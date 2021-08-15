package Chapter3;

import static net.mindview.util.Print.*;

class Tank {
    int level;
}

public class Assginment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("t1.level:" + t1.level + " t2.level:" + t2.level);

        t1 = t2;
        print("t1.level:" + t1.level + " t2.level:" + t2.level);

        t1.level = 27;
        print("t1.level:" + t1.level + " t2.level:" + t2.level);
    }    
}
