package com.mycompany.sistembansos;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class PenerimaBantuan {
    String nama;
    String alamat;
    double besaranBantuan;

    public PenerimaBantuan(String nama, String alamat, double besaranBantuan) {
        this.nama = nama;
        this.alamat = alamat;
        this.besaranBantuan = besaranBantuan;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nBesaran Bantuan: " + besaranBantuan + "\n";
    }
}
public class SistemBansos {

    static LinkedList<PenerimaBantuan> daftarPenerima = new LinkedList<>();
    static Stack<PenerimaBantuan> stackPenerima = new Stack<>();
    static Queue<PenerimaBantuan> queuePenerima = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Bantuan Sosial ===");
            System.out.println("1. Tambah Penerima Bantuan");
            System.out.println("2. Lihat Daftar Penerima Bantuan (Linked List)");
            System.out.println("3. Tumpukkan Penerima Bantuan (Stack)");
            System.out.println("4. Antrian Penerima Bantuan (Queue)");
            System.out.println("5. Cari Penerima Bantuan");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi (1/2/3/4/5/6): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahPenerima(scanner);
                    break;
                case 2:
                    lihatDaftarPenerima();
                    break;
                case 3:
                    tumpukPenerima();
                    break;
                case 4:
                    antrePenerima();
                    break;
                case 5:
                    cariPenerima(scanner);
                    break;
                case 6:
                    System.out.println("Terima kasih. Program berakhir.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    static void tambahPenerima(Scanner scanner) {
        System.out.print("Masukkan nama penerima: ");
        String nama = scanner.next();
        System.out.print("Masukkan alamat penerima: ");
        String alamat = scanner.next();
        System.out.print("Masukkan besaran bantuan: ");
        double besaranBantuan = scanner.nextDouble();

        PenerimaBantuan penerima = new PenerimaBantuan(nama, alamat, besaranBantuan);
        daftarPenerima.add(penerima);
        stackPenerima.push(penerima);
        queuePenerima.add(penerima);

        System.out.println("Penerima bantuan berhasil ditambahkan.");
    }

    static void lihatDaftarPenerima() {
        System.out.println("\n=== Daftar Penerima Bantuan (Linked List) ===");
        if (daftarPenerima.isEmpty()) {
            System.out.println("Belum ada penerima bantuan.");
        } else {
            for (PenerimaBantuan penerima : daftarPenerima) {
                System.out.println(penerima);
            }
        }
    }

    static void tumpukPenerima() {
        System.out.println("\n=== Tumpukkan Penerima Bantuan (Stack) ===");
        if (stackPenerima.isEmpty()) {
            System.out.println("Belum ada penerima bantuan.");
        } else {
            while (!stackPenerima.isEmpty()) {
                System.out.println(stackPenerima.pop());
            }
        }
    }

    static void antrePenerima() {
        System.out.println("\n=== Antrian Penerima Bantuan (Queue) ===");
        if (queuePenerima.isEmpty()) {
            System.out.println("Belum ada penerima bantuan.");
        } else {
            while (!queuePenerima.isEmpty()) {
                System.out.println(queuePenerima.poll());
            }
        }
    }

    static void cariPenerima(Scanner scanner) {
        System.out.print("Masukkan nama penerima yang dicari: ");
        String namaCari = scanner.next();

        boolean ditemukan = false;

        for (PenerimaBantuan penerima : daftarPenerima) {
            if (penerima.nama.equalsIgnoreCase(namaCari)) {
                System.out.println("=== Penerima Bantuan Ditemukan ===");
                System.out.println(penerima);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Penerima bantuan dengan nama '" + namaCari + "' tidak ditemukan.");
        }
    }
}
