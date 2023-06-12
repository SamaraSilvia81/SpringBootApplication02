package br.com.acqiogrowup.modelo;

import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_users")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn (name="listId")
    @JsonIgnore
    private ListEntity list;

}