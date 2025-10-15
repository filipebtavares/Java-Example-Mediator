public class Usuario {
    private String nome;
    private ChatMediator mediator;

    public Usuario(String nome, ChatMediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public void enviar(String mensagem) {
        System.out.println(nome + " enviou: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    public void receber(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
