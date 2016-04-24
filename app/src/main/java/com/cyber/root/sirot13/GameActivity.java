package com.cyber.root.sirot13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;

/**
 * Created by root on 07/04/16.
 */
public class GameActivity extends AppCompatActivity {
String s1,s2,s3,s4;
String j1,j2,j3,j4;
    String p,p2;
    public ButtonRectangle buttonRectangleJawab;
    public EditText editTextJawab;
    public TextView textViewSoal;
    public TextView textViewIsi,textViewSkor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        s1="Aku suka android";
        j1="Nxh fhxn naqebvq";
        s2="Havxnzn xnzchfxh";
        j2="Unikama kampusku";
        s3="Ibu kU Surgaku";
        j3="Voh xH Fhetnxh";
        s4="Znunfvfjn Frwngv nqnynu Zrerxn Lnat FRYNH cnagnat ZralrEnu";
        j4="Mahasiswa Sejati adalah Mereka Yang SELALU pantang MenyeRah";
        p="Enkripsikan kalimat berikut dengan metode Rot13 !";
        p2="Deskripsikan kalimat berikut dengan metode Rot13";
        buttonRectangleJawab=(ButtonRectangle)findViewById(R.id.btnjawab);
        editTextJawab=(EditText)findViewById(R.id.edtjawab);
        textViewIsi=(TextView)findViewById(R.id.tvisi);
        textViewSoal=(TextView)findViewById(R.id.tvsoal);
        textViewSkor=(TextView)findViewById(R.id.tvskor);
        textViewSoal.setText(p);
        textViewIsi.setText(s1);
        buttonRectangleJawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editTextJawab.getText().toString();
                if (s.equals(j1)){
                    textViewSkor.setText("1");
                    textViewSoal.setText(p2);
                    textViewIsi.setText(s2);

                }else {
                    Toast.makeText(getApplicationContext(),"Jawaban Kamu Salah",Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}
