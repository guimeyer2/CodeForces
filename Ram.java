/*Oh no, the ForceCodes servers are running out of memory! Luckily, you can help them out by uploading some of your RAM!

You want to upload n GBs of RAM. Every second, you will upload either 0
 or 1 GB of RAM. However, there is a restriction on your network speed: in any k
 consecutive seconds, you can upload only at most 1 GB of RAM in total.

Find the minimum number of seconds needed to upload n GBs of RAM!*/

import java.util.Scanner;

public class Ram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {  

            int totalGb = sc.nextInt();   
            int tempoEspera = sc.nextInt();   
            
            int segundos = 0;

            
            while (totalGb > 0) {

                if (totalGb >= 1){
                    
                    if (totalGb == 1){
                        segundos += 1;
                    }
                    else  segundos += tempoEspera; 

                } 
                totalGb--;  
            }

            
            System.out.println(segundos);
        }

        sc.close();
    }
}
