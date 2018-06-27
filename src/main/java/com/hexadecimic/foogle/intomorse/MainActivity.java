package com.hexadecimic.foogle.intomorse;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    EditText editText;
    TextView textView;
    RadioGroup radioGroup;
    RadioButton radioButton, radioButton2;
    Button button;
    String clicked="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            ActionBar actionBar = getActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
        }
        catch (NullPointerException n){

        }
        setContentView(R.layout.activity_main);



        editText=(EditText)findViewById(R.id.editText);
        textView=(TextView)findViewById(R.id.textView);
        radioGroup=(RadioGroup)findViewById(R.id.radio);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        button=(Button)findViewById(R.id.button);

        textView.setOnClickListener(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if(null!=rb && radioButton.getText().equals(rb.getText())){
                    Toast.makeText(MainActivity.this, "English to Morse Code", Toast.LENGTH_SHORT).show();
                    clicked="E2M";
                }
                else if(null!=rb && radioButton2.getText().equals(rb.getText())){
                    Toast.makeText(MainActivity.this, "Morse Code to English", Toast.LENGTH_SHORT).show();
                    clicked="M2E";
                }
                else{

                }

            }
        });




    }

    public void englishToMorse(String s){

        CharSequence answer="";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                answer=answer+".-";
            }
            if(s.charAt(i)=='B' || s.charAt(i)=='b'){
                answer=answer+"-...";
            }
            if(s.charAt(i)=='C' || s.charAt(i)=='c'){
                answer=answer+"-.-.";
            }
            if(s.charAt(i)=='D' || s.charAt(i)=='d'){
                answer=answer+"-..";
            }
            if(s.charAt(i)=='E' || s.charAt(i)=='e'){
                answer=answer+".";
            }
            if(s.charAt(i)=='F' || s.charAt(i)=='f'){
                answer=answer+"..-.";
            }
            if(s.charAt(i)=='G' || s.charAt(i)=='g'){
                answer=answer+"--.";
            }
            if(s.charAt(i)=='H' || s.charAt(i)=='h'){
                answer=answer+"....";
            }
            if(s.charAt(i)=='I' || s.charAt(i)=='i'){
                answer=answer+"..";
            }
            if(s.charAt(i)=='J' || s.charAt(i)=='j'){
                answer=answer+".---";
            }
            if(s.charAt(i)=='K' || s.charAt(i)=='k'){
                answer=answer+"-.-";
            }
            if(s.charAt(i)=='L' || s.charAt(i)=='l'){
                answer=answer+".-..";
            }
            if(s.charAt(i)=='M' || s.charAt(i)=='m'){
                answer=answer+"--";
            }
            if(s.charAt(i)=='N' || s.charAt(i)=='n'){
                answer=answer+"-.";
            }
            if(s.charAt(i)=='O' || s.charAt(i)=='o'){
                answer=answer+"---";
            }
            if(s.charAt(i)=='P' || s.charAt(i)=='p'){
                answer=answer+".--.";
            }
            if(s.charAt(i)=='Q' || s.charAt(i)=='q'){
                answer=answer+"--.-";
            }
            if(s.charAt(i)=='R' || s.charAt(i)=='r'){
                answer=answer+".-.";
            }
            if(s.charAt(i)=='S' || s.charAt(i)=='s'){
                answer=answer+"...";
            }
            if(s.charAt(i)=='T' || s.charAt(i)=='t'){
                answer=answer+"-";
            }
            if(s.charAt(i)=='U' || s.charAt(i)=='u'){
                answer=answer+"..-";
            }
            if(s.charAt(i)=='V' || s.charAt(i)=='v'){
                answer=answer+"...-";
            }
            if(s.charAt(i)=='W' || s.charAt(i)=='w'){
                answer=answer+".--";
            }
            if(s.charAt(i)=='X' || s.charAt(i)=='x'){
                answer=answer+"-..-";
            }
            if(s.charAt(i)=='Y' || s.charAt(i)=='y'){
                answer=answer+"-.--";
            }
            if(s.charAt(i)=='Z' || s.charAt(i)=='z'){
                answer=answer+"--..";
            }
            if(s.charAt(i)=='0'){
                answer=answer+"-----";
            }
            if(s.charAt(i)=='1'){
                answer=answer+".----";
            }
            if(s.charAt(i)=='2'){
                answer=answer+"..---";
            }
            if(s.charAt(i)=='3'){
                answer=answer+"...--";
            }
            if(s.charAt(i)=='4'){
                answer=answer+"....-";
            }
            if(s.charAt(i)=='5'){
                answer=answer+".....";
            }
            if(s.charAt(i)=='6' ){
                answer=answer+"-....";
            }
            if(s.charAt(i)=='7'){
                answer=answer+"--...";
            }
            if(s.charAt(i)=='8'){
                answer=answer+"---..";
            }
            if(s.charAt(i)=='9'){
                answer=answer+"----.";
            }
            if(s.charAt(i)=='.'){
                answer=answer+".-.-.-";
            }
            if(s.charAt(i)==','){
                answer=answer+"--..--";
            }
            if(s.charAt(i)=='?'){
                answer=answer+"..--..";
            }
            if(s.charAt(i)=='"'){
                answer=answer+".-..-.";
            }
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                answer=answer+"-.--.-";
            }
            if(s.charAt(i)=='-'){
                answer=answer+"-....-";
            }
            if(s.charAt(i)=='/'){
                answer=answer+"-..-.";
            }
            if(s.charAt(i)=='='){
                answer=answer+"-...-";
            }
            if(s.charAt(i)=='@'){
                answer=answer+".--.-.";
            }
            if(s.charAt(i)==':'){
                answer=answer+"---...";
            }
            else{
                answer=answer+" ";
            }

            textView.setText(answer);
        }

    }
    public void morseToEnglish(String s){

    }


    public void onClick(View view){
        switch (view.getId()) {
            case R.id.textView:
                if (clicked == "E2M") {
                    String temp;
                    temp = editText.getText().toString();
                    englishToMorse(temp);
                } else if (clicked == "M2E") {
                    String temp;
                    temp = editText.getText().toString();
                    morseToEnglish(temp);
                } else {

                }
        }
    }
}
