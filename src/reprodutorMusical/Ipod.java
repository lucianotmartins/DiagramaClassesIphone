package reprodutorMusical;

public class Ipod implements ReprodutorMusical {
    
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
