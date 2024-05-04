import Interfaces.aparelhoDeCelular;
import Interfaces.aparelhoDeSom;
import Interfaces.navegadorInternet;

public class Celular implements aparelhoDeCelular,aparelhoDeSom,navegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova pagina");
        ;
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

        @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

        @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }


    @Override
    public void ligar() {
        System.out.println("Ligando para o numero");
    }

        @Override
    public void atender() {
        System.out.println("Atendendo ligação");

    }

        @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Iniciando correio de Voz");
        ;
    }
}
