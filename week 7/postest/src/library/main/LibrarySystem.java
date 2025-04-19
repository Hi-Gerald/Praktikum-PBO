package library.main;

import library.model.Book;
import library.model.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(String title, String author, int yearPublished) {
        books.add(new Book(title, author, yearPublished));
        System.out.println("Buku berhasil ditambahkan.\n");
    }

    public void addMember(String name, String memberId) {
        members.add(new Member(name, memberId));
        System.out.println("Anggota berhasil ditambahkan.\n");
    }

    public void displayBooks() {
        System.out.println("\n=== Daftar Buku ===");
        if (books.isEmpty()) {
            System.out.println("Belum ada buku.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayMembers() {
        System.out.println("\n=== Daftar Anggota ===");
        if (members.isEmpty()) {
            System.out.println("Belum ada anggota.");
        } else {
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Tampilkan Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    system.addBook(title, author, year);
                }
                case 2 -> {
                    System.out.print("Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("ID Anggota: ");
                    String id = scanner.nextLine();
                    system.addMember(name, id);
                }
                case 3 -> system.displayBooks();
                case 4 -> system.displayMembers();
                case 0 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
