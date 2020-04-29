import java.util.List;
// Borrador(new Tipo(), new Material(), new Color())
public class Borrador {
    Material material;Color colores;Tipo tipo;
    Borrador(Tipo tipo, Material material, Color colores){
        this.tipo=tipo;this.material=material;this.colores=colores;
    }
    Prenda guardar(){
        if(material.valido() && colores.valido() && tipo.valido()){
            System.out.println("Prenda guardada con exito");
            return new Prenda(tipo,material,colores);
            /* verificar cómo hacer para que retorne una instancia, con alguna caracteristica visible, para poder manejarla (nombre, id)
            * ej: Prenda x = new Prenda(...), porque con new Prenda(...) no puedo manejarla*/
        }else{
            System.out.println("Falta alguna caracteristica de la prenda, no es valida");
            return null;
        }
    }
}
