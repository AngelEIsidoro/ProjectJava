public class Pilas
{
    private Nodoo top;
    
    public Pilas() {
        top = null;
    }
    public boolean vacia() {
        return (top==null);
    }
    public void push(int valor) { //Insertar
        Nodoo nuevoNodo;
        if(vacia() )
            top = new Nodoo(valor);
          else{
              nuevoNodo = new Nodoo (valor);
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
        Nodoo temp = top;
        if( temp!=null) {
            System.out.println("La pila es: ");
            while(temp!=null) {
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }else
            System.out.println("PILA VACÍA.");
    }
    
    //Creamos un metodo que determine el numero de elementos que hay en la pila
    public void tamaño(){
        //verificamos si la pila esta vacia con el metodo vacia
        if(!vacia()) {
            //insertamos una variable tipo int con el nombre de 
            //numerostamaño que es igual a 0. 
            int numerostamaño = 0;
            //de igual manera el objeto Nodo.
            Nodoo temp = top;
            //insertamos un while para verificar si temp es igual o diferente a null,
            //si se cumple esto se comparan los valores
            while (temp != null) {
                //La siguiente variable nos sirve para contar los elementos aregados
                numerostamaño++;
                //Este sirve para recorrerlos y esperar al siguiente numero insertado
                temp = temp.getProx();
            }
            //Insertamos un System.out.println para imprimir,
            //el numero de elementos que hay en la pila.
            System.out.println("El tamaño de la pila es: " + numerostamaño);
        }else{
            //Pero la pila esta vacia imprimira vacia...
            System.out.println("La pila esta vacía");
        }
    }
}
