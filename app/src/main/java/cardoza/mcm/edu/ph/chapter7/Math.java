package cardoza.mcm.edu.ph.chapter7;

public class Math {

    private double firstDouble, secondDouble;
    private int firstInt, secondInt;
    private String a;

    public String getAnswer(){ //getter method for answer
        return a;
    }



    public Math(String d,double e,double f){// 1.b

        if(d.equals("a")) {//division
            firstDouble = e;
            secondDouble =f;
            a = String.valueOf(firstDouble/secondDouble);
        }
        else if(d.equals("b")){//multiplication
            firstDouble = e;
            secondDouble =f;
            a = String.valueOf(firstDouble*secondDouble);
        }
    }
    public Math(int e, int f){//1.c
        firstInt=e;
        secondInt=f;
        a=String.valueOf(firstInt+secondInt);

    }
    public Math(String d){//1.d
        this.a=d;
    }public Math(String d,String e,String f){// 1.b
        firstDouble = Double.parseDouble(e);
        secondDouble = Double.parseDouble(f);

        if(d.equals("a")) {//division
            a = String.valueOf(firstDouble/secondDouble);
        }
        else if(d.equals("b")){//multiplication
            a = String.valueOf(firstDouble*secondDouble);
        }
    }

    public Math(String e, String f){//1.c
        firstInt = Integer.parseInt(e);
        secondInt = Integer.parseInt(f);
        a=String.valueOf(firstInt+secondInt);

    }
}
