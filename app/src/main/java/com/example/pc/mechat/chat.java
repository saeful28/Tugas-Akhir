package com.example.pc.mechat;

/**
 * Created by PC on 16/12/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.lang.ref.Reference;

public class chat extends Fragment {

    private EditText editMessage;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatt);
        
        editMessage = (EditText) findViewById(R.id.editMessageE);
        mDatabase = mDatabase.getInstance().getReference().Child("Msesage");
                
        private void findViewById(int editMessage) {

            editMessage = (EditText) findViewById(R.id.editMessageE);
        }
    }

    public void SendButtonClicked (View view){
        final String MessageValue = editMessage.getText().toString().trim();
        if(TextUtils.isEmpty(MessageValue)){
            final DatabaseReference NewPost = mDatabase.push();
            NewPost.Child("Content").setValue(MessageValue);
        }
    }

    private void setContentView(int activity_main) {
        setContentView(R.layout.chatt);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.chatt, container, false);
        return rootView;
    }

    
}
