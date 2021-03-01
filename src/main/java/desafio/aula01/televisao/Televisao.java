package desafio.aula01.televisao;

public class Televisao {

    private Integer volume;
    private Integer canal;

    public Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Televisao " +
                "volume=" + volume +
                ", canal=" + canal;
    }
}
