CT_BagNames = nil;

function CT_GetNextCID()
    for i=1, 5, 1 do
        if (not getglobal("ContainerFrame" .. i):IsVisible()) then
            return i;
        end
    end
    return 5;
end

function CT_GetBagID(container)
    if ( not container ) then return nil; end
    return getglobal("ContainerFrame" .. container):GetID();
end

function CT_CCFrame_ToggleEditBox(self)
    local parentName = self:GetParent():GetName();
    local bagId = self:GetParent():GetID()+1;
    local frame = getglobal(parentName .. "EBFrame");
    local box = getglobal(parentName .. "EBFrameEditBox")

    -- If the edit box isn't visible, show it
    if ( frame:IsVisible() ~= 1 ) then
        frame:Show();
        local bagName = CT_BagNames[CT_GetBagID(bagId)];
        -- If there already is a bag name, put that in the text box so it can be edited
        if (bagName and strlen(bagName) > 0) then
            box:SetText(bagName);
        end
    -- Otherwise save the box and then hide it
    else
        CT_SaveEditBox(box, bagId);
        frame:Hide();
    end
end

function CT_SaveEditBox(box, id)
    local text = box:GetText();
    -- If there isn't any text, reset it to the default empty string
    if ( not text or strlen(text) == 0 ) then 
        text = "";
    end

    -- Reset the edit box text
    box:SetText("");
    -- Save the entered value
    CT_BagNames[CT_GetBagID(id)] = text;

    -- If all we have is the empty string, reset this back to the bag name
    if ( text == "" ) then
        getglobal("ContainerFrame" .. id .. "Name"):SetText(GetBagName(CT_GetBagID(id)));
    -- Otherwise show the entered value
    else
        getglobal("ContainerFrame" .. id .. "Name"):SetText(text);
    end
end

function CT_CCEditBox_OnEnterPressed(self)
    CT_SaveEditBox(self, self:GetParent():GetParent():GetID()+1);

    -- Reset the edit box text
    self:SetText("");
    -- And hide it if it's visible
    if ( self:GetParent():IsVisible() == 1 ) then
        self:GetParent():Hide();
    end
end

function CT_CCEditBox_OnEscapePressed(self)
    local containerID = self:GetParent():GetParent():GetID()+1;
    local bagID = CT_GetBagID();
    local bagName = CT_BagNames[bagID];

    -- If there is a name and it's different than the current name, set the container text
    if ( bagName and strlen(bagName) > 0 and bagName ~= GetBagName() ) then
        getglobal("ContainerFrame" .. containerID .. "Name"):SetText(bagName);
    -- Otherwise reset the text to the name of the bag
    else
        getglobal("ContainerFrame" .. containerID .. "Name"):SetText(GetBagName(bagID));
    end

    -- Reset the edit box text
    self:SetText("");
    -- And hide it if it's visible
    if ( self:GetParent():IsVisible() == 1 ) then
        self:GetParent():Hide();
    end
end

function CT_CCFrame_OnShow(self)
    local containerID = self:GetParent():GetID()+1;
    local bagID = CT_GetBagID(containerID);
    local bagName = CT_BagNames[bagID];

    -- If we have a saved bag name, show it
    if ( bagName and strlen(bagName) > 0 ) then
        getglobal("ContainerFrame" .. containerID .. "Name"):SetText(bagName);
    -- Otherwise show the original bag name
    else
        getglobal("ContainerFrame" .. containerID .. "Name"):SetText(GetBagName(bagID));
    end
end

function CT_CCItemSlotButton_OnLoad(self)
    self:RegisterEvent("BAG_UPDATE");
    self:RegisterEvent("UNIT_INVENTORY_CHANGED");
    self:RegisterEvent("ITEM_LOCK_CHANGED");
    self:RegisterEvent("CURSOR_UPDATE");
    self:RegisterEvent("BAG_UPDATE_COOLDOWN");
    self:RegisterEvent("SHOW_COMPARE_TOOLTIP");
    self:RegisterForDrag("LeftButton");
    self:RegisterForClicks("LeftButtonUp", "RightButtonUp");
    self.isBag = 1;
    self.CID = self:GetID()+1;
end

-- BID = Button ID
-- CID = Container ID

-- Backpack oppens, BID 0, CID 1
-- Bag 2 opens, BID 2, CID 3
-- Bag 2 changes CID to 2, Bag 1 takes CID 3.

