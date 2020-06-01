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

public class minusfrag extends Fragment {

    EditText num3, num4;
    TextView res2;
    Button min2;
    View.OnClickListener cl;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.minus,container,false);

        num3 = (EditText)root.findViewById(R.id.number3);
        num4 = (EditText)root.findViewById(R.id.number4);
        res2 = (TextView)root.findViewById(R.id.result2);
        min2 = (Button)root.findViewById(R.id.minu2);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, c;
                a = Integer.parseInt(num3.getText().toString());
                b = Integer.parseInt(num4.getText().toString());
                c = a - b;
                res2.setText("합계 = " + c);
            }
        };
        min2.setOnClickListener(cl);

        return root;//super.onCreateView(inflater, container, savedInstanceState);
    }
}
