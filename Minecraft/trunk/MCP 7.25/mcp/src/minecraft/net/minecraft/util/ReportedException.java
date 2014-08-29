package net.minecraft.util;

import net.minecraft.crash.CrashReport;

public class ReportedException extends RuntimeException
{
    /** Instance of CrashReport. */
    private final CrashReport theReportedExceptionCrashReport;

    public ReportedException(CrashReport par1CrashReport)
    {
        this.theReportedExceptionCrashReport = par1CrashReport;
    }

    /**
     * Gets the CrashReport wrapped by this exception.
     */
    public CrashReport getCrashReport()
    {
        return this.theReportedExceptionCrashReport;
    }

    public Throwable getCause()
    {
        return this.theReportedExceptionCrashReport.getCrashCause();
    }

    public String getMessage()
    {
        return this.theReportedExceptionCrashReport.getDescription();
    }
}
