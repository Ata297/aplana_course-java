import exceptions.DivisionByZeroException;
import java.util.Scanner;

/**
 * Калькулятор
 *
 * @author Анастасия Вязьмина
 * @version 22.07.2017
 * @since 16.07.2017
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("В калькуляторе доступны следующие операции:");
        System.out.println("для сложения введите - '+',");
        System.out.println("для вычитания введите - '-',");
        System.out.println("для умножения введите - '*',");
        System.out.println("для деления введите - '/'.");

        User user = new User();

        try(Scanner scanner = new Scanner(System.in)) {
            do {
                user.selectOperation(scanner);
                user.getCurrentOperation().setFirstOperand(scanner);
                user.getCurrentOperation().setSecondOperand(scanner);

                try {
                    user.getCurrentOperation().calculate();
                } catch (DivisionByZeroException e) {
                    System.out.println((char) 27 + "[31mНельзя делить на 0. Операция не выполнена. " + (char) 27 + "[0m");
                } catch (ArithmeticException e) {
                    System.out.println((char) 27 + "[31mОшибка вычисления операции. " + (char) 27 + "[0m");
                    System.out.println("Выброшено исключение:");
                    System.out.println(e.toString());
                }

            } while(user.selectNextOperation(scanner));
        } catch(Exception e) {
            System.out.println((char) 27 + "[31m\nИзвините, произошла ошибка при работе приложения. " + (char)27 + "[0m");
            e.printStackTrace();
        }
    }
}
