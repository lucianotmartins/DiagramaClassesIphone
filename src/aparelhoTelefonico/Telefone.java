package aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
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
}
