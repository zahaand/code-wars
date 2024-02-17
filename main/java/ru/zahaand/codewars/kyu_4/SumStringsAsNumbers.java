package ru.zahaand.codewars.kyu_4;

/**
 * <a href="https://www.codewars.com/kata/5324945e2ece5e1f32000370/train/java">...</a>
 */
public class SumStringsAsNumbers {

    /**
     * Складывает строковые представления двух целых чисел и возвращает строковое представление их суммы.
     *
     * @param firstNumber  строковое представление первого целого числа
     * @param secondNumber строковое представление второго целого числа
     * @return строковое представление суммы двух целых чисел
     */
    public static String sumStrings(String firstNumber, String secondNumber) {
        int carry = 0;
        StringBuilder sumBuilder = new StringBuilder();

        int firstIndex = firstNumber.length() - 1;
        int secondIndex = secondNumber.length() - 1;

        while (firstIndex >= 0 || secondIndex >= 0 || carry > 0) {
            int firstDigit = firstIndex >= 0 ? firstNumber.charAt(firstIndex--) - '0' : 0;
            int secondDigit = secondIndex >= 0 ? secondNumber.charAt(secondIndex--) - '0' : 0;
            int totalDigit = firstDigit + secondDigit + carry;
            carry = totalDigit / 10;
            sumBuilder.append(totalDigit % 10);
        }

        String sumString = sumBuilder.reverse().toString();
        return sumString.replaceFirst("^0+(?!$)", "");
    }
}
