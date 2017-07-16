import java.util.Arrays;
import java.util.Scanner;

/**
 * Входной класс
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 27.06.2017
 */
public class Base {
    public static void main(String[] args) {
        int[] numbers = userSelectApp(20, -10, 10);
        System.out.print("Сформированный массив: ");
        System.out.println(Arrays.toString(numbers));

        int indexMaxNegativeNumber = searchMaxNegativeNumber(numbers);
        int indexMinPositiveNumber = searchMinPositiveNumber(numbers);

        if (indexMaxNegativeNumber == -1) {
            System.out.println("Все числа положительные или 0.");
        } else if (indexMinPositiveNumber == -1) {
            System.out.println("Все числа отрицательные или 0.");
        } else {
            System.out.printf("Первый максимальный отрицательный элемент %d (номер элемента %d).\n",
                    numbers[indexMaxNegativeNumber], indexMaxNegativeNumber + 1);

            System.out.printf("Первый минимальный положительный элемент %d (номер элемента %d).\n",
                    numbers[indexMinPositiveNumber], indexMinPositiveNumber + 1);

            System.out.printf("Меняем местами элементы №%d и №%d.\n",
                    indexMaxNegativeNumber + 1, indexMinPositiveNumber + 1);

            numbers = swapItems(numbers, indexMaxNegativeNumber, indexMinPositiveNumber);
            System.out.print("Сформированный массив: ");
            System.out.println(Arrays.toString(numbers));
        }

    };

    //а если сгенерировались только положительные или только отрицательные числа, как поведет себя программа?
    /**
     * Возращает массив целых случайных чисел
     *
     * @param sizeArray длинна массива со случайными числами
     * @param minNumber минимальная величина случайного числа
     * @param maxNumber максимальная величина случайного числа
     * @return массив случайных чисел
     */
    private static int[] userSelectApp(int sizeArray, int minNumber, int maxNumber) {
        int[] numbers = new int[sizeArray];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * (maxNumber - minNumber) + minNumber); //проверь, будут ли генериться крайние значения -10, 10
        }
        return numbers;
    };

    //можешь возвращать только индекс элемента, а потом по индексу уже находишь его значение
    /**
     * Ищет максимальный отрицательный элемент
     *
     * @param numbers массив целых чисел
     * @return индекс максимального отрицательного элемента
     */
    private static int searchMaxNegativeNumber(int[] numbers) {
        int махNegativeNumber = -100;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 && махNegativeNumber < numbers[i]) {
                махNegativeNumber = numbers[i];
                index = i;
            }
        }
        return index;
    };

    /**
     * Ищет минимальный положительный элемент
     *
     * @param numbers массив целых чисел
     * @return индекс минимального положительного элемента
     */
    private static int searchMinPositiveNumber(int[] numbers) {
        int minPositiveNumber = 100;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && minPositiveNumber > numbers[i]) {
                minPositiveNumber = numbers[i];
                index = i;
            }
        }
        return index;
    };

    /**
     * Меняет два элемента местами в массиве
     *
     * @param numbers массив целых чисел
     * @param index1 индекс 1-го элемента
     * @param index2 индекс 2-го элемента
     * @return массив целых чисел
     */
    private static int[] swapItems(int[] numbers, int index1, int index2) {
        int value = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = value;
        return numbers;
    };
}
