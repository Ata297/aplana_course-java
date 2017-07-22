package operations;

import exceptions.DivisionByZeroException;

/**
 * Вычисляемый
 *
 * @author Анастасия Вязьмина
 * @version 22.07.2017
 * @since 16.07.2017
 */
public interface Calculable {
    float calculate() throws DivisionByZeroException;
}
