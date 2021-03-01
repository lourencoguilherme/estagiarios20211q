package desafio.aula01.televisao;

public class ControleRemotoTelevisao extends ContratoAparelhoDomestico<Televisao> {

    public ControleRemotoTelevisao() {
    }

    @Override
    public void aumentarVolume(Televisao televisao) {
        Integer volumeAtual = televisao.getVolume();
        volumeAtual ++;
        televisao.setVolume(volumeAtual);

    }

    @Override
    public void diminuirVolume(Televisao televisao) {
        televisao.setVolume(televisao.getVolume()-1);
    }

    @Override
    public void aumentarCanal(Televisao televisao) {
        Integer canalAtual = televisao.getCanal();
        canalAtual++;
        televisao.setCanal(canalAtual);
    }

    @Override
    public void diminuirCanal(Televisao televisao) {
        televisao.setCanal(televisao.getCanal()-1);
    }

    @Override
    public void trocarParaCanalIndicado(Televisao televisao, Integer canal) {
        televisao.setCanal(canal);
    }

    /*@Override
    public void consultarVolumeECanal(Televisao televisao) {
        Integer canal = televisao.getCanal();
        Integer volume = televisao.getVolume();

        System.out.println("canal: " + canal + " volume: " + volume);

    }*/
}