function CT_CCSlotButton_OnClick(self)
    local isVisible = 0;
    local container;
    local button;

    if ( self:GetID() >= 1 ) then
        button = getglobal("CharacterBag" .. self:GetID()-1 .. "Slot")

        local id = button:GetID();
        local translatedID = id - CharacterBag0Slot:GetID() + 1;
        local hadItem = PutItemInBag(id);
        if ( not hadItem ) then
            ToggleBag(translatedID);
            PlaySound("BAGMENUBUTTONPRESS");
        end
        for i=1, NUM_CONTAINER_FRAMES, 1 do
            local frame = getglobal("ContainerFrame"..i);
            if (frame:GetID() == translatedID) then
                container = i;
                if ( frame:IsVisible() ) then
                    isVisible = 1;
                    break;
                end
            end
        end
        button:SetChecked(isVisible);
    else
        if ( not PutItemInBackpack() ) then
            ToggleBackpack();
            
            for i=1, NUM_CONTAINER_FRAMES, 1 do
                local frame = getglobal("ContainerFrame"..i);
                if (frame:GetID() == 0) then
                    container = i;
                    if ( frame:IsVisible() ) then
                        isVisible = 1;
                        break;
                    end
                end
            end
            getglobal("MainMenuBarBackpackButton"):SetChecked(isVisible);

        end
    end

    local newCID = container;
    for z=0, 4, 1 do
        local glb = getglobal("CT_CCB" .. z .. "Button");
        if ( glb and glb.CID == newCID ) then
            glb.CID = self.CID;
            self.CID = newCID;
            getglobal("ContainerFrame" .. glb.CID):SetID(glb:GetID());
        end
    end
end

function CT_CCSlotButton_OnDrag(self)
    local button;
    if ( self:GetID() ~= 0 ) then
        button = getglobal("CharacterBag" .. self:GetID()-1 .. "Slot")
    else
        button = getglobal("MainMenuBarBackpackButton");
    end
    local translatedID = button:GetID() - CharacterBag0Slot:GetID() + 1;
    PickupBagFromSlot(button:GetID());
    PlaySound("BAGMENUBUTTONPRESS");
    local isVisible = 0;
    for i=1, NUM_CONTAINER_FRAMES, 1 do
        local frame = getglobal("ContainerFrame"..i);
        if ( (frame:GetID() == translatedID) and frame:IsVisible() ) then
            isVisible = 1;
            break;
        end
    end
    button:SetChecked(isVisible);
end

function CT_CCFrame_OnEnter(self)
    local bagid = CT_GetBagID(self:GetParent():GetID()+1);
    local cid = self:GetParent():GetID()+1;
    local settext;
    if ( not CT_BagNames[bagid] or CT_BagNames[bagid] == "" ) then
        settext = GetBagName(bagid);
    else
        settext = CT_BagNames[bagid];
    end
    GameTooltip:SetOwner(self, "ANCHOR_LEFT");
    
    if ( bagid and bagid == 0 ) then
        GameTooltip:SetText(settext, 1.0, 1.0, 1.0);
        if (GetBindingKey("TOGGLEBACKPACK")) then
            GameTooltip:AppendText(" "..NORMAL_FONT_COLOR_CODE.."("..GetBindingKey("TOGGLEBACKPACK")..")"..FONT_COLOR_CODE_CLOSE)
        end

    elseif ( bagid and bagid > 0 and ContainerIDToInventoryID(bagid) and GameTooltip:SetInventoryItem("player", ContainerIDToInventoryID(bagid)) ) then
        getglobal("GameTooltipTextLeft1"):SetText(settext);
        local binding = GetBindingKey("TOGGLEBAG"..(5 - bagid));
        if ( binding ) then
            GameTooltip:AppendText(" "..NORMAL_FONT_COLOR_CODE.."("..binding..")"..FONT_COLOR_CODE_CLOSE);
        end 
    end
    
end

function CT_CCButton_OnEnter(self)
    local bagid = self:GetID();
    local settext;
    if ( not CT_BagNames[bagid] or CT_BagNames[bagid] == "" ) then
        settext = GetBagName(bagid);
    else
        settext = CT_BagNames[bagid];
    end
    GameTooltip:SetOwner(self, "ANCHOR_LEFT");
    if ( bagid == 0 ) then
        GameTooltip:SetText(settext, 1.0, 1.0, 1.0);
        if (GetBindingKey("TOGGLEBACKPACK")) then
            GameTooltip:AppendText(" "..NORMAL_FONT_COLOR_CODE.."("..GetBindingKey("TOGGLEBACKPACK")..")"..FONT_COLOR_CODE_CLOSE)
        end
    elseif ( GameTooltip:SetInventoryItem("player", ContainerIDToInventoryID(bagid)) ) then
        getglobal("GameTooltipTextLeft1"):SetText(settext);
        local binding = GetBindingKey("TOGGLEBAG"..(5 - bagid));
        if ( binding ) then
            GameTooltip:AppendText(" "..NORMAL_FONT_COLOR_CODE.."("..binding..")"..FONT_COLOR_CODE_CLOSE);
        end 
    else
        GameTooltip:SetText(TEXT(EQUIP_CONTAINER), 1.0, 1.0, 1.0);
    end
end

function CT_CCFrame_OnEvent(self, event, ...)
    local arg1 = ...
    -- If the addon loaded and is telling us that our variable is ready, get it
    if event == "ADDON_LOADED" and arg1 == "CT_BagMod" then
        local names = _G["CT_BagNames"];
        -- If it's null, initialize it
        if names == nil then
            CT_BagNames = { };
            _G["CT_BagNames"] = { };
        -- Otherwise save it
        else
            CT_BagNames = names;
        end
    -- If the player is logging out, save the bag names
    elseif event == "PLAYER_LOGOUT" then
        _G["CT_BagNames"] = CT_BagNames;
    end
end