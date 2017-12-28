package com.example.pc.mechat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.time.Instant;

/**
 * Created by PC on 16/12/2017.
 */

public class call extends Fragment {

    private Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calling);

        Button = findViewById(R.id.call);
        Button.setOnClickListener(new.View.OnClickListener){

            @Override
            public void OnClick(View v){
                Instant callintent = new Instant(Instant.ACTION_CALL);
                callintent.setData(Url.parse("tel:123"));
                startActivity(callintent);
            }
        }
    }

    private void findViewById(int call) {
        Button=findViewById(R.id.call);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.calling, container, false);
        return rootView;
    }
}
