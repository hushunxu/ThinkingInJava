package Chapter3;

import static net.mindview.util.Print.*;

class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("x.c:" + x.c);//a
        
        //传递的是一个引用，不是参数的副本
        f(x);
        print("x.c:" + x.c);//z
    }
}
