import java.util.Scanner;

public class Sereja {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
       
        int totalCartas = sc.nextInt();
        int[] cartas = new int[totalCartas];
        
        for (int i = 0; i < totalCartas; i++) {
            cartas[i] = sc.nextInt();
        }

    int sereja = 0,  dima = 0;
    boolean vezSereja = true;
    int esq = 0, dir = totalCartas -1;
    
    while (esq <= dir) {
        if (cartas[esq] > cartas[dir]) {
            if (vezSereja) {
                sereja += cartas[esq];
            } else {
                dima += cartas[esq];
            }
            esq++;
        } else {
            if (vezSereja) {
                sereja += cartas[dir];
            } else {
                dima += cartas[dir];
            }
            dir--;
        }
        vezSereja = !vezSereja;
    }
    
    System.out.println(sereja + " " + dima);

        sc.close();
       }
       
    }

