public class MethodReturnTypes {
    public static void main(String[] args) {
        // Call the displayWelcomeMessage method
        displayWelcomeMessage();
        
        // Declare two integer variables
        int value1 = 20;
        int value2 = 30;
        
        // Call calculateAverage method and store the result in a variable
        double result = calculateAverage(value1, value2);
        
        // Print the result of the average
        System.out.println("The average is: " + result);
    }
    
    // Void method that prints a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }
    
    // Method that calculates and returns the average of two integers
    public static double calculateAverage(int num1, int num2) {
        // Calculate the average
        double average = (num1 + num2) / 2.0;
        
        // Return the average to the caller
        return average;
    }
}