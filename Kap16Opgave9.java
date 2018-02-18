public class Kap16Opgave9 {

    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        System.out.println(stutter(A));


    }

    // Kapitel 16 opgave 9

    public static LinkedIntList stutter(LinkedIntList list)
    {
        LinkedIntList list2 = new LinkedIntList();
        for (int i = 0; i < list.size() ; i++) {

            list2.add(list2.size(),list.get(i));
            list2.add(list2.size(),list.get(i));


        }
        for (int j = 0; j < list.size();) {
            list.remove(j);

        }
        for (int k = 0; k < list2.size() ; k++) {
            list.add(list2.get(k));

        }
        return list;
    }
}
