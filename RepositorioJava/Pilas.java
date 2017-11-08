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
}
