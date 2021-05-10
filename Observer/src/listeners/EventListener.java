package listeners;
import java.io.File;

/**
 * Interface comum do Observer
 */
public interface EventListener {
    void update(String eventType, File file);
}