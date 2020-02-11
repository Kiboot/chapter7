package cardoza.mcm.edu.ph.chapter7;

public class Math {

    double firstDouble, secondDouble;
    int firstInt, secondInt;
    String a;

    public Math(String d,double e,double f){// 1.b

        if(d.equals("a")) {//division
            this.firstDouble = e;
            this.secondDouble =f;
            a = String.valueOf(firstDouble/secondDouble);
        }
        else if(d.equals("b")){//multiplication
            this.firstDouble = e;
            this.secondDouble =f;
            a = String.valueOf(firstDouble*secondDouble);
        }
    }
    public Math(int e, int f){//1.c
        this.firstInt=e;
        this.secondInt=f;
        a=String.valueOf(firstInt+secondInt);

    }
    public Math(String d){//1.d
        this.a=d;
    }
}
