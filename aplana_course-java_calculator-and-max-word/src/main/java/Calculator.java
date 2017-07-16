import java.util.Scanner;

/**
 * Консольный калькулятор
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 27.06.2017
 */
public class Calculator {

    public Calculator() {
    }

    /**
     * Запускает калькулятор без объекта
     *
     * @param scanner общий сканнер для консоли
     */
    public static void start(Scanner scanner) {
        helloUser();

        do {
            float[] ab = new float[2];
            switch (userSelectOperation(scanner)) {
                case "+":
                    ab = scanner2Float(scanner);
                    addition(ab[0], ab[1]);
                    break;
                case "-":
                    ab = scanner2Float(scanner);
                    subtraction(ab[0], ab[1]);
                    break;
                case "*":
                    ab = scanner2Float(scanner);
                    multiplication(ab[0], ab[1]);
                    break;
                case "/":
                    ab = scanner2Float(scanner);
                    division(ab[0], ab[1]);
                    break;
                default:
                    System.out.println("Не знаю такой операции :)");
                    break;
            }
        } while(userSelectNextOperation(scanner));
    };

    /**
     * Выдает приветственную информацию пользователю
     */
    private static void helloUser() {
        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");
    };

    /**
     * Дает пользователю возможность выбрать операцию
     *
     * @param scanner общий сканнер для консоли
     * @return выбранная операция
     */
    private static String userSelectOperation(Scanner scanner) {
        System.out.print("Выберите операцию: ");
        return scanner.next();
    };

    /**
     * Дает пользователю возможность выбрать следующую операцию или завершить работу калькулятора
     *
     * @param scanner общий сканнер для консоли
     * @return флаг следующей операции
     */
    private static Boolean userSelectNextOperation(Scanner scanner) {
        System.out.println("\nТребуется ли ещё одна операция? (да/нет) ");
        return (scanner.next().equals("да"));
    };

    /**
     * Получает из сканнера пару чисел типа float
     *
     * @param scanner общий сканнер для консоли
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
     * @param a первый операнд
     * @param b второй операнд
     */
    private static void addition(float a, float b) {
        System.out.println("Выбрана операция сложение.");
        System.out.printf("Результат: %.4f\n", a + b);
    };

    /**
     * Вычитает из первого числа из консоли второе число
     *
     * @param a первый операнд
     * @param b второй операнд
     */
    private static void subtraction(float a, float b) {
        System.out.println("Выбрана операция вычитание.");
        System.out.printf("Результат: %.4f\n", a - b);
    }

    /**
     * Умножает два числа из консоли
     *
     * @param a первый операнд
     * @param b второй операнд
     */
    private static void multiplication(float a, float b) {
        System.out.println("Выбрана операция умножение.");
        System.out.printf("Результат: %.4f\n", a * b);
    };

    /**
     * Делит первое число из консоли на второе число
     *
     * @param a первый операнд
     * @param b второй операнд
     */
    private static void division(float a, float b) {
        System.out.println("Выбрана операция деление.");

        if (b == 0.0) {
            System.out.println("Деление не возможно, так как второй операнд равен 0.");
        } else {
            System.out.printf("Результат: %.4f\n", a / b);
        }
    }
}
