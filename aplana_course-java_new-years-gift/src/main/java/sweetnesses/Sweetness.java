package sweetnesses;

/**
 * Сладость
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 03.07.2017
 */
public abstract class Sweetness {
    private String name;
    private float weight;
    private float price;

    public Sweetness() {
    };

    public Sweetness(String name, float weight, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    };

    /**
     * Возвращает название сладости
     *
     * @return Название сладости
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название сладости
     *
     * @param name Название сладости
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает вес сладости
     *
     * @return Вес сладости
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Устанавливает вес сладости
     *
     * @param weight Вес сладости
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Возвращает цену сладости
     *
     * @return Цена сладости
     */
    public float getPrice() {
        return price;
    }

    /**
     * Устанавливает цену сладости
     *
     * @param price Цена сладости
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Возвращает строковое представление объета
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "вес: " + this.weight + " гр., цена: " + this.price + " руб.";
    }
}
