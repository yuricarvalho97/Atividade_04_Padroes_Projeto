# Atividade_04_Padroes_Projeto
Repositório para a atividade 4 de Padrões de Projeto.

## Explique a aderência aos princípios SOLID em cada padrão implementado.

### Chain of Responsibility
* <b>Princípio de responsabilidade única:</b> 
Este princípio está presente, pois é possível desacoplar as classes que invocam das operações de classes que realizam as operações.
* <b>Princípio aberto/fechado:</b>
Este princípio está presente, pois é possível introduzir novos handles na aplicação sem quebrar o código cliente existente.
### Template Method
* É possível violar o princípio de substituição de Liskov ao suprimir uma etapa padrão de implementação por meio da subclasse.

### Observer
* <b>Princípio aberto/fechado:</b>
Este princípio está presente, pois é possível introduzir novas classes assinantes sem a necessidade de mudar o código da publicadora (se existir uma interface publicadora o inverso também é possível).

#### REFERÊNCIAS:
* https://refactoring.guru/

