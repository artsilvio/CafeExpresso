Café Expresso

Descrição do Projeto
O "Café Expresso" é um sistema de autoatendimento desenvolvido para uma cafeteria de pequeno porte. Seu objetivo é modernizar e agilizar o processo de pedidos, permitindo que os clientes realizem suas compras diretamente em um totem digital, sem a necessidade de enfrentar filas.

O sistema busca melhorar a experiência do cliente, reduzir o tempo de espera e minimizar erros no registro de pedidos.

Objetivos
- Automatizar o processo de pedidos em uma cafeteria
- Reduzir filas e tempo de espera
- Garantir maior precisão nos pedidos
- Facilitar o gerenciamento dos pedidos pela equipe

Funcionalidades Principais

Requisitos Funcionais
- RF01: Cadastro de produtos com nome e preço  
- RF02: Adição de múltiplos itens a um pedido  
- RF03: Cálculo automático do valor total  
- RF04: Controle de status do pedido: - Pendente; - Pago; - Em preparo; - Finalizado

Estrutura do Sistema

O sistema é baseado em três classes principais:

Produto
Representa os itens disponíveis no cardápio da cafeteria.
- Nome
- Preço unitário

ItemPedido
Responsável por relacionar um produto com sua quantidade.
- Produto
- Quantidade
- Subtotal (produto × quantidade)

Pedido
Classe principal que gerencia o pedido do cliente.
- Lista de itens
- Valor total
- Status do pedido
- Controle do fluxo (pendente → pago → preparo → finalizado)

Fluxo do Pedido
1. Cliente seleciona os produtos  
2. Sistema calcula o total automaticamente  
3. Cliente realiza o pagamento  
4. Pedido é enviado para preparo  
5. Pedido é finalizado e entregue  

O sistema garante que o fluxo seja seguido corretamente, impedindo etapas fora de ordem.

Interfaces do Sistema
- Cliente (Totem): Realiza pedidos e pagamentos  
- Atendente: Visualiza e gerencia pedidos  

Tecnologias Utilizadas
- Java JDK 25
- Git e GitHub  
- IDE VS Code

Autores
- Sílvio Aparecido Rêgo Silva  
- Marcos Silva Souza

Como Executar o Projeto
Se necessário ou se quiser pode ajustar depois quando tiver código

bash
Clonar o repositório
git clone https://github.com/artsilvio/CafeExpresso.git

Abrir o projeto na IDE e executar