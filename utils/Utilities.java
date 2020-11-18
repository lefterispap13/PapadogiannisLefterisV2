package utils;

import com.lefterisPap.*;
import database.SchoolDatabase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static database.SchoolDatabase.*;


public class Utilities {

    //this method takes a date with LocalDate format and returns it as a String
    public static String reformatDate(LocalDate date){
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static LocalDate newDate(String str){
        return LocalDate.parse(str, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public static void callScanner(){
        Scanner sc=new Scanner(System.in);
    }

    public static void printStudents(){
        for (Student current:students){
            System.out.println("List of all students: \n");
            current.giveBasicStatsForStuds();
        }
    }

    public static void printTrainers() {
        for (Trainer current : trainers) {
            System.out.println("List of all trainers: \n");
            current.showTrainers();
        }
    }

    public static void printAssignments(){
        for (Assignment current:assignments){
            System.out.println("List of all assignments: \n");
            System.out.println(current);
        }
    }

    public static void printCourses(){
        for (StreamPerCourse current:stps){
            System.out.println("List of all courses: \n");
            current.printCourses();
        }
    }

    public static void  printTrainersPerCourse(){
        for (Trainer current:trainers){
            System.out.println("List of all trainers per course: \n");
            current.printUserDetails();
        }
    }

    public static void printStudentsPerCourse(){
        for (Student current:students){
            System.out.println("List of all students per course: \n");
            current.showStudentsPerCourse();
        }
    }



    public static void printAssignmentsPerCourse(){
        for (StreamPerCourse current : stps){
            System.out.println("List of all assignments per course: \n");
            System.out.println("Course title: "+current.getCourse().getTitle()+" , stream : "+
                    current.getStream().getTitle()+ " , type : "+current.getStream().getType()+
                    " ,and assignments: " +current.getStream().getAssign());
        }
    }

    //      ???? list of all assignments per student
    public static void printAssignmentsPerStudent(){
        System.out.println("List of all assignments per student: \n");
        for (Student i:students) {
            System.out.println("Student :"+i.getLastName()+" "+i.getFirstName() );
            for (AssignmentPerStudent current : i.getIndividualGrades()) {
                System.out.println(current);
            }
        }
    }

    // ???? list of students who need to submit one or more assignments
    public static void studentsNeedToSubmitAssignments(){
        System.out.println("Students who need to submit one or more assignments are: \n");
        for (Student i:students) { //Ton mathiti olokliro
//            System.out.println("Student :"+i.getLastName()+" "+i.getFirstName() );
            for (AssignmentPerStudent current : i.getIndividualGrades()) {
//                System.out.println(current);
                for (Assignment x: assignments){
                    if (isBetweenTheDeliveryWeek(current.getDeliveryDate(), x.getSubDateTime())){
                        System.out.println("Assignment: "+x.getTitle()+" , Student: "+i.getLastName()+" "+i.getFirstName());
                    }
                }

            }
        }
    }

    private static boolean isBetweenTheDeliveryWeek(LocalDate deliveryDate, LocalDate dueDate){
        //Calculate the start of the week
        int minusDates = deliveryDate.getDayOfWeek().getValue()-1;
        LocalDate startDate = deliveryDate.minusDays(minusDates);

        //Calculate the end of the week (Friday)
        int plusDays = 7 - deliveryDate.getDayOfWeek().getValue()-2;
        LocalDate endDate = deliveryDate.plusDays(plusDays);

        return (dueDate.isAfter(startDate)||dueDate.isEqual(startDate))
                &&(dueDate.isEqual(endDate)||dueDate.isBefore(endDate));
    }
}




