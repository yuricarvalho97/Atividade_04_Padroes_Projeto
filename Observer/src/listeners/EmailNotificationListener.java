package listeners;

import java.io.File;

/**
 * Envia emails ao receber notificações
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email para " + email + ": Alguém tentou " + eventType + " o seguinte arquivo: " + file.getName());
    }
}