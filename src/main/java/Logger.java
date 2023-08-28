import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;

    LocalDateTime datetime = LocalDateTime.now();

    public void log(String msg) {
        System.out.println("[" + datetime + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    // Запрещаем пользователям пользоваться
    // конструктором нашего класса
    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
