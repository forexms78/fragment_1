package com.example.fragment1;

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

public class plusfrag extends Fragment {

    EditText num1, num2;
    TextView res1;
    Button add;
    View.OnClickListener cl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.plus,container,false);

        num1 = (EditText)root.findViewById(R.id.number1);
        num2 = (EditText)root.findViewById(R.id.number2);
        res1 = (TextView)root.findViewById(R.id.result1);
        add = (Button)root.findViewById(R.id.add);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, c;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                c = a + b;
                res1.setText("곱하기 = " + c);
            }
        };
        add.setOnClickListener(cl);

        return root;//super.onCreateView(inflater, container, savedInstanceState);
    }
}
