/**
 * Кекс
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 03.07.2017
 */
public class Cake extends Sweetness {
    private String filling = "";

    public Cake() {
        super();
    };

    public Cake(String name, float weight, float price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    };

    public Cake(String filling) {
        this("Сластена", 0.05f, 5, filling);

        if (!filling.equals("")) {
            this.setPrice(1.5f * this.getPrice());
        }
    };
    /**
     * Возвращает название начинки
     *
     * @return Название начинки
     */
    public String getFilling() {
        return filling;
    }

    /**
     * Устанавливает название начинки
     *
     * @param filling Название начинки
     */
    public void setFilling(String filling) {
        this.filling = filling;
    }

    /**
     * Возвращает строковое представление объета
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Кекс \"" + super.getName() + "\"" + (this.filling.equals("") ? "": "\" с начинкой \"" + this.filling + "\"") + " (" + super.toString() + ")";
    }
}
