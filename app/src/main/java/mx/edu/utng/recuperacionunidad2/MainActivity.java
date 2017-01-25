package mx.edu.utng.recuperacionunidad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_number_x;
    private Button btn_calculation;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_number_x = (EditText) findViewById(R.id.txt_number_x);
        btn_calculation = (Button) findViewById(R.id.btn_calculation);
        txtResult = (TextView) findViewById(R.id.txv_result);


        btn_calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Float.parseFloat(
                        txt_number_x.getText().toString());

                double result = 0;

                result = ((4*Math.pow(x,3) - 3*Math.pow(x,2))  / (2*x));



                txtResult.setText(String.valueOf(result));

            }
        });
    }
}
