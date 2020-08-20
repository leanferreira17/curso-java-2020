package modulo.cinco.masestructurasdedatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class EstructurasDeDatos {
    public static void main(String[] args) {
        /* ArrayList */
        ArrayList arrayList = new ArrayList();

        arrayList.size(); // conocer el tamaño del array
        //arrayList.add(); // agregar elemento
        //arrayList.get(2); // recuperar un elemento
        //arrayList.remove(2); // eliminar un elemento
        arrayList.clear(); // borrar el contenido total
        //arrayList.set(indice, nuevoObjeto); // modificar un elemento

        /* ArrayList para un tipo específico */
        ArrayList<String> strings = new ArrayList<>(20);


        /* TreeSet */
        TreeSet<Integer> treeSet = new TreeSet();

        treeSet.add(34); // agregar un elemento
        treeSet.add(1);
        System.out.println(treeSet); // observamos que se ordenan solos
        treeSet.add(1); // no permite duplicados
        System.out.println(treeSet);
        System.out.println(treeSet.contains(34)); // devuelve true si lo contiene, de lo contrario false
        treeSet.first(); // recuperar 1er elemento
        treeSet.last(); // recuperar último elemento
        treeSet.higher(3); // recuperar los valores mas altos que el parámetro
        treeSet.higher(3); // recuperar los valores mas bajos que el parámetro
        treeSet.remove(34); // eliminar el elemento
        treeSet.pollFirst(); // eliminar el primer elemento
        treeSet.pollLast(); // eliminar el último elemento


        // HashMap
        HashMap<String, String> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("indice1", "valor indice 1"); // agregar indice y elemento
        stringStringHashMap.get("indice1"); // recuperar el elemento con el índice
        stringStringHashMap.remove("indice1"); // eliminar un objeto por el índice
        stringStringHashMap.clear(); // eliminar todos los objetos
        stringStringHashMap.size(); // obtener el tamaño del objeto
        stringStringHashMap.keySet(); // recuperar el conjunto total de indices
        stringStringHashMap.values(); // recuperar el conjunto total de valores

        System.out.println(stringStringHashMap.keySet());
        System.out.println(stringStringHashMap.values());
    }
}
