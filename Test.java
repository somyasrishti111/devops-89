
public class Test{
    public String Hello() {
        return "Hello in Test class";
    }

    // Method to return a result message
    public String findResult() {
        return "Hello, how are you doing?";
    }

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to print a message
    public void printMessage() {
        System.out.println("Hello, how are you doing?");
    }

    // Main method to run the program
    public static void main(String[] args) {
        Test test = new Test();

        // Calling methods and displaying results
        System.out.println(test.Hello());
        System.out.println(test.findResult());
        System.out.println("Sum: " + test.add(5, 10));
        test.printMessage();
    }
}

