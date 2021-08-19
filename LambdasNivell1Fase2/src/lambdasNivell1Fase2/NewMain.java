package lambdasNivell1Fase2;

public class NewMain {

    public static void main(String[] args) {
        
        /* Instanciació de la interficie i assignació mitjançant una expressió
           lambda del valor 3.1416
           Invocació del mètode getPiValue
        */
        PiValue pv = () -> 3.1416;
	System.out.println(pv.getPiValue());
    
    }
    
}
