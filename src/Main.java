public class Main {
    public static void main(String[] args) {
        RecursiveArray recursiveArray = new RecursiveArray("1,2,3,4");
        System.out.println(recursiveArray);

        System.out.println("isAscending: " + recursiveArray.isAscending());
        System.out.println("contains 3: " + recursiveArray.contains(3));
        System.out.println("contains 5: " + recursiveArray.contains(5));
        System.out.println("append 5");
        recursiveArray.append(5);
        System.out.println(recursiveArray);
        System.out.println("contains 5: " + recursiveArray.contains(5));
        System.out.println("prepend 0");
        recursiveArray.prepend(0);
        System.out.println(recursiveArray);
        System.out.println("contains 0: " + recursiveArray.contains(0));
        System.out.println("descending: " + recursiveArray.isDescending());
        System.out.println("append 0");
        recursiveArray.append(0);
        System.out.println(recursiveArray);
        System.out.println("descending: " + recursiveArray.isDescending());
        System.out.println("ascending: " + recursiveArray.isAscending());

        System.out.println(recursiveArray);
        System.out.println("Sorting ascending: ");
        recursiveArray.sortAscending();
        System.out.println(recursiveArray);

        System.out.println("Sorting descending: ");
        recursiveArray.sortDescending();
        System.out.println(recursiveArray);
        System.out.println("descending: " + recursiveArray.isDescending());

        RecursiveArray recursiveArray1 = new RecursiveArray();
        System.out.println(recursiveArray1);

        RecursiveArray recursiveArray2 = new RecursiveArray("");
        System.out.println(recursiveArray2);


        System.out.println("isAscending: " + recursiveArray1.isAscending());
        System.out.println("descending: " + recursiveArray1.isDescending());
        System.out.println("contains 3: " + recursiveArray1.contains(3));
        System.out.println("contains 5: " + recursiveArray1.contains(5));
        System.out.println("append 5");
        recursiveArray1.append(5);
        System.out.println(recursiveArray1);
        System.out.println("contains 5: " + recursiveArray1.contains(5));
        System.out.println("prepend 0");
        recursiveArray1.prepend(0);
        System.out.println(recursiveArray1);
        System.out.println("contains 0: " + recursiveArray1.contains(0));
        System.out.println("append 0");
        recursiveArray1.append(0);
        System.out.println(recursiveArray1);
        System.out.println("descending: " + recursiveArray1.isDescending());
        System.out.println("ascending: " + recursiveArray1.isAscending());
    }
}
