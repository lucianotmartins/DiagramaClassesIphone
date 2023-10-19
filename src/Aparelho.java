import aparelhoTelefonico.AparelhoTelefonico;
import aparelhoTelefonico.Iphone;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Aparelho {
    public static void main(String[] args) throws Exception {
    
        NavegadorInternet iphone14 = new Iphone();

        iphone14.adicionarNovaAba();
        iphone14.atualizarPagina();
        iphone14.exibirPagina();
        iphone14.fecharNovaAba();
        
        ReprodutorMusical iphone11 = new Iphone();

        iphone11.selecionarMusica();
        iphone11.tocar();
        iphone11.aumentarVolume();
        iphone11.diminuirVolume();
        iphone11.pausar();

        AparelhoTelefonico iphone12 = new Iphone();

        iphone12.ligar();
        iphone12.atender();
        iphone12.silenciar();
        iphone12.iniciarCorreioVoz();

    }


}
