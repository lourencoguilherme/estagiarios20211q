package pokemon;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Pokemon {
    private String nome;
    private Integer nivel;

    public void quemEEssePokemon() {
        System.out.println(this);
    }

}
