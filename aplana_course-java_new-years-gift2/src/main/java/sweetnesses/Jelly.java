package sweetnesses;

/**
 * Желе
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 03.07.2017
 */
public class Jelly extends Sweetness {
    private Boolean inSugar = false;

    public Jelly() {
        super();
    };

    public Jelly(String name, float weight, float price, Boolean inSugar) {
        super(name, weight, price);
        this.inSugar = inSugar;
    };

    public Jelly(Boolean inSugar) {
        this("Мармелад", 0.03f, 2, inSugar);

        if (inSugar) {
            this.setPrice(1.5f * this.getPrice());
        }
    };

    /**
     * Возвращает флаг в сахаре желе или нет
     *
     * @return Флаг в сахаре желе или нет
     */
    public Boolean getInSugar() {
        return inSugar;
    }

    /**
     * Устанавливает флаг в сахаре желе или нет
     *
     * @param inSugar Флаг в сахаре желе или нет
     */
    public void setInSugar(Boolean inSugar) {
        this.inSugar = inSugar;
    }

    /**
     * Возвращает строковое представление объета
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Желе \"" + super.getName() + "\"" + (this.inSugar ? " в сахаре": "") + " (" + super.toString() + ")";
    }
}
