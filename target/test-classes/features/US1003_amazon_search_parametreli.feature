Feature: US1003_amazon_search_parametreli
  @amazon
  Scenario: TC05_parametre-kullanma
    Given kullanici amazon anasayfaya gider
    And "teapot" icin arama yapar
    Then sonucun "hasan" icerdigini test eder
    And kullanici sayfayi kapatir
