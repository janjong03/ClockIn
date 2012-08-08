package com.mustadio98.clockin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.mustadio98.clockin.database.Clock;

import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Clock clock=new Clock();
	TextView startText;
	TextView endText;
	TextView total;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startText=(TextView)findViewById(R.id.txtStartTime);
        endText=(TextView)findViewById(R.id.txtEndTime);
        total=(TextView)findViewById(R.id.txtTotal);        
        
        final ActionBar actionBar=getActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater=getMenuInflater();
    	inflater.inflate(R.menu.activity_main, menu);
//        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
    	
    	Intent i;
    	switch(item.getItemId()){  	
    	case android.R.id.home:
    		i= new Intent(getApplicationContext(),Start.class);
        	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        	startActivity(i);
    		return true;
    	case R.id.clock_in:
    		if(clock.getClockIn()==null){  			
    		Date calendar=new Date();
    		String time=dateFormat.format(calendar);
    		clock.setClockIn(calendar);
    		if(clock.getClockOut()!=null){
    			clock.setClockOut(null);
    		}
    		startText.setText(time);
    		}
    		else{
    			Toast a=Toast.makeText(getApplicationContext(), "You already clocked in", Toast.LENGTH_SHORT);
    			a.show();
    		}
//    		Toast a=Toast.makeText(getApplicationContext(), calendar.getTime()+"", Toast.LENGTH_SHORT);
//    		a.show();
    		return true;
    	case R.id.breakout:
    		Toast a=Toast.makeText(getApplicationContext(), "To Be Implemeted", Toast.LENGTH_SHORT);
    		a.show();
    		return true;
    	case R.id.clockout:
    		if(clock.getClockOut()==null && clock.getClockIn()!=null){
    			Date calendar=new Date();
    			String time=dateFormat.format(calendar);
    			clock.setClockOut(calendar);
    			if(clock.getClockIn()!=null){
    				clock.setClockIn(null);
    			}
    			endText.setText(time);
//    			startText.setText(null);
//    			endText.setText(null);
//    			total.setText(String.valueOf(clock.getTotalTime()));
    		}
    		else if(clock.getClockOut()==null && clock.getClockOut()==null){
    			Toast b=Toast.makeText(getApplicationContext(), "Please Clock In First", Toast.LENGTH_SHORT);
        		b.show();
    		}
    		else{
    			Toast b=Toast.makeText(getApplicationContext(), "You already clocked out", Toast.LENGTH_SHORT);
    			b.show();
    		}
    		return true;
    	case R.id.menu_settings:
    		i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=dQw4w9WgXcQ"));
    		startActivity(i);
    		return true;
    	default:
    		return super.onOptionsItemSelected(item);
    	}
    	
    }
   
    
}
