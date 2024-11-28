package tic.tac.toe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class TICTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        char[][] tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(tablero[i], ' ');
        }
        Scanner scanner = new Scanner(System.in);
        boolean fin = false;

        char jugador1 = 'X';
        while (!fin) {
            InprimirTab(tablero);

            System.out.println("Jugador " + jugador1 + " te toca");
            System.out.println("Ingresa la fila 0, 1, 2");
            int fila = scanner.nextInt();
            System.out.println("Ingresa la columna 0, 1, 2");
            int columna = scanner.nextInt();
            if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
                System.out.println("intenta de nuevo");
                continue;
            }

            if (tablero[fila][columna] != ' ') {
                System.out.println(" intenta de nuevo en otra posicion");
                continue;
            }

            tablero[fila][columna] = jugador1;
            if (Gandador(tablero, jugador1)) {
                System.out.println("Jugador " + jugador1 + " gana");
                InprimirTab(tablero);
                fin = true;
            }
            if (TableroLleno(tablero)) {
                System.out.println("empate");
                fin = true;
            }
            jugador1 = (jugador1 == 'X' ? 'O' : 'X');
        }
    }

    private static void InprimirTab(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
        }
    }

    private static boolean TableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean Gandador(char[][] tab, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == jugador && tab[i][1] == jugador && tab[i][2] == jugador) {
                return true;
            }
            if (tab[0][i] == jugador && tab[1][i] == jugador && tab[2][i] == jugador) {
                return true;
            }
        }
        return (tab[0][2] == jugador && tab[1][1] == jugador && tab[2][0] == jugador) || (tab[0][0] == jugador && tab[1][1] == jugador && tab[2][2] == jugador);
    }
}
