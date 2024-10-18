import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {
    public static void main(String[] args) {
        int num=1;
        int num1=2;
        int num2=3;
        int num3=4;
        int num4=5;
        int num5=6;
        int num6=7;
        int num7=8;
        int num8=9;
        int num9=10;

        List<Integer> listNumerica = new ArrayList();
        listNumerica.add(num);
        listNumerica.add(num1);
        listNumerica.add(num2);
        listNumerica.add(num3);
        listNumerica.add(num4);
        listNumerica.add(num5);
        listNumerica.add(num6);
        listNumerica.add(num7);
        listNumerica.add(num8);
        listNumerica.add(num9);

        System.out.println("Impresión del 1 al 10 " +listNumerica);

        //Filtra los números pares en una nueva lista llamada evenNumbers.
        List<Integer> evenNumbers = new ArrayList();

        for (int numero:listNumerica) {
            if (numero % 2 == 0) {
                evenNumbers.add(numero);
                System.out.println("Impresión de números pares" +evenNumbers);
            }
        }

    //Imprime la lista original y la lista de números pares
        System.out.println("Lista original" +listNumerica);
        System.out.println("lista Pares" +evenNumbers);



    }
}
