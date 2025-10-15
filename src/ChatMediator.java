package src;
public interface ChatMediator {
    void enviarMensagem(String mensagem, Usuario usuario);
    void adicionarUsuario(Usuario usuario);
}