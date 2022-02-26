package com.example.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CountFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CountFragment extends Fragment {

    private Button boton;
    private EditText edit;
    private TextView text;


    public CountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_count, container, false);
        boton = (Button) view.findViewById(R.id.main_button);
        edit = (EditText) view.findViewById(R.id.main_editText);
        text = (TextView) view.findViewById(R.id.main_textview);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String mensaje = edit.getText().toString();
                text.setText(String.valueOf(mensaje.length()));
            }
        });
        return view;
    }
}



