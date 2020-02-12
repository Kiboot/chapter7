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
        Math mathOp3= new Math(txtD3,txtD1,txtD2);
        Math mathOp2= new Math(txtD1,txtD2);


        txt.setText(mathOp3.getAnswer()); //unconventional or borderline illegal
        txt.setText(mathOp1.getAnswer());

        Product titanGelMAX = new Product("Titan Gel MAX","6969","696969");
        Product femdomlash = new Product("Latigo ni Hudas","666","6666666");
        titanGelMAX.setName("TT GEL MAX"); //You renamed titan gel max
        Product secretnilyka = new Product("Nudes ni Malik","999","99999");
        secretnilyka.setPrice("1500000");
        femdomlash.setID("6666666"); //increased deebil
        String pangalansayawa = femdomlash.getName();
        String product1 = titanGelMAX.getName();

        Product chippy = new Product("Chippy Light Saled","Parat gihapon kaayo");
        Product nova = new Product("Nova Chips","Balas balas ug lasa");
    }
}
