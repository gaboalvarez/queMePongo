import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Prenda remeraRoja = new Prenda(new TipoPrenda("remera",new ParteSuperior()),"algodon","rojo");
        System.out.println("prueba1");
        Prenda pantalonAzul = new Prenda(new TipoPrenda("pantalon",new ParteSuperior()),"algodon","azul");
        System.out.println("prueba2");
    }
}