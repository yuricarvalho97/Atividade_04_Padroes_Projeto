package editor;
import publisher.*;
import java.io.File;

/**
 * Publicador concreto, que é rastreado por outros objetos.
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("abrir", "salvar");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("abrir", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("salvar", file);
        } else {
            throw new Exception("Por favor, abra um arquivo primeiro");
        }
    }
}