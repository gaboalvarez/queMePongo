import java.util.ArrayList;
import java.util.List;

interface Atuendo{}
public class AtuendoObjeto implements Atuendo{
    List<Prenda> prendas = new ArrayList<Prenda>();
    AtuendoObjeto(List<Prenda> prendasMateriaPrima){prendas = prendasMateriaPrima;} // para los sastres
    void agregar(Prenda prenda){prendas.add(prenda);} // para las prendas unitarias
    List<Prenda> mostrarPrendas(){return prendas;}
    int cantPrendas(){return prendas.size();}
}
class AtuendoNull implements Atuendo{

}