package Seminar001double;

import java.util.ArrayList;

public class VendMachine {

    private ArrayList<Product> products = new ArrayList<>();

    private double money = 0;

    public VendMachine addProduct(Product product){
        this.products.add(product);
        return this;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getMoney() {
        return money;
    }

    //метод поиска по названию продукта
    public Product findProduct (String name){
        for (Product prod: getProducts()
             ) {
            if(prod.getName().equals(name)){
                System.out.println("Найден продукт" + prod);
                return prod;
            }
        }
        return null;
    }

    // метод покупки товара - ищет товар по названию и цене, удаляет товар из листа. добавляет цену в кассу
    public Product buy (String name, double cost){
        Product buyProd = findProduct(name);
        if(buyProd == null){
            System.out.println("Продукт не найден");
            return null;
        }
        if(cost == buyProd.getCost()){
            products.remove(buyProd);
            money += buyProd.getCost();
            //System.out.printf("В кассе %d", money);
            return buyProd;
        }
        return null;
    }

    // метод печати списка продуктов

    // первый метод вывода продуктов
    public void printList(){
        for (Product prod: this.getProducts()
        ) {
            System.out.println(prod);
        }
    }

    //написали второй метод вывода списка продуктов
    @Override
    public String toString() {
        StringBuilder wdProducts = new StringBuilder();

        for (Product prod : this.getProducts()
             ) {
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(money);
        return wdProducts.toString();
    }


}
