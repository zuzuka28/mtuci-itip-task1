package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        if (remainder(1, 3) != 1) {
            System.out.println("Bad 1.1");
        }
        if (remainder(3, 4) != 3) {
            System.out.println("Bad 1.2");
        }
        if (remainder(-9, 45) != -9) {
            System.out.println("Bad 1.3");
        }
        if (remainder(5, 5) != 0) {
            System.out.println("Bad 1.4");
        }

        if (triArea(3, 2) != 3) {
            System.out.println("Bad 2.1");
        }
        if (triArea(7, 4) != 14) {
            System.out.println("Bad 2.2");
        }
        if (triArea(10, 10) != 50) {
            System.out.println("Bad 2.3");
        }

        if (animals(2, 3, 5) != 36) {
            System.out.println("Bad 3.1");
        }
        if (animals(1, 2, 3) != 22) {
            System.out.println("Bad 3.2");
        }
        if (animals(5, 2, 8) != 50) {
            System.out.println("Bad 3.3");
        }

        if (!profitableGamble(0.2, 50, 9)) {
            System.out.println("Bad 4.1");
        }
        if (profitableGamble(0.9, 1, 2)) {
            System.out.println("Bad 4.2");
        }
        if (!profitableGamble(0.9, 3, 2)) {
            System.out.println("Bad 4.3");
        }

        if (!operation(24, 15, 9).equals("added")) {
            System.out.println("Bad 5.1");

        }
        if (!operation(24, 26, 2).equals("subtracted")) {
            System.out.println("Bad 5.2");

        }
        if (!operation(15, 11, 11).equals("none")) {
            System.out.println("Bad 5.3");

        }

        if (ctoa('A') != 65) {
            System.out.println("Bad 6.1");
        }
        if (ctoa('m') != 109) {
            System.out.println("Bad 6.2");
        }
        if (ctoa('[') != 91) {
            System.out.println("Bad 6.3");
        }
        if (ctoa('\\') != 92) {
            System.out.println("Bad 6.4");
        }

        if (addUpTo(3) != 6) {
            System.out.println("Bad 7.1");
        }
        if (addUpTo(10) != 55) {
            System.out.println("Bad 7.2");
        }
        if (addUpTo(7) != 28) {
            System.out.println("Bad 7.3");
        }

        if (nextEdge(8, 10) != 17) {
            System.out.println("Bad 8.1");
        }
        if (nextEdge(5, 7) != 11) {
            System.out.println("Bad 8.2");
        }
        if (nextEdge(9, 2) != 10) {
            System.out.println("Bad 8.3");
        }

        if(sumOfCubes(new int[]{1, 5, 9}) != 855){
            System.out.println("Bad 9.1");
        }
        if(sumOfCubes(new int[]{3, 4, 5}) != 216){
            System.out.println("Bad 9.2");
        }
        if(sumOfCubes(new int[]{2}) != 8){
            System.out.println("Bad 9.3");
        }
        if(sumOfCubes(new int[]{}) != 0){
            System.out.println("Bad 9.4");
        }

        if(abcmath(42, 5, 10)){
            System.out.println("Bad 10.1");
        }
        if(!abcmath(5, 2, 1)){
            System.out.println("Bad 10.2");
        }
        if(abcmath(1, 2, 3)){
            System.out.println("Bad 10.3");
        }

    }

    // task 1
    public static int remainder(int a, int b) {
        return a % b;
    }

    // task 2
    public static double triArea(double a, double h) {
        return (a * h) / 2;
    }

    // task 3
    public static int animals(int chicks, int cows, int pigs) {
        return 2 * chicks + 4 * cows + 4 * pigs;
    }

    // task 4
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return prob * prize > pay;
    }

    // task 5
    public static String operation(int n, int b, int c) {
        if (b + c == n) {
            return "added";
        } else if (b - c == n) {
            return "subtracted";
        } else if (b * c == n) {
            return "multiplied";
        } else if (b / c == n) {
            return "divided";
        }
        return "none";
    }

    // task 6
    public static int ctoa(char s) {
        return (int) s;
    }

    // task 7
    public static int addUpTo(int s) {
        int t = 0;
        for (int i = 1; i <= s; i++) {
            t += i;
        }
        return t;
    }

    // task 8
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    // task 9
    public static int sumOfCubes(int[] mas) {
        int t = 0;
        for (int i: mas){
            t += Math.pow(i, 3);
        }
        return t;
    }

    // task 10
    public static boolean abcmath(int a, int b, int c) {
        int t = a;
        for (int i = 0; i <= b; i++){
            t += t;
        }

        return t % c == 0;
    }


}