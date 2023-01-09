--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2023-01-09 00:42:30

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3379 (class 1262 OID 49526)
-- Name: deliveryfajuto; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE deliveryfajuto WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';


ALTER DATABASE deliveryfajuto OWNER TO postgres;

\connect deliveryfajuto

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 217 (class 1259 OID 49554)
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    id integer NOT NULL,
    nome character varying(36),
    cpf character varying(14),
    email character varying(36),
    senha character varying
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 49553)
-- Name: cliente_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_id_seq OWNER TO postgres;

--
-- TOC entry 3380 (class 0 OID 0)
-- Dependencies: 216
-- Name: cliente_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_id_seq OWNED BY public.cliente.id;


--
-- TOC entry 225 (class 1259 OID 57838)
-- Name: contato; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contato (
    id integer NOT NULL,
    telefone character varying(14),
    id_cliente integer
);


ALTER TABLE public.contato OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 57837)
-- Name: contato_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contato_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contato_id_seq OWNER TO postgres;

--
-- TOC entry 3381 (class 0 OID 0)
-- Dependencies: 224
-- Name: contato_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.contato_id_seq OWNED BY public.contato.id;


--
-- TOC entry 223 (class 1259 OID 57820)
-- Name: endereco; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.endereco (
    id integer NOT NULL,
    cep character varying(10) NOT NULL,
    bairro character varying(36),
    rua character varying(36),
    num character varying(10),
    referencia character varying(60),
    uf character(2),
    cidade character varying(36),
    id_cliente integer NOT NULL
);


ALTER TABLE public.endereco OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 57819)
-- Name: endereco_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.endereco_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.endereco_id_seq OWNER TO postgres;

--
-- TOC entry 3382 (class 0 OID 0)
-- Dependencies: 222
-- Name: endereco_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.endereco_id_seq OWNED BY public.endereco.id;


--
-- TOC entry 219 (class 1259 OID 49590)
-- Name: produto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.produto (
    id integer NOT NULL,
    nome character varying(36),
    descricao character varying(80),
    preco numeric(5,2),
    qtd integer,
    foto character varying,
    categoria character varying
);


ALTER TABLE public.produto OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 49589)
-- Name: produto_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.produto_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.produto_id_seq OWNER TO postgres;

--
-- TOC entry 3383 (class 0 OID 0)
-- Dependencies: 218
-- Name: produto_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.produto_id_seq OWNED BY public.produto.id;


--
-- TOC entry 215 (class 1259 OID 49528)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id integer NOT NULL,
    email character varying(40),
    senha character varying,
    nome character varying(36),
    tipo integer NOT NULL
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 49527)
-- Name: usuario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuario_id_seq OWNER TO postgres;

--
-- TOC entry 3384 (class 0 OID 0)
-- Dependencies: 214
-- Name: usuario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_id_seq OWNED BY public.usuario.id;


--
-- TOC entry 221 (class 1259 OID 49602)
-- Name: venda; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.venda (
    id integer NOT NULL,
    qtd integer,
    id_produto integer,
    id_usuario integer,
    id_cliente integer
);


ALTER TABLE public.venda OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 49601)
-- Name: venda_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.venda_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.venda_id_seq OWNER TO postgres;

--
-- TOC entry 3385 (class 0 OID 0)
-- Dependencies: 220
-- Name: venda_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.venda_id_seq OWNED BY public.venda.id;


--
-- TOC entry 3199 (class 2604 OID 49557)
-- Name: cliente id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente ALTER COLUMN id SET DEFAULT nextval('public.cliente_id_seq'::regclass);


--
-- TOC entry 3203 (class 2604 OID 57841)
-- Name: contato id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contato ALTER COLUMN id SET DEFAULT nextval('public.contato_id_seq'::regclass);


--
-- TOC entry 3202 (class 2604 OID 57823)
-- Name: endereco id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco ALTER COLUMN id SET DEFAULT nextval('public.endereco_id_seq'::regclass);


--
-- TOC entry 3200 (class 2604 OID 49593)
-- Name: produto id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produto ALTER COLUMN id SET DEFAULT nextval('public.produto_id_seq'::regclass);


--
-- TOC entry 3198 (class 2604 OID 49531)
-- Name: usuario id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario ALTER COLUMN id SET DEFAULT nextval('public.usuario_id_seq'::regclass);


--
-- TOC entry 3201 (class 2604 OID 49605)
-- Name: venda id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venda ALTER COLUMN id SET DEFAULT nextval('public.venda_id_seq'::regclass);


