import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    // algoritma selection sort
    public static int[] selectSort(int[] dataset) {
        // set banyak data
        int banyak = dataset.length;

        for (int i=0; i < banyak - 1; i++) {
            // atur indeks pertama sebagai nilai minimum
            int min = i;

            for (int j=i+1; j < banyak; j++) {
                // jika data ke-j lebih kecil dari nilai minimum
                if (dataset[j] < dataset[min]) {
                    // atur nilai minimum yang baru
                    min = j;
                }
            }
            // lakukan pertukaran posisi
            int temp     = dataset[min];
            dataset[min] = dataset[i];
            dataset[i]   = temp;
        }
        // kembalikan data set yang telah diurutkan
        return dataset;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int banyak = input.nextInt();

        int[] dataset = new int[banyak];

        for (int i=0; i < banyak; i++) {
            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            dataset[i] = input.nextInt();
        }
        System.out.println("-----------------------------------------");
        // cetak dataset sebelum dan setelah diurutkan
        System.out.println("Sebelum sort: " + Arrays.toString(dataset));
        System.out.println("Setelah sort: " + Arrays.toString(selectSort(dataset)));
    }
}
