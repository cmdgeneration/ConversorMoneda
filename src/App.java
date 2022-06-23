import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Bienvenido al conversor de moneda!");
        System.out.println("Por favor, introduzca una cantidad en euros y el programa le devolverá la conversión en US dólares: ");
        
        Scanner myObjScanner = new Scanner(System.in);
        double euros = myObjScanner.nextDouble();

        double equivalencia = 1/0.947771;

        System.out.println("La cantidad de " + euros + " euros equivalen a " + (euros*equivalencia) + " US dólares");
    }
}
