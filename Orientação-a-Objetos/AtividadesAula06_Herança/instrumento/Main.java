package instrumento;

public class Main {
    public static void main(String[] args) {
        Instrumento i1 = new Violao();
        Instrumento i2 = new Piano();
        
        i1.tocar();
        i2.tocar();
        
        Violao v = new Violao();
        v.tocar();
    }
}
