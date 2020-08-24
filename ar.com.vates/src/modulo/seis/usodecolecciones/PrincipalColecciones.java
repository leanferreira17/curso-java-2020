package modulo.seis.usodecolecciones;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalColecciones {
    public static void main(String[] args) {
        int arreglo[] = {22, 56, 87, 34, 56, 67, 23, 1, 0, 37, 72};
        ArrayList<Integer> arrayList = new ArrayList<>(arreglo.length);

        for (int item : arreglo) {
            arrayList.add(item);
        }

        for (int item : arrayList) {
            System.out.println(item);
        }

        System.out.println("### Uso de Collections ###");
        Collections.sort(arrayList);

        for (int item : arrayList) {
            System.out.println(item);
        }
    }
}
