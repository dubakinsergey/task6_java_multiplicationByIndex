public class Task6 {

    public static int[] multiplicationByIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] * i);
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrayNumb = {21, 4, 7, 12, 15, 10, 2, 5};
        multiplicationByIndex(arrayNumb);
    }
}


// Задачи:
// Вам дан список чисел: 21, 4, 7, 12, 15, 10, 2, 5.
// Напишите программу, возвращающую новый список, содержащий значения произведения чисел на их индекс
