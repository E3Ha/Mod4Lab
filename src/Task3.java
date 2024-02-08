public class Task3 {

    public static void main(String[] args) {

        int initialBalance = 5000;
        double INTEREST = 1.17;
        double monthOne;
        double monthTwo;

        monthOne = initialBalance * INTEREST;
        monthTwo = monthOne * INTEREST;

        System.out.println("Your initial balance of: " + initialBalance + " after one month and two months respectively is: " + monthOne + ", " + monthTwo);



    }
}
