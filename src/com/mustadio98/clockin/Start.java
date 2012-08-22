package com.mustadio98.clockin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Start extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        View startButton = findViewById(R.id.startBtn);
        startButton.setOnClickListener(this);     
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i;
		switch (v.getId()) {
		case R.id.startBtn:
			i= new Intent(this, MainActivity.class);
			startActivity(i);
			break;
		}
		
	}

}
