import java.util.Arrays;
import java.util.Scanner;

/**
 * Консолькное приложение для поиска слова максимальной длины
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 27.06.2017
 */
public class MaxWord {

    public MaxWord() {
    }

    /**
     * Запускает калькулятор без объекта
     *
     * @param scanner общий сканнер для консоли
     */
    public static void start(Scanner scanner) {
        helloUser();

        do {
            String[] words = scannerWords(scanner);
            searchMaxWords(words);
        } while(userSelectNext(scanner));
    };

    /**
     * Выдает приветственную информацию пользователю
     */
    private static void helloUser() {
        System.out.println("Приложение ищет слово максимальной длины в вашем массиве.");
    };

    /**
     * Дает пользователю возможность повторить или завершить работу
     *
     * @param scanner общий сканнер для консоли
     * @return флаг продолжения
     */
    private static Boolean userSelectNext(Scanner scanner) {
        System.out.println("\nЗапустить еще раз? (да/нет) ");
        return (scanner.next().equals("да"));
    };

    /**
     * Получает из сканнера массив слов
     *
     * @param scanner общий сканнер для консоли
     * @return массив слов
     */
    private static String[] scannerWords(Scanner scanner) {
        String[] words;
        System.out.printf("Введите количество слов: ");
        int wordsNumber = scanner.nextInt();
        words = new String[wordsNumber];

        for(int i = 0; i < wordsNumber; i++) {
            System.out.printf("Введите слово №%d:\n", i+1);
            words[i] = scanner.next();
        }
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.asList(words));
        return words;
    };

    /**
     * Ищет самое длинное слово/а в массиве
     *
     * @param words массив слов
     */
    private static void searchMaxWords(String[] words) {
        String maxWords = "";
        int lengthMaxWord = 0;
        for(int i = 0; i < words.length; i++) {
            if (words[i].length() > lengthMaxWord) {
                maxWords = words[i];
                lengthMaxWord = words[i].length();
            } else if (words[i].length() == lengthMaxWord) {
                maxWords += ", " + words[i];
            }
        }
        System.out.printf("Слово/а с максимальной длинной %s. Длинна %d.\n", maxWords, lengthMaxWord);
    };
}
