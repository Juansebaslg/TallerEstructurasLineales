package tallerestructuraslineales;
/**
 *
 * @author Juan Sebastian
 */
public class ListaJava {
Nodo inicio,fin;
int cont = 0;

public ListaJava(){
  inicio = null;
  fin = null;
}
public boolean isEmpty(){
 if(inicio == null){
   return true;
 }else{
   return false;
 }
}
public void showData(){
  Nodo aux = inicio;
  while(aux != null){
      System.out.println("["+aux.dato+"]");
      aux = aux.siguiente;
  }
}
public int size(){
  return cont - 1;
}
public void addLast(int d){
    if(isEmpty()){
    inicio = new Nodo (d);
    fin = inicio;
  }else{
    fin.siguiente = new Nodo (d);
    fin = fin.siguiente;
  }
}
public void addAfter(int num, int d){
   Nodo nuevo = new Nodo(d);
   Nodo actual;
   actual = inicio;
   int n = -1;
   while(actual != null){
      if(actual.dato == num){
        n = cont;
      }
      cont += 1;
      actual = actual.siguiente;
   }
  if(n > 0){
    if(inicio == null){
      inicio = nuevo;
    }else{
      Nodo fin = inicio;
      int contador = 0;
      while(contador < n && fin.siguiente != null){
         fin = fin.siguiente;
         contador++;
      }
      nuevo.siguiente = fin.siguiente;
      fin.siguiente = nuevo;
    }
    cont++;
  }else{
    System.out.print("El tamaño no existe");
  }
}
public int deleteLast(){
 int elemento = fin.dato;
 if(inicio == fin){
   inicio = fin = null;
 }else{
   Nodo temporal = inicio;
   while(temporal.siguiente != fin){
      temporal = temporal.siguiente;
   }
   fin = temporal;
   fin.siguiente = null;
 }
 return elemento;
}

}
