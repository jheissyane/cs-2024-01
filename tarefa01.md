# Rest API

## O que é uma API REST?

**API REST**, ou **API RESTful**, refere-se a uma interface de programação de aplicativos que segue as diretrizes do estilo arquitetônico REST, possibilitando a comunicação com serviços web que aderem ao paradigma RESTful. REST é uma abreviação para "Representational State Transfer", traduzido como "Transferência de Estado Representacional", em português. Esta estrutura foi concebida por Roy Fielding, um renomado cientista da computação dos Estados Unidos.


### Para uma API ser considerada do tipo RESTful, ela precisa está em conformidade com os seguintes critérios:

- Utilizar uma estrutura cliente/servidor composta por clientes, servidores e recursos, onde as requisições são gerenciadas através do protocolo HTTP.
    - Nesse princípio, há uma clara separação entre o cliente (que faz as solicitações) e o servidor (que processa essas solicitações).
- Manter uma comunicação stateless entre o cliente e o servidor, o que implica que nenhuma informação do cliente é retida entre as solicitações GET, garantindo que todas as requisições sejam independentes e isoladas.
   - Isso significa que cada solicitação do cliente para o servidor deve conter todas as informações necessárias para que o servidor entenda e processe a solicitação. 
- Implementar o armazenamento em cache de dados para melhorar a eficiência das interações entre o cliente e o servidor.
   - Os servidores REST podem definir se as respostas às solicitações podem ou não serem armazenadas em cache. Isso ajuda a melhorar a eficiência e a velocidade das solicitações, já que o cliente pode reutilizar respostas que já foram recebidas anteriormente, sem precisar solicitar novamente ao servidor.
- Empregar uma interface uniforme entre os componentes para a transferência de informações em um formato padronizado.
    - Isso significa que as interações entre o cliente e o servidor devem ser padronizadas e consistentes.
- Adotar um sistema em camadas para organizar os diferentes tipos de servidores (como os responsáveis pela segurança, pelo carregamento da carga, entre outros) envolvidos na obtenção das informações solicitadas, em uma hierarquia que permanece invisível para o cliente.
    - Isso permite uma maior escalabilidade e segurança do sistema, pois cada camada pode ser gerenciada de forma independente.
 
## Referência
- https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api
