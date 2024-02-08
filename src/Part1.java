public class Part1 {

    public static void main(String[] args) {

        int intOperandA = 1;
        int intOperandB = 15;
        int intSum = 45;
        int intProduct = 63;
        int intDifference = 23;
        int intQuotient = 678;
        int intModulo = 53;

        double doubleOperandA = 1.5;
        double doubleOperandB = 3.14;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        System.out.println("");

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);

        System.out.println("");

        int numOfKids = 2;
        String raining = "true";
        double gasPrice = 2.55;
        int favNum = 8;
        double shoeSize = 10.5;
        int birthMonth = 4;
        String fullName = "E" + "." + "H";

        System.out.println("The number of kids in your family:" + numOfKids);
        System.out.println("Is it raining?:" + raining);
        System.out.println("The price of a gallon of gas:" + gasPrice);
        System.out.println("Your favorite number:" + favNum);
        System.out.println("Your shoe size:" + shoeSize);
        System.out.println("Your birth month:" + birthMonth);
        System.out.println("Your full name:" + fullName);




    }


}