package pokemon;

public class Pokemon {
    private String nome;
    private Integer nivel;

    public Pokemon() {
        this.nivel = 1;
    }

    public Pokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void quemEEssePokemon() {
        System.out.println("Esse pokemon é o :" + this.nome + " e o nível dele é " + this.nivel);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
