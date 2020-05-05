import java.util.ArrayList;
import java.util.List;

public class Main {
    // ATUENDO --> INTERFAZ PARA ATUENDO_OBJETO Y ATUENDO_NULL (PARA QUE HAYA POLIMORFISMO)
    public static void main(String[] args) {
    Borrador x1=new Borrador(new Tipo("remera",new ParteSuperior()),new Material("algodon"),new Color("rojo","amarillo"));
    Prenda p1 = x1.guardar();
    AtuendoObjeto pocaRopa = new AtuendoObjeto(new ArrayList<Prenda>());
    pocaRopa.agregar(p1);
    System.out.print("elems: ");System.out.print(pocaRopa.cantPrendas());
    Sastre juancito = new Sastre();
    Atuendo unifSJ = juancito.crearUniforme(new UniformeSanJuan());
    }
}