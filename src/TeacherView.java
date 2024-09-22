import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println("Teacher ID: " + teacher.getTeacherId() +
                    ", Name: " + teacher.getFirstName() + " " + teacher.getLastName());
        }
    }
}