package org.shauryabahl08.oops.polymorphism.runtime.company;

public class Manager extends Employee {

    private String projectName;

    public Manager(String name, int salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
