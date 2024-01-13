package ru.zahaand.codewars.kyu_5;

import java.time.Duration;

/**
 * <a href="https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java">...</a>
 */
public class HumanReadableTime {

    /**
     * Преобразует количество секунд в человекочитаемый формат "00:00:00"
     */
    public static String makeReadable(int seconds) {
        Duration duration = Duration.ofSeconds(seconds);
        return String.format("%02d:%02d:%02d",
                duration.toHours(),
                duration.toMinutesPart(),
                duration.toSecondsPart());
    }
}
