package Chapter3;

import java.util.*;
import static net.mindview.util.Print.*;

public class MathOps {
    public static void main(String[] args) {
        //http://www.51gjie.com/java/605.html
        //47位的种子
        Random rand = new Random(47);
        
        int i, j, k;
        
        //http://www.51gjie.com/java/607.html
        //随机返回一个值在[0,100)的int类型的整数,包括0不包括100
        j = rand.nextInt(100) + 1;
        print("j = " + j);

        k = rand.nextInt(100) + 1;
        print("k = " + k);

        i = j + k;
        print("j + k = " + i);

        i = j - k;
        print("j - k = " + i);

        i = k / j;
        print("k / j = " + i);

        i = k * j;
        print("k * j = " + i);

        i = k % j;
        print("k % j = " + i);

        //float
        float u, v, w;
        v = rand.nextFloat();
        print("v :" + v);

        w = rand.nextFloat();
        print("w :" + w);

        u = v + w;
        print("v + w : " + u);

        u = v - w;
        print("v - w : " + u);

        u = v * w;
        print("v * w :" + u);

        u = v / w;
        print("v / w :" + u);

        //操作符
        print("u = " + u + " v = " + v);
        u += v;
        print("u += v :" + u);

        u -= v;
        print("u -= v :" + u);

        u *= v;
        print("u *= v :" + u);

        u /= v;
        print("u /= v :" + u);
    }
}
