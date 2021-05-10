package server;
import middleware.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe server
 */

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

  /**
   * Recebe uma cadeia de objetos do cliente para o servidor. 
   */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

   /**
    * O server obtém o email e senha do usuário e a autorização.
    */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Autorização feita com sucesso!");
            /**
             * Autoriza o usuário
             */
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}