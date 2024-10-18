import java.util.ArrayList;

public class EjercicioCuatro {
    public static void main(String[] args) {
        //Crea dos ArrayList de String llamadas list1 y list2.
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();

        //Llena list1 con: "Apple", "Banana", "Cherry", "Date".
        list1.add ("Apple");
        list1.add ("Banana");
        list1.add ("Cherry");
        list1.add ("Date");
        System.out.println("Impresión lista 1 " +list1);

        //Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
        list2.add ("Banana");
        list2.add ("Date");
        list2.add ("Elderberry");
        list2.add ("Fig");
        System.out.println("Impresión lista 2 " +list2);

        //Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
        ArrayList <String> commonElements = new ArrayList<>();
        for(String iguales: list1)
        {
            if (!list2.contains(iguales));
            {
                commonElements.add(iguales);
            }

        }
        //Imprime los elementos comunes.
        System.out.println("Lista de elementos iguales" +commonElements);

    }
}
