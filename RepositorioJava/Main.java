import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int elementos,numero,buscarnumero;

        Pilas p = new Pilas();

        do{
        System.out.println("Elige una opción");
        System.out.println("1. Insertar\t\t2. Mostrar\t\t3. Buscar\t\t4. Eliminar");
        System.out.println("5. Tamaño\t\t6. Máximo\t\t7. Mínimo\t\t8. Terminar");

        opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //System.out.println("¿Cuantos elementos desea insertar?");
                    //elementos = sc.nextInt();
                    //for(int i=1; i<=elementos; i++){
                        System.out.println("Inserte el valor");
                        numero =sc.nextInt();
                        p.push(numero);

                    //}
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
               
                    break;
                case 6:
                    p.maximo();
                    break;
                case 7:
                    p.minimo();
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


