package com.artsafin.ofa.utils;

import java.io.File;
import java.util.Properties;

public class AppConfig extends Properties {
    public String docDir() {
        String dir = getProperty("doc_dir");

        File f = new File(dir);

        if (f.isFile() || !f.exists() && !f.mkdir()) {
            throw new RuntimeException("Could not create a doc_dir at " + dir);
        }

        return dir;
    }

    public String airtableAppId() {
        return getProperty("airtable_app_id");
    }

    public String airtableToken() {
        return getProperty("airtable_token");
    }

    public String payslipFolder() {
        return getProperty("payslip_folder");
    }

    public String payslipTemplateFile() {
        return getProperty("payslip_template_file");
    }

    public int payslipTemplateSheet() {
        return Integer.parseInt(getProperty("payslip_template_sheet"));
    }

    public String invoiceFolder() {
        return getProperty("invoice_folder");
    }

    public String invoiceTemplateFile() {
        return getProperty("invoice_template_file");
    }

    public int invoiceTemplateSheet() {
        return Integer.parseInt(getProperty("invoice_template_sheet"));
    }

    public String redmineUrl() {
        return getProperty("redmine_url");
    }

    public String redmineKey() {
        return getProperty("redmine_key");
    }

    public String redmineReportUserIds() {
        return getProperty("redmine_report_user_ids");
    }
}
