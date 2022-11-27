import java.util.Map;

public class Main {
    public static void main(String[] args) {
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
    }
}