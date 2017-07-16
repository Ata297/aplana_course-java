package operations;

import java.util.Scanner;

/**
 * Деление
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 16.07.2017
 */
public class Division extends Operation implements Calculable {

    public Division() {
        super();
    }

    @Override
    public void setSecondOperand(Scanner scanner) {
        super.setSecondOperand(scanner);
        while (super.getSecondOperand() == 0.0) {
            System.out.println("Второй операнд для операции деления не может быть нулем. Значение не установлено.");
            super.setSecondOperand(scanner);
        }
    }

    /**
     * Вычисляет операцию деления
     *
     * @return Результат вычисления операции сложения
     */
    public float calculate() {
        System.out.println("Выполняется операция деления.");
        float result = super.getFirstOperand() / super.getSecondOperand();
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }
}
