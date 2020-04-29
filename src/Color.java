// Color("rojo") o Color("rojo","amarillo")
public class Color {
    String colorP;String colorS;
    Color(String colorP){this.colorP=colorP;}
    Color(String colorP, String colorS){this.colorP=colorP;this.colorS=colorS;}
    boolean valido(){return (colorP!=null);}
}
