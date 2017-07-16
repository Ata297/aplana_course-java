package operations;

import java.util.Scanner;

/**
 * Операция
 *
 * @author Анастасия Вязьмина
 * @version 0.1
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
        this.firstOperand = scanner.nextFloat();
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
        this.secondOperand = scanner.nextFloat();
    }
}
