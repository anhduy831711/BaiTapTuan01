package com.example.tranduy1996.baitaptuan01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtSoA,txtSoB;
    private TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTong(View view)
    {
        txtSoA = findViewById(R.id.txtSoA);
        txtSoB = findViewById(R.id.txtSoB);
        int ketQua = Integer.parseInt(txtSoA.getText().toString())+Integer.parseInt(txtSoB.getText().toString());
        txtKetQua = findViewById(R.id.txtKetQua);
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void onClickHieu(View view)
    {
        txtSoA = findViewById(R.id.txtSoA);
        txtSoB = findViewById(R.id.txtSoB);
        int ketQua = Integer.parseInt(txtSoA.getText().toString())-Integer.parseInt(txtSoB.getText().toString());
        txtKetQua = findViewById(R.id.txtKetQua);
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void onClickNhan(View view)
    {
        txtSoA = findViewById(R.id.txtSoA);
        txtSoB = findViewById(R.id.txtSoB);
        int ketQua = Integer.parseInt(txtSoA.getText().toString())*Integer.parseInt(txtSoB.getText().toString());
        txtKetQua = findViewById(R.id.txtKetQua);
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void onClickChia(View view)
    {
        txtSoA = findViewById(R.id.txtSoA);
        txtSoB = findViewById(R.id.txtSoB);
        txtKetQua = findViewById(R.id.txtKetQua);
        if(Integer.parseInt(txtSoB.getText().toString())==0)
        {
            txtKetQua.setText(String.valueOf(0));
        }
        else
        {
            int ketQua = Integer.parseInt(txtSoA.getText().toString())/Integer.parseInt(txtSoB.getText().toString());
            txtKetQua.setText(String.valueOf(ketQua));
        }
    }

    public void onClickClose(View view)
    {
        finish();
    }
}
