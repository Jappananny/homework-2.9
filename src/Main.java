import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ProductException {
        Phonebook phonebook = new Phonebook();
        phonebook.addPhone(new FullName("Василий","Свечкин"),"79784548090");
        phonebook.addPhone(new FullName("Зая",""),"112");
        phonebook.addPhone(new FullName("Вика","Деньги"),"74509800066");
        phonebook.addPhone(new FullName("777",""),"88003332439");
        phonebook.addPhone(new FullName("рандом1",""),"01");
        phonebook.addPhone(new FullName("рандом2",""),"02");
        phonebook.addPhone(new FullName("рандом3",""),"03");
        phonebook.addPhone(new FullName("рандом4",""),"04");
        phonebook.addPhone(new FullName("рандом5",""),"05");
        phonebook.addPhone(new FullName("рандом6",""),"06");
        phonebook.addPhone(new FullName("рандом7",""),"07");
        phonebook.addPhone(new FullName("рандом8",""),"08");
        phonebook.addPhone(new FullName("рандом9",""),"09");
        phonebook.addPhone(new FullName("рандом10",""),"10");
        phonebook.addPhone(new FullName("рандом11",""),"11");
        phonebook.addPhone(new FullName("рандом12",""),"12");
        phonebook.addPhone(new FullName("рандом13",""),"13");
        phonebook.addPhone(new FullName("рандом14",""),"14");
        phonebook.addPhone(new FullName("рандом15",""),"15");
        phonebook.addPhone(new FullName("рандом16",""),"16");

        System.out.println("Телефонный справочник:");
        for (Map.Entry<FullName, String> phone : phonebook.getPrhone()) {
            System.out.println(phone.getKey() + " " + phone.getValue());
        }
        System.out.println("==============================================================================");

        Product bananas = new Product("Банан",89.90,0.5);
        System.out.println(bananas);
        Product nail = new Product("Деревянные гвозди", 820,3.0);
        System.out.println(nail);
        Product rice = new Product("Рис",119.99,10.5);
        System.out.println(rice);
        Product sand = new Product("Песок строительный",6, 4500.0);
        System.out.println(sand);
        Product mayonese = new Product("Майонез",96.50,1.0 );
        System.out.println(mayonese);
        ProductServise allProducts = new ProductServise();
        allProducts.add(bananas);
        allProducts.add(nail);
        allProducts.add(mayonese);
        Recipes fairNails = new Recipes("Жаренные гвозди");
        fairNails.addProd(nail,5);
        fairNails.addProd(mayonese,1);
        System.out.println(fairNails.sumPricesRecipes() + " Итого сумма");
        System.out.println("==============================================================================");
        MapList mapList = new MapList();
        System.out.println(mapList.keysAndValues());
        System.out.println(mapList.convertCollection());
        System.out.println("==============================================================================");
        Checked.addMap("str1",2);
        Checked.addMap("str2",1);
        Checked.addMap("str1",3);
        Checked.addMap("str1",5);
        Checked.addMap("str1",5);


    }
}