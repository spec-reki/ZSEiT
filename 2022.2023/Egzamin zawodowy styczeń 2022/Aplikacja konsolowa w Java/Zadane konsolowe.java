import java.util.Scanner;

public class SelectionSort {
    public int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    /********************************************************
     * nazwa funkcji: sort
     * parametry wejściowe: brak
     * wartość zwracana: brak (Operacje są robione na polu)
     * autor: <numer PESEL zdającego>
     * ****************************************************/
    public void sort() {
        for(int i = 0; i < array.length; i++) {
            int indexOfLargestElement = this.findIndexOfLargestElement(i - 1);
            int currentValue = array[i];
            array[i] = array[indexOfLargestElement];
            array[indexOfLargestElement] = currentValue;
        }
    }

    /********************************************************
     * nazwa funkcji: findIndexOfLargestElement
     * parametry wejściowe: lastSortedIndex - index ostatniego posortowanego elementu tablicy
     * wartość zwracana: index największego nieposortowanego elementu
     * autor: <numer PESEL zdającego>
     * ****************************************************/
    private int findIndexOfLargestElement(int lastSortedIndex) {
        int indexOfLargestElement = lastSortedIndex + 1;
        for(int i = lastSortedIndex + 1; i < (array.length); i++) {
            if(array[indexOfLargestElement] < array[i]) indexOfLargestElement = i;
        }
        return indexOfLargestElement;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.printf("Podaj %d liczbę: ", i + 1);
            array[i] = in.nextInt();
        }

        SelectionSort sort = new SelectionSort(array);
        sort.sort();
        
        for (int element : sort.array) {
            System.out.printf("%d ", element);
        }
    }
}