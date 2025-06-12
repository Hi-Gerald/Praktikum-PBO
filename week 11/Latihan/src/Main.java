import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidBookIdException extends Exception {
    public InvalidBookIdException(String message) {
        super(message);
    }
}

class InvalidLoanDurationException extends Exception {
    public InvalidLoanDurationException(String message) {
        super(message);
    }
}

public class Main {
    public static void validateAndProcess(Scanner scanner) throws InvalidBookIdException, InvalidLoanDurationException {
        System.out.println("Masukkan nama peminjam:");
        String name = scanner.nextLine();
        System.out.println("Masukkan ID Buku yang tersedia: [\"B001\", \"B002\"]");
        String bookId = scanner.nextLine();
        System.out.println("Masukkan lama peminjaman (hari):");
        int loanDuration = scanner.nextInt();

        if (!bookId.equals("B001") && !bookId.equals("B002")) {
            throw new InvalidBookIdException("ID Buku tidak valid!");
        }

        if (loanDuration < 1 || loanDuration > 14) {
            throw new InvalidLoanDurationException("Lama peminjaman harus antara 1 - 14 hari.");
        }
        System.out.println("Peminjaman berhasil. Nama: " + name + ", ID Buku: " + bookId + ", Lama: " + loanDuration + " hari.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            validateAndProcess(scanner);
        } catch (InvalidBookIdException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Program selesai.");
        } catch (InvalidLoanDurationException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Program selesai.");
        } catch (InputMismatchException e) {
            System.out.println("Exception: Input tidak valid. Harap masukkan angka untuk lama peminjaman.");
            System.out.println("Program selesai.");
        } finally {
            scanner.close();
        }
    }
}