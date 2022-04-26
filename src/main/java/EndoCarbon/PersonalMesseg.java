package EndoCarbon;

import java.util.Date;

public class PersonalMesseg extends Messeg{
    public  PersonalMesseg(String content, String imagePath, Date sentDate){

        super(content, imagePath, sentDate);
        }
        public void print(){
        System.out.println("Это личное сообщение, "+"не для чата"+content);
        }
}
