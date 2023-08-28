import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int currentValue : source) {
            if (currentValue < treshold) {
                logger.log("Значение " + currentValue + " не проходит");
            } else {
                result.add(currentValue);
                logger.log("Значение " + currentValue + " проходит");
                count++;
            }
        }
        logger.log("Прошли фитрацию " + count + " элемент(ов) из " + source.size());
        return result;
    }
}
