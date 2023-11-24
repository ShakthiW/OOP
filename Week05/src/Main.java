import java.util.ArrayList;
import java.util.Arrays;

public class  Main {
    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }



    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
        }
    }

    static int[] array01 = {7};
    static int[] array02 = {3, 6};
    static int[] array03 = {4, 6, 8};
    static int[] array04 = {1, 2, 3, 4};
    static int[] array05 = {8, 4, 2, 0, 4};

    public static void main(String[] args) {
        ArrayList<Integer> arrayList01 = new ArrayList<Integer>();
        arrayList01.add(5);
        arrayList01.add(10);
        arrayList01.add(15);

        ArrayList<Integer> arrayList02 = new ArrayList<Integer>();
        arrayList02.add(8);
        arrayList02.add(2);
        arrayList02.add(8);
        arrayList02.add(2);
        arrayList02.add(4);

        ArrayList<Integer> arrayList03 = new ArrayList<Integer>();
        arrayList03.add(-1);
        arrayList03.add(3);
        arrayList03.add(28);
        arrayList03.add(17);
        arrayList03.add(9);
        arrayList03.add(30);

        loadArray(array01);
        loadArray(array02);
        loadArray(array03);
        loadArray(array04);
        loadArray(array05);

        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(array02));
        System.out.println(Arrays.toString(array03));
        System.out.println(Arrays.toString(array04));
        System.out.println(Arrays.toString(array05));

        System.out.println();

        listDemo(arrayList01);
        listDemo(arrayList02);
        listDemo(arrayList03);
    }
}