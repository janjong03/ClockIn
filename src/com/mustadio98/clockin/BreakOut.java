package com.mustadio98.clockin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BreakOut extends Activity implements OnClickListener {
RadioButton rbtn15;
RadioButton rbtn30;
RadioButton rbtn60;
Button submit;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.break_out);
		rbtn15= (RadioButton)findViewById(R.id.rbtn15);
		rbtn30=(RadioButton)findViewById(R.id.rbtn30);
		rbtn60=(RadioButton)findViewById(R.id.rbtn60);
		submit=(Button)findViewById(R.id.btnSubmit);
		submit.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnSubmit:
			Toast a = Toast.makeText(getApplicationContext(), "To be Implemented", Toast.LENGTH_SHORT);
			a.show();
			break;

		default:
			break;
		}
		
	}
}
