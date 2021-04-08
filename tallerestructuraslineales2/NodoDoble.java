package tallerestructuraslineales2;
/**
 *
 * @author Juan Sebastian
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
    public NodoDoble(int ele){
      this(ele,null,null);
    }
    public NodoDoble(int ele, NodoDoble s, NodoDoble a){
      dato = ele;
      siguiente = s;
      anterior = a;
    }

}
