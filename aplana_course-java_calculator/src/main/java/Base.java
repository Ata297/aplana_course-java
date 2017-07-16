import java.util.Scanner;

/**
 * Входной класс
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 26.06.2017
 */
public class Base {
    public static void main(String[] args) {

        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");

        Scanner scanner = new Scanner(System.in);
        boolean is_next_operation = false;

        do {
            System.out.print("Выберите операцию: ");
            String operation = scanner.next();

            switch (operation) {
                case "+":
                    addition(scanner);
                    break;
                case "-":
                    subtraction(scanner);
                    break;
                case "*":
                    multiplication(scanner);
                    break;
                case "/":
                    division(scanner);
                    break;
                default:
                    System.out.println("Не знаю такой операции :)");
                    break;
            }

            System.out.println("\nТребуется ли ещё одна операция? (да/нет) ");
            String is_next_operation_str = scanner.next();

            is_next_operation = (is_next_operation_str.equals("да"));
        } while(is_next_operation);
        scanner.close();
    };

    /**
     * Получает из сканнера пару чисел типа float
     *
     * @param scanner объект сканнера из консоли
     * @return массив из двух чисел типа float
     */
    private static float[] scanner2Float(Scanner scanner) {
        float[] numbers = new float[2];
        System.out.println("Введите первое число: ");
        numbers[0] = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        numbers[1] = scanner.nextFloat();
        return numbers;
    };

    /**
     * Складывает два числа из консоли
     *
     * @param scanner объект сканнера из консоли
     */
    private static void addition(Scanner scanner) {
        System.out.println("Выбрана операция сложение.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] + ab[1]);
    };

    /**
     * Вычитает из первого числа из консоли второе число
     *
     * @param scanner объект сканнера из консоли
     */
    private static void subtraction(Scanner scanner) {
        System.out.println("Выбрана операция вычитание.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] - ab[1]);
    }

    /**
     * Умножает два числа из консоли
     *
     * @param scanner объект сканнера из консоли
     */
    private static void multiplication(Scanner scanner) {
        System.out.println("Выбрана операция умножение.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] * ab[1]);
    };

    /**
     * Делит первое число из консоли на второе число
     *
     * @param scanner объект сканнера из консоли
     */
    private static void division(Scanner scanner) {
        System.out.println("Выбрана операция деление.");
        float[] ab = scanner2Float(scanner);

        System.out.printf("Результат: %.4f\n", ab[0] / ab[1]);
    }
}
