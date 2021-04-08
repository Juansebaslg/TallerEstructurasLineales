package tallerestructuraslineales;
import java.util.Scanner;
/**
 *
 * @author Juan Sebastian
 */
public class Interfaz {
    
    public static void main(String[] args){
        ListaJava lista = new ListaJava();
        int d;
        int num;
        lista.addLast(15);
        lista.addLast(25);
        lista.addLast(35);
        lista.addLast(45);
        lista.addLast(65);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el dato específico: ");
        num = teclado.nextInt();
        System.out.print("Ingrese el nuevo nodo: ");
        d = teclado.nextInt();
        lista.addAfter(num, d);
        lista.deleteLast();
        lista.showData();
        System.out.println("Esta vacía?: "+ lista.isEmpty());
        System.out.println("La cantidad de datos de la lista enlazada es: "+ lista.size());
        
    }
}
