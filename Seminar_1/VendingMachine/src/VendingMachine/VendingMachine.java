package VendingMachine;

import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
    private List<Product> products;

    /**
     * Конструктор по умолчанию, который создает пустой список продуктов.
     */
    public VendingMachine() {
        products = new ArrayList<>();
    }

    /**
     * Конструктор с параметром для инициализации списка продуктов.
     * 
     * @param productList   Список исходных продуктов
     */
    public VendingMachine(List<Product> productList) {
        this.products = new ArrayList<>(productList);
    }

    /**
     * Метод для инициализации списка продуктов в торговом автомате.
     * 
     * @param productList   Список исходных продуктов
     */
    public void initProducts(List<Product> productList) {
        products = new ArrayList<>(productList);        
    }

    /**
     * Метод для получения продукта по его названию.
     * 
     * @param name  Название продукта
     * @return      Продукт с указанным названием или null, если продукт не найден
     */
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Продукт не найден.
    }
}
