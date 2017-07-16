import java.util.Scanner;

/**
 * Калькулятор
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 16.07.2017
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");

        User user = new User();

        try {
            do {
                user.selectOperation(scanner);
                user.getCurrentOperation().setFirstOperand(scanner);
                user.getCurrentOperation().setSecondOperand(scanner);
                user.getCurrentOperation().calculate();

            } while(user.selectNextOperation(scanner));
        } finally {
            scanner.close();
        }
    }
}
