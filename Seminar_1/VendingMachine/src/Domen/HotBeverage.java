package Domen;

/**
 * Класс, представляющий горячий напиток.
 */
public class HotBeverage extends Product {

    private int temperature; //Температура горячего напитка
    

    /**
     * Конструктор класса HotBeverage.
     *
     * @param id          ID горячего напитка.
     * @param name        Название горячего напитка.
     * @param price       Цена горячего напитка.
     * @param description Описание горячего напитка.
     * @param category    Категория горячего напитка.
     * @param quantity    Количество горячего напитка на складе.
     * @param temperature Температура горячего напитка.
     */
    public HotBeverage(int id, String name, double price, String description, String category, int quantity, int temperature) {
        super(id, name, price, description, category, quantity);
        this.temperature = temperature;
    }

    /**
     * Получить температуру горячего напитка.
     *
     * @return Температура горячего напитка.
     */
    public int getTemperature() {
        return temperature;
    }
    
    /**
     * Установить температуру горячего напитка.
     *
     * @param temperature Новая температура горячего напитка.
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Переопределенный метод использования горячего напитка.
     * Выводит сообщение "Наслаждайтесь горячим напитком!".
     */
    @Override
    public void use() {
        System.out.print("Наслаждайтесь горячими напитками!");
    }
}
