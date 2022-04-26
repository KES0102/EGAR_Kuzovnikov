package EndoCarbon;

import java.util.Date;

public class Main {
    public  static  void main(String[] args) throws InterruptedException {
        Messeg messeg1=new PersonalMesseg("hello world", "Adress", new Date());
        Messeg messeg2=new groupMesseg("hello world", "Adress", new Date());

        messeg1.print();
        int i = 0;

        messeg2.print();

    }
}
