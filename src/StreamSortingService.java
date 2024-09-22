import java.util.Collections;
import java.util.List;

// Создаем отдельный класс для логики сортировки, применяем SRP
public class StreamSortingService {
    public void sort(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
