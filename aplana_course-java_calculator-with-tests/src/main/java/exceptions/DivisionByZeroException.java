package exceptions;

/**
 * Исключение для деления на ноль
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 22.07.2017
 */
public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Ошибка деления на ноль.");
    }
}
