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
