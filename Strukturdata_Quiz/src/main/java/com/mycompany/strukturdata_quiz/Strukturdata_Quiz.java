package com.mycompany.strukturdata_quiz;
import java.util.Stack;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Comparator;
public class Strukturdata_Quiz {
    public static void main(String[] args) {
         //Tipe data
     record  Mahasiswa(String nama,int npm, String prodi,String kartu ){}
     record  Jurnal(String kode,String judul,String penulis, int terbit ){}
     record  Peminjam(int npm, String kodejurnal ){}
       
        System.out.println("<==========================================>");
        System.out.println("<==Data Peminjaman Jurnal Di Perpustakaan==>");
        System.out.println("<==========================================>");
        System.out.println();
        System.out.println("<==========================================>");
        System.out.println("<======Data Mahasiswa Peminjam Jurnal======>");
        System.out.println("<==========================================>");
        System.out.println();
         //Record
       Mahasiswa person1 = new Mahasiswa("Akbar", 235520111,"Teknik Informatika","3.Tetap");
        Mahasiswa person2 = new Mahasiswa("Andika", 235520112,"Desain Komunikasi Visual","5.Sementara");
        Mahasiswa person3 = new Mahasiswa("Bagas", 235520113,"Teknik Industri","1.Khusus");
        Mahasiswa person4 = new Mahasiswa("Redy", 235520114,"Teknik Informatika","2.Tetap");
        Mahasiswa person5 = new Mahasiswa("Riki ", 235520115,"Bisnis Digital ","4.Sementara");
        
        Jurnal[]jurnal=new Jurnal[6];
        jurnal[0] = new Jurnal("001", "Implementasi Algoritma Machine Learning pada deteksi Intruksi Jaringan ", "Dr. Putri Wulandri", 2019);
        jurnal[1] = new Jurnal("002", "Analisis Kinerja Sistem Database Terdistribusi dengan Pendekatan Cloud Computing  ", "Prof. Bambang Santoso", 2020);
        jurnal[2] = new Jurnal("003", "Pengembangan Aplikasi Mobile Berbasis Internet of Things (IoT) untuk Pemantauan Lingkungan ", "Dr. Rudi Hartanto", 2018);
        jurnal[3] = new Jurnal("004", "Keamanan Sistem Informasi: Tantangan dan Solusi Terkini", "Dr. Anisa Fitri ", 2021);
        jurnal[4] = new Jurnal("005", "Perbandingan Performa Jaringan Syaraf Tiruan dalam Pengenalan Pola Tulisan Tangan", "Prof. Andi Kurniawan", 2017);
        jurnal[5] = new Jurnal("006", "Penerapan Teknologi Blockchain dalam Keamanan Data: Suatu kajian Literatur", "Dr. Indra Perdana", 2022);

        //Array
         Mahasiswa[] mahasiswaarray = {person1, person2, person3, person4, person5};
        for(Mahasiswa kupu : mahasiswaarray){
            System.out.println("Nama   : "+kupu.nama()+"\n" +"NPM    : "+kupu.npm()+"\n" +"Jurusan: "+kupu.prodi());
        }
        System.out.println();
        System.out.println("<==========================================>");
        System.out.println("<=======Daftar Jurnal Di Perpustakaan=======>");
        System.out.println("<==========================================>");
        System.out.println();
        
         System.out.println(" Kode Jurnal:" +jurnal[0].kode + ". " + jurnal[0].judul+"\n"  + " Penulis    : " + jurnal[0].penulis +"\n" + " Terbitan   : " + jurnal[0].terbit);
        System.out.println(" Kode Jurnal:" +jurnal[1].kode + ". " + jurnal[1].judul+"\n"  + " Penulis    : " + jurnal[1].penulis +"\n" + " Terbitan   : " + jurnal[1].terbit);
        System.out.println(" Kode Jurnal:" +jurnal[2].kode + ". " + jurnal[2].judul+"\n"  + " Penulis    : " + jurnal[2].penulis +"\n" + " Terbitan   : " + jurnal[2].terbit);
        System.out.println(" Kode Jurnal:" +jurnal[3].kode + ". " + jurnal[3].judul +"\n" + " Penulis    : " + jurnal[3].penulis +"\n" + " Terbitan   : " + jurnal[3].terbit);
        System.out.println(" Kode Jurnal:" +jurnal[4].kode + ". " + jurnal[4].judul +"\n" + " Penulis    : " + jurnal[4].penulis +"\n" + " Terbitan   : " + jurnal[4].terbit);
        System.out.println(" Kode Jurnal:" +jurnal[5].kode + ". " + jurnal[5].judul +"\n" + " Penulis    : " + jurnal[5].penulis +"\n" + " Terbitan   : " + jurnal[5].terbit);
        
        //Stack
        Stack<Jurnal> RakJurnal = new Stack<>();
        for (Jurnal stack:jurnal){
            RakJurnal.push(stack);
        }
        System.out.println();
        System.out.println("<==========================================>");
        System.out.println("<===Jurnal Pada Rak Yang Dapat Dipinjam===>");
        System.out.println("<==========================================>");
        System.out.println();
        for(Jurnal stackjurnal:RakJurnal){
          System.out.println("Kode:" +stackjurnal.kode()+", Judul: "+stackjurnal.judul()+",Penulis: "+stackjurnal.penulis()+", Terbit: "+stackjurnal.terbit());
        }
        System.out.println();
//        Queue
        PriorityQueue<Mahasiswa> peminjam = new PriorityQueue<>(Comparator.comparing(Mahasiswa::kartu));
        peminjam.add(person1);
        peminjam.add(person2);
        peminjam.add(person3);
        peminjam.add(person4);
        System.out.println();
        System.out.println();

//      LinkedList
        LinkedList<Jurnal>pinjam =new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("<==========================================>");
        System.out.println("<=======Daftar Jurnal Di Perpustakaan=======>");
        System.out.println("<==========================================>");
        System.out.println();
        System.out.print("Masukan Banyak Jurnal Yang Akan  Dipinjam :");
        int banyak = input.nextInt();
        input.nextLine();
        
        Peminjam[] pinjamarray = new Peminjam[banyak];
               
        for (int i = 0; i < banyak; i++){
            Mahasiswa urutanmahasiswa = peminjam.poll();
            System.out.println("urutan ke - " + (i+1));
            System.out.println("Nama Mahasiswa : "+urutanmahasiswa.nama()+", NPM : "+urutanmahasiswa.npm()+", Prodi : "+urutanmahasiswa.prodi());
            System.out.print("Masukan kode jurnal yang akan dipinjam : ");
            String Kodejurnal = input.next();
            boolean kodesesuai = false;
            
            for(Jurnal peminjaman : jurnal){
                if (peminjaman.kode().equals(Kodejurnal)) {
                    kodesesuai = true;
                    pinjam.push(peminjaman);
                    RakJurnal.remove(peminjaman);
                    break;
                }
            }
            if (kodesesuai){
                pinjamarray[i] = new Peminjam(urutanmahasiswa.npm(),Kodejurnal);      
                System.out.println("<< Kode Jurnal Terdaftar , Peminjaman Berhasil >>");
            }else {
                System.out.println("<< Peminjaman Gagal, Kode Jurnal Tidak Terdaftar Harap Cek Kembali atau hubungi kepala perpustakaan >>");
            }
            System.out.println("=====================================================================");
            
        }
        System.out.println("Daftar Jurnal yang tersedia pada Rak : ");
        for (Jurnal stackjurnal : RakJurnal) {
            System.out.println("Kode: " + stackjurnal.kode() + ", Judul: " + stackjurnal.judul() + ", Penulis: " + stackjurnal.penulis() + ", Terbit: " + stackjurnal.terbit());
    }
    }
}
