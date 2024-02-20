package com.example.praca_1_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_layout);

        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello");
        int valueInDp = 25; //Программно устанавливаем размер
        int valueInPx = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics());
        tv.setTextSize(valueInPx);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView2 = new TextView(this);
        textView2.setText("New textView");
        textView2.setTextSize(25);
        //Ширина и высота
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textView2.setPadding(40,40,40,40);
        layoutParams.setMargins(60,50,60,50);

        textView2.setLayoutParams(layoutParams);
        constraintLayout.addView(textView2);
        setContentView(constraintLayout);


    }
}