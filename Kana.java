import java.util.Scanner;

public class Kana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {

            int hitpoints = sc.nextInt();
            int absorb = sc.nextInt();
            int raio = sc.nextInt();

            while (absorb > 0 && hitpoints > 20) {
                hitpoints = hitpoints / 2 + 10;
                absorb--;
            }

            
            hitpoints -= raio * 10;

            
            if (hitpoints <= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
