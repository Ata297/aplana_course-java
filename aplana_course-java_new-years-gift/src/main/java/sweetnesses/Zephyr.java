package sweetnesses;

/**
 * Зефир
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 03.07.2017
 */
public class Zephyr extends Sweetness {
    private Boolean inChocolate = false;

    public Zephyr() {
        super();
    };

    public Zephyr(String name, float weight, float price, Boolean inChocolate) {
        super(name, weight, price);
        this.inChocolate = inChocolate;
    };

    public Zephyr(Boolean inChocolate) {
        this("Шармель", 0.025f, 1.5f, inChocolate);

        if (inChocolate) {
            this.setPrice(2.0f * this.getPrice());
        }
    };

    /**
     * Возвращает флаг в шоколаде зефир или нет
     *
     * @return Флаг в шоколаде зефир или нет
     */
    public Boolean getInChocolate() {
        return inChocolate;
    }

    /**
     * Устанавливает флаг в шоколаде зефир или нет
     *
     * @param inChocolate Флаг в шоколаде зефир или нет
     */
    public void setInChocolate(Boolean inChocolate) {
        this.inChocolate = inChocolate;
    }

    /**
     * Возвращает строковое представление объета
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Зефир \"" + super.getName() + "\"" + (this.inChocolate ? " в шоколаде": "") + " (" + super.toString() + ")";
    }
}
