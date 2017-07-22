package operations;

/**
 * Сложение
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 16.07.2017
 */
public class Addition extends Operation implements Calculable {

    public Addition() {
        super();
    }

    /**
     * Вычисляет операцию сложения
     *
     * @return Результат вычисления операции сложения
     */
    public float calculate() {
        System.out.println("Выполняется операция сложения.");
        float result = super.getFirstOperand() + super.getSecondOperand();
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }
}
