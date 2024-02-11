package ru.zahaand.codewars.kyu_4;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java">...</a>
 */
public class TimeFormatter {

    /**
     * Преобразует заданное количество секунд в форматированную строку времени.
     */
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        Duration duration = Duration.ofSeconds(seconds);
        long years = duration.toDays() / 365;
        long days = duration.toDays() % 365;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long remainingSeconds = duration.getSeconds() % 60;

        List<String> timeElements = new LinkedList<>();

        addTimeElement(timeElements, years, "year");
        addTimeElement(timeElements, days, "day");
        addTimeElement(timeElements, hours, "hour");
        addTimeElement(timeElements, minutes, "minute");
        addTimeElement(timeElements, remainingSeconds, "second");

        int timeElementsCount = timeElements.size();
        if (timeElementsCount > 1) {
            String lastElement = timeElements.remove(timeElementsCount - 1);
            return String.join(", ", timeElements) + " and " + lastElement;
        } else {
            return timeElements.get(0);
        }
    }

    private static void addTimeElement(List<String> timeElements, long value, String unit) {
        if (value > 0) {
            String formattedUnit = value > 1
                    ? " " + unit + "s"
                    : " " + unit;

            timeElements.add(value + formattedUnit);
        }
    }
}
