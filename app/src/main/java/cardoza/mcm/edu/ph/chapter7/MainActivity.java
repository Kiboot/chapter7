package cardoza.mcm.edu.ph.chapter7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double aDouble,bDouble;
    int aInt,bInt;
    String streng;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt1);


        String txtD1="4", txtD2="2",txtD3="a",answer;

        Math mathOp1= new Math(2,4);
        Math mathOp3= new Math(txtD3,Double.parseDouble(txtD1),Double.parseDouble(txtD2));

        txt.setText(mathOp3.a);
        txt.setText(mathOp1.a);
        //answer = mathOp3.a; //2
        //answer = mathOp1.a; //6



    }
}
