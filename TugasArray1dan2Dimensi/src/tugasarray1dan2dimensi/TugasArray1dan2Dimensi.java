package tugasarray1dan2dimensi;
import java.util.Scanner;
public class TugasArray1dan2Dimensi {

    public static void main(String[] args) {
         String [] buah =new String[2];
        Scanner scan=new Scanner(System.in);

        for(int i=0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("---------------------------");
         System.out.println("----Array Satu Dimensi----");

        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }
         System.out.println("------Array Dua Dimensi------");
          String[][] kotak={
            {"Lili","08111"}, 
            {"Lala","08122"}, 
            {"Maya","08133"}
            };

        for(int x=0; x < kotak.length; x++){
            System.out.println("Nama: "+kotak[x][0]);
            System.out.println("Nomer: "+kotak[x][1]);
            System.out.println("-----------------------");
        }
    }
    
}
