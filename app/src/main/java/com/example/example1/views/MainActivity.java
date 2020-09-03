package com.example.example1.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.example1.R;
import com.example.example1.databinding.ActivityMainBinding;
import com.example.example1.model.ATM;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumber;
    private Button btncheck;
    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        edtNumber = findViewById(R.id.edtNumber);
        tvTitle = findViewById(R.id.tvTitle);
        btncheck = findViewById(R.id.btnCheck);
        ATM atm = new ATM("NHẬP SỐ THẺ ATM", "Số thẻ ATM người nhận");

       binding.setAtm(atm);

    }


    public void check(View view) {
      Toast.makeText(MainActivity.this,edtNumber.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}