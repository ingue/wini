package com.e.user.commute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.user.commute.DataSet.Profile;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_login_loginbtn:
                Profile profile = (Profile) getApplicationContext();
                int lid = profile.num;
                Log.d("ddd",""+lid);
                intent =new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

            case R.id.activity_login_helpbtn:
              intent =new Intent(this,HelpActivity.class);
                startActivity(intent);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView help_btn=(ImageView)findViewById(R.id.activity_login_helpbtn);
        TextView login_btn=(TextView)findViewById(R.id.activity_login_loginbtn);
        help_btn.setOnClickListener(this);
        login_btn.setOnClickListener(this);
    }

}
