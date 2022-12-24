# jpa-practice
## JPA
Java Persistence API (JPA) é a especificação padrão da plataforma Java EE (pacote javex.persistence) para mapeamento objeto-relacional e persistência de dados.

JPA é apenas uma especificação (JSR 338).

Para trabalhar com JPA é preciso incluir no projeto uma implementação da API (ex: Hibernate).

## Principais classes

[EntityManager](https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html)

Um objeto EntityManager encapsula uma conexão com a base de dados e serve para efetuar operações de
acesso a dados (inserção, remoção, deleção, atualização) em entidades (clientes, produtos, pedidos, etc.)
por ele monitoradas em um mesmo contexto de persistência.
Escopo: tipicamente mantem-se uma instância única de EntityManager para cada thread do sistema (no caso
de aplicações web, para cada requisição ao sistema).

[EntityManagerFactory](https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManagerFactory.html)

Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.
Escopo: tipicamente mantem-se uma instância única de EntityManagerFactory para toda aplicação.
