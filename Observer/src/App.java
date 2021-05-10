import listeners.*;
import editor.*;

/**
 * Classe cliente onde tudo ocorre em conjunto.
 */

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("abrir", new LogOpenListener("/Observer/src/teste.txt"));
        editor.events.subscribe("salvar", new EmailNotificationListener("usuario@teste.com"));

        try {
            editor.openFile("teste.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}