package com.epam.EmployeeManagmentSystem;
/**
 * Hello world!
 *

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
 */
//import java.util.ArrayList;
import java.util.*;
class Address{
	private int floorNumber;
	private String streetName;
	private String cityName;
	private String state;
	private String country;
	public Address(int floorName,String streetName,String cityName,String state,String country)
	{
		this.floorNumber=floorNumber;
		this.streetName=streetName;
		this.cityName=cityName;
		this.state=state;
		this.country=country;
	}
}
class Employee {
    private int id;
    private String name;
    private double salary;
    //task 3
    private Address address;
    public Employee(int id, String name, double salary,Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address=address;
    }
 public int getId()
 {
	 return this.id;
 }
 
 public String getName()
 {
	 return this.name;
 }
 public Address getAddress() {
	 //System.out.println(this.address.floorNumber+","+this.address.streetName+","+this.address.cityName)
	//System.out.println("========="+this.address.);
	 return this.address;
 }
}
class JuniorEngineer extends Employee {
    private int assessmentScore;
    private String feedback;
   
    public JuniorEngineer(int id, String name, double salary, int assessmentScore, String feedback,Address address) {
        super(id, name, salary,address);
        this.assessmentScore = assessmentScore;
        this.feedback = feedback;
    }
}

class SoftwareEngineer extends Employee {
    private String projectName;

    public SoftwareEngineer(int id, String name, double salary, String projectName,Address address) {
        super(id, name, salary,address);
        this.projectName = projectName;
    }
}

class Trainer extends Employee {
    private List<String> skills;
    private List<String> certifications;

    public Trainer(int id, String name, double salary, List<String> skills, List<String> certifications,Address address) {
        super(id, name, salary,address);
        this.skills = skills;
        this.certifications = certifications;
    }
}

class Course {
    private int courseId;
    private String courseName;
    private int courseDuration;

    public Course(int courseId, String courseName, int courseDuration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }
    public int getCourseId()
    {
   	 return this.courseId;
    }
    
    public String getCourseName()
    {
   	 return this.courseName;
    }
    
}

class Training {
    private int trainingId;
    private int employeeId;
    private int courseId;
    private String dateAttended;

    public Training(int trainingId, int employeeId, int courseId, String dateAttended) {
        this.trainingId = trainingId;
        this.employeeId = employeeId;
        this.courseId = courseId;
        this.dateAttended = dateAttended;
   }
    public String getDateAttended() {
    	return dateAttended;
    }
}

class Feedback {
    private int feedbackId;
    private int courseId;
    private String feedbackComments;
    private int rating;

    public Feedback(int feedbackId, int courseId, String feedbackComments, int rating) {
        this.feedbackId = feedbackId;
        this.courseId = courseId;
        this.feedbackComments = feedbackComments;
        this.rating = rating;
    }
    
    public String getFeedbackComments() {
    	return feedbackComments;
    }
    

}

public class App {
    public static void main(String[] args) {
    	
    
    	
    	
    	
         Address address1=new Address(1,"Ira pg","madhapur","Andhra Pradesh","India");
        Employee employee1 = new Employee(1, "John Doe", 50000,address1);
        Course course1 = new Course(101, "Java Programming", 30);
        Training training1 = new Training(1, employee1.getId(), course1.getCourseId(), "2024-04-07");
        Feedback feedback1 = new Feedback(1, course1.getCourseId(), "Great course!", 5);
        System.out.println("Employee: " + employee1.getName());
       // System.out.println("Address: " + employee1.getAddress().getCityName());
        System.out.println("Course: " + course1.getCourseName());
        System.out.println("Training Date: " + training1.getDateAttended());
        System.out.println("Feedback: " + feedback1.getFeedbackComments());
        int k=3;
        String currentDay="monday";
        String dayAfterKdays=findDayAfterKDays(currentDay,k);
        System.out.println("------------day after"+k+"days is:"+dayAfterKdays);
        
        //----------------------
        String inputString = "Epam Systems Pvt Ltd";
        findDuplicateCharacters(inputString);
    }
	//function to find day after k days
	public static String findDayAfterKDays(String currentDay,int k)
	{
		Map<String,Integer> dayHashMap=new HashMap<>();
		dayHashMap.put("monday", 0);
		dayHashMap.put("tuesday", 1);
		dayHashMap.put("wednesday", 2);
		dayHashMap.put("thursday", 3);
		dayHashMap.put("friday", 4);
		dayHashMap.put("saturday", 5);
		dayHashMap.put("sunday", 6);
		
		String[] days= {"monday","tuesday","wednesday","thursday","friday","saturday", "sunday"};
		int currentIndex=dayHashMap.get(currentDay);
		int nextIndex=(currentIndex+k)%7;
		return days[nextIndex];
	}
	public static void findDuplicateCharacters(String inputString) {
        inputString = inputString.replace(" ", "");
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = charFrequencyMap.entrySet();
        System.out.println("Duplicate characters in the string '" + inputString + "':");
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }

	
	//
}
