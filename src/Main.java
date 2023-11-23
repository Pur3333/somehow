import java.util.Scanner;

public class Main {
    static void first_task (int arr_size) {
        int[] arr = new int[arr_size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        int sum = 0;
        for (int i = 0; i < arr_size; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        double average = (double) sum / arr_size;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
    static void second_task(int arr_size) {
        int[] arr = new int[arr_size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        int sum = 0; int i = 0;
        while(i < arr_size) {
            arr[i] = scan.nextInt();
            sum += arr[i];
            i++;
        }
        i = 0; int min = 666; int max = 0;
        do{
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            i++;
        }while (i < arr_size);
        System.out.println("Сумма элементов массива = " + sum + "\nМинимальный элемент массива: " +
                min + "\nМаксимальный элемент: " + max);
    }
    static void fourth_task() {
        int i = 0, row = 0;
        do {
            row += 1/i;
            i++;
        } while(i < 10);
        System.out.println(row);
    }
    static int fiveth_task(int num) {
        if (num <= 1)
            return 1;
        return num * fiveth_task(num - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scan.nextInt();
        first_task(n);
        second_task(n);
        for (int i = 0; i < args.length; i++)
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        fourth_task();
        System.out.println(fiveth_task(5));
    }
}