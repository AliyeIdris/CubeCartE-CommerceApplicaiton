package com.unitedcoder.lambdaexpression;

@FunctionalInterface
public interface Employee {
    void employeeNetSalary();
}

class TestEmployee implements Employee{

    @Override
    public void employeeNetSalary() {
        System.out.println("Calculate Employee net salary");
    }
}

class Salary{
    public static void main(String[] args) {
        TestEmployee testEmployee=new TestEmployee();
        testEmployee.employeeNetSalary();
    }
}
