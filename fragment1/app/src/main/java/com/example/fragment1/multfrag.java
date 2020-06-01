package com.example.fragment1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class multfrag extends Fragment {

    EditText num1, num2;
    TextView res1;
    Button mul;
    View.OnClickListener cl;

    @SuppressLint("CutPasteId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.mult, container,false);
        num1 = (EditText)root.findViewById(R.id.number5);
        num2 = (EditText)root.findViewById(R.id.number6);
        res1 = (TextView)root.findViewById(R.id.result3);
        mul = (Button)root.findViewById(R.id.gob);
        num1.setBackgroundColor(Color.YELLOW);
        num2.setBackgroundColor(Color.YELLOW);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = a * b;
                res1.setText("합계 = " + c);
            }
        };
        mul.setOnClickListener(cl);

        return root;//super.onCreateView(inflater, container, savedInstanceState);
    }
}
