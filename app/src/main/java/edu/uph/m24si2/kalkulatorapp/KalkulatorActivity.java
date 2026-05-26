package edu.uph.m24si2.kalkulatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorActivity extends AppCompatActivity {
    private EditText edtNilaiPertama, edtNilaiKedua;
    private Button btnTambah, btnKali, btnBagi;
    private TextView txvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    edtNilaiPertama = findViewById(R.id.edtNilaiPertama);
    edtNilaiKedua = findViewById(R.id.edtNilaiKedua);
    btnTambah = findViewById(R.id.btnTambah);
    btnKali = findViewById(R.id.btnKali);
    btnBagi = findViewById(R.id.btnBagi);
    txvHasil = findViewById(R.id.txvHasil);
    btnTambah.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a, b, hasilTambah;
            a = Integer.parseInt(edtNilaiPertama.getText().toString());
            b = Integer.parseInt(edtNilaiKedua.getText().toString());
            hasilTambah = a + b;
            txvHasil.setText(Integer.toString(hasilTambah));
        }
    });
    btnKali.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a, b, hasilKali;
            a = Integer.parseInt(edtNilaiPertama.getText().toString());
            b = Integer.parseInt(edtNilaiKedua.getText().toString());
            hasilKali = a * b;
            txvHasil.setText(Integer.toString(hasilKali));
        }
    });
    btnBagi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a, b, hasilBagi;
            a = Integer.parseInt(edtNilaiPertama.getText().toString());
            b = Integer.parseInt(edtNilaiKedua.getText().toString());
            hasilBagi = a / b;
            txvHasil.setText(Integer.toString(hasilBagi));
        }
    });
    }
}