import java.util.ArrayList;
import java.util.List;
public class EjercicioUno {
    public static void main(String[] args) {



    String fruits="Apple";
    String fruits1="Banana";
    String fruits2="Cherry";

    List<String> listFruist = new ArrayList<>();
    //Agrega los siguientes elementos
    listFruist.add(fruits);
    listFruist.add(fruits1);
    listFruist.add(fruits2);
        System.out.println("Imprime primer lista " + listFruist);
    //Imprime el tamaño de la lista y los elementos.
        System.out.println(listFruist.size());

        //Elimina "Banana" de la lista.

        listFruist.remove(1);
        System.out.println(listFruist);

    //Cambia el valor de "Cherry" por "Orange".
        listFruist.add(2,"Cherry");
        listFruist.set(2,"Orange");


    //Imprime la lista resultante.
        System.out.println(listFruist);

}
}