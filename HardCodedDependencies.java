interface ReportGenerator {
    void generateReport();
}

class PDFReportGenerator implements ReportGenerator {
    public void generateReport() {
        System.out.println("Generating PDF Report...");
    }
}

class ExcelReportGenerator implements ReportGenerator {
    public void generateReport() {
        System.out.println("Generating Excel Report...");
    }
}