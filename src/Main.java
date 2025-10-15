package src;

public class Main {
    public static void main(String[] args) {
        ChatSala chat = new ChatSala();

        Usuario joao = new Usuario("Joao", chat);
        Usuario rafael = new Usuario("Rafael", chat);
        Usuario felipe = new Usuario("Felipe", chat);

        chat.adicionarUsuario(joao);
        chat.adicionarUsuario(rafael);
        chat.adicionarUsuario(felipe);

        joao.enviar("Ola, pessoal!");
    }
}
