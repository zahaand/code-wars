package ru.zahaand.codewars.kyu_4;

/**
 * <a href="https://www.codewars.com/kata/525f4206b73515bffb000b21/train/java">...</a>
 */
public class AddingBigNumbers {

    /**
     * Складывает два больших числа, представленных в виде строк.
     * Удаляет ведущие нули перед выполнением сложения.
     *
     * @param a Первое число в виде строки.
     * @param b Второе число в виде строки.
     * @return Сумма двух чисел в виде строки.
     */
    public static String add(String a, String b) {
        a = removeLeadingZeros(a);
        b = removeLeadingZeros(b);

        StringBuilder result = new StringBuilder();
        int carryOver = 0;
        int indexFirst = a.length() - 1;
        int indexSecond = b.length() - 1;

        while (indexFirst >= 0 || indexSecond >= 0 || carryOver != 0) {
            int digitFirst = indexFirst >= 0 ? Character.getNumericValue(a.charAt(indexFirst)) : 0;
            int digitSecond = indexSecond >= 0 ? Character.getNumericValue(b.charAt(indexSecond)) : 0;
            int sum = digitFirst + digitSecond + carryOver;

            carryOver = sum / 10;
            result.insert(0, sum % 10);
            indexFirst--;
            indexSecond--;
        }

        return result.toString();
    }

    private static String removeLeadingZeros(String number) {
        int fromIndex = 0;
        while (fromIndex < number.length() - 1 && number.charAt(fromIndex) == '0') {
            fromIndex++;
        }
        return number.substring(fromIndex);
    }
}
