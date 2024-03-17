package ru.zahaand.codewars.kyu_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://www.codewars.com/kata/5263c6999e0f40dee200059d/train/java">...</a>
 */
public class TheObservedPIN {

    private static final Map<Character, List<Character>> KEYPAD = getKeypad();

    /**
     * Генерирует все возможные варианты PIN-кодов, основываясь на наблюдаемых цифрах,
     * учитывая соседние цифры на клавиатуре.
     *
     * @param observed Строка, содержащая наблюдаемые цифры.
     * @return Список строк, представляющих все возможные варианты PIN-кодов.
     */
    public static List<String> getPINs(String observed) {
        List<String> variations = new ArrayList<>();
        getPINsRecursive(observed, 0, new StringBuilder(), variations);
        return variations;
    }

    /**
     * Рекурсивно генерирует все возможные варианты PIN-кодов, основываясь на наблюдаемых цифрах,
     * учитывая соседние цифры на цифровой клавиатуре.
     *
     * @param observed Строка, содержащая наблюдаемые цифры.
     * @param index Текущий индекс в строке наблюдаемых цифр.
     * @param currentPIN Текущий PIN-код, который строится рекурсивно.
     * @param variations Список, в который добавляются все возможные варианты PIN-кодов.
     */
    private static void getPINsRecursive(String observed, int index, StringBuilder currentPIN, List<String> variations) {
        if (index == observed.length()) {
            variations.add(currentPIN.toString());
            return;
        }

        char digit = observed.charAt(index);
        List<Character> adjacentDigits = KEYPAD.get(digit);

        for (char adjacent : adjacentDigits) {
            currentPIN.append(adjacent);
            getPINsRecursive(observed, index + 1, currentPIN, variations);
            currentPIN.deleteCharAt(currentPIN.length() - 1); // Удаляем последний символ для следующей итерации
        }
    }

    private static Map<Character, List<Character>> getKeypad() {
        return Map.of(
                '0', List.of('0', '8'),
                '1', List.of('1', '2', '4'),
                '2', List.of('1', '2', '3', '5'),
                '3', List.of('2', '3', '6'),
                '4', List.of('1', '4', '5', '7'),
                '5', List.of('2', '4', '5', '6', '8'),
                '6', List.of('3', '5', '6', '9'),
                '7', List.of('4', '7', '8'),
                '8', List.of('5', '7', '8', '9', '0'),
                '9', List.of('6', '8', '9')
        );
    }
}
