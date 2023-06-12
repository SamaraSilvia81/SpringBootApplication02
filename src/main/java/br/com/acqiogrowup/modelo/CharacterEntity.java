package br.com.acqiogrowup.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Table(name = "tb_characters")
public class CharacterEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;
    private String name;
    private File photo;
    private String about;

}
