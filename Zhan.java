import java.util.Scanner;

public class Zhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testes = sc.nextInt();
        
        for (int i = 0; i < testes; i++) {
            int total = sc.nextInt();  
            int blenderporseg = sc.nextInt();  
            int capacidadeblender = sc.nextInt();  
            
           
            if (total == 0) {
                System.out.println(0);
                continue;
            }
            
            
            int resultado = (total + Math.min(blenderporseg, capacidadeblender) - 1) / Math.min(blenderporseg, capacidadeblender);
            System.out.println(resultado);
        }
        
        sc.close();
    }
}
