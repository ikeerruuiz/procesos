
package fugacolditz;

public class Matriz {
    String array[][];
    
    public Matriz(){
        array = new String[10][10];
    }
       
    public void rellenar(){
        for (int x = 0; x < array.length; x++) {
            for (int i = 0; i < array[x].length; i++) {
                //le meto  valores a la matriz
                array[x][i] = "X";
            }            
        }
    }

    public void imprimir(){
        for (int x = 0; x < array.length; x++) {
            for (int i = 0; i < array[x].length; i++) {
                System.out.print(array[x][i] + " ");
            }
            System.out.println("");
        }
    }
    
    
}
