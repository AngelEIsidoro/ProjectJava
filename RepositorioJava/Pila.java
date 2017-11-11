public class Pila
{
    private Nodo top;
    
    public Pila() {
        top = null;
    }
    public boolean vacia() {
        return (top==null);
    }
    public void push(int valor) { //Insertar
        Nodo nuevoNodo;
        if(vacia() )
            top = new Nodo(valor);
          else{
              nuevoNodo = new Nodo (valor);
              nuevoNodo.setProx(top);
              top = nuevoNodo;
              }
    }
    public void cima() {//Buscar
        if(!vacia() )
            System.out.println("Cima: " + top.getValor());
            else
                System.out.println("La pila esta vacia");
    }
    public void pop() {//Extraer o Borrar
        if(!vacia()) {
            System.out.println("Dato extraido: " + top.getValor());
            top = top.getProx();
        }else
            System.out.println("La pila esta vacia");
    }
    
    public void peek() {//Mostrar
        Nodo temp = top;
        if( temp!=null) {
            System.out.println("La pila es: ");
            while(temp!=null) {
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }else
            System.out.println("PILA VACÍA.");
    }
    
    //Buscar número
    public void Buscar(int referencia){
        Nodo temp = top;
        int contador = 0;

        if (buscar(referencia)) {
           while (temp != null) {
              if (referencia == temp.getValor()) {
                 System.out.println("El numero: " + temp.getValor() + " esta en la posición " + contador);
              }

              temp = temp.getProx();
              contador++;
           }
              System.out.println("\n");
        }else{
           System.out.println("El número no esta en la pila");
           System.out.println("\n");
        }
    }
    
    //Método que no ayudara a verificar si el elemento se encuentra devolviendonos un true
    public boolean buscar(int numero){
        // Crea una copia de la lista.
        Nodo temp = top;;
        // Indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta
        // llegar al final de la lista.
        while(temp != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (numero == temp.getValor()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }

            // Avansa al siguiente. nodo.
            temp = temp.getProx();

        }
        // Retorna el resultado.
        return encontrado;
    }
}
