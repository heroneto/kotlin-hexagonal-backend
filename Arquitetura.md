Arquitetura Hexagonal

Abaixo a estrutura do projeto exagonal com seus pacotes e a explicação de cada um deles.


**Applicaton**

Tudo que deve ficar isolado de bibliotecas, frameworks etc.
Terá as portas de entrada e saída

    Application -> Core -> Domain
    Classes de domínio
    
    Application -> usecase
    Casos de uso ou regras de negócio
    
    Application -> Ports
    Entradas e saídas da aplicação
    
    Application -> Ports -> in
    Porta de entrada
    
    
    Application -> Ports -> out
    Porta de saída


**Adapters**

Onde ficam os adaptadores de entrada e saída. Adaptadores são as implementações das interfaces

    Adapters -> in -> consumer
    Entrada de dados através de consumo de filas(Kafka)
    
    Adapters -> in -> controller
    Entrada de dados através de chamadas API Rest.
    
    Adapters -> out -> client
    Chamadas para APIs externas
    
    Adpaters -> out -> repository
    Operações em bancos de dados da própria aplicação

**Config**

Arquivos de configuração da aplicação