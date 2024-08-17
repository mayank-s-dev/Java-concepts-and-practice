package Basics;

public class ReferenceDataTypes {
    public static void main(String[] args){
         // 1. Class type
        // reference is created here
        Employee embObj = new Employee();
        embObj.employeeId = 10;
        System.out.println("empObj " + embObj.employeeId);
        modify(embObj);
        System.out.println("mof " + embObj.employeeId);

        // empObj2 will point to empObj
        Employee empObj2 = embObj;
        System.out.println(empObj2.employeeId);

        // 2. String type
        String s1 = "Hello"; // string literal
        String s2 = "Hello"; // string literal
        String s3 = new String("Hello");
        System.out.println(s1==s2); // reference are being campared
        // in string literal "hello" is present in string constant pool, s2 will point s1
        System.out.println(s1==s3);

        s1 = "Mayank"; // s1 will point to "mayank"

        s3 = "yoooo";

        //  3. Interface

        // 4 Array
        int arr[] = new int[5];
        System.out.println(arr); // this will print address of first pointer

        int []arr1 = new int[5];

        int arr2[] = {1, 3, 4, 5};

        int arr_2d[][] = new int[3][4];
        System.out.println(arr_2d[0][1]); // default value of int is 0

        // other practice

        Employee.employee_static = 20; // static variable is accessed with class name and can be changed
        // Employee.employee_static_final = 30; // final, static variable is accessed with class name and can't be changed

        int a = 10;
        System.out.println("a: " + a);
        modify_int(a);
        System.out.println("after modifying int a: " + a);

        Integer b = new Integer(10);
        System.out.println("b: " + b);
        // right now unable to understand why b is not getting modified
        modify_Integer(b);
        System.out.println("after modifying Integer b: " + b);

        // type conversion
        int parsedValue = Integer.parseInt("123");
        String intAsString = Integer.toString(456);

        // get type
        System.out.println(intAsString.getClass().getSimpleName()); // for reference datatypes
        System.out.println(((Object)parsedValue).getClass().getSimpleName()); // for primitive data types

        Integer aa = 10;
        Integer bb = 10;
        Integer cc = new Integer(10);
        Integer dd = new Integer(cc);
        System.out.println("camparing Integer " + (aa == bb));
        System.out.println("camparing Integer " + (cc == bb));
        System.out.println("camparing Integer " + (cc == dd));

        // passing String practice
        // practice
        String s = "Hello";
        System.out.println("before modify " + s);
        modify_string(s);
        System.out.println("after modify  " + s);

        // passing array
        int passing_arr[] = new int[5];
        passing_arr[0] = 99;
        System.out.println("before modify arr " + passing_arr[0]);
        modify_arr(passing_arr);
        System.out.println("after modify arr " + passing_arr[0]);

    }

    private static void modify_arr(int arr[]){
        arr[0] = 88;
    }
    private static void modify_string(String s){
        s = "Mayank";
    }
    private static void modify_int(int a){
        a = 20;
    }

    private static void modify_Integer(Integer b){
        b = 20;
    }
    private static void modify(Employee embObj) {
        embObj.employeeId = 20;
    }
}

class Employee{
    int employeeId;

    static int employee_static = 10;

    static final int employee_static_final = 10;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
