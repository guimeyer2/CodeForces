/* What joy! Petya's parents went on a business trip for the whole year and the playful kid is left all by himself. Petya got absolutely happy. He jumped on the bed and threw pillows all day long, until...

Today Petya opened the cupboard and found a scary note there. His parents had left him with duties: he should water their favourite flower all year, each day, in the morning, in the afternoon and in the evening. "Wait a second!" — thought Petya. He know for a fact that if he fulfills the parents' task in the i-th (1 ≤ i ≤ 12) month of the year, then the flower will grow by ai centimeters, and if he doesn't water the flower in the i-th month, then the flower won't grow this month. Petya also knows that try as he might, his parents won't believe that he has been watering the flower if it grows strictly less than by k centimeters.

Help Petya choose the minimum number of months when he will water the flower, given that the flower should grow no less than by k centimeters.*/

import java.util.Scanner;
import java.util.Arrays;

public class Trip {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

int k = sc.nextInt();
int[] crescimentoMes = new int[12];


for (int i = 0; i < 12; i++) {
    crescimentoMes[i] = sc.nextInt();
}
sc.close();

if (k ==0){
    System.out.println(0);
    return;
}
Arrays.sort(crescimentoMes);
int crescimentoTotal = 0;
int meses = 0;

for (int i = 11; i >= 0; i--) {
    crescimentoTotal += crescimentoMes[i];
    meses++;
    if (crescimentoTotal >= k) {
        System.out.println(meses);
        return;
    }
}

System.out.println(-1);
}
}
