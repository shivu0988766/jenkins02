class Calculator {
    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method for division
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }
   

    public static void mafghin(String[] args) {
        Calculator calc = new Calculator();
        int a = 10, b = 5; // Predefined values

        System.out.prinn("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
	
    }
}