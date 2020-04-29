import java.util.ArrayList;
import java.util.List;
public class Uniforme {
    List<Prenda> prendasDelUniforme = new ArrayList<>();
    Uniforme(Prenda p1, Prenda p2, Prenda p3){
        if(this.cumplenCondicion(p1.getCategoria(),p2.getCategoria(),p3.getCategoria())){
            prendasDelUniforme.add(p1);prendasDelUniforme.add(p2);prendasDelUniforme.add(p3);
        }else{
            System.out.println("No se cumple el requisito de una prenda de cada tipo");
        }
    }
    boolean cumplenCondicion(String p1, String p2, String p3){
        if (this.sonDistintos(p1,p2,p3)){
            if(p1.equals("Parte Superior") || p2.equals("Parte Superior") || p3.equals("Parte Superior")){
                if(p1.equals("Parte Inferior") || p2.equals("Parte Inferior") || p3.equals("Parte Inferior")){
                    if(p1.equals("Calzado") || p2.equals("Calzado") || p3.equals("Calzado")){
                        return true;
                    }else{return false;}
                }else{return false;}
            }else{return false;}
        }else{return false;}
    }
    boolean sonDistintos(String p1, String p2, String p3){
        return (!p1.equals(p2))&&(!p1.equals(p3))&&(!p3.equals(p2));
    }

}
/* ACA CREO VARIOS EJEMPLOS DE UNIFORMES, CODEAR -->
class SugerenciasUniformes{
    List<Uniforme> uniformes = new ArrayList<>();
    Uniforme boca = new Uniforme();
}*/

/* ACA SE CREAN LOS UNIFORMES DE LOS 2 COLEGIOS, CODEAR -->
class UniformeSanJuan{
    chomba verde de piqué, un pantalón de acetato gris y zapatillas blancas
}
class UniformeJohnson{
    camisa blanca, pantalón de vestir negro y zapatos negros
}
*/