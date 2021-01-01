Feature: US1006_Dinamik_url_test.feature
  @smoke
  Scenario: TC08_yazilan_her_url’e_gitmeli

  Given kullanici "bestbuy_url" anasayfaya gider

  Scenario Outline: TC09_her url'e gitmeli
      Given kullanici "<istenenUrl>" anasayfaya gider
      Then "<istenenUrl>" de oldugunu test eder
      And kullanici sayfayi kapatir
      Examples:
        | istenenUrl |
        | amazon_url |
        | walmart_url |
        | bestbuy_url |