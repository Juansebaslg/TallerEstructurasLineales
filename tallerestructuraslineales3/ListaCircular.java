package tallerestructuraslineales3;
/**
 *
 * @author Juan Sebastian
 */
public class ListaCircular {
    NodoCircular primero;
    NodoCircular ultimo;
    int cont = 0;
    
    public ListaCircular(){
      primero = null;
      ultimo = null;
    }
    public boolean isEmpty(){
     return ultimo == null;
    }
    public void addData(int dato){
     cont++;
     NodoCircular nuevo = new NodoCircular();
     nuevo.dato = dato;
     if(primero == null){
       primero = nuevo;
       ultimo = primero;
       primero.siguiente = ultimo;
     }else{
       ultimo.siguiente = nuevo;
       nuevo.siguiente = primero;
       ultimo = nuevo;
     }
   }
  public int size(){
  return cont;
}
    public void showData(){
     NodoCircular actual = new NodoCircular();
     actual = primero;
     do{
        System.out.println("["+actual.dato+"]");
        actual = actual.siguiente;
     }while(actual != primero);
   }
   public void deleteFirst(int dato){
    NodoCircular actual = new NodoCircular();
    NodoCircular anterior = new NodoCircular();
    actual = primero;
    anterior = ultimo;
    do{
       if(actual == primero){
         primero = primero.siguiente;
         ultimo.siguiente = primero;
       }else if(actual == ultimo){
         anterior.siguiente = ultimo.siguiente;
         ultimo = anterior;
       }else{
         anterior.siguiente = actual.siguiente;
       }
       anterior = actual;
       actual = actual.siguiente;
    }while(actual != primero);
  }
  public int unirDatos(int indice){
   NodoCircular aux = ultimo.siguiente;
   int i = 0;
   while(i < indice){
      aux = aux.siguiente;
      i += 1;
   }
   return aux.dato;
  }
}
    
