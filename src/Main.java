import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Prenda remeraRoja = new Prenda(new TipoPrenda("remera",new ParteSuperior()),"algodon","rojo");
        System.out.println("prueba1");
        Prenda pantalonAzul = new Prenda(new TipoPrenda("pantalon",new ParteInferior()),"algodon","azul");
        System.out.println("prueba2");
        Atuendo outfit1 = new Atuendo();
        outfit1.agregar(remeraRoja);
        outfit1.agregar(pantalonAzul);
        System.out.println(outfit1.mostrarPrendas());
    }
}