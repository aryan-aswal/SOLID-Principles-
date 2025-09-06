package Example_2.ProblematicCode;

public class ReportGenerator {
    public String generateReport(String reportType) {
        if(reportType.equals(".pdf")) {
            return "Generating PDF report";
        } else if (reportType.equals(".docx")) {
            return "Generating word report";
        }
        return "report type not supported";
    }
}

