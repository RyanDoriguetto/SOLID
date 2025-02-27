class Calculator {
    public void divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}