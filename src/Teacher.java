public class Teacher extends User {
    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}

//Класс Teacher расширяет класс User, и благодаря принципу LSP
//можно использовать объекты типа Teacher везде, где ожидается User, что
//не нарушит работу программы.