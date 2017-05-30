/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CALVIN
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // while loop = pernyataan yang diulang-ulang sampai mencapai kondisi yang cocok
        int a = 5;
        
        while ( a > 0 ){ 
            System.out.print(a); a--;
        }
        System.out.println("");
        
        // do-while loop = sama dengan while loop tapi akan dieksekusi sedikitnya 'satu' kali
        // akan dilakukan selama kondisi (while) adalah benar
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b<10);
        
        /* for loop
        
            for(InitializationExpression;LoopCondition;StepExpression)
                InitializationExpression = inisialisasi pada variabel loop
                LoopCondition = membandingkan variabel loop pada nilai batas tertentu
                StepExpression = melakukan update pada variabel loop. 
        */ 
        int c;
        for(c=0;c<10;c++){
            System.out.print(c);
        }
    }
}
