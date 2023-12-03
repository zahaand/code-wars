package ru.zahaand.codewars.kyu_4;

/**
 * <a href="https://www.codewars.com/kata/51fda2d95d6efda45e00004e/train/java">...</a>
 */
public class User {
    int rank = -8;
    int progress = 0;

    /**
     * Увеличивает прогресс в зависимости от применяемого ранга.
     */
    public void incProgress(int applyingRank) {
        if (applyingRank < -8 || applyingRank > 8 || applyingRank == 0) {
            throw new IllegalArgumentException();
        }

        // корректировка полученного ранга с учетом того, что ранг 0 отсутствует
        if (rank < 0 && applyingRank > 0) {
            applyingRank--;
        } else if (rank > 0 && applyingRank < 0) {
            applyingRank++;
        }

        int difference = applyingRank - rank;
        if (difference == 0) {
            progress += 3;
        } else if (difference == -1) {
            progress += 1;
        } else if (difference > 0) {
            progress += 10 * difference * difference;
        }

        while (progress >= 100 && rank < 8) {
            rank = (rank == -1) ? 1 : rank + 1;
            progress -= 100;
        }

        if (rank == 8) {
            progress = 0;
        }
    }
}