class UserAuthenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}

class Application {
    private UserAuthenticator authenticator = new UserAuthenticator();
    private DashboardLoader dashboardLoader = new DashboardLoader();
    private PaymentProcessor paymentProcessor = new PaymentProcessor();
    private ReportGenerator reportGenerator = new ReportGenerator();

    public void run() {
        System.out.println("Running application...");
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}