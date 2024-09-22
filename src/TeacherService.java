import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();

    public void createTeacher(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teacherList.add(teacher);
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMiddleName(middleName);
            }
        }
    }

    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teacherList);
    }
}