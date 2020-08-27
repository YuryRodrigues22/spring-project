
CREATE TABLE IF NOT EXISTS `empresa`
(
    `id` bigint NOT NULL DEFAULT nextval('empresasequence'::regclass),
    `razao_social` character varying(500) COLLATE pg_catalog."default",
    `cnpj` character varying(255) COLLATE pg_catalog."default" NOT NULL,
    `data_criacao` date NOT NULL,
    `data_atualizacao` date NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE empresa
    OWNER to postgres;