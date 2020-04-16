import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<>();
    int superior = 0,inferior = 0,calzado = 0;
    void agregarPrenda(Prenda prenda){
        if(prenda.getCategoria()=="superior" && superior==0){superior+=1;prendas.add(prenda);}
        if(prenda.getCategoria()=="inferior" && inferior==0){inferior+=1;prendas.add(prenda);}
        if(prenda.getCategoria()=="calzado" && calzado==0){calzado+=1;prendas.add(prenda);}
        if(prenda.getCategoria()=="accesorio"){prendas.add(prenda);}
    }
// en esta solucion, se van agregando las prendas de a una, y no se admiten categorias repetidas (no puede haber 2 calzados, o 2 partes superiores).
}
