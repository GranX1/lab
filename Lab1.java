public class Lab1 {

    public static void main(String[] args) {
        BancoDePalabras miBanco = new BancoDePalabras(); 
        String respuesta = miBanco.dameUnaPalabra(); 
        System.out.println(respuesta); 
    }
}

public class BancoDePalabras {

    String palabra = "banana";

    /**
     * Constructor de la clase BancoDePalabras
     */
    public BancoDePalabras() {
        
        palabra = "banana";
    }

    public String dameUnaPalabra() {
        return palabra; 
    }
}