/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CALVIN
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai = 65;
        if(nilai>70){ // dilakukan jika nilai lebih besar dari 70
            System.out.println("Excellent!");
        }else if(nilai>60){ // dilakukan jika nilai lebih besar dari 60
            System.out.println("Very Good!"); 
        }else{ // dilakukan jika nilai lebih kecil dari yang di atas
            System.out.println("Maaf kamu tidak lulus");
        }
    }
    
}
