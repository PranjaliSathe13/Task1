/*Task 2: Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows
:Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/


class Employee{

private String name;
private int yearOfJoining;
private double salary;
private String address;

public Employee(String name,String address,double salary,int yearOfJoining)
{
this.name=name;
this.salary=salary;
this.yearOfJoining=yearOfJoining;
this.address=address;
}

public String getName()
{
return this.name;
}
public double getSalary()
{
return this.salary;
}
public int getYearOfJoining()
{
return this.yearOfJoining;
}
public String getAddress()
{
return this.address;
}

}
class EmployeeMain{
public static void main(String[] arg)
{
 Employee employee1=new Employee("Robert","64C- WallsStreat",15000,1994);
 Employee employee2=new Employee("Sam","68D- WallsStreat",15000,2000);
 Employee employee3=new Employee("John","26B- WallsStreat",15000,1999);
 //Employee employee1=new Employee("Pranjali","Ira Womens Hostel",15000,2024);

System.out.println("Name\t\tYear of Joining\t\\ttsalary\t\tAddress");

System.out.println(employee1.getName()+"\t\t"+employee1.getYearOfJoining()+"\t\t\t"+employee1.getSalary()+"\t\t"+employee1.getAddress());

System.out.println(employee2.getName()+"\t\t"+employee2.getYearOfJoining()+"\t\t\t"+employee2.getSalary()+"\t\t"+employee2.getAddress());
System.out.println(employee3.getName()+"\t\t"+employee3.getYearOfJoining()+"\t\t\t"+employee3.getSalary()+"\t\t"+employee3.getAddress());
}
}