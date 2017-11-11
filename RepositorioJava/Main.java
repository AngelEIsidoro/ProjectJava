import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int elementos,numero,buscarnumero;

        Pila p = new Pila();

        do{
          System.out.println("Elige una opción");
          System.out.println("1. Insertar\t\t2. Mostrar\t\t3. Buscar\t\t4. Eliminar");
          System.out.println("5. Tamaño\t\t6. Máximo\t\t7. Mínimo\t\t8. Terminar");

          opcion = sc.nextInt();

            switch (opcion) {
              case 1:
                  System.out.println("Inserte el valor");
                  numero =sc.nextInt();
                  p.push(numero);
                  break;
              case 2:
                  p.peek();
                  break;
              case 3: 
                  if(!p.vacia()) {
                      System.out.println("¿Que numero desea buscar?");
                      buscarnumero = sc.nextInt();
                      p.Buscar(buscarnumero);
                  }else{
                      System.out.println("La pila esta vacía");
                      System.out.println("\n");
                  }
                  break;
              case 4:
                  p.pop();
                  break;
              case 5:
                  //p.tamaño();
                  break;
              case 6:
                  //p.maximo();
                  break;
              case 7:
                  //p.minimo();
                  break;
              case 8:
                  System.out.println("¡Adios!");
                  break;
              default:
                  System.out.println("Opción incorrecta");
                  break;
          }
        }while(!(opcion ==8));
    }
}

