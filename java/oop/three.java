package oop;
public class three {
    public static void main(String[] args) {
        employee e1 = new employee("zyad", "egeypt", "it", "zyad2323@gmail.com", 3000);
        salaryedemployee e2 = new salaryedemployee("zyad", "egeypt", "it", "zyad2323@gmail.com", 3000, 200);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}
