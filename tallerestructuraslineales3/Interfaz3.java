package tallerestructuraslineales3;
import java.util.Scanner;
/**
 *
 * @author Juan Sebastian
 */
public class Interfaz3 {

    public static void main(String[] args) {
     ListaCircular lista1 = new ListaCircular();
     ListaCircular lista2 = new ListaCircular();
     int dato;
     lista1.addData(32);
     lista1.addData(56);
     lista1.addData(44);
     lista1.addData(89);
     lista1.addData(71);
     lista2.addData(90);
     lista2.addData(30);
     lista2.addData(60);
     Scanner teclado = new Scanner(System.in);
     System.out.print("Ingrese el dato del primer nodo: ");
     dato = teclado.nextInt();
     lista1.deleteFirst(dato);
     for(int i = 0; i < lista2.size(); i++){
        lista1.addData(lista2.unirDatos(i));
     }
     lista1.showData();
   }
}
