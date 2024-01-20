package ru.zahaand.codewars.kyu_5;

import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/515bb423de843ea99400000a/train/java">...</a>
 */
public class PaginationHelper<I> {
    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * Принимает массив элементов и целое число, указывающее, сколько элементов на одной странице
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * Возвращает количество элементов в коллекции
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * Возвращает количество страниц
     */
    public int pageCount() {
        int totalItems = collection.size();
        int totalPages = totalItems / itemsPerPage;

        return totalItems % itemsPerPage == 0
                ? totalPages
                : totalPages + 1;
    }

    /**
     * Возвращает количество элементов на странице с заданным индексом.
     * Возвращает -1 если заданный индекс страницы выходит за пределы допустимого диапазона
     */
    public int pageItemCount(int pageIndex) {
        int totalItems = collection.size();
        int totalPages = pageCount();

        if (pageIndex < 0 || pageIndex >= totalPages) {
            return -1;
        }

        if (pageIndex == totalPages - 1) {
            return totalItems % itemsPerPage == 0
                    ? itemsPerPage
                    : totalItems % itemsPerPage;
        }

        return itemsPerPage;
    }

    /**
     * Определяет, на какой странице находится элемент с заданным индексом.
     * Возвращает -1 если заданный индекс элемента выходит за пределы допустимого диапазона
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= collection.size()) {
            return -1;
        }

        return itemIndex / itemsPerPage;
    }
}
