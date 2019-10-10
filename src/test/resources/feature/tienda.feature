@Regression
Feature: Web Automation JumboTiendas
  As a web user
  wants to access to jumbotienda and select 20 differents products from despensa
  To veriry that price doesn't excedes tweenty thousand pesos

  @RunnerTags
  Scenario: Access the page and buy products
    Given that Maleja needs to login on jumbo's page
    When she makes the registration entry in the application, select from menu despensa and choose products
    |Arroz y granos|Aceite|Café|Bebida achocolatada en polvo|Cereales|Harinas y mezclas|Pastas|Enlatados y conservas|Encurtidos y otros|Azúcar, Endulzantes y Panelas|Chocolate de mesa|Avenas y salvado|Condimentos, caldos y sal|Bases, cremas y sopas|Salsas y vinagres|Té, infusiones e instantaneos|
    Then she visualizes the shoping car and verify that don't be major than tweenty thousand pesos