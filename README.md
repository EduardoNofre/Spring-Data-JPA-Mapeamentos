# Spring data jpa projections
Exemplo para estudo de projections com jpa e orm

java 1.8 </br>
Spring 2.2.2.RELEASE </br>
banco H2 </br>
Lombok </br>

## Exemplo - 01
### Orm Funcionario -> Empresa - @OneToOne
 * Onde um funcionario so pode esta em uma empresa </br>
   Relacionamento um para um @OneToOne </br>
   Um funcionario so pode esta registrado em uma empresa ou departamento.</br>
   Relaionamento 1 -> 1 </br>
      
## Exemplo - 02
### Orm Restaurante -> Cozinha - @ManyToOne
 * Onde muitos Restaurantes pode ter uma Cozinha </br>
   Relacionamento muitos para um @ManyToOne </br>
   Varios Restuarantes so pode ter uma cozinha ou um especialidade </br>
    Relaionamento N -> 1 </br>
   
## Exemplo - 03
### Orm Aula -> Tarefa - @oneToMany
 * Onde uma Aula pode tem nehuma ou muitas Tarefas  </br>
   Relacionamento um para muitos @oneToMany </br> 
   Uma Aula pode ter varias tarefas  </br>
   Relaionamento 1 -> N </br>
   
## Exemplo - 04
### Orm Projeto -> Pessoa - @ManyToMany
 * Onde um Pessoa pode esta em varios Projetos e um Projeto pode ter varias Pessoa </br>
   Relacionamento Muitos para Muitos @ManyToMany </br> 
   Onde um Pessoa pode esta em varios Projetos e um Projeto pode ter varias Pessoa  </br>
   Relaionamento N -> N </br>

