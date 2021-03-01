package desafio.aula01.televisao;


public abstract class ContratoAparelhoDomestico<ClasseQualquer> {

    abstract void aumentarVolume(ClasseQualquer televisao);

    abstract void diminuirVolume(ClasseQualquer televisao);

    abstract void aumentarCanal(ClasseQualquer televisao);

    abstract void diminuirCanal(ClasseQualquer televisao);

    abstract void trocarParaCanalIndicado(ClasseQualquer televisao, Integer canal);

    public void consultarVolumeECanal(ClasseQualquer televisao){
        System.out.println(televisao);
    };

    public void mostraDados(ClasseQualquer televisao) {
        System.out.println(televisao);
    }

}
