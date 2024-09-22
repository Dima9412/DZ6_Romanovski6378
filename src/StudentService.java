import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    // Метод для создания студента
    public void createStudent(String firstName, String lastName, String middleName) {
        Student student = new Student(firstName, lastName, middleName);
        studentList.add(student);
    }

    // Метод для удаления студента по ФИО
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentList.removeIf(student -> student.getFirstName().equals(firstName) &&
                student.getLastName().equals(lastName) &&
                student.getMiddleName().equals(middleName));
    }

    // Метод для получения всех студентов
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);
    }

    // Метод для сортировки студентов по ФИО
    public List<Student> getSortedStudentByFIO() {
        List<Student> sortedList = new ArrayList<>(studentList);
        sortedList.sort((Comparator<? super Student>) new UserComparator<>());
        return sortedList;
    }
}