package com.mystartup.convnumtolettacademicscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtresult = (TextView) findViewById(R.id.txtresult);
        final EditText edtinput = (EditText) findViewById(R.id.edtinput);
        Button btngnrt = (Button) findViewById(R.id.btngnrt);

        final Convert myConv = new Convert(0);

        btngnrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtinput.getText().toString().length()==0){
                    txtresult.setTextSize(30);
                    txtresult.setText("Kolom Tidak Boleh Kosong!");
                    Toast.makeText(MainActivity.this, "Add Score!", Toast.LENGTH_SHORT).show();
                }

                else if (Double.parseDouble(edtinput.getText().toString()) > 100.00){
                    txtresult.setTextSize(30);
                    txtresult.setText("Score Tidak Boleh Lebih Dari 100!");
                    Toast.makeText(MainActivity.this, "Add Score (0-100)!", Toast.LENGTH_SHORT).show();
                }
                else {
                    txtresult.setTextSize(180);
                    myConv.numScore(Double.parseDouble(edtinput.getText().toString()));
                    txtresult.setText(myConv.converting());
                    Toast.makeText(MainActivity.this, "Convertion Success", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
