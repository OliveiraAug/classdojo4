/* Populando a tabela modulos */

insert into modulos (nome) values ('Logica 1');
insert into modulos (nome) values ('Games 2 - Construct');
insert into modulos (nome) values ('Games 1');
insert into modulos (nome) values ('Logica 2');
insert into modulos (nome) values ('Games 3');
insert into modulos (nome) values ('Apps 1');
insert into modulos (nome) values ('Apps 2');
insert into modulos (nome) values ('Maker 1');
insert into modulos (nome) values ('Maker 2');
insert into modulos (nome) values ('Web');
insert into modulos (nome) values ('Drone');
insert into modulos (nome) values ('Games 2 - Game maker');

/* Populando a tabela aulas do módulo construct */

insert into aulas (modulo_id, nome, descricao) values (
2, 'Conhecendo a Ferramenta',
'será introduzido a ferramenta construct a ele e terá que criar um jogo de plataforma,
onde irá desenhar e desenvolver também o lado artístico na criação deste jogo,
desenhando o seu personagem e elementos do cenário.');
insert into aulas (modulo_id, nome, descricao) values (
2, 'Controlando Comportamentos',
'deverá programar um jogo de plataforma testando vários tipos de comportamentos em personagens diferentes,
afim compreender a importância e o uso deles.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Eventos',
'terá que desenvolver um jogo de corrida,
montará o level design da pista, colocará informações textuais utilizando variáveis.
 Trabalhará muito o que é, como criar, e as utilidades dos eventos no Construct.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Animações',
'terá que criar um jogo de plataforma cujo personagem principal é o Mario,
 aprendendo a montar e programar as animações: Andar, Parar e Pular do personagem.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Construindo um Projeto',
'é preciso criar um jogo de carro no deserto,
 seu personagem precisa desviar dos obstáculos e encontrar água para vencer.
 Aprenderá a utilizar os comportamentos de carro, câmera e piscar, para dar um efeito de colisão.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Fugindo dos Inimigos',
'terá que desenvolver um jogo de plataforma estilo pega pega.
 É preciso desviar dos ataques dos inimigos correndo ou ficando invisível.
 Nessa aula trabalhará pela primeira vez o conceito de funções que são essenciais para otimização de código.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Pixels e Piskel',
'aprenderá a criar sprites pixelados na ferramenta Piskel,
 é também o inicio da saga Piggzy e
 nessa aula criará os sprites para o jogo Arcade que serão utilizado nas três aulas posteriores.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Puzzle Design',
'segunda aula da saga Piggzy, onde é preciso construir um jogo de quebra cabeça (primus),
 quando resolvido o jogo é finalizado por uma animação do Piggzy, Marlux e Pollux,
 três personagens do Universo Codebuddy.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Turbinando o Voo',
'uma aula continuação da saga Piggzy, sendo que dessa vez teve que criar uma batalha entre o Pollux e Piggzy.
 Aprendeu a programar os comportamentos Projétil e Senóide.
 De forma breve aprende a colocar efeitos sonoros no seu jogo.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Blips e Tunes',
'terceira aula da saga Piggzy, aprende a utilizar a ferramenta PixiTracker e Bfxr
 para criar músicas e efeitos sonoros para o jogo.');

insert into aulas (modulo_id, nome, descricao) values (
2, 'Polindo o Jogo',
'última aula da saga Piggzy, aprenderá a utilizar novos comportamentos de movimentação e
 adiciona mais inimigos a Boss Fight para dificultar o jogo.');
 
insert into aulas (modulo_id, nome, descricao) values (
2, 'Pipoca Coder',
'irá começar a primeira de uma série de aulas objetivando criar um jogo de plataforma no espaço
 utilizando a ferramenta Construct. Nessa aula o foco é criar o menu e uma história inicial do jogo.');
 
 insert into aulas (modulo_id, nome, descricao) values (
2, 'Pipoca Platformer',
'dará continuidade ao projeto desenvolvido na aula anterior,
 dando ênfase neste momento na criação da plataforma do jogo e na criação de suas mecânicas,
 pontuações e demais recursos.');
 
  insert into aulas (modulo_id, nome, descricao) values (
2, 'Pipoca Boss',
'concluirá o projeto de jogo Pipoca Coder desenvolvido nas últimas três aulas,
 focando o enriquecimento do jogo de plataforma aperfeiçoando o level design das fases do jogo.');
 
 insert into aulas (modulo_id, nome, descricao) values (
2, 'Construindo um RPG',
'primeira aula da serie RPG, onde criará um jogo do zero. Desenvolverá personagens, interações e mapas.');
  
 insert into aulas (modulo_id, nome, descricao) values (
2, 'Explorando Mundos',
'a segunda aula da saga RPG, nessa aula terá que montar o level design do jogo e
 também programar as interações entre os personagens.');
 
  insert into aulas (modulo_id, nome, descricao) values (
2, 'Concluindo o RPG',
'concluirá o desenvolvimento do jogo de RPG, programando a lógica das falas e atribuindo itens novos
 a história do jogo.');
 
 insert into aulas (modulo_id, nome, descricao) values (
2, 'Julgamento de Pollux',
'Você conhecerá diversos novos conceitos no Construct, como JSON, AJAX e objetos Touch.
 Dará prosseguimento ao seu projeto na próxima aula.');