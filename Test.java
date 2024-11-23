public class Test {
    public static void main(String[] args) {
        Person person = new Person("Cezary", "Markiewicz", 20);
        person.setName("Mirosław");
        person.setSurname("Zelent");
        person.setAge(50);

        System.out.println("Nastąpiła zmiana imienia");
        System.out.println(person.getName());

        System.out.println("Nastąpiła zmiana nazwiska");
        System.out.println(person.getSurname());

        System.out.println("Nastąpiła zmiana wieku");
        System.out.println(person.getAge());
        System.out.println("-----------------------");

        Address address = new Address();
        address.setCity("Warszawa");
        address.setStreet("Łabiszyńska");

        System.out.println("Miasto:");
        System.out.println(address.getCity());

        System.out.println("Ulica: ");
        System.out.println(address.getStreet());
    }
}

class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {return age;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Address {
    private String city;
    private  String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

