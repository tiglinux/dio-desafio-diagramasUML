//Testando funcionalidades IPHONE
public class TestandoIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.ligar("19996635326");
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina("www.github.com/tiglinux");
    }
}
