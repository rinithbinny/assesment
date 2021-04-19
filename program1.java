package assessment;
import java.util.Comparator;
import java.util.Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  




class Employee implements Comparable<Employee>{
	
	public Employee(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee o1,Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
    public String toString() {
        return "";
    }
	
	
}

class AgeComparator  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee s1=(Employee)o1;  
		Employee s2=(Employee)o2;  
		if(s1.getAge()>s2.getAge()) {
			return 1;
		}
		else if(s1.getAge()<s2.getAge()) {
			return 0;
		}
		else {
			if(s1.getDateOfJoining().compareTo(s2.getDateOfJoining())==1) {
				return 1;
			}
			else {
				return 0;
			}
			
		}
	}
	
}

class EmployeeBO{
	static void printEmployees(List<Employee> list) {
		for(Employee emp:list) {  
			  System.out.println(emp.getId()+emp.getAge()+emp.getDepartment()+emp.getName()+emp.getSalary()+emp.getDateOfJoining());  
			  
			}  
	}
}

public class program1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in); 

		System.out.print("Enter number of employees ");  
		int num= sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print("Enter details of emp"+(i+1));
			String name= sc.nextLine();
			sc.nextLine();

			String department= sc.nextLine();
			System.out.println(name+"ndame");


			String cindate = sc.nextLine();
			Date date1=new Date();;
			try {
				 date1=new SimpleDateFormat("dd/MM/yyyy").parse(cindate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			int age= sc.nextInt();
			int salary= sc.nextInt();
			System.out.println(name+"name");
			Employee emp=new Employee(i+1,name,department,date1,age,salary);
			System.out.println(emp.getName()+"hi");

		}

	}
	

}
