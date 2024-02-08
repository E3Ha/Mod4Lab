public class Task1 {

        public static void main(String[] args) {

            double SALESTAX = 0.05;
            double itemPrice = 10.65;
            double taxPrice;
            double finalPrice;

            taxPrice = itemPrice * SALESTAX;
            finalPrice = taxPrice + itemPrice;
            System.out.println("Your item price of: " + itemPrice + " plus a tax price of: " + taxPrice + " equals: " + finalPrice);



        }
}
