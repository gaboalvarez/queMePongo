import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Prenda {
    String material; String colorPrincipal; String colorSecundario;
    TipoPrenda tipo;

    Prenda(TipoPrenda tipo, String material, String colorPrincipal) throws Exception{
        this.tipo=tipo;this.material=material;this.colorPrincipal=colorPrincipal;
        if(tipo==null || material==null || colorPrincipal==null){
            throw new Exception("no puede haber elementos nulos");
        }
    }
    Prenda(TipoPrenda tipo, String material, String colorPrincipal, String colorSecundario) throws Exception{
        this.tipo=tipo;this.material=material;this.colorPrincipal=colorPrincipal;this.colorSecundario=colorSecundario;
        if(tipo==null || material==null || colorPrincipal==null || colorSecundario==null){
            throw new Exception("no puede haber elementos nulos");
        }
    }
}

class TipoPrenda {
    String descripcion;
    TipoPrenda(String descripcion,Categoria categoria) throws Exception{
        if ((categoria.listado()).contains(descripcion)) {
            this.descripcion = descripcion;
        } else { throw new Exception("no coinciden los tipos"); }
    }
}
interface Categoria{String clasificacion();List<String> listado();}
class ParteSuperior implements Categoria {
    List<String> listado = List.of("remera","buzo","campera");
    public String clasificacion(){
        return "Parte Superior";
    }
    public List<String> listado(){
        return listado;
    }
}
class ParteInferior implements Categoria {
    List<String> listado = List.of("pantalon","bermuda","malla");
    public String clasificacion(){
        return "Parte Inferior";
    }
    public List<String> listado(){
        return listado;
    }
}
class Calzado implements Categoria {
    List<String> listado = List.of("zapatillas","ojotas","crocs");
    public String clasificacion(){
        return "Calzado";
    }
    public List<String> listado(){
        return listado;
    }
}
class Accesorio implements Categoria {
    List<String> listado = List.of("reloj","pulsera","anillo");
    public String clasificacion(){
        return "Accesorio";
    }
    public List<String> listado(){
        return listado;
    }
}