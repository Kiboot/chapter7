package cardoza.mcm.edu.ph.chapter7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double aDouble,bDouble;
    int aInt,bInt;
    String streng;
    TextView txt,txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt1);
        txt1 = findViewById(R.id.txt2);
        txt2 = findViewById(R.id.txt3);
        txt3 = findViewById(R.id.txt4);



        //String txtD1="4", txtD2="2",txtD3="a",answer;

        //Math mathOp1= new Math(2,4);
        //Math mathOp3= new Math(txtD3,txtD1,txtD2);
        //Math mathOp2= new Math(txtD1,txtD2);


        //txt.setText(mathOp3.getAnswer()); //unconventional or borderline illegal
        //txt.setText(mathOp1.getAnswer());

        //Product titanGelMAX = new Product("Titan Gel MAX","6969","696969");
        //Product femdomlash = new Product("Latigo ni Hudas","666","6666666");
        //titanGelMAX.setName("TT GEL MAX"); //You renamed titan gel max
        //Product secretnilyka = new Product("Nudes ni Malik","999","99999");
        //secretnilyka.setPrice("1500000");
        //femdomlash.setID("6666666"); //increased deebil
        //String pangalansayawa = femdomlash.getName();
        //String product1 = titanGelMAX.getName();

        //Product chippy = new Product("Chippy Light Saled","Parat gihapon kaayo");
        //Product nova = new Product("Nova Chips","Balas balas ug lasa");

        int startingID = 20200000;



        Student rhea = new Student(startingID++,"Ria","Cordero",'F',17);
        Student hirna = new Student(startingID++,"Hernan Rey","Jugar",'M',18);

        rhea.setStudentID(startingID++);
        rhea.setfName("Ria");
        rhea.setlName("Cordero");
        rhea.setAge(17);
        rhea.setSex('F');


        txt.setText(rhea.getfName()+" "+rhea.getlName());
        txt1.setText(String.valueOf(rhea.getStudentID()));
        txt2.setText(String.valueOf(rhea.getAge()));
        txt3.setText(String.valueOf(rhea.getSex()));
    }
}
