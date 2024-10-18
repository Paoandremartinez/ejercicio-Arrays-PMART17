import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {
        int num=1;
        int num1=2;
        int num2=3;
        int num3=4;
        int num4=5;
        List<Integer> listNumerica = new ArrayList();
        listNumerica.add(num);
        listNumerica.add(num1);
        listNumerica.add(num2);
        listNumerica.add(num3);
        listNumerica.add(num4);


        System.out.println("Imprimir lista númerica" +listNumerica);

        //Usa un bucle for para imprimir cada número.
        for (int i=0;i<listNumerica.size();i++);
        {
            System.out.println("Impresión con For " +listNumerica);
        }
        //Usa un bucle for-each para imprimir los mismos números.
       for (int numero1 : listNumerica);
       {
           System.out.println("Impresión con For Each " +listNumerica);
        }

        }



    }