
package Listas;


public class ListaCircular {
    nodo primero;
    nodo ultimo;
    
    
    public ListaCircular (){
        primero = null;
        ultimo = null;
    }

        public void insertarDato(int dato){
        
         nodo nodoNuevo = new nodo ();
    
        nodoNuevo.dato =  dato;
        
        if (primero == null){
        
            primero = nodoNuevo;
            
                       
            ultimo = primero;
            
            primero.siguiente = ultimo;
            
        }
        
        else {
        
             ultimo.siguiente = nodoNuevo;
             
             nodoNuevo.siguiente = primero;
             
             ultimo = nodoNuevo;
        
             
             
             }
        
        
    }
        
        
        
    public void verLista (){
    
    nodo actual = new nodo();
    
    actual = primero;
    
    do {
    
        
    System.out.println(" " + actual.dato);
    
    actual = actual.siguiente;
    
    } while (actual!=primero);  //PARA PROBAR EL FUNCIONAMIENTO DE CIRCULO PODEMOS PONER  actual!=null
        
    
    }
    

    
    
    
}
