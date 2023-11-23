package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void luas_lingkaran(int r){
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran adalah " + luas);
    }

    public static void keliling_lingkaran(int r) {
        double keliling = 2 * 3.14 * r;
        System.out.println("Keliling lingkaran adalah " + keliling);
    }

    public static void KNN(){

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //luas lingkaran
        luas_lingkaran(10);

    }
}