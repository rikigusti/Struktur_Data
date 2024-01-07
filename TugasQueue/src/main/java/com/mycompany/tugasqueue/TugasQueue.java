package com.mycompany.tugasqueue;
import java.util.*;
public class TugasQueue {

    public static void main(String[] args) {
      Queue<String> antrian = new LinkedList<>();
        antrian.add("Andika");
        antrian.add("Redy");
        antrian.add("Riki");
        System.out.println("Antrian: "+antrian);
        
        antrian.add("Elga");
        antrian.add("Babang");       
        System.out.println("Antrian: "+antrian);
        
        antrian.poll();
        System.out.println("Antrian: "+antrian);
        
        antrian.remove();
        System.out.println("Antrian: "+antrian);

        System.out.println("Dipanggil: "+antrian.peek());
        System.out.println("Dipanggil Elemen: "+antrian.element());
        System.out.println("Jumlah antrian: "+antrian.size());
        
        antrian.clear();
        System.out.println("Antrian: "+antrian);
    }
}
