package listeners;

import java.io.File;
/**
 * Escreve uma mensagem em um registro ao receber uma notificação
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Salvo em log " + log + ": Alguém tentou " + eventType + " o seguinte arquivo: " + file.getName());
    }
}