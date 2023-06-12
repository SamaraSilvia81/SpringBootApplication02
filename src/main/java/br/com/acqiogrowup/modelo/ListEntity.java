package br.com.acqiogrowup.modelo;

import javax.persistence.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Table(name = "tb_lists")
public class ListEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;
    private String name;

    @ManyToMany
    @JoinColumn (name="characterId")
    @JsonIgnore
    private java.util.List<CharacterEntity> characterList;

}
