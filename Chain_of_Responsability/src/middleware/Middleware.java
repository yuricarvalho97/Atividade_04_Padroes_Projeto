package middleware;
/*
Base da classe Middleware
 */

public abstract class Middleware {
    private Middleware next;

   /*
    Constrói as cadeias de objetos Middleware
   */

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /* 
    As subclasses irão implementar este método com verificações concretas.
    */
    public abstract boolean check(String email, String password);

    /*
    *Executa a verificação no próximo objeto na cadeia
    *ou termina a travessia se estamos no último objeto na cadeia 
    */
    public class InnerMiddleware {
    
        
    }
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}