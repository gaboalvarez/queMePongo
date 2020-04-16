import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<>();
    int sup = 0,inf = 0,cal = 0;
    void agregarPrenda(Prenda prenda){
        if(prenda.getCat()=="sup" && sup==0){sup+=1;prendas.add(prenda);}
        if(prenda.getCat()=="inf" && inf==0){inf+=1;prendas.add(prenda);}
        if(prenda.getCat()=="cal" && cal==0){cal+=1;prendas.add(prenda);}
        if(prenda.getCat()=="acc"){prendas.add(prenda);}
    }
// en esta solucion, se van agregando las prendas de a una, y no se admiten categorias repetidas (no puede haber 2 calzados, o 2 partes superiores).
}
