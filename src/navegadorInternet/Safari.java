package navegadorInternet;

public class Safari implements NavegadorInternet {
    
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
}
