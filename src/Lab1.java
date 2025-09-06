public class Lab1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is even.");
        } else {
            System.out.println("The sum is odd.");
        }
    }
}