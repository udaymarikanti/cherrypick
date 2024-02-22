package reversePrintingNumber;

public class ReversePrinting {

    public static void main(String[] args) {
        int num = 1234;
        int reversedNumber = 0;
        System.out.println(" given number " + num );

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num/ 10;
        }
        System.out.println("reverced number" + reversedNumber);






                int number = 12345;
                String numberAsString = String.valueOf(number);
                String reversedNumberByString = new StringBuilder(numberAsString).reverse().toString();
                System.out.println("Original number: " + number);
                System.out.println("Reversed number: " + reversedNumberByString);
            }
        }

