public class Course {
private int courseId, instructorId, roomId;

public Course()
{
this.courseId = 0;
this.instructorId = 0;
this.roomId = 0;
}

public Course(int courseId, int instructorId, int roomId)
{
this.courseId = courseId;
this.instructorId = instructorId;
this.roomId = roomId;
}

public int getCourseId() {
return courseId;
}

public int getInstructorId() {
return instructorId;
}

public int getRoomId() {
return roomId;
}
}