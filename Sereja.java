/* Sereja and Dima play a game. The rules of the game are very simple. The players have n cards in a row. Each card contains a number, all numbers on the cards are distinct. The players take turns, Sereja moves first. During his turn a player can take one card: either the leftmost card in a row, or the rightmost one. The game ends when there is no more cards. The player who has the maximum sum of numbers on his cards by the end of the game, wins.

Sereja and Dima are being greedy. Each of them chooses the card with the larger number during his move.

Inna is a friend of Sereja and Dima. She knows which strategy the guys are using, so she wants to determine the final score, given the initial state of the game. Help her.*/

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

