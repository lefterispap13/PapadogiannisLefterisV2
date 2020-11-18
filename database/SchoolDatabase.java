package database;

import com.lefterisPap.*;
import utils.Utilities;
import java.time.LocalDate;
import java.util.ArrayList;

public class SchoolDatabase {

    public static ArrayList<Student> students=new ArrayList<>();
    public static ArrayList<Course> courses=new ArrayList<>();
    public static ArrayList<Assignment> assignments=new ArrayList<>();
    public static ArrayList<Stream> streams=new ArrayList<>();
    public static ArrayList<AssignmentPerStudent> grades=new ArrayList<>();
    public static ArrayList<Trainer> trainers=new ArrayList<>();
    public static ArrayList<StreamPerCourse> stps=new ArrayList<>();

    static{
        Assignment java1=new Assignment("project1","private school",Utilities.newDate("17/09/2021"));
        Assignment java2=new Assignment("project2","bank account",Utilities.newDate("17/12/2021"));
        Assignment java3=new Assignment("project3","login system",Utilities.newDate("17/01/2021"));
        Assignment java4=new Assignment("project4","pc structure",Utilities.newDate("17/02/2021"));
        Assignment java5=new Assignment("project5","company management",Utilities.newDate("29/01/2021"));
        Assignment csharp1=new Assignment("project6","school ",Utilities.newDate("05/11/2021"));
        Assignment csharp2=new Assignment("project7","game account",Utilities.newDate("16/12/2021"));
        Assignment csharp3=new Assignment("project8","system log",Utilities.newDate("14/01/2021"));
        Assignment csharp4=new Assignment("project9","structure",Utilities.newDate("17/02/2021"));
        Assignment csharp5=new Assignment("project10","build car",Utilities.newDate("25/10/2021"));


        //initialize Assignments
        assignments.add(java1);
        assignments.add(java2);
        assignments.add(java3);
        assignments.add(java4);
        assignments.add(java5);
        assignments.add(csharp1);
        assignments.add(csharp2);
        assignments.add(csharp3);
        assignments.add(csharp4);
        assignments.add(csharp5);

        ArrayList<Assignment> javaFullTime=new ArrayList<>();
        javaFullTime.add(java1);
        javaFullTime.add(java2);
        javaFullTime.add(java3);
        javaFullTime.add(java4);
        javaFullTime.add(java5);

        ArrayList<Assignment> javaPartTime=new ArrayList<>();
        javaPartTime.add(java1);
        javaPartTime.add(java2);
        javaPartTime.add(java3);
        javaPartTime.add(java4);
        javaPartTime.add(java5);

        ArrayList<Assignment> cSharpFullTime=new ArrayList<>();
        cSharpFullTime.add(csharp1);
        cSharpFullTime.add(csharp2);
        cSharpFullTime.add(csharp3);
        cSharpFullTime.add(csharp4);
        cSharpFullTime.add(csharp5);

        ArrayList<Assignment> cSharpPartTime=new ArrayList<>();
        cSharpPartTime.add(csharp1);
        cSharpPartTime.add(csharp2);
        cSharpPartTime.add(csharp3);
        cSharpPartTime.add(csharp4);
        cSharpPartTime.add(csharp5);

        //initialize AssignmentPerStudent
        AssignmentPerStudent lefterisAssign1=new AssignmentPerStudent(java1,Utilities.newDate("17/09/2021"),"90","HIGH PASS");
        AssignmentPerStudent lefterisAssign2=new AssignmentPerStudent(java2,Utilities.newDate("17/12/2020"),"80","HIGH PASS");
        AssignmentPerStudent lefterisAssign3=new AssignmentPerStudent(java3,Utilities.newDate("17/01/2021"),"70","PASS");
        AssignmentPerStudent lefterisAssign4=new AssignmentPerStudent(java4,Utilities.newDate("16/02/2021"),"90","HIGH PASS");
        AssignmentPerStudent lefterisAssign5=new AssignmentPerStudent(java5,Utilities.newDate("25/11/2020"),"85","HIGH PASS");
        AssignmentPerStudent kwstasAssign1=new AssignmentPerStudent(java1,Utilities.newDate("16/11/2020"),"85","HIGH PASS");
        AssignmentPerStudent kwstasAssign2=new AssignmentPerStudent(java2,Utilities.newDate("17/12/2020"),"80","HIGH PASS");
        AssignmentPerStudent kwstasAssign3=new AssignmentPerStudent(java3,Utilities.newDate("16/01/2021"),"75","PASS");
        AssignmentPerStudent kwstasAssign4=new AssignmentPerStudent(java4,Utilities.newDate("16/02/2021"),"90","HIGH PASS");
        AssignmentPerStudent kwstasAssign5=new AssignmentPerStudent(java5,Utilities.newDate("25/11/2020"),"85","HIGH PASS");
        AssignmentPerStudent giannhsAssign1=new AssignmentPerStudent(java1,Utilities.newDate("16/11/2020"),"60","PASS");
        AssignmentPerStudent giannhsAssign2=new AssignmentPerStudent(java2,Utilities.newDate("17/12/2020"),"40","FAIL");
        AssignmentPerStudent giannhsAssign3=new AssignmentPerStudent(java3,Utilities.newDate("16/01/2021"),"70","PASS");
        AssignmentPerStudent giannhsAssign4=new AssignmentPerStudent(java4,Utilities.newDate("16/02/2021"),"90","HIGH PASS");
        AssignmentPerStudent giannhsAssign5=new AssignmentPerStudent(java5,Utilities.newDate("25/11/2020"),"45","FAIL");

        //grades
        grades.add(lefterisAssign1);
        grades.add(lefterisAssign2);
        grades.add(lefterisAssign3);
        grades.add(lefterisAssign4);
        grades.add(lefterisAssign5);
        grades.add(kwstasAssign1);
        grades.add(kwstasAssign2);
        grades.add(kwstasAssign3);
        grades.add(kwstasAssign4);
        grades.add(kwstasAssign5);
        grades.add(giannhsAssign1);
        grades.add(giannhsAssign2);
        grades.add(giannhsAssign3);
        grades.add(giannhsAssign4);
        grades.add(giannhsAssign5);

        ArrayList<AssignmentPerStudent> lefterisAssignments=new ArrayList<>();
        lefterisAssignments.add(lefterisAssign1);
        lefterisAssignments.add(lefterisAssign2);
        lefterisAssignments.add(lefterisAssign3);
        lefterisAssignments.add(lefterisAssign4);
        lefterisAssignments.add(lefterisAssign5);

        ArrayList<AssignmentPerStudent> kwstasAssignments=new ArrayList<>();
        kwstasAssignments.add(kwstasAssign1);
        kwstasAssignments.add(kwstasAssign2);
        kwstasAssignments.add(kwstasAssign3);
        kwstasAssignments.add(kwstasAssign4);
        kwstasAssignments.add(kwstasAssign5);

        ArrayList<AssignmentPerStudent> giannhsAssignments=new ArrayList<>();
        giannhsAssignments.add(giannhsAssign1);
        giannhsAssignments.add(giannhsAssign2);
        giannhsAssignments.add(giannhsAssign3);
        giannhsAssignments.add(giannhsAssign4);
        giannhsAssignments.add(giannhsAssign5);



        //initialize Courses
        Course cb1=new Course("CB1",Utilities.newDate("19/10/2020"),utils.Utilities.newDate("10/02/2021"));
        Course cb2=new Course("CB2",Utilities.newDate("18/05/2018"),utils.Utilities.newDate("16/05/2019"));
        Course cb3=new Course("CB3",Utilities.newDate("08/08/2021"),utils.Utilities.newDate("10/12/2021"));
        Course cb4=new Course("CB4",Utilities.newDate("13/07/2020"),utils.Utilities.newDate("19/10/2020"));

        courses.add(cb1);
        courses.add(cb2);
        courses.add(cb3);
        courses.add(cb4);

        //initialize Streams
        streams.add(new Stream("java","full time",javaFullTime));
        streams.add(new Stream("java","part time",javaPartTime));
        streams.add(new Stream("cSharp","full time",cSharpFullTime));
        streams.add(new Stream("cSharp","part time",cSharpPartTime));

        //StreamPerCourse for cb12 course
        StreamPerCourse javaFull=new StreamPerCourse(cb1,streams.get(0));
        StreamPerCourse javaPart=new StreamPerCourse(cb1,streams.get(1));
        StreamPerCourse cSharpFull=new StreamPerCourse(cb1,streams.get(2));
        StreamPerCourse cSharpPart=new StreamPerCourse(cb1,streams.get(3));
        StreamPerCourse javaFull1=new StreamPerCourse(cb2,streams.get(0));
        StreamPerCourse javaPart1=new StreamPerCourse(cb2,streams.get(1));
        StreamPerCourse cSharpFull1=new StreamPerCourse(cb2,streams.get(2));
        StreamPerCourse cSharpPart1=new StreamPerCourse(cb2,streams.get(3));

        //????? stream per courses
        stps.add(javaFull);
        stps.add(javaPart);
        stps.add(cSharpFull);
        stps.add(cSharpPart);
        stps.add(javaFull1);
        stps.add(javaPart1);
        stps.add(cSharpFull1);
        stps.add(cSharpPart1);



        //initialize Students

        //enrolled students for java full time in BootCamp
        Student LePa=new Student("lefteris","papadogiannis",Utilities.newDate("16/06/1991"),javaFull,javaFullTime,lefterisAssignments,"1900");
        Student KwKw=new Student("kwstas","kwsta",Utilities.newDate("10/10/1992"),javaFull,javaFullTime,kwstasAssignments,"2000");
        Student GiGi=new Student("giannhs","giannh",Utilities.newDate("13/12/1991"),javaFull,javaFullTime,giannhsAssignments,"1800");

        //enrolled students for java part time in BootCamp
        Student GrGr =new Student("grhgorhs","grhgoriou",Utilities.newDate("15/10/1993"),javaPart,javaPartTime,lefterisAssignments,"1900");
        Student AlAl =new Student("alekshs","aleksiou",Utilities.newDate("18/02/1995"),javaPart,javaPartTime,kwstasAssignments,"1900");
        Student PaPa =new Student("paulos","paulou",Utilities.newDate("05/03/1985"),javaPart,javaPartTime,giannhsAssignments,"1900");

        //enrolled students for c# full time in BootCamp
        Student PaPan=new Student("panos","panou",Utilities.newDate("13/07/1987"),cSharpFull,cSharpFullTime,lefterisAssignments,"1900");
        Student MiMi =new Student("mixalhs","mixalh",Utilities.newDate("25/06/1994"),cSharpFull,cSharpFullTime,kwstasAssignments,"1900");
        Student AnAn =new Student("anastasia","anastasiou",Utilities.newDate("25/04/1993"),cSharpFull,cSharpFullTime,giannhsAssignments,"1900");

        //enrolled students for c# part time in BootCamp
        Student KwKws =new Student("kwstantina","kwstantinidh",Utilities.newDate("16/07/1993"),cSharpPart,cSharpPartTime,lefterisAssignments,"1900");
        Student AgAg =new Student("aggelikh","aggelou",Utilities.newDate("10/12/1992"),cSharpPart,cSharpPartTime,kwstasAssignments,"1900");
        Student GiMa =new Student("gianna","makripodi",Utilities.newDate("01/01/1989"),cSharpPart,cSharpPartTime,giannhsAssignments,"1900");

        students.add(LePa);
        students.add(KwKw);
        students.add(GiGi);
        students.add(GrGr);
        students.add(AlAl);
        students.add(PaPa);
        students.add(PaPan);
        students.add(MiMi);
        students.add(AnAn);
        students.add(KwKws);
        students.add(AgAg);
        students.add(GiMa);

        //initialize trainers
        Trainer vlad=new Trainer("vladimiros","fwtiadis",javaFull);
        Trainer pasp=new Trainer("giwrgos","pasparakis",cSharpFull);
        Trainer kwstas=new Trainer("kwstas","kalogerhs",javaPart);
        Trainer giwrgos=new Trainer("giwrgos","gewrgiadis",cSharpPart);
        Trainer aggelos=new Trainer("aggelos","aggelidis",javaFull);
        Trainer dimitris=new Trainer("dimitris","dimitriadis",cSharpFull);
        Trainer paulos=new Trainer("paulos","paulou",javaPart);
        Trainer tasos=new Trainer("tasos","anastasiadis",cSharpPart);

        trainers.add(vlad);
        trainers.add(pasp);
        trainers.add(kwstas);
        trainers.add(giwrgos);
        trainers.add(aggelos);
        trainers.add(dimitris);
        trainers.add(paulos);
        trainers.add(tasos);

        //initialize streams with the assignments
        Stream jav1=new Stream("JAVA","FULL TIME",javaFullTime);
        Stream jav2=new Stream("JAVA","PART TIME",javaPartTime);
        Stream c1=new Stream("C#","PART TIME",cSharpFullTime);
        Stream c2=new Stream("C#","PART TIME",cSharpPartTime);









    }

}
