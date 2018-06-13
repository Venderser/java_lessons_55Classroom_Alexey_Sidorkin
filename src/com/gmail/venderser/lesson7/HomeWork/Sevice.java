package com.gmail.venderser.lesson7.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

class Service {
    String stringScanner() {
        System.out.println("Enter the text line");
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        return n;
    }

    void equalMethod(String txt) {
        char[] text = txt.toCharArray();
        int i = 0;
        for (char symbol : text) {
            i++;
            if (symbol == text[text.length - 1] & i != text.length) {
                sysOutInt(i);
            }
        }
    }

    String stringLines(String array) {
        String yes = "yes";
        String no = "no";
        boolean indexDog = array.contains("dog");

        boolean indexCat = array.contains("cat");

        if (indexCat || indexDog) {
            return "yes";
        } else {
            return "no";
        }
    }

    void del(String txt) {
        char[] text = txt.toCharArray();
        int i = 0;
        int counter = 0;
        StringBuilder ttxt = new StringBuilder();
        for (char symbol : text) {
            counter++;
            if (symbol == '?') {
                i++;
            }
            if (i != 2) {
                ttxt.append(symbol);
            } else {
                if (i == 2) {
                    if (symbol != ' ') {
                        ttxt.append(symbol);
                    }

                } else {
                    if (i >= 3) {
                        ttxt.append(symbol);
                    }
                }
            }
        }
        System.out.println(ttxt);
    }

    void sysOutInt(int x) {
        System.out.println(x);
    }
}
