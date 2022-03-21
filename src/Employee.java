import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private  static   String name;
    private static  int salary;
    private static int hours;
    private static int id;
    public Employee(String name,int salary,int hours,int id){
        this.salary=salary;
        this.name=name;
        this.hours=hours;
        this.id=id;

    }

    public  int getSalary() {
        return salary;
    }

    public  void setSalary(int salary) {
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getInfo(int salary, int hours){
        int total_Salary =salary*hours;
        return total_Salary;

    }
    public int addSal(){
       if(getSalary()<500){
           setSalary(getSalary()+5);
       }
       return getSalary();

    }
    public String toString () {
        return "ID:" + getId ()  + "\tName:" + getName () + "\tSalary:" + getSalary () +
                "\tHours:" + getHours () ;
    }


    public static Employee search(ArrayList<Employee> list, int id) {
        for (Employee emp : list) {
            if (Double.toString(emp.getSalary()).equals(id) || Double.toString(emp.getId()).equals(id))
                return emp;

        }
        return null;

    }


    public static Employee Add_Employee(){
        Scanner obj =new Scanner(System.in);
        System.out.println("Add Employee name");
       name=obj.next();
        System.out.println("Add Employee Salary");
       salary=obj.nextInt();
        System.out.println("Add Employee id");
       id = obj.nextInt();
        System.out.println("Add Employee working hours");
       hours=obj.nextInt();
        Employee e =new Employee(name,salary,hours,id);
        return e;
    }

    public static void main(String[] args){
        ArrayList<Employee> list=new ArrayList<Employee>();

        System.out.println("Adding Employee press 1");
        System.out.println("Adding salary press 2");
        System.out.println("search Employee press 3");
        Scanner obj= new Scanner(System.in);
        int num = obj.nextInt();
        switch (num) {
            case 1:
                Employee emp= Employee.Add_Employee();
                list.add(emp);
                System.out.println("employee information "+list);
            case 2:

                if(!(list.isEmpty())){
                    System.out.println("Enter Employee ID to Add salary: ");
                    int searchid = obj.nextInt();
                    Employee.search(list,searchid).addSal();

                    System.out.println("employee information "+Employee.search(list,searchid).addSal());
                        }
                    }
                }




        }








