# Spring data jpa projections
Exemplo para estudo de projections com jpa e orm

java 1.8 </br>
Spring 2.2.2.RELEASE </br>
banco H2 </br>
Lombok </br>

## Exemplo - 01
### Orm funcionario -> empresa - @OneToOne
 * Onde um funcionario so pode esta em uma empresa </br>
   Relacionamento um para um @OneToOne </br>
   Um funcionario so pode esta registrado em uma empresa ou departamento.</br>
      
## Exemplo - 02
### Orm Restaurante -> Cozinha - @ManyToOne
 * Onde muitos Restaurantes pode ter uma Cozinha </br>
   Relacionamento muitos para um @ManyToOne </br>
   Varios Restuarantes so pode ter uma cozinha ou um especialidade </br>
   
## Exemplo - 03
### Orm Restaurante -> Cozinha - @oneToMany
 * Onde uma Aula pode ter uma ou muitas coisas </br>
   Relacionamento um para muitos @oneToMany </br> 
   Uma Aula pode ter varias tarefas  </br>

