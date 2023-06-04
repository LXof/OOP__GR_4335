package Domen;

/**
 * Класс, представляющий товар.
 */
public abstract class Product {
    
    private int id;             // ID товара
    private String name;        // Название товара
    private double price;       // Цена товара
    private String description; // Описание товара
    private String category;    // Категория товара
    private int quantity;       // Количество товаров на складе
    

    /**
     * Конструктор класса Product.
     * 
     * @param id            id товара.
     * @param name          Название товара.
     * @param price         Цена товара.
     * @param description   Описание товара.
     * @param category      Категория товара.
     * @param quantity      Количество товаров на складе.
     */
    public Product(int id, String name, double price, String description, String category, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.quantity = quantity;
    }

    
    /**
     * Получить ID товара.
     *
     * @return ID товара
     */
    public int getId() {
        return id;
    }
    
    /**
     * Получить название товара.
     *
     * @return Название товара
     */
    public String getName() {
        return name;
    }
    
    /**
     * Получить цену товара.
     *
     * @return Цена товара
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Установить цену товара.
     * Если указанная цена меньше 0, выводится сообщение об ошибке.
     *
     * @param price Новая цена товара
     */
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Цена не может быть отрицательной");
        }
    }
    
    /**
     * Получить описание товара.
     *
     * @return Описание товара
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Установить описание товара.
     *
     * @param description Новое описание товара
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Получить категорию товара.
     *
     * @return Категория товара
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * Установить категорию товара.
     *
     * @param category Новая категория товара
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    /**
     * Получить количество товаров на складе.
     *
     * @return Количество товаров на складе
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Установить количество товаров на складе.
     * Если указанное количество меньше 0, выводится сообщение об ошибке.
     * Количество устанавливается в 0 в случае недопустимого значения.
     *
     * @param quantity Новое количество товаров на складе
     */
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Недопустимое количество");
            this.quantity = 0;
        }
    }

    public abstract void use();

    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
