package com.lefterisPap;

public class StreamPerCourse {
    private Course course;
    private Stream stream;

    public StreamPerCourse(Course course, Stream stream){
        this.course = course;
        this.stream=stream;
    }
    public Course getCourse(){
        return course;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream newStream) {
        this.stream = newStream;
    }

    public void setCourse(Course newTitle) {
        this.course = newTitle;
    }

    public void printCourses(){
        System.out.println("Course: "+this.course.getTitle().toUpperCase()+" "+this.stream.getTitle().toUpperCase()+" "+
                this.stream.getType().toUpperCase()+" , Start date: "+this.course.getStartDate()+
                " ,End date: "+this.course.getEndDate());
    }

    public void showCourseTitleStreamType(){
        System.out.println("Course: "+this.course.getTitle().toUpperCase()+" "+this.stream.getTitle().toUpperCase()+" "+
                this.stream.getType().toUpperCase());
    }

    @Override
    public String toString() {
        return "StreamPerCourse{" +
                "course=" + course +
                ", stream=" + stream +
                '}';
    }
}

