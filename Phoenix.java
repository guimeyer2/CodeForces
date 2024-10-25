/* Phoenix has n coins with weights 2^1,2^2,…,2^n. He knows that n is even.

He wants to split the coins into two piles such that each pile has exactly n^2   coins and the difference of weights between the two piles is minimized. Formally, let a
 denote the sum of weights in the first pile, and b denote the sum of weights in the second pile. Help Phoenix minimize |a−b|, the absolute value of a−b. */
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
