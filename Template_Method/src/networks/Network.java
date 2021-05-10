package networks;

/**
 * Classe base das redes sociais
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * Publica a informação em qualquer rede social
     */
    public boolean post(String message) {
        // Autentifica antes de postar. Cada rede social usar um método
        // de autentificação diferente
        if (logIn(this.userName, this.password)) {
            // Envia a informção
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}