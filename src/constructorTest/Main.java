package constructorTest;

public class Main {

    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person("Konin", "Oleg",'m');
        System.out.println(oleg);

        Employee olga = new Employee("Svetova", "Olga", 'f', "Buhgalter");

        System.out.println(olga);

        Person olga2 = olga;
        // Employee oleg2 = oleg;

        System.out.println(olga2);
    }


//    public static void main(String[] args) throws Exception {
//        Person person = new Person("Sergey", 28, "Proletarskaya 10", "88005553535");
//        Person.getCounter();
//        Fraction fraction = new Fraction(1, 10);
//    }
//}

//class Person {
//    int id;
//    private static String name;
//    private int age;
//    private static int counter = 0;
//
//    public int getId() {
//        return id;
//    }
//
//    public static int getCounter() {
//        return counter;
//    }
//    //    public String address;
////    private String phone;
//
//    static {
//        System.out.println(counter);
//    }
//
//    public Person(String name, int age, String adress, String phone) {
//        id = counter++;
//        this.name = name;
//        this.age = age;


//        this.address = address;
//        this.phone = phone;
}

//    public void displayName(){
//        System.out.printf("Name %s \n, name");
//    }
//    void displayAge(){
//        System.out.printf("Age %d \n, age");
//    }

//    private void displayAddress(){
//        System.out.printf("Address %s \n, address");
//    }
//
//    protected void displayPhone(){
//        System.out.printf("Phone %s \n, phone");
//    }


//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        if (age > 0 && age < 110)
//            this.age = age;
//    }
//}


class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add1ToNumerator() {
        this.numerator++;
        return this;
    }

    public Fraction getObjectCurrent() {
        return this;
    }

}

class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // m - male, f - female

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public Person() {
        this("", "", '-');
    }

    public Person(String lastName) {
        this(lastName, "", '-');
    }

    public Person(String lastName, String firstName, char gender) {
        this(lastName, firstName);
        this.gender = gender;
    }

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
    class Employee extends Person{
     protected String dolznost;

        public Employee(String lastName, String firstName, char gender, String dolznost) {
            super(lastName, firstName, gender);
            this.dolznost = dolznost;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "dolznost='" + dolznost + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public void tellMeWhoAreYou() {
            System.out.println("Hello, I am employee and my class is " + this.getClass());
        }

    }


