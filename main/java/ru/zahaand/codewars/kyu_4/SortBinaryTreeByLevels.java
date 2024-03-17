package ru.zahaand.codewars.kyu_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://www.codewars.com/kata/52bef5e3588c56132c0003bc/train/java">...</a>
 */
public class SortBinaryTreeByLevels {

    /**
     * Выполняет обход в ширину двоичного дерева и возвращает список значений узлов в порядке их посещения.
     *
     * @param node Корень двоичного дерева, которое нужно обойти.
     * @return Список целых чисел, представляющих значения узлов в порядке обхода в ширину.
     */
    public static List<Integer> treeByLevels(Node node) {
        if (node == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Queue<Node> level = new LinkedList<>();
        level.add(node);

        while (!level.isEmpty()) {
            Node currentNode = level.poll();
            result.add(currentNode.value);

            if (currentNode.left != null) {
                level.add(currentNode.left);
            }

            if (currentNode.right != null) {
                level.add(currentNode.right);
            }
        }

        return result;
    }

    public static class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(Node l, Node r, int v) {
            left = l;
            right = r;
            value = v;
        }
    }
}
