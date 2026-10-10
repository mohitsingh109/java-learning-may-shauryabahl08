package org.shauryabahl08.questions.collage;

public class Student {

    private String name;

    private String rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    // because the equals method is doing memory address compare
    @Override
    public boolean equals(Object obj) { // Student Object

        // instanceOf is used to check the type of object

        if(!(obj instanceof Student)) {
           return false;
        }

        Student other = (Student) obj; // s2

        // string compare
        // this.name --> s1
        // other.getName() --> s2
        if(!this.name.equals(other.getName())) {
            return false;
        }

        // this.rollNumber --> s1
        // other.getRollNumber() --> s2
        if(this.rollNumber != other.getRollNumber()) {
            return false;
        }
        return true;
    }
}
