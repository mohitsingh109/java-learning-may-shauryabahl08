package org.shauryabahl08.oops.constructor;

public class UserMain {

    public static void main(String[] args) {
        // Idea of constructor is you don't need to call the setter
        // every time you need to create the object
        // instead you can pass the value at the time of object creation
        User user = new User(); // it's calling the default constructor
        user.setName("John");
        user.setAge(25);
        // 50 setter function

        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());

        User user2 = new User("Alice", 30); // it's calling user define constructor
        System.out.println("Name: " + user2.getName()); // Alice
        System.out.println("Age: " + user2.getAge()); // 30

        User user3 = new User("Mohit");

        User user4 = new User(25);

        Phone phone1 = new Phone("Apple", "iPhone 13", 999.99, "Black", "A1", "16GB", "1TB", "A1 Chip");

        Phone phone2 = new Phone("Samsung", "Samsung A55", 999.99, "Black", "SM", "16GB", "1TB", "Intel Chip");
    }
}
