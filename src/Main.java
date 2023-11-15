import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---isPalindrome---");
        System.out.println(isPalindrome((-1221))); //true
        System.out.println(isPalindrome((707)));    //true
        System.out.println(isPalindrome((11212)));  //false
        System.out.println("---isPerfectNumber---");
        System.out.println(isPerfectNumber((6))); //true
        System.out.println(isPerfectNumber((28)));    //true
        System.out.println(isPerfectNumber((5)));  //false
        System.out.println(isPerfectNumber((-1)));  //false
        System.out.println("---numberToWords---");
        System.out.println(numberToWords((123))); //"One Two Three"
        System.out.println(numberToWords((1010)));    //"One Zero One Zero"
        System.out.println(numberToWords((-12)));  //"Invalid Value"

    }
    public static boolean isPalindrome(int number){
        String intInputStr = String.valueOf(Math.abs(number));

        return intInputStr.equals(new StringBuilder(intInputStr).reverse().toString());
    }

    public static boolean isPerfectNumber(int number){
        if(number<0) {
            return false;
        };
        int sum = 0;
        for(int i=1; i<number; i++){
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number){
        if(number<0){
            return ("Invalid Value");
        }

        char[] digits = String.valueOf(number).toCharArray();
        String numToText = "";

        for(char digit: digits){
            switch (digit){
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();

    }
}
