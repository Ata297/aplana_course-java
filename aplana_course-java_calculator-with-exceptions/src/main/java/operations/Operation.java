package operations;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Операция
 *
 * @author Анастасия Вязьмина
 * @version 22.07.2017
 * @since 16.07.2017
 */
public abstract class Operation implements Calculable {

    Operation() {
    }

    /**
     * Первый операнд операции калькулятора
     */
    private float firstOperand;

    /**
     * Второй операнд операции калькулятора
     */
    private float secondOperand;

    /**
     * Получает первый операнд операции калькулятора
     *
     * @return Первый операнд операции калькулятора
     */
    float getFirstOperand() {
        return firstOperand;
    }

    /**
     * Устанавливает значение для первого операнда операции калькулятора
     *
     * @param scanner общий сканнер для консоли
     */
    public void setFirstOperand(Scanner scanner) {
        System.out.println("Введите первый операнд: ");

        try {
            this.firstOperand = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println((char) 27 + "[31mНе корректное значение операнда. " + (char) 27 + "[0m");
            System.out.printf("Введено \"%s\", требуется число с запятой.\n", scanner.next());
            this.setFirstOperand(scanner);
        }
    }

    /**
     * Получает второй операнд операции калькулятора
     *
     * @return второй операнд операции калькулятора
     */
    float getSecondOperand() {
        return secondOperand;
    }

    /**
     * Устанавливает значение для второго операнда операции калькулятора
     *
     * @param scanner общий сканнер для консоли
     */
    public void setSecondOperand(Scanner scanner) {
        System.out.println("Введите второй операнд: ");
        try {
            this.secondOperand = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println((char) 27 + "[31mНе корректное значение операнда. " + (char) 27 + "[0m");
            System.out.printf("Введено \"%s\", требуется число с запятой.\n", scanner.next());
            this.setSecondOperand(scanner);
        }
    }
}
