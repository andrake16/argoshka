package com.nd.argoshka.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nd.argoshka.MainActivity;
import com.nd.argoshka.R;

public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }

    public void OnClick(View view){
        Intent intent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
