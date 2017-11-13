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
    //Cual es el valor maximo
    public void maximo(){
        Nodoo temp = top; //el objeto top le pasa todo lo que contiene al nuevo objeto creado temp
        int max=-1;// se declara una variable con un valor minimo 
        if(temp!= null){//si el objeto temp es igual o diferente a null , si esto se cumple entra en la condicion
                        //while 
            while(temp!=null){//si temp es igual o diferente de null, si esto se cumple se compara los valores del temp
                             //con max 
                if(temp.getValor() > max){ //si el valor que contiene el  objeto temp es mayor que la variable max entonces 
                    max = temp.getValor(); //se le asigna el nuevo valor a la variable max
                }
                temp = temp.getProx(); //el valor siguiente lo volvemos nuestro nuevo temp
            }
            System.out.println("El valor maximo es: " + max); //se imprime el valor máximo
            System.out.println("\n");// se imprime un salto de linea
        }else{
            System.out.println("Pila vacia.");// en caso de que no se cumpliera la condicion If se manda a imprimir un mensaje
            System.out.println("\n");// se imprime un salto de linea
        }
    }

    //Cual es el valor minimo
    public void minimo(){
        Nodoo temp = top;
        int min=10000000;// se declara una variable con un valor maximo
        if(temp!= null){//si el objeto temp es igual o diferente a null, si esto se cumple entra en la condicion while

            while(temp!=null){//si temp es diferente a null, si esto se cumple entra a la condicion If

                if(temp.getValor() < min){//compara los valores del temp con la variable min  
                    min = temp.getValor();// se le asigna el nuevo valor a la variable min 
                }
                temp = temp.getProx();//el valor siguiente lo volvemos nuestro nuevo temp 
            }
            System.out.println("El valor minimo es: " + min);//se imprime el valor minimo
            System.out.println("\n");//se imprime un salto de linea 
        }else{
            System.out.println("Pila vacia.");//se imprime un mensaje en caso de que no se cumpliera la condicion 
            System.out.println("\n");//se imprime un salto de linea 
        }
    }
}