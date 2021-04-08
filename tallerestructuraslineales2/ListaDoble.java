package tallerestructuraslineales2;
/**
 *
 * @author Juan Sebastian
 */
public class ListaDoble {
    NodoDoble inicio,fin;
    int cont = 0;
    
    public ListaDoble(){
     inicio = null;
     fin = null;
    }
    
    public boolean isEmpty(){
     return inicio == null;
    }
    
    public void addOrdered(int ele){
     NodoDoble nuevo = new NodoDoble(ele);
     nuevo.dato = ele;
     nuevo.siguiente = null;
     nuevo.anterior = null;
     if(inicio == null){
       inicio = nuevo;
       fin = nuevo;
     }else{
       NodoDoble aux = inicio;
       while((aux != null)&&(aux.dato < ele)){
         aux = aux.siguiente;
       }
       if(aux == null){
         nuevo.anterior = fin;
         fin.siguiente = nuevo;
         fin = nuevo;
       }else if(aux.anterior == null){
         nuevo.siguiente = inicio;
         inicio.anterior = inicio;
         inicio = nuevo;
       }else{
        NodoDoble ant = aux.anterior;
        ant.siguiente = nuevo;
        nuevo.anterior = ant;
        nuevo.siguiente = aux;
        aux.anterior = nuevo;
       }
       }
     }
    public void delete(int ele){
     NodoDoble actual = new NodoDoble(ele);
     NodoDoble atras = new NodoDoble(ele);
     actual = inicio;
     atras = null;
     while(actual != null){
        if(actual.dato == ele){
          if(actual == inicio){
            inicio = inicio.siguiente;
            inicio.anterior = null;
          }else{
            atras.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
          }
        }
        atras = actual;
        actual = actual.siguiente;
     }
    }
    public void showData(){
      NodoDoble aux = inicio;
      while(aux != null){
      System.out.println("["+aux.dato+"]");
      aux = aux.siguiente;
    }
     }

}
