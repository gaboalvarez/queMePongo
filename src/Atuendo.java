import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<>();
    void agregar(Prenda prenda){prendas.add(prenda);}
    List<Prenda> mostrarPrendas(){return prendas;}
}
