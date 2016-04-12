package com.nd.argoshka.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nd.argoshka.MainActivity;
import com.nd.argoshka.R;

public class AddClientActivity extends Activity {

    Button doAddClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_client);
        doAddClient = (Button)findViewById(R.id.doAddClientBtn);

        doAddClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.main);
                //Toast.makeText(getApplicationContext(),"You click on Button do Add Client", Toast.LENGTH_LONG).show();
                Intent intent  = new Intent(AddClientActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
