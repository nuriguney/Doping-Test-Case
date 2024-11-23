Feature: Doping Hafıza Study Case
  Scenario: Kullanıcının dopinghafiza ana sayfasına gidebildiğini doğrulamak.
    Given Dopinghafiza ana sayfası açıldı
    When Sayfa yüklendiği zaman
    Then Sayfa başlığı doping hafıza içeriyor
  Scenario: Yorumlar ve Başarılarımız Tıklama
    Given : Kullanıcı ana sayfadadır
    When : Yorumlar ve Başarılarımız butonunun tıklanabilir.
    Then : Yorumlar ve Başarılarımız butonuna tıklandı.
    And : Kullanıcı Yorumlar ve Başarılarımız Sayfasında.
  Scenario:  Paketlerimize Tıklama ve Paketlerin Geldiğinin Doğrulanması
    Given : Paketlerimiz butonunun tıklanabilir olmasını bekleyin.
    When : Paketlerimiz butonuna tıklayın
    Then : Paketlerimiz sayfasında paketlerin geldiği doğrulanmalıdır.
