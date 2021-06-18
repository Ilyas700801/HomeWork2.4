package com.Geekteck;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите колличество строк:");
        int line = scanner.nextInt();

        System.out.println("\nвведите данный первого списка");
        ArrayList A = new ArrayList(line);

        for (int i = 0; i < line; i++) {
            A.add(scanner.next());
        }
        print(A);


        System.out.println("\nвведите данный второго списка");
        ArrayList B = new ArrayList(line);

        for (int i = 0; i < line; i++) {
            B.add(scanner.next());
        }
        print(B);

        Collections.reverse(B);

        System.out.println("----------------------------");


        ArrayList C = new ArrayList();
        int zero = 0;
        while (C.size() < A.size() + B.size()) {
            C.add(A.get(zero));
            C.add(B.get(zero));
            zero++;
        }
        print(C);
        System.out.println("----------------------------");


        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        print(C);

    }

    static void print(ArrayList list) {
        Iterator<String> all = list.iterator();

        while (all.hasNext()) {
            System.out.println(all.next());
        }
    }

}
