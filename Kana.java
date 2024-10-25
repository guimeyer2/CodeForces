/* Kana was just an ordinary high school girl before a talent scout discovered her. Then, she became an idol. But different from the stereotype, she is also a gameholic.

One day Kana gets interested in a new adventure game called Dragon Quest. In this game, her quest is to beat a dragon.
The dragon has a hit point of x initially. When its hit point goes to 0or under 0, it will be defeated. In order to defeat the dragon, Kana can cast the two following types of spells.

Void Absorption
Assume that the dragon's current hit point is h, after casting this spell its hit point will become ⌊h2⌋+10
. Here ⌊h2⌋denotes h divided by two, rounded down.

Lightning Strike
This spell will decrease the dragon's hit point by 10
. Assume that the dragon's current hit point is h, after casting this spell its hit point will be lowered to h−10.

Due to some reasons Kana can only cast no more than n Void Absorptions and m Lightning Strikes. She can cast the spells in any order and doesn't have to cast all the spells. 
Kana isn't good at math, so you are going to help her to find out whether it is possible to defeat the dragon.*/

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
