class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice amount: " + invoice.getAmount());
    }
}

class InvoiceSaver {
    public void saveToDatabase(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }
}