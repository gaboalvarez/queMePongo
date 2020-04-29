import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<>();
    Atuendo(Atuendo atuendoYaFabricado){prendas = atuendoYaFabricado.mostrarPrendas();}
    void agregar(Prenda prenda){prendas.add(prenda);}
    List<Prenda> mostrarPrendas(){return prendas;}
}
