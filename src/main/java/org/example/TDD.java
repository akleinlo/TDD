package org.example;

public class TDD {
    public static void main(String[] args) {
        boolean primeNorNot = isPrime(23);
        System.out.println(primeNorNot);

        String reversed = reverseString("Hallo");
        System.out.println(reversed);
        System.out.println();
        System.out.println(isPalindrome("Otto"));
        System.out.println();
        int factOf = 6;
        int fact = factorial(factOf);
        System.out.println("Factorial von " + factOf + " ist " + fact + ".");
        System.out.println();
        String text = "Das hier ist mein Text, bitte Vokale zählen.";
        int numVowels = countVowels(text);
        System.out.println("Das ist der Text: \n\"" + text
                         + "\"\nDie Anzahl an Vokalen ist: " + numVowels + ".");
        int fib = 32;
        System.out.println("Fibonacci(" + fib + ") ist = " + fibonacci(fib) + ".");

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static boolean isPositive (int number) {
        return number > 0;
    }

    public static String getFirstLetter(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        else {
            return String.valueOf(text.charAt(0));
        }
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Die Zweite Zahl darf nicht 0 sein");
        }
        else {
            return (double) a/b;
        }
    }


    public static boolean isPrime(int number) {
        if (number < 1) return false;
        for (int i = 2; i * i < number+1; i++ ) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static char getFirstCharacter(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Text ist leer, null oder nur Leerzeichen.");
        }
        else {
            return text.charAt(0);
        }
    }

    public static String reverseString (String text) {
        char[] reversedText = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversedText[i] = text.charAt(text.length() -1 -i);
        }
        return new String (reversedText);
    }

    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        text = text.toLowerCase();
        int len = text.length();

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != text.charAt(len -1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int countVowels(String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        int result = 1;
        for (int i = a;  i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a+ b;
            a = b;
            b = result;
        }
        return result;
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }

        return result;

    }

}