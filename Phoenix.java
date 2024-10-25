import java.util.Scanner;

public class Phoenix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  
            
            
            long pilhaA= 0;
            long pilhaB = 0;
            
            
            pilhaA+= (1 << n); 
            
            
            for (int j = 1; j <= n / 2 - 1; j++) {
                pilhaA+= (1 << j); 
            }
            
            
            for (int j = n / 2; j < n; j++) {
                pilhaB += (1 << j);  
            }
            
            long diferenca = Math.abs(pilhaA- pilhaB);
            
            
            System.out.println(diferenca);
        }
        
        sc.close();
    }
}
