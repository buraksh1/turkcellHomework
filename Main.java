package org.turkcellHomework;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        product1.setName("Orcamp Purmuz Set");
        product1.setUnitPrice(7500);
        product1.setDiscount(10);
        product1.setUnitInStock(15);
        product1.setImageUrl("orcamppurmuz.jpg");

        Product product2 = new Product();

        product2.setName("Orcamp 3 Kisilik Cadir");
        product2.setUnitPrice(10453);
        product2.setDiscount(15);
        product2.setUnitInStock(5);
        product2.setImageUrl("orcamp3kisilikcadir.jpg");

        Product product3 = new Product();
        product3.setName("Orcamp Ocak");
        product3.setUnitPrice(1500);
        product3.setDiscount(5);
        product3.setUnitInStock(1);
        product3.setImageUrl("orcampocak.jpg");

        Product[] products = {product1,product2,product3};

        for (Product product: products)
        {
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("64324");
        individualCustomer.setFirstName("Burak");
        individualCustomer.setLastName("Sahin");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("45421");
        corporateCustomer.setCompanyName("adenhouse");
        corporateCustomer.setTaxNumber("7606917");


        Customer[] custormers = {individualCustomer,corporateCustomer};
        for(Customer customer : custormers)
        {
            System.out.println(customer.getPhone());
        }

    }

}