Feature: US1004_amazon_search_scenario_outline

  @amazon
  Scenario Outline: TC06_coklu_arama
    When kullanici amazon anasayfaya gider
    Then "<arananlar>" icin arama yapar
    And sonucun "<arananlar>" icerdigini test eder
    Then kullanici sayfayi kapatir

    Examples:
    |arananlar|
    |yasin    |
    |samsung  |
    |headphone|
    |pencil   |

