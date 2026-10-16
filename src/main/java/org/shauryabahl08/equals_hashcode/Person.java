package org.shauryabahl08.equals_hashcode;

import java.util.Objects;

// final ==> Now no one can inherit me
// abstract keyword ==> Now no one can create object of me
public final class Person {

    private String name;

    private String email;

    private Integer age;

    public Person(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) { // because the signature of the equals method is defined in the Object class
//        // this == p1??
//        // obj == p2??
//        // Runtime polymorphism ---> parent can handle child object
//
//        // instanceOf --> check the object type
//
//        if(this == obj) {
//            System.out.println("Both objects are same memory address");
//            return true;
//        }
//
//        if (!(obj instanceof Person)) {
//            System.out.println("Object is not of type Person");
//            return false;
//        }
//
//        if(obj.getClass() != this.getClass()) {
//            System.out.println("Object is not of type Person");
//            return false;
//        }
//
//        // Type casting
//        Person p2 = (Person) obj;
//
//        if(!this.name.equals(p2.name)) {
//            System.out.println("Name is not equal");
//            return false;
//        }
//
//        if(!this.email.equals(p2.email)) {
//            System.out.println("Email is not equal");
//            return false;
//        }
//
//        if(!this.age.equals(p2.age)) {
//            System.out.println("Age is not equal");
//            return false;
//        }
//
//        return true; // to make code compile
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getAge(), person.getAge());
    }

    @Override // unique so we can search it easily via a hash table
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + Objects.hashCode(getEmail());
        result = 31 * result + Objects.hashCode(getAge());
        return result;
    }


}
