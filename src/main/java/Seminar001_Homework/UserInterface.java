package Seminar001_Homework;

public class UserInterface {

    public static void main(String[] args) {

        VendMachine store = new VendMachine();

        store.addProduct(new Product("Choco", 155.60))
                .addProduct(new Product("Lays", 350.75))
                .addProduct(new Product("Moet Chandon", 1500.50))
                .addProduct(new CurecedProducts("Milk", 110.30, 7))
                .addProduct(new Alcohole("Beer", 250.60, 5.50))
                .addProduct(new Alcohole("Vine", 550.50, 15.00))
                .addProduct(new Sigaretts("Bond", 650.00, 20))
                .addProduct(new Sigaretts("Belomor", 980.00, 25))
                .addProduct(new WeightGoods("Apple", 50.60, 350.00))
                .addProduct(new WeightGoods("Pineapple", 690.00, 10.00));



        System.out.println(store.findProduct("Lays"));

        System.out.println(store);
        store.buy("Lays", 350.75);
        store.buy("Choco", 155.60);
        store.buy("Beer", 250.60);
        store.buy("Belomor", 980.00);



        System.out.println(store);


    }


}
