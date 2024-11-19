/*Today, a club fair was held at "NSPhM". In order to advertise his pastry club, Zhan decided to demonstrate the power of his blender.

To demonstrate the power of his blender, Zhan has n
 fruits.

The blender can mix up to x
 fruits per second.

In each second, Zhan can put up to y
 fruits into the blender. After that, the blender will blend min(x,c)
 fruits, where c
 is the number of fruits inside the blender. After blending, blended fruits are removed from the blender.

Help Zhan determine the minimum amount of time required for Zhan to blend all fruits. */

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
        
        sc.close();//teste git
    }
}
