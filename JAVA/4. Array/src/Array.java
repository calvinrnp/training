/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CALVIN
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] murid; // deklarasi murid mahasiswa bertipe String
        murid = new String[5]; // membuat array murid dengan panjang 5
        murid[0] = "Dono"; // isi element array 0
        murid[1] = "Danu"; // isi element array 1
        murid[2] = "Dana"; // isi element array 2
        murid[3] = "Dini"; // isi element array 3
        murid[4] = "Doni"; // isi element array 4
        
        System.out.println("========= Array of murid =========="); // mencetak array

        for(int i=0;i<murid.length;i++){
           System.out.println("Murid "+i + ": " +murid[i]);
      } // for loop untuk mencetak isi dari array murid
    }
}
