package tallerestructuraslineales2;
import java.util.Scanner;
/**
 *
 * @author Juan Sebastian
 */
public class Interfaz2 {

    public static void main(String[] args) {
      ListaDoble lista = new ListaDoble();
      int ele;
      lista.addOrdered(23);
      lista.addOrdered(47);
      lista.addOrdered(66);
      lista.addOrdered(53);
      lista.addOrdered(12);
      Scanner teclado = new Scanner(System.in);
      System.out.print("Ingrese el dato del nodo a eliminar: ");
      ele = teclado.nextInt();
      lista.delete(ele);
      lista.showData();
    }
    
}
