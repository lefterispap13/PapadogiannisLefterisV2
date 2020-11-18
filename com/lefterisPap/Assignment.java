package com.lefterisPap;

import java.time.LocalDate;

public class Assignment {

    private String title;
    private String description;
    private LocalDate subDateTime;

    public Assignment(String title,String description,LocalDate subDateTime){
        this.title=title;
        this.description=description;
        this.subDateTime=subDateTime;
    }

    public String getTitle(){
        return title.toUpperCase();
    }
    public String getDescription(){
        return description.toUpperCase();
    }
    public LocalDate getSubDateTime(){
        return subDateTime;
    }
    public void setTitle(String newTitle){
        this.title=newTitle.toUpperCase();
    }
    public void setDescription(String newDescription){
        this.description=newDescription.toUpperCase();
    }
    public void setSubDateTime(LocalDate newSubDateTime){
        this.subDateTime=newSubDateTime;
    }

    public void printAssignments(){
        System.out.println("Assignment: "+this.title.toUpperCase()+
                " ,description: "+this.description.toUpperCase()+" and sub date :"+this.subDateTime);
    }

    public void showAssignments(){
        System.out.println("Assignment{" +
                "description: '" + description.toUpperCase() + '\'' +
                ", title:'" + title.toUpperCase() + '\'' +
                ", subDateTime: " + subDateTime +
                '}');
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "title: " + title + '\'' +
                ", description:" + description + '\'' +
                ", subDateTime: " + subDateTime +
                '}';
    }
}
