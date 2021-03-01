package desafio.aula01.televisao;

public class ProgramaTelevisao {

    /*
        canal: 0 volume: 0
        canal: 0 volume: 1
        canal: 2 volume: 0
        canal: 1 volume: 1
        canal: 200 volume: 1
     */

    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ContratoAparelhoDomestico controleRemotoTelevisao = new ControleRemotoTelevisao();

        controleRemotoTelevisao.consultarVolumeECanal(televisao);

        controleRemotoTelevisao.aumentarVolume(televisao);

        controleRemotoTelevisao.consultarVolumeECanal(televisao);

        controleRemotoTelevisao.aumentarCanal(televisao);
        controleRemotoTelevisao.aumentarCanal(televisao);

        controleRemotoTelevisao.consultarVolumeECanal(televisao);

        controleRemotoTelevisao.diminuirVolume(televisao);

        controleRemotoTelevisao.consultarVolumeECanal(televisao);

        controleRemotoTelevisao.diminuirCanal(televisao);

        controleRemotoTelevisao.consultarVolumeECanal(televisao);


        controleRemotoTelevisao.trocarParaCanalIndicado(televisao, 200);

        controleRemotoTelevisao.consultarVolumeECanal(televisao);


    }
}
