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
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                switch (userSelectApp(scanner)) {
                    case 1:
                        Calculator.start(scanner);
                        break;
                    case 2:
                        MaxWord.start(scanner);
                        break;
                    default:
                        System.out.println("Не знаю такого приложения :)");
                        break;
                }
            } while(userSelectNextApp(scanner));
        } finally {
            scanner.close();
        }
    };

    /**
     * Дает пользователю возможность выбрать приложение для запуска
     *
     * @param scanner общий сканнер для консоли
     * @return номер выбранного приложения
     */
    private static Integer userSelectApp(Scanner scanner) {
        System.out.println("Доступны два приложения: ");
        System.out.println("1 - калькулятор,");
        System.out.println("2 - поиск максимального слова.");
        System.out.print("Введите номер приложение: ");
        return scanner.nextInt();
    };

    /**
     * Дает пользователю возможность выбрать следующее приложение или завершить работу
     *
     * @param scanner общий сканнер для консоли
     * @return флаг следующего приложения
     */
    private static Boolean userSelectNextApp(Scanner scanner) {
        System.out.println("\nЗапустить другое приложение? (да/нет) ");
        return (scanner.next().equals("да"));
    };
}
