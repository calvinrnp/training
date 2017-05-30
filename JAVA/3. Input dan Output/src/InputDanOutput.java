
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CALVIN
 */
public class InputDanOutput {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in)); // Deklarasi variabel (input) dengan tipe class BufferedReader 
        String nama = ""; // Deklarasi String dengan identifier "nama"
        
        System.out.print("Isi Namamu : ");
        try{
            nama = input.readLine(); // mendapatkan input dari user dan memberikan nilai string dan akan disimpan di dalam variabel "nama"
        }catch(IOException e){
            System.out.println("Error!");
        } // penangkapan dan pelemparan error
        
        System.out.println("Halo "+nama+"!");
    }
    
}
