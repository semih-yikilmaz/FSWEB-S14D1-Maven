package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager (int id, String name, double salary){
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() * 1.75);
    }

    public void addEmployee(JuniorDeveloper developer, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index!");
        } else if (juniorDevelopers[index] != null) {
            System.out.println("This index is already occupied!");
        } else {
            juniorDevelopers[index] = developer;
        }
    }

    public void addEmployee(MidDeveloper developer, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index!");
        } else if (midDevelopers[index] != null) {
            System.out.println("This index is already occupied!");
        } else {
            midDevelopers[index] = developer;
        }
    }

    public void addEmployee(SeniorDeveloper developer, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index!");
        } else if (seniorDevelopers[index] != null) {
            System.out.println("This index is already occupied!");
        } else {
            seniorDevelopers[index] = developer;
        }
    }
}
