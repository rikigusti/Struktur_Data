package com.mycompany.tugaslinkedlist;
import java.util.LinkedList;
public class TugasLinkedList {

    public static void main(String[] args) {
        LinkedList<String>kota = new LinkedList<>();
        kota.add("Ambon");
        kota.add("Bandung");
        kota.add("Jakarta");
        kota.add("Denpasar");
        kota.add("Surabaya");
        
        //Menambahkan kota pada index ke 5
        kota.add(5,"Tanggerang");
        //Menambahkan data index paling atas
        kota.addFirst("Solo");
        //Menambah data index paling bawah        
        kota.addLast("Palembang");
//        Mengubah data
        kota.set(1,"Bogor");
//        Menghapus data paling atas
        kota.removeFirst();
//        Menghapus data paling bawah
        kota.removeLast();

        System.out.println("Nama Kota: "+kota);
        System.out.println("Jumlah Kota: "+kota.size());
        System.out.println("Kota Teratas: "+kota.getFirst());        
        System.out.println("Kota Terbawah: "+kota.getLast());

    }
}
