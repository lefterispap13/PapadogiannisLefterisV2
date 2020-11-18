package com.lefterisPap;

import java.util.ArrayList;

public class Stream {
    private String title;
    private String type;
    private ArrayList<Assignment> assign;


    public Stream(String title,String type,ArrayList<Assignment> assign){
        this.title=title;
        this.type=type;
        this.assign=assign;
    }

    public String getTitle(){
        return title.toUpperCase();
    }
    public String getType(){
        return type.toUpperCase();
    }
    public ArrayList<Assignment> getAssign(){
        return assign;
    }

    public void setTitle(String newTitle){
        this.title=newTitle.toUpperCase();
    }
    public void setType(String newType){
        this.type=newType.toUpperCase();
    }
    public void setAssign(ArrayList<Assignment> newAssign){
        this.assign=newAssign;
    }

    public void showTitleAndType(){
        System.out.println(" ,stream: "+title.toUpperCase()+" , type: "+type.toUpperCase());
    }

    @Override
    public String toString() {
        return "Stream{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", assign=" + assign +
                '}';
    }
}
