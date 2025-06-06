public class Task {
    private String title; //Görev başlığı
    private String description; //Görev açıklaması
    private boolean isCompleted; //Görev tamamlandı mı tamamlanmadı mı

    //Constructor (yapıcı metod)
    public Task (String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }
    public void markAsCompleted() {
        isCompleted = true;
    }
    //Görev tamamlandı mı
    public boolean isCompleted() {
        return isCompleted;
    }
    public String getTitle () {
        return title;
    }
    public String getDescription() {
        return  description;
    }
    //Görev detayını ekrana yazdır
    public void showTask () {
        System.out.println("Başlık: "+title);
        System.out.println("Açıklama: "+description);
        System.out.println("Durum: " + (isCompleted ? "Tamamlandı " : "Devam ediyor "));
        System.out.println("----------------");
    }

}
