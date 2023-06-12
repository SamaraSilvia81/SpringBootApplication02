create table tb_lists
(
    name         VARCHAR not null,
    PRIMARY KEY (listid),
    FOREIGN KEY (characterid) REFERENCES tb_characters(characterid)
);

create table tb_characters
(
    name         VARCHAR not null,
    photo        VARCHAR not null,
    about        VARCHAR not null,
    PRIMARY KEY (characterid)
);

INSERT INTO tb_characters (name, about, photo) VALUES ('Groot', 'arvore alienigena', 'https://uploads.jovemnerd.com.br/wp-content/uploads/2022/10/guardioes_da_galaxia_filme_solo_groot__l8b0oz-1210x544.jpg');

INSERT INTO tb_characters (name, about, photo) VALUES ('Loki', 'deus da mentira', 'https://img.olhardigital.com.br/wp-content/uploads/2021/02/Loki.jpg');

INSERT INTO tb_lists (name, characterid) VALUES ('listadeeudes', 1);

INSERT INTO tb_lists (name, characterid) VALUES ('listadesamara', 2);

INSERT INTO tb_users (name, email, password, listid) VALUES ('Eudes', 'eudes@gmail.com', 'bts', 1);

INSERT INTO tb_users (name, email, password, listid) VALUES ('Samara', 'samara@gmail.com', 'loki', 2);
