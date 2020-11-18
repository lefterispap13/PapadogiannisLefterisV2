package com.lefterisPap;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private StreamPerCourse personalCourse;
    private LocalDate dateOfBirth;
    private ArrayList<Assignment> persAssignments;
    private ArrayList<AssignmentPerStudent> individualGrades;
    private String tuitionFees;

    public Student(String firstName, String lastName,LocalDate dateOfBirth, StreamPerCourse personalCourse,
                   ArrayList<Assignment> persAssignments,ArrayList<AssignmentPerStudent> individualGrades,
                   String tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=dateOfBirth;
        this.personalCourse = personalCourse;
        this.persAssignments = persAssignments;
        this.individualGrades = individualGrades;
        this.tuitionFees = tuitionFees;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public StreamPerCourse getPersonalCourse() {
        return personalCourse;
    }

    public void setPersonalCourse(StreamPerCourse personalCourse) {
        this.personalCourse = personalCourse;
    }

    public ArrayList<Assignment> getPersAssignments() {
        return persAssignments;
    }

    public void setPersAssignments(ArrayList<Assignment> persAssignments) {
        this.persAssignments = persAssignments;
    }

    public ArrayList<AssignmentPerStudent> getIndividualGrades() {
        return individualGrades;
    }

    public void setIndividualGrade(ArrayList<AssignmentPerStudent> persAssignmentPerStudent) {
        this.individualGrades = persAssignmentPerStudent;
    }

    public String getTuitionFees() {
        return tuitionFees.toUpperCase();
    }

    public void setTuitionFees(String tuitionFees) {
        this.tuitionFees = tuitionFees.toUpperCase();
    }
    //???list of students per course
    public void showStudentsPerCourse(){
        System.out.println("Course: "+ this.getPersonalCourse().getCourse().getTitle().toUpperCase()+" "+
                this.getPersonalCourse().getStream().getTitle().toUpperCase()+" "+
                this.getPersonalCourse().getStream().getType().toUpperCase()+
                " ,Student: "+this.lastName.toUpperCase()+" "+this.firstName.toUpperCase()+" ,date of birth: "+
                this.dateOfBirth);
    }
    //??maybe for the list of students that are in more than one lesson
    public void showFnameLnameDob(){
        System.out.println("Student: "+this.lastName.toUpperCase()+" "+this.firstName.toUpperCase()+
                " ,date of birth: "+this.dateOfBirth);
    }

    //??????list of students
    public void giveBasicStatsForStuds(){
        System.out.println("Last name : "+this.getLastName().toUpperCase()+" ,First name : "+
                this.getFirstName().toUpperCase()+" , date of birth: "+this.getDateOfBirth()+
                " , tuition fees:"+this.getTuitionFees().toUpperCase());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", tuitionFees='" + tuitionFees + '\'' +
                '}';
    }
}
