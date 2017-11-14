package tom.com.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bHelp = (Button) findViewById(R.id.b_help);
        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("xxx")
                        .setMessage("BMI原來的設計是一個用於公眾健康研究的統計工具。當需要知道肥胖是否為某一疾病的致病原因時，可以把病人的身高及體重換算成BMI，再找出其數值及病發率是否有線性關連。")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });
    }

    public void bmi(View view) {
        //   System.out.println("what???");
        Log.d("MainActivity", "testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);

        if (bmi < 20) {
            new AlertDialog.Builder(this)
                    .setMessage("你的bmi是" + bmi + "請多吃點")
                    .setTitle("my tytle")
                    .setPositiveButton("OK", null)
                    .show();
        } else {
                new AlertDialog.Builder(this)
                        .setMessage("你的bmi是" + bmi)
                        .setTitle(R.string.my_title)
                        .setPositiveButton(R.string.ok, null)
                        .show();

            }


        /*Log.d("MainActivity","Your bmi is"+bmi);
        Toast.makeText(this, "Your BMI is"+bmi,Toast.LENGTH_LONG).show();*/

        }
    }

