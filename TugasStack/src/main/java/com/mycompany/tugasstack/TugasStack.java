package com.mycompany.tugasstack;
import java.util.Stack;
public class TugasStack {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Stack<String> stks = new Stack<>();

        boolean hasil =stk.empty();
        System.out.println("Apakah Stack Kosong? "+hasil);
        
        stk.push(2);
        stk.push(9);
        System.out.println("Elemem Dalam Stack: "+stk);
        
        stk.push(7);
        System.out.println("Elemem Dalam Stack: "+stk);
        
        stk.pop();
        System.out.println("Elemem Dalam Stack Setelah pop: "+stk);
        System.out.println("Ini Item Paling Atas: "+stk.peek());
        
        stks.push("Andika");
        stks.push("Redy");
        System.out.println("Elemem Dalam Stack: "+stks);
        
        stks.push("Riki");
        System.out.println("Elemem Dalam Stack: "+stks);
        
        stks.pop();
        System.out.println("Elemem Dalam Stack Setelah pop: "+stks);
        System.out.println("Ini Item Paling Atas: "+stks.peek());
        
        System.out.println("Dimanakah Lokasinya?: "+stks.search("Riki"));
    }
}
