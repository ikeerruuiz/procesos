
package fugacolditz;


import java.util.Random;
import java.util.Scanner;

public class Personaje {
    Posicion pos;
    Boolean bp, ba, bu;
    Herramientas herramientas;
    boolean win;

    Scanner teclado = new Scanner(System.in);

    public Personaje(Posicion pos) {
        this.pos = pos;
        this.ba = false;
        this.bp = false;
        this.bu = false;
    }

    public void recogerHerramienta(int x, int y, Matriz tablero) {
        System.out.println("HAS Obtenido la herramienta,pero debes jugar a piedra=1,papel=2 o tijeras=3");
        System.out.print("ELIGE: ");
        int valor = teclado.nextInt();
        int aleatorio = (int) ((Math.random() * 3 + 1));
        if (aleatorio == valor) {
            win = true;
            switch (tablero.array[x][y]) {
                case "P", "A", "U":
                    tablero.array[x][y] = "X";
                    break;

            }
        } else {
            win = false;

        }

    }
}
