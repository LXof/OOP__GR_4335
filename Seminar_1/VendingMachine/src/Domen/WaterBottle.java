package Domen;

/**
 * Класс, представляющий бутылку воды.
 */
public class WaterBottle extends Product {
    int capacity;

    /**
     * Конструктор класса WaterBottle.
     *
     * @param id          ID бутылки воды.
     * @param name        Название бутылки воды.
     * @param price       Цена бутылки воды.
     * @param description Описание бутылки воды.
     * @param category    Категория бутылки воды.
     * @param quantity    Количество бутылок воды на складе.
     * @param capacity    Вместимость бутылки воды.
     */
    public WaterBottle(int id, String name, double price, String description, String category, int quantity, int capacity) {
        super(id, name, price, description, category, quantity);
        this.capacity = capacity;
    }

    /**
     * Получить вместимость бутылки воды
     * 
     * @return  Вместимость бутылки воды
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Установить вместимость бутылки воды.
     * 
     * @param capacity  Новая вмесимость бутылки воды
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    /**
     * переопределение абстрактного метода use() в классе WaterBottle, 
     * чтобы реализовать конкретное действие использования бутылки воды - в данном случае,
     * выпить воду из бутылки.
     */
    @Override
    public void use() {
        System.out.println("Пейте воду из бутылки");
    }    
}
