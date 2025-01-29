public class Exception{
    public static void main(String[] args) {
        String name = "Swathi";
        int age = 21;
        try {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
