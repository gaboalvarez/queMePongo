import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Prenda {
    Material material;Color colores;Tipo tipo;
    Prenda(Tipo tipo, Material material, Color colores){
        this.tipo=tipo;this.material=material;this.colores=colores;
    }
    String getCategoria(){
        return tipo.getCategoria();
    }
}