package VendingMachine;

import java.util.List;

import Domen.Product;


/**
 * Интерфейс, представляющий торговый автомат.
 */
public interface VendingMachineInterface {

    /**
     * Инициализация списка продуктов в торговом автомате.
     * 
     * @param productList   Список продуктов
     */
    void initProducts(List<Product> productList);

    /**
     * Получить продукт по названию.
     * 
     * @param name  Название продута
     * @return      Продукт с указанным наванием или null, если такого подукта нет 
     */
    Product getProduct(String name);


}
