Feature: US1005_Walmart_parameter_arama.feature

  Scenario Outline:  TC07_aranan_kelime_title’da_olmali
    When kullanici walmart anasayfaya gider
    Then walmart sayfasinda"<arananlar>" icin arama yapar
    And walmart sayfa basliginin "<arananlar>" icerdigini test eder
    Then kullanici sayfayi kapatir

    Examples:
      |arananlar|
      |Nutella  |
      |pencil   |
      |milk     |
      |domatoes |
      |popcorn  |