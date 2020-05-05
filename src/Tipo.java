import java.util.List;
// Tipo("remera",new ParteSuperior())
public class Tipo {
    String descripcion;Categoria categoria;
    Tipo(String descripcion,Categoria categoria){
        if ((categoria.listado()).contains(descripcion)) {
            this.descripcion = descripcion;this.categoria = categoria;
        } else { System.out.println("No coincide el tipo con la categoria"); }
    }
    boolean valido(){return ((descripcion!=null)&&(categoria!=null));}
    String getCategoria(){
        return categoria.clasificacion();
    }
}
interface Categoria{String clasificacion();List<String> listado();}
class ParteSuperior implements Categoria {
    List<String> listado = List.of("remera","buzo","campera","chomba","camisa");
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
    List<String> listado = List.of("zapatillas","ojotas","crocs","zapatos");
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
