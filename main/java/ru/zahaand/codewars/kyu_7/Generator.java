package ru.zahaand.codewars.kyu_7;

/**
 * <a href="https://www.codewars.com/kata/5637ead70013386e30000027/train/java">...</a>
 */
public class Generator {
    private final int a;
    private int num = 0;

    private Generator(int a) {
        this.a = a;
    }

    public static Generator of(int a) {
        return new Generator(a);
    }

    public String next() {
        return a + " x " + ++num + " = " + a * num;
    }
}
