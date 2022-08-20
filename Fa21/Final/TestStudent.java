import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestStudent {

private static final String STUDENT_FILE = "ClassesData.dat";
private static final String COURSE_FILE = "CoursesData.dat";

public static void main(String[] args)
{
Scanner studentFileReader, courseFileReader;
Student student = null;
Course course = null;

try
{
studentFileReader = new Scanner(new File(STUDENT_FILE));
while(studentFileReader.hasNextLine())
{
String line = studentFileReader.nextLine().trim();
String[] data = line.split(",");
String name = data[1];
String major = data[0];
String className = "Class Name";
int credits = Integer.parseInt(data[3]);
char grade = data[4].charAt(0);

student = new Student(name, major, className, credits, grade);
}
studentFileReader.close();
}catch(FileNotFoundException fnfe){
System.out.println(STUDENT_FILE + " could not be found!");
System.exit(0);
}

try
{
courseFileReader = new Scanner(new File(COURSE_FILE));
while(courseFileReader.hasNextLine())
{
String line = courseFileReader.nextLine().trim();
String[] data = line.split(",");
int courseId = Integer.parseInt(data[0]);
int instructorId = Integer.parseInt(data[1]);
int roomId = Integer.parseInt(data[2]);

course = new Course(courseId, instructorId, roomId);
}
courseFileReader.close();
}catch(FileNotFoundException fnfe){
System.out.println(COURSE_FILE + " couldn't be found!");
System.exit(0);
}

displayDetails(student, course);
}

private static String giveComment(char grade)
{
if(grade == 'A')
return "Great Job!";
else
return "Best of luck for next time!";
}

private static void displayDetails(Student st, Course co)
{
System.out.println("Student Name: " + st.getName() + "\n"
+ "Course Id: " + co.getCourseId() + "\n"
+ "Major: " + st.getMajor() + "\n"
+ "Class Name: " + st.getClassName() + "\n"
+ "Instructor Id: " + co.getInstructorId() + "\n"
+ "Room Id: " + co.getRoomId() + "\n"
+ "Grade: " + st.getGrade() + "\n"
+ "Credits: " + st.getCredits() + "\n"
+ "Comment: " + giveComment(st.getGrade()));
}
}