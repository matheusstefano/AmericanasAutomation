Feature: Compra de produto Americanas

  Scenario: Usuario ira adicionar um produto do site no Carrinho
    Given Que o usuario esteja no site da Americanas
    When Digitar "Iphone" no campo de busca
    And Clicar em buscar
    Then Devera ser apresentado o produto
    And O usuario devera adicionar ao carrinho
