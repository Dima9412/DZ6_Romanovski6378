import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}

//Интерфейс UserView содержит только один метод, что соответствует ISP, так
//как он не заставляет классы реализовывать ненужные методы.
//Если в будущем потребуется расширить функционал, можно
//создать дополнительные интерфейсы.