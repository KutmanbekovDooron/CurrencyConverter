package itacademy.kg.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static int count = 0;
    public  static  int counter = 0;
    public static String moneyName[] = {"USD -> RUB","USD -> KGS" ,"USD -> EUR", "EUR -> KGS"," EUR -> USD"," EUR -> RUB"
    ,"RUB -> KGS","RUB -> USD","RUB -> EUR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText maney = (EditText) findViewById(R.id.namber);
        Button setManey = (Button) findViewById(R.id.setManeyCurrency);
        TextView output = (TextView) findViewById(R.id.output);
        Button chengeClick = (Button) findViewById(R.id.chengeCurrency);
        TextView setMonay = (TextView) findViewById(R.id.chengeMonay);
        Button chengeClickBackTo = (Button) findViewById(R.id.chengeBackTo);
        ImageView chengePicture = (ImageView) findViewById(R.id.pictureChenge);
        chengeClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (setMonay.getText().toString().equals(moneyName[0])){
                    setMonay.setText(moneyName[1]);
                }else if (setMonay.getText().toString().equals(moneyName[1])){
                    setMonay.setText(moneyName[2]);
                }else if (setMonay.getText().toString().equals(moneyName[2])){
                    setMonay.setText(moneyName[3]);
                }else if (setMonay.getText().toString().equals(moneyName[3])){
                    setMonay.setText(moneyName[4]);
                }else if (setMonay.getText().toString().equals(moneyName[4])){
                    setMonay.setText(moneyName[5]);
                }else if (setMonay.getText().toString().equals(moneyName[5])){
                    setMonay.setText(moneyName[6]);
                }else if (setMonay.getText().toString().equals(moneyName[6])){
                    setMonay.setText(moneyName[7]);
                }else if (setMonay.getText().toString().equals(moneyName[7])){
                    setMonay.setText(moneyName[8]);
                }else if (setMonay.getText().toString().equals(moneyName[8])){
                    setMonay.setText(moneyName[0]);
                }
            }
        });

        chengeClickBackTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (setMonay.getText().toString().equals(moneyName[8])){
                    setMonay.setText(moneyName[7]);
                }else if (setMonay.getText().toString().equals(moneyName[7])){
                    setMonay.setText(moneyName[6]);
                }else if (setMonay.getText().toString().equals(moneyName[6])){
                    setMonay.setText(moneyName[5]);
                }else if (setMonay.getText().toString().equals(moneyName[5])){
                    setMonay.setText(moneyName[4]);
                }else if (setMonay.getText().toString().equals(moneyName[4])){
                    setMonay.setText(moneyName[3]);
                }else if (setMonay.getText().toString().equals(moneyName[3])){
                    setMonay.setText(moneyName[2]);
                }else if (setMonay.getText().toString().equals(moneyName[2])){
                    setMonay.setText(moneyName[1]);
                }else if (setMonay.getText().toString().equals(moneyName[1])){
                    setMonay.setText(moneyName[0]);
                }else if (setMonay.getText().toString().equals(moneyName[0])){
                    setMonay.setText(moneyName[8]);
                }
            }
        });


        chengePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (setMonay.getText().toString().equals(moneyName[0])){
                    setMonay.setText(moneyName[7]);
                }else if (setMonay.getText().toString().equals(moneyName[1])){
                    Toast.makeText(MainActivity.this,"извините KGS курс не можите поминать местами" ,Toast.LENGTH_LONG).show();
                }else if (setMonay.getText().toString().equals(moneyName[2])){
                    setMonay.setText(moneyName[4]);
                }else if (setMonay.getText().toString().equals(moneyName[3])){
                    Toast.makeText(MainActivity.this,"извините KGS курс не можите поминать местами" ,Toast.LENGTH_LONG).show();
                }else if (setMonay.getText().toString().equals(moneyName[4])){
                    setMonay.setText(moneyName[2]);
                }else if (setMonay.getText().toString().equals(moneyName[5])){
                    setMonay.setText(moneyName[8]);
                }else if (setMonay.getText().toString().equals(moneyName[6])){
                    Toast.makeText(MainActivity.this,"извините KGS курс не можите поминать местами" ,Toast.LENGTH_LONG).show();
                }else if (setMonay.getText().toString().equals(moneyName[7])){
                    setMonay.setText(moneyName[0]);
                }else if (setMonay.getText().toString().equals(moneyName[8])){
                    setMonay.setText(moneyName[5]);
                }
            }
        });



        setManey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (setMonay.getText().toString().equals(moneyName[0])) {
                        double rubbl = 75.30;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("USD " + dollor + " -> " + rubblSumma + " RUB");
                    } else if (setMonay.getText().toString().equals(moneyName[1])) {
                        double rubbl = 84.80;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("USD " + dollor + " -> " + rubblSumma + " KGS");
                    } else if (setMonay.getText().toString().equals(moneyName[2])) {
                        double rubbl = 0.84;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("USD " + dollor + " -> " + rubblSumma + " EUR");
                    } else if (setMonay.getText().toString().equals(moneyName[3])) {
                        double rubbl = 101.05;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("EUR " + dollor + " -> " + rubblSumma + " KGS");
                    } else if (setMonay.getText().toString().equals(moneyName[4])) {
                        double rubbl = 1.20;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("EUR " + dollor + " -> " + rubblSumma + " USD");
                    } else if (setMonay.getText().toString().equals(moneyName[5])) {
                        double rubbl = 88.60;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("EUR " + dollor + " -> " + rubblSumma + " RUB");
                    } else if (setMonay.getText().toString().equals(moneyName[6])) {
                        double rubbl = 1.14;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("RUB " + dollor + " -> " + rubblSumma + " KGS");
                    } else if (setMonay.getText().toString().equals(moneyName[7])) {
                        double rubbl = 0.013;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("RUB " + dollor + " -> " + rubblSumma + " USD");
                    } else if (setMonay.getText().toString().equals(moneyName[8])) {
                        double rubbl = 0.011;
                        double dollor = Double.valueOf(maney.getText().toString());
                        double rubblSumma = dollor * rubbl;
                        output.setText("RUB " + dollor + " -> " + rubblSumma + " EUR");
                    }
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Введите цыфру!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}