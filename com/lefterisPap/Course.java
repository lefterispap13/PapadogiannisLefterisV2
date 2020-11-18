package com.lefterisPap;
import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String title, LocalDate startDate,LocalDate endDate){
        this.title=title;
        this.startDate=startDate;
        this.endDate=endDate;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void showTitle(){
        System.out.println(" Course: "+this.getTitle());
    }

    public void showDate(){
        System.out.println(" ,Start date: "+this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
