public class Iphone implements NavegadorInternet,ReprodutorMusical,AparelhoTelefonico{
    @Override
    public void exibirPagina(String url) {
        System.out.println("http://"+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizado");
    }

    @Override
    public void tocar() {
        System.out.println("RING-RING!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Você está ligando para o número "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Sua chamada está em correio de voz");
    }
}
