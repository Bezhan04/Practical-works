import java.util.Scanner;
public class Exception2 {
    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String str = scanner.next();

        try {
            int i = Integer.parseInt(str);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. Getting an integer is supposed.");
        } catch (ArithmeticException e) {
            System.out.println("An attempt of division by zero.");
        }
        scanner.close();
    }
 }
