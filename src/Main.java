import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Borrador x1=new Borrador(new Tipo("remera",new ParteSuperior()),new Material("algodon"),new Color("rojo","amarillo"));
    Prenda p1 = x1.guardar();
    }
}