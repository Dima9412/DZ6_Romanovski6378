import java.util.ArrayList;
import java.util.List;

// Новый класс репозитория, который отвечает за хранение данных
public class TeacherRepository {
    private List<Teacher> teacherList = new ArrayList<>();

    public void add(Teacher teacher) {
        teacherList.add(teacher);
    }

    public List<Teacher> findAll() {
        return new ArrayList<>(teacherList);
    }
}
