package ro.ulbs.ingprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1.4 Run / Debug
        System.out.println("Hello world!");
        char c = 'a';
        int len = 'z' - 'a';
        for (int i = 0; i <= len; i++) {
            int next = c + i;
            char nextChar = (char) next;
            System.out.println(nextChar);
        }

        // 1.7.1 Inversare string
        System.out.println("\n=== 1.7.1 ===");
        System.out.println(reverse("A inceput scoala."));

        // 1.7.2 Liste de numere aleatoare
        System.out.println("\n=== 1.7.2 ===");
        Random rand = new Random();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(5 + rand.nextInt(21)); // [5..25]
        }
        List<Integer> list2 = new ArrayList<>();
        for (int x : list1) {
            if (x >= 10 && x <= 20) {
                list2.add(x);
            }
        }
        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 2: " + list2);
        System.out.println("Lista 1 -> min = " + Collections.min(list1) + ", max = " + Collections.max(list1));
        if (list2.isEmpty()) {
            System.out.println("Lista 2 este goala, nu are min/max.");
        } else {
            System.out.println("Lista 2 -> min = " + Collections.min(list2) + ", max = " + Collections.max(list2));
        }

        // 1.7.3 Forme
        System.out.println("\n=== 1.7.3 a) ===");
        printRectangle(4, 5);
        System.out.println("\n=== 1.7.3 b) ===");
        printDiagonals(7);
    }

    // 1.7.1
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 1.7.3 a) dreptunghi gol de n randuri si m coloane
    static void printRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < m; j++) {
                boolean border = i == 0 || i == n - 1 || j == 0 || j == m - 1;
                line.append(border ? "* " : "  ");
            }
            System.out.println(line.toString().stripTrailing());
        }
    }

    // 1.7.3 b) diagonalele unui patrat n x n
    static void printDiagonals(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n; j++) {
                boolean diag = i == j || i + j == n - 1;
                line.append(diag ? "* " : "  ");
            }
            System.out.println(line.toString().stripTrailing());
        }
    }
}