--
-- TOC entry 3365 (class 0 OID 49554)
-- Dependencies: 217
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (1, 'asdsfd', '00011122213', 'asdfasdfasdf', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (2, 'asdsfd', '00011122213', 'asdfasdfasdf', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (3, 'asdfadf', '0033322212', 'asdfasdfdfas', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (4, 'Fulano', '06177983111', '@fulanodetal', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (5, 'sadfadf', '0022211133', 'awwwwr', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (6, 'abdcef', '002223311', 'avcdfe@yz.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (7, 'WEsley', '06177983111', 'asdfadf@ifg.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (8, 'WEsley', '06177983111', 'asdfadf@ifg.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (9, 'WEsley', '06177983111', 'asdfadf@ifg.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (10, 'wesley', '06177983111', 'adfasdfasdfadfs', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (11, 'Hygor', '6249782122', 'hyorvenicio@outlook.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (12, 'Kauan', '00012312133', 'havaianas.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (13, 'Kauan', '00012312133', 'havaianas.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (14, 'SemIdeia', '0011122233', 'mãe.@.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (15, 'Carlin', '0432232300', 'luizcarlos@fazenda.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (16, 'Carlin', '043.223.230-00', 'luizcarlos@fazenda.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (17, 'João', '042.878.023-12', 'joão@outlook.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (18, 'Rodrigo', '000.000.000-22', 'rodrigo@g.ail.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (19, 'roniel', '000.000.000-11', 'ronielteste@gmail.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (20, 'Cansei', '000000000000', 'blabalabal', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (21, 'Fulano', '00012312311', 'aasdfsdfa@ifg.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (22, 'Tal', '111222333-77', 'asdafblala@.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (23, 'João', '66677788821', 'joaodasilva.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (24, 'Asdfsad', '12345678910', 'asdfasdff', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (25, 'Matheus', 'Farengards.com', 'qualquercoisa.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (26, 'Wesley', '06177983111', 'wesleyfsousa10@gmail.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (27, 'fulano', '00000000000', 'qualquercoisa', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (28, 'Matheus', '00033311111', 'Farengards@ifg.com', NULL);
INSERT INTO public.cliente (id, nome, cpf, email, senha) VALUES (29, 'Dumbledore', '000.222.333-31', 'hoogwarts@sonserina.com', '123');


--
-- TOC entry 3373 (class 0 OID 57838)
-- Dependencies: 225
-- Data for Name: contato; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.contato (id, telefone, id_cliente) VALUES (1, '61996078878', 7);
INSERT INTO public.contato (id, telefone, id_cliente) VALUES (2, '(61)99888-8888', 25);
INSERT INTO public.contato (id, telefone, id_cliente) VALUES (3, '(61)99607-8878', 26);
INSERT INTO public.contato (id, telefone, id_cliente) VALUES (4, '(61)99666-9999', 28);
INSERT INTO public.contato (id, telefone, id_cliente) VALUES (5, '(33)99888-4516', 29);


--
-- TOC entry 3371 (class 0 OID 57820)
-- Dependencies: 223
-- Data for Name: endereco; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (1, '73802130', 'São Vicente', 'Rua 7', '69', 'casa verde', 'GO', 'Formosa', 5);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (2, '73803130', 'Setor Industrial II', 'Rua 1', '1275', 'olá', 'GO', 'Formosa', 6);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (3, '73803130', 'Setor Industrial II', 'Rua 1', '1275', 'olá', 'GO', 'Formosa', 6);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (4, '73804130', 'Chácaras Setor Abreu', 'Rua Rifania', '23A', 'proximo a via 03', 'GO', 'Formosa', 7);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (5, '73805130', 'Setor Primavera', 'Rua 8', '93', 'diogão', 'GO', 'Formosa', 7);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (6, '73.805-130', 'Setor Primavera', 'Rua 8', '93', 'diogão', 'GO', 'Formosa', 7);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (7, '73801130', 'Centro', 'Rua Costa Pinto', '1780', 'proximo de tal lugar', 'GO', 'Formosa', 7);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (8, '73802-130', 'São Vicente', 'Rua 7', '69', 'Esquina com a 03', 'GO', 'Formosa', 0);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (9, '73802-130', 'São Vicente', 'Rua 7', '69', 'Esquina com a 03', 'GO', 'Formosa', 0);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (10, '73802-130', 'São Vicente', 'Rua 7', '40', 'perto de tal lugar', 'GO', 'Formosa', 25);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (11, '73802-130', 'São Vicente', 'Rua 7', '40', 'perto de tal lugar', 'GO', 'Formosa', 25);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (12, '73802-130', 'São Vicente', 'Rua 7', '69', 'Esq com a Rua 03', 'GO', 'Formosa', 26);
INSERT INTO public.endereco (id, cep, bairro, rua, num, referencia, uf, cidade, id_cliente) VALUES (13, '73815-150', 'Parque São Francisco', 'Rua 35', '14', 'Casa do muro laranja', 'GO', 'Formosa', 28);


--
-- TOC entry 3367 (class 0 OID 49590)
-- Dependencies: 219
-- Data for Name: produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produto (id, nome, descricao, preco, qtd, foto, categoria) VALUES (5, 'X-Tudo', 'hamburguer, salada, bacon, queijo	', 20.00, 10, 'C:\Users\wesle\OneDrive\Imagens\imagensCardápioDeliveryFajuto\ImgHamburguer02.jpg', 'Hamburguer');


--
-- TOC entry 3363 (class 0 OID 49528)
-- Dependencies: 215
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.usuario (id, email, senha, nome, tipo) VALUES (6, 'farengards@ifg.com', '456', 'Matheus', 1);
INSERT INTO public.usuario (id, email, senha, nome, tipo) VALUES (13, 'usuario03@ifg.com', '789', 'Usuario03', 2);
INSERT INTO public.usuario (id, email, senha, nome, tipo) VALUES (14, 'usuario04@ifg.com', '1011', 'Usuario04', 2);
INSERT INTO public.usuario (id, email, senha, nome, tipo) VALUES (15, 'wesley@ifg.com', '2988', 'Wesley', 1);


--
-- TOC entry 3369 (class 0 OID 49602)
-- Dependencies: 221
-- Data for Name: venda; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3386 (class 0 OID 0)
-- Dependencies: 216
-- Name: cliente_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_id_seq', 29, true);


--
-- TOC entry 3387 (class 0 OID 0)
-- Dependencies: 224
-- Name: contato_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.contato_id_seq', 5, true);


--
-- TOC entry 3388 (class 0 OID 0)
-- Dependencies: 222
-- Name: endereco_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.endereco_id_seq', 13, true);


--
-- TOC entry 3389 (class 0 OID 0)
-- Dependencies: 218
-- Name: produto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.produto_id_seq', 5, true);


--
-- TOC entry 3390 (class 0 OID 0)
-- Dependencies: 214
-- Name: usuario_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuario_id_seq', 15, true);


--
-- TOC entry 3391 (class 0 OID 0)
-- Dependencies: 220
-- Name: venda_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.venda_id_seq', 1, false);


--
-- TOC entry 3207 (class 2606 OID 49559)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);


--
-- TOC entry 3215 (class 2606 OID 57843)
-- Name: contato contato_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contato
    ADD CONSTRAINT contato_pkey PRIMARY KEY (id);


--
-- TOC entry 3213 (class 2606 OID 57825)
-- Name: endereco endereco_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (id);


--
-- TOC entry 3209 (class 2606 OID 49595)
-- Name: produto produto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (id);


--
-- TOC entry 3205 (class 2606 OID 49533)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);


--
-- TOC entry 3211 (class 2606 OID 49607)
-- Name: venda venda_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venda
    ADD CONSTRAINT venda_pkey PRIMARY KEY (id);


--
-- TOC entry 3219 (class 2606 OID 57844)
-- Name: contato contato_id_cliente_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contato
    ADD CONSTRAINT contato_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id);


--
-- TOC entry 3216 (class 2606 OID 49618)
-- Name: venda venda_id_cliente_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venda
    ADD CONSTRAINT venda_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id);


--
-- TOC entry 3217 (class 2606 OID 49608)
-- Name: venda venda_id_produto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venda
    ADD CONSTRAINT venda_id_produto_fkey FOREIGN KEY (id_produto) REFERENCES public.produto(id);


--
-- TOC entry 3218 (class 2606 OID 49613)
-- Name: venda venda_id_usuario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.venda
    ADD CONSTRAINT venda_id_usuario_fkey FOREIGN KEY (id_usuario) REFERENCES public.usuario(id);


-- Completed on 2023-01-09 00:42:31

--
-- PostgreSQL database dump complete
--

