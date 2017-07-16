package sweetnesses;

/**
 * Шоколад
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 03.07.2017
 */
public class Chocolate extends Sweetness {
    private Boolean withNuts = false;

    public Chocolate() {
        super();
    };

    public Chocolate(String name, float weight, float price, Boolean withNuts) {
        super(name, weight, price);
        this.withNuts = withNuts;
    };

    public Chocolate(Boolean withNuts) {
        this("Аленка", 0.1f, 50f, withNuts);

        if (withNuts) {
            this.setPrice(1.5f * this.getPrice());
        }
    };

    /**
     * Возвращает флаг с орехами шоколад или нет
     *
     * @return Флаг в шоколаде зефир или нет
     */
    public Boolean getWithNuts() {
        return withNuts;
    }

    /**
     * Устанавливает флаг в шоколаде зефир или нет
     *
     * @param withNuts Флаг в шоколаде зефир или нет
     */
    public void setWithNuts(Boolean withNuts) {
        this.withNuts = withNuts;
    }

    /**
     * Возвращает строковое представление объета
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Шоколад \"" + super.getName() + "\"" + (this.withNuts ? " с орехами": "") + " (" + super.toString() + ")";
    }
}
