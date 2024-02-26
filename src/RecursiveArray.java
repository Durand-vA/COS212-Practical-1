public class RecursiveArray {
    public Integer[] array;

    public RecursiveArray() {
        array = new Integer[0];
    }

    public RecursiveArray(String input) {
        if (input.isEmpty()) {
            array = new Integer[0];
            return;
        }

        String[] inputs = input.split(",");
        array = new Integer[inputs.length];
        appendRecursive(inputs);
    }

    private void appendRecursive(String[] input) {
        appendRecursive(input, 0);
    }

    private void appendRecursive(String[] input, int i) {
        array[i] = Integer.parseInt(input[i]);
        if (i+1 < input.length) {
            appendRecursive(input, i + 1);
        }
    }

    @Override
    public String toString() {
        if (array.length == 0)
            return "Empty Array";

        return "[" + toString(0) + "]";
    }

    private String toString(int i) {
        if (i == array.length-1) {
            return array[i].toString();
        }
        return array[i].toString() + "," + toString(i+1);
    }

    public void append(Integer value) {
        Integer[] newArr = new Integer[array.length+1];
        copy(newArr);
        newArr[array.length] = value;
        array = newArr;
    }

    private void copy(Integer[] newArr) {
        if (array.length == 0) {
            return;
        }
        copy(newArr, 0);
    }

    private void copy(Integer[] newArr, int i) {
        newArr[i] = array[i];
        if (i+1 < array.length) {
            copy(newArr, i + 1);
        }
    }

    public void prepend(Integer value) {
        Integer[] newArr = new Integer[array.length+1];
        copyPrepend(newArr);
        newArr[0] = value;
        array = newArr;
    }
    private void copyPrepend(Integer[] newArr) {
        if (array.length == 0) {
            return;
        }
        copyPrepend(newArr, 0);
    }

    private void copyPrepend(Integer[] newArr, int i) {
        newArr[i+1] = array[i];
        if (i+1 < array.length) {
            copyPrepend(newArr, i + 1);
        }
    }

    public boolean contains(Integer value) {
        return contains(value, 0);
    }

    public boolean contains(Integer value, int i) {
        if (i == array.length) {
            return false;
        }
        if (array[i].equals(value)) {
            return true;
        }
        return contains(value, i+1);
    }

    public boolean isAscending() {
        if (array.length == 0)
            return true;
        return isAscending(array[0], 1);
    }

    public boolean isAscending(Integer prevVal, int i) {
        if (i == array.length)
            return true;

        if (prevVal.compareTo(array[i]) <= 0)
            return isAscending(array[i], i+1);
        else {
            return false;
        }
    }

    public boolean isDescending() {
        if (array.length == 0)
            return true;
        return isDescending(array[0], 1);
    }

    public boolean isDescending(Integer prevVal, int i) {
        if (i == array.length)
            return true;

        if (prevVal.compareTo(array[i]) >= 0)
            return isDescending(array[i], i+1);
        else {
            return false;
        }
    }

    private void swap(int left, int right) {
        Integer temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private int partitionAsc(int low, int high) {
        return partitionAsc(array[high], low, high, low-1);
    }
    private int partitionAsc(Integer pivot, int low, final int high, int i) {
        if (!(low < high)) {
            swap(i+1, high);
            return i+1;
        }
        if (array[low] <= pivot) {
            i++;
            swap(i, low);
        }

        return partitionAsc(pivot, low+1, high, i);
    }

    private void quickSortAsc(int low, int high) {
        if (low < high) {
            int part = partitionAsc(low, high);
            quickSortAsc(low, part-1);
            quickSortAsc(part+1, high);
        }
    }

    private void quickSortAsc() {
        quickSortAsc(0, array.length-1);
    }
    public void sortAscending() {
        quickSortAsc();
    }

    private int partitionDesc(int low, int high) {
        return partitionDesc(array[high], low, high, low-1);
    }

    private int partitionDesc(Integer pivot, int low, final int high, int i) {
        if (!(low < high)) {
            swap(i+1, high);
            return i+1;
        }
        if (array[low] >= pivot) {
            i++;
            swap(i, low);
        }

        return partitionDesc(pivot, low+1, high, i);
    }

    private void quickSortDesc(int low, int high) {
        if (low < high) {
            int part = partitionDesc(low, high);
            quickSortDesc(low, part-1);
            quickSortDesc(part+1, high);
        }
    }

    private void quickSortDesc() {
        quickSortDesc(0, array.length-1);
    }
    public void sortDescending() {
        quickSortDesc();
    }

}
