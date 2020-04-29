// Material("algodon") o Material("algodon","con rayas")
public class Material {
    String tela;
    String trama = "lisa";
    Material(String tela){this.tela=tela;}
    Material(String tela, String trama){this.tela=tela;this.trama=trama;}
    boolean valido(){return (tela!=null);}
}
