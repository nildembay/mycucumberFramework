#Yeni bir feature file olusturun: US1007_kullanici_data_ekleyebilmeli
#DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun
#When kullanici https://editor.datatables.net/ adresine gider
#Then new butonuna basar
#And tum bilgileri girer
#And Create tusuna basar
#When kullanici ilk isim ile arama yapar
#Then isim bolumunde isminin oldugunu dogrular
Feature: US1007_kullanici_data_ekleyebilmeli
 @rapor  @smoke
  Scenario Outline: TC009_5_farkli_kisi_ile_Farkli_kombinasyonlar_calismali
    When kullanici "datatables_url" anasayfaya gider
    Then new butonuna basar
    And first name girer "<firstname>"
   And "1" saniye bekler
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
      |mehmet     |bulut     |teacher  |ankara  |---        |2020-12-10|1000|
      |yasin      |kaya      |manager  |ankara  |--         |2020-10-15|10000|
      |cevat      |fehmi     |tester   |istanbul|Dr         |2020-05-15|12500000|
      |adnan      |calis     |QA lead  |berlin  |Master     |2020-03-16|-25000  |
      |selin      |gul       |Manuel tester|munih|--        |2020-12-12 |1256125|
