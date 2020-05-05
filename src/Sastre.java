import java.util.ArrayList;
import java.util.List;
public class Sastre {
    Atuendo crearUniforme(Uniforme uniforme){
        Prenda p1 = uniforme.prenda1();Prenda p2 = uniforme.prenda2();Prenda p3 = uniforme.prenda3();
            if(this.cumplenCondicion(p1.getCategoria(),p2.getCategoria(),p3.getCategoria())){
                List<Prenda> temporal = new ArrayList<Prenda>();temporal.add(p1);temporal.add(p2);temporal.add(p3);
                System.out.println("\n Uniforme creado con exito");
                return new AtuendoObjeto(temporal);
            }else{
                System.out.println("No se cumple el requisito de una prenda de cada tipo");
                return new AtuendoNull();
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
}*/
interface Uniforme{Prenda prenda1();Prenda prenda2();Prenda prenda3();}
class UniformeSanJuan implements Uniforme{
    Prenda chombaVerdePique = new Prenda(new Tipo("chomba",new ParteSuperior()),new Material("pique"),new Color("verde"));
    Prenda pantalonAcetatoGris = new Prenda(new Tipo("pantalon",new ParteInferior()),new Material("acetato"),new Color("gris"));
    Prenda zapatillasBlancas = new Prenda(new Tipo("zapatillas",new Calzado()),new Material("nose"),new Color("blancas"));
    public Prenda prenda1(){return chombaVerdePique;}
    public Prenda prenda2(){return pantalonAcetatoGris;}
    public Prenda prenda3(){return zapatillasBlancas;}
}
class UniformeJohnson implements Uniforme{
    Prenda camisaBlanca = new Prenda(new Tipo("camisa",new ParteSuperior()),new Material("algodon"),new Color("blanca"));
    Prenda pantalonNegro = new Prenda(new Tipo("pantalon",new ParteInferior()),new Material("nose"),new Color("negro"));
    Prenda zapatosNegros = new Prenda(new Tipo("zapatos",new Calzado()),new Material("nose"),new Color("negro"));
    public Prenda prenda1(){return camisaBlanca;}
    public Prenda prenda2(){return pantalonNegro;}
    public Prenda prenda3(){return zapatosNegros;}
}