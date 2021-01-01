#Yeni bir feature file olusturun: US1007_kullanici_data_ekleyebilmeli
#DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun
#When kullanici https://editor.datatables.net/ adresine gider
#Then new butonuna basar
#And tum bilgileri girer
#And Create tusuna basar
#When kullanici ilk isim ile arama yapar
#Then isim bolumunde isminin oldugunu dogrular
Feature: US1007_kullanici_data_ekleyebilmeli
 @wip
  Scenario Outline: TC009_5_farkli_kisi_ile_Farkli_kombinasyonlar_calismali
    When kullanici "datatables_url" anasayfaya gider
    Then new butonuna basar
    And first name girer "<firstname>"
    Then last name girer "<lastname>"
    And postion girer "<postion>"
    And office girer "<office>"
    And extention girer "<extention>"
    And start date girer "<start>"
    And Salary girer "<Salary>"
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar "<firstname>"
    Then isim bolumunde isminin oldugunu dogrular "<firstname>"
    Examples:
      | firstname | lastname | postion | office | extention | start | Salary |
      | nilufer| demir |manager | ankara | ------ | 2020-12-12 | 10000 |
      | ahmet | bayraktar | student| duzce | ----- | 2011-12-03| 50000 |
