package com.lefterisPap;

public class Trainer {

    private String firstName;
    private String lastName;
    private StreamPerCourse subject;

    public Trainer(String fname,String lname,StreamPerCourse subject){
        this.firstName=fname;
        this.lastName=lname;
        this.subject=subject;
    }

    public String getFirstName(){
        return firstName.toUpperCase();
    }
    public String getLastName(){
        return lastName.toUpperCase();
    }

    public StreamPerCourse getSubject(){
        return subject;
    }

    public void setFirstName(String newName){
        this.firstName=newName.toUpperCase();
    }
    public void setLastName(String newLname){
        this.lastName=newLname.toUpperCase();
    }

    //????? list of trainer
    public void showTrainers(){
        System.out.println("Trainer: "+this.lastName.toUpperCase()+" "+this.firstName.toUpperCase()+" ,with subject: "+
                this.subject.getStream().getTitle().toUpperCase());
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject=" + subject.getStream().getTitle() +" "+subject.getStream().getType();
    }

    public void printUserDetails(){
        System.out.println("Trainer: "+this.lastName.toUpperCase()+" "+ this.firstName.toUpperCase()+" teaches the course: "+
                subject.getCourse().getTitle().toUpperCase()+ " "
                +subject.getStream().getTitle().toUpperCase()+" "+subject.getStream().getType().toUpperCase());
    }
}
