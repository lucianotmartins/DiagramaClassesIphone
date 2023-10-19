package aparelhoTelefonico;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    @Override
   public void ligar() {
    System.out.println("Ligando para o telefone");
   } 

   @Override
   public void atender() {
    System.out.println("Atendendo ligação no telefone");
   }

   public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de Voz no telefone");
   }

   public void silenciar() {
    System.out.println("Silencionando o telefone");
   }

   @Override
    public void exibirPagina (){
        System.out.println("Abrindo a pagina do navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void fecharNovaAba(){
        System.out.println("Fechando aba do navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pausar(){
        System.out.println("pausando a musica");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Selecionar a musica");
    }

    @Override
    public void aumentarVolume(){
        System.out.println("Aumentando volume");
    }

    @Override
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume");
    }

}
