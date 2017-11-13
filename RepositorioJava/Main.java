
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int elementos,numero,buscarnumero;

        Pilas p = new Pilas();

        do{
        System.out.println("Elige una opción");
        System.out.println("1. Insertar");
        System.out.println("2. Mostrar");
        System.out.println("3. Buscar");
        System.out.println("4. Eliminar");
        System.out.println("5. Tamaño");
        System.out.println("6. Máximo");
        System.out.println("7. Mínimo");
        System.out.println("8. Terminar");

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
                    
                    break;
                case 4:
                    p.pop();
                    break;
                case 5:
                    p.tamaño();
                    break;
                   
                case 6:
                   
                    break;
                case 7:
                 
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