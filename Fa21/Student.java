public class Student {
private String name, major, className;
private int credits;
private char grade;

public Student()
{
this.name = "";
this.major = "";
this.className = "";
this.credits = 0;
this.grade = 0;
}

public Student(String name, String major, String className, int credits, char grade)
{
this.name = name;
this.major = major;
this.className = className;
this.credits = credits;
this.grade = grade;
}

public String getName() {
return name;
}

public String getMajor() {
return major;
}

public String getClassName() {
return className;
}

public int getCredits() {
return credits;
}

public char getGrade() {
return grade;
}
}