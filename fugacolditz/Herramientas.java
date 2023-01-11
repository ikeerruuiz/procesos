
package fugacolditz;

import java.util.ArrayList;


public class Herramientas {
    //pasaporte = P
    //alicates = A
    //uniforme = U
    char type;
    ArrayList<Posicion> pos = new ArrayList();
    
    public Herramientas(char tipo, ArrayList<Posicion> pos){
        this.pos=pos;
        this.type=tipo;
    }


}
