public class Prenda {
    Categoria categoria;
    String material;
    String colorPrincipal, colorSecundario;
    Prenda(Categoria categoria, String material, String colorPrincipal){
        this.categoria = categoria;this.material = material;this.colorPrincipal = colorPrincipal;}
    Prenda(Categoria categoria, String material, String colorPrincipal, String colorSecundario){
        this.categoria = categoria;this.material = material;this.colorPrincipal = colorPrincipal;this.colorSecundario = colorSecundario;}
    String getCat(){return categoria.getCat();}
}
interface Categoria{String getCat();}
class ParteSuperior implements Categoria{
    String tipo,cat;
    ParteSuperior(String tipo){this.tipo = tipo;this.cat="sup";}
    public String getCat(){return cat;}
}
class ParteInferior implements Categoria{
    String tipo,cat;
    ParteInferior(String tipo){this.tipo = tipo;this.cat="inf";}
    public String getCat(){return cat;}
}
class Calzado implements Categoria{
    String tipo,cat;
    Calzado(String tipo){this.tipo = tipo;this.cat="cal";}
    public String getCat(){return cat;}
}
class Accesorio implements Categoria{
    String tipo,cat;
    Accesorio(String tipo){this.tipo = tipo;this.cat="acc";}
    public String getCat(){return cat;}
}