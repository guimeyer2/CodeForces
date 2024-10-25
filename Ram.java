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
