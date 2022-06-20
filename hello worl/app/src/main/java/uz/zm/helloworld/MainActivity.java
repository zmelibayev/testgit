package uz.zm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView rezultTxt;
    Button clearBtn, backSpaceBtn, btnDel, btnMultiply, btnMinus, btnDot, btnEqual,
            btnPlus, btnNull;
    String curr = "";
    String res = "";
    boolean operator_inserted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout1);

    }

        public void init() {
        editText = findViewById(R.id.editTxt);
        rezultTxt= findViewById(R.id.result);
        clearBtn = findViewById(R.id.clearBtn);
        backSpaceBtn = findViewById(R.id.backSpaceBtn);
        btnDel = findViewById(R.id.btnDel);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnPlus = findViewById(R.id.btnPlus);
        btnNull = findViewById(R.id.btnNull);
        }
}