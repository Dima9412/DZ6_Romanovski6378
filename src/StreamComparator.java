import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream s1, Stream s2) {
        return Integer.compare(s1.getStudentGroups().size(), s2.getStudentGroups().size());
    }
}

//Класс StreamComparator следует OCP, так
//как его можно расширять(например, добавив другие методы сравнения),но при этом не нужно модифицировать существующий код.