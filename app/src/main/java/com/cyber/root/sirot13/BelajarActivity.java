package com.cyber.root.sirot13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;

/**
 * Created by root on 07/04/16.
 */
public class BelajarActivity extends AppCompatActivity {
    ButtonRectangle buttonRectangleProses, buttonRectangleDeskripsi;
    TextView textViewHasil;
    EditText editTextKata, editTextEnkripsi;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        img=(ImageView)findViewById(R.id.img);

        buttonRectangleProses = (ButtonRectangle) findViewById(R.id.btnprosesEnkripsi);
        buttonRectangleDeskripsi = (ButtonRectangle) findViewById(R.id.btnprosesDeskripsi);
        textViewHasil = (TextView) findViewById(R.id.tvhasil);
        editTextKata = (EditText) findViewById(R.id.edtkata);
        editTextEnkripsi = (EditText) findViewById(R.id.edtkataDeskripsi);
        buttonRectangleProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextKata.getText().toString();
                if (s.equals("")) {
                    Toast.makeText(getApplicationContext(), "Kata Masih Kosong Tidak Dapat Di Deskripsi", Toast.LENGTH_SHORT).show();
                } else {
                    String a = editTextKata.getText().toString();
                    editTextEnkripsi.setText(Rot13Activity.prosesrot13(a));
                    String ss = editTextEnkripsi.getText().toString();
                    textViewHasil.setText("Hasil dari proses enkripsi Rot13 dari kata =" + s +
                            " adalah " + ss + "\n" + " Penjelasannya adalah " +
                            "Rot13 mengeser tiap huruf ke 13 huruf di depannya dan jika huruf 'N' " +
                            " sampai 'Z' dia akan menggeser kembali sebanyak 13 ke belakang jadi kata (" + s + ")" +
                            " di ubah tiap hurufnya menjadi (" + ss + ") itu di peroleh " +
                            "dari tiap huruf bergeser 13 (a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z)" +
                            " menjadi (n-o-p-q-r-s-t-u-v-w-x-y-z-a-b-c-d-e-f-g-h-i-j-k-l-m)");
img.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonRectangleDeskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextEnkripsi.getText().toString();
                if (s.equals("")) {
                    Toast.makeText(getApplicationContext(), "Kata Masih Kosong Tidak Dapat Di Enkripsi", Toast.LENGTH_SHORT).show();
                } else {
                    editTextKata.setText(Rot13Activity.prosesrot13(s));
                    String ss = editTextKata.getText().toString();
                    textViewHasil.setText("Hasil dari deskripsi Rot13 dari kata =" + s + " adalah " + ss +
                            "\n" + " Penjelasanya adalah " +
                            "Deskripsi Rot13 memiliki metode jika huruf di 'A' sampai 'N' Rot13 " +
                            "akan di geser ke depan sebanyak 13,jika huruf 'N' sampai 'Z' maka Rot13 akan mengeser mundur sebanyak 13" +
                            ", jadi kata (" + s + ")" + " di ubah tiap hurufnya menjadi" +
                            " (" + ss + ")" + " itu di peroleh " +
                            "dari rumus Rot13 (n-o-p-q-r-s-t-u-v-w-x-y-z-a-b-c-d-e-f-g-h-i-j-k-l-m)" +
                            " menjadi (a-b-c-d-e-f-g-h-i-j-k-l-m-n-o-p-q-r-s-t-u-v-w-x-y-z)");
                    img.setVisibility(View.VISIBLE);
                }

            }
        });
    }

}
