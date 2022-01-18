package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();

        String n1 = scanner.next();
        String n2 = scanner.next();
        String n3 = scanner.next();
        String n4 = scanner.next();
        String n5 = scanner.next();

        name.add(n1);
        name.add(n2);
        name.add(n3);
        name.add(n4);
        name.add(n5);
        System.out.println(name);

        ArrayList<String> surname = new ArrayList<>();

        String a1 = scanner.next();
        String a2 = scanner.next();
        String a3 = scanner.next();
        String a4 = scanner.next();
        String a5 = scanner.next();

        surname.add(a1);
        surname.add(a2);
        surname.add(a3);
        surname.add(a4);
        surname.add(a5);

        System.out.println(surname);

        ArrayList<String> mix = new ArrayList<>();
        Collections.reverse(surname);

        for (int i = 0; i < name.size(); i++) {
            mix.add(name.get(i));
            mix.add(surname.get(i));
        }
        System.out.println(mix);
        Collections.sort(mix, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(mix);
    }
}
