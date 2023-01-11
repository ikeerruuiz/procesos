package fugacolditz;

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
        int aleatorio = (int) ((Math.random() * 3 + 1));//1piedra/2papel/3tijeras
        if (aleatorio == 1 && valor == 2) { //piedra vs papel
            win = true;
        }
        if (aleatorio == 2 && valor == 3) {//papel vs tijeras
            win = true;
        }
        if (aleatorio == 3 && valor == 1) {//tijeras vs piedra
            win = true;
        }
        if (aleatorio == valor) {
            win = false;
        }
        if (win) {
            switch (tablero.array[x][y]) {
                case "P", "A", "U":
                    tablero.array[x][y] = "X";
                    break;

            }

        }

    }
}
