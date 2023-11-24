package org.example;

import Model.ModelBuku;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //testing model buku
        ModelBuku books = new ModelBuku();
        books.addBuku("Buku 1", "Pengarang 3", 2020, 10);
        books.addBuku("Buku 2", "Pengarang 4", 2020, 10);
        books.commitJSON();
        books.getListBuku().forEach(buku -> {
            System.out.println(buku.getKode());
            System.out.println(buku.getJudul());
            System.out.println(buku.getPengarang());
            System.out.println(buku.getTahunTerbit());
            System.out.println(buku.getStok());
        });
    }
}