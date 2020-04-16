public class Prenda {
    Categoria categoria;
    String material;
    String colorPrincipal, colorSecundario;
    Prenda(Categoria categoria, String material, String colorPrincipal){
        this.categoria = categoria;this.material = material;this.colorPrincipal = colorPrincipal;

    }
    Prenda(Categoria categoria, String material, String colorPrincipal, String colorSecundario){
        this.categoria = categoria;this.material = material;this.colorPrincipal = colorPrincipal;this.colorSecundario = colorSecundario;

    }
    String getCategoria(){return categoria.getCategoria();}
}
interface Categoria{String getCategoria();}
class ParteSuperior implements Categoria{
    String tipo,categoria;
    ParteSuperior(String tipo){this.tipo = tipo;this.categoria="superior";}
    public String getCategoria(){return categoria;}
}
class ParteInferior implements Categoria{
    String tipo,categoria;
    ParteInferior(String tipo){this.tipo = tipo;this.categoria="inferior";}
    public String getCategoria(){return categoria;}
}
class Calzado implements Categoria{
    String tipo,categoria;
    Calzado(String tipo){this.tipo = tipo;this.categoria="calzado";}
    public String getCategoria(){return categoria;}
}
class Accesorio implements Categoria{
    String tipo,categoria;
    Accesorio(String tipo){this.tipo = tipo;this.categoria="accesorio";}
    public String getCategoria(){return categoria;}
}