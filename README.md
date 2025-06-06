# toDoList
Java dilinde yazılmış basit bir görev takip uygulamasıdır. 

#Özellikler
-Görev başlığı ve açıklaması girme
-Görevleri listeleme
-Görevlerin tamamlanma durumunu gösterme (işaretleme yok)

#Kullanım
'1' ile yeni görev eklenir
'2' ile tüm görevler listelenir
'3' ile çıkış yapılır

#Kodlar 
ArrayList<Task> taks = new ArrayList<>();
ile tüm görevler saklanmak için liste oluşturuldu. Program çalıştığı sürece tüm görevler bu listede saklanır.

Scanner input = new Scanner (System.in);
Kullanıcıdan veri almak için. 

while (true)
Kullanıcı '3' (çıkış) girene kadar menü sürekli gösterilir.

Task sınıfı
showTask() metodu görev bilgilerini ekrana yazdırır.

choice
Kullanıcının menüden yaptığı seçimi gösterir.

boolean
"Görev tamamlandı mı?" sorusuna cevap verir.

isCompleted
Görevin tamamlanıp tamamlanmadığını belirtir.
False sonradan true olabilir. (boolean yalnızca true/false değeri alır)
