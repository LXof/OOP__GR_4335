package VendingMachine;

import java.util.List;

import Domen.Product;

public class WaterBottleVendingMachine extends VendingMachine implements VendingMachineInterface {
    public WaterBottleVendingMachine() {
        super();
    }

    public WaterBottleVendingMachine(List<Product> productList) {
        
    }

    @Override
    public void initProducts(List<Product> productList) {
        super.initProducts(productList);
        initProducts(productList);
    }

    @Override
    public Product getProduct(String name) {
        return super.getProduct(name);
    }
}
