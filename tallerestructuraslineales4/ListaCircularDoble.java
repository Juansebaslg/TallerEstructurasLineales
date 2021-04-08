package tallerestructuraslineales4;

 public class ListaCircularDoble {
    NodoCD primero, ultimo;
    
    public ListaCircularDoble(){
        primero = null;
        ultimo = null;
    }
    public void addData(int dato){
        NodoCD nuevo = new NodoCD();
        nuevo.dato = dato;
        if (primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    public void mostrarListaDescendente(){
     NodoCD actual = new NodoCD();
     actual = primero;
     do{
        System.out.println("["+actual.dato+"]");
        actual = actual.siguiente;
     }while(actual != primero);
    }
    public int search(int num){
        NodoCD actual;
        actual = primero;
        int indice = 0;
        int pos =- 1;
        do{
            if(actual.dato == num){
                pos = indice;
            }
            actual = actual.siguiente;
            indice += 1;
        }while(actual != primero);
        return pos;
    }
 
}


