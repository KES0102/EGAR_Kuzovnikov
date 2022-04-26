package EndoCarbon;

import java.util.Date;

public class Messeg {
    String content;
    String imagePath;
    Date sentDate;
    int readCount;

    public  Messeg(String content, String imagePath, Date sentDate){
        this.content=content;
        this.content=imagePath;
        this.sentDate=sentDate;
    }

    public void print(){
        System.out.println(content);
    }

    void loadPImage() throws InterruptedException {
        System.out.println("Загрузка  по пути"+ imagePath);
        Thread.sleep(1000);
        System.out.println("Картинка загружена");
    }
    void printSentDate(){
        System.out.println(sentDate);
    }
    int getReadCount(){
        return readCount;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
}
