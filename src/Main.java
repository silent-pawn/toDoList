import java.util.ArrayList; //Liste Kullanmak İçin
import java.util.Scanner; //Kullanıcıdan Veri Almak İçin
public class Main {
    public static void main (String [] args) {
        ArrayList<Task> tasks = new
                ArrayList<>(); //Görev Tutan Liste
        Scanner input = new
                Scanner(System.in); //Kullanıcıdan Veri Almak

        //Sonsuz döngü
        while(true) {
            //Menu
            System.out.println("  Görev Takip Uygulaması  ");
            System.out.println("1. Görev Ekle");
            System.out.println("2. Görevleri Listele");
            System.out.println("3. Çıkış");
            System.out.println("Seçiminiz: ");
            int choice =
                    input.nextInt(); //Menüden seçim al
            input.nextLine();

            if (choice == 1) {
                //Görev Ekleme
                System.out.println("Görev Başlığı: ");
                String title =
                        input.nextLine(); //Başlık
                System.out.println("Görev Açıklaması: ");
                String desc =
                        input.nextLine(); //Açıklama
                Task newTask = new
                        Task(title, desc); //Yeni görev oluştur
                tasks.add(newTask); //Listeye ekle
                System.out.println(" Görev Eklendi! ");
            }
            else if (choice == 2) {
                //Görevleri listele
                System.out.println(" Tüm Görevler: ");
                if (tasks.isEmpty()) {
                    System.out.println("Henüz görev eklenmedi");
                 } else {
                    for (Task task : tasks )
                        task.showTask(); //Her görev için bilgi
                    {

                }

            }
        }  else if (choice == 3) {
                System.out.println("Çıkılıyor...");
                break;
            }
        }
        input.close();
    }
}