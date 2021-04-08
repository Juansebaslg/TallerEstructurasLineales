package tallerestructuraslineales4;
/**
 *
 * @author Juan Sebastian
 */
public class Interfaz4 {

    public static void main(String[] args) {
     ListaCircularDoble lista = new ListaCircularDoble();
     lista.addData(13);
     lista.addData(21);
     lista.addData(35);
     lista.addData(42);
     lista.addData(66);
     lista.mostrarListaDescendente();
     int indice = lista.search(35);
        if(indice<0){
            System.out.println("El número no se encuentra en la lista");
        }else{
            System.out.println("El número se encuentra en la posición "+ indice +" de la lista");
        }
    }
}