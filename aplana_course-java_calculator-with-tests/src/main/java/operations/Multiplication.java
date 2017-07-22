package operations;

/**
 * Умножение
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 16.07.2017
 */
public class Multiplication extends Operation implements Calculable {

    public Multiplication() {
        super();
    }

    /**
     * Вычисляет операцию умножения
     *
     * @return Результат вычисления операции сложения
     */
    public float calculate() {
        System.out.println("Выполняется операция умножения.");
        float result = super.getFirstOperand() * super.getSecondOperand();
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }
}
