
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CALVIN
 */
public class Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilihan;
        System.out.println("--Malam Minggunya Programmer--\n");
            System.out.print("Kamu pilih AKU atau DIA??? (kamu/dia)");
            pilihan=in.nextLine();
            switch(pilihan){ // jika (pilihan)
                case "kamu":                   // 
                    System.out.println("\nAku pasti akan lebih baik dari dia!");
                    break;
                case "dia":
                    System.out.println("\nLebih baik aku pergi jauh dari hidupmu!");
                    break;
                default:
                    System.out.println("Aku tidak mengerti apa yang kau katakan!");
                    System.out.println("\nLebih baik aku pergi jauh dari hidupmu!");
            }
    }
}
