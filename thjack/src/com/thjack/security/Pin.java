package com.thjack.security;

import com.example.thjack.Database;
import com.example.thjack.R;
import com.example.thjack.R.layout;
import com.example.thjack.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class Pin extends Activity {

	
	Database db;
	public String input;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pin);
		final EditText ed=(EditText)findViewById(R.id.editText1);
		ed.setRawInputType(Configuration.KEYBOARD_12KEY);
		
		
		 input=ed.getText().toString(); 
		ed.setOnEditorActionListener(new OnEditorActionListener() {

			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				// TODO Auto-generated method stub
				boolean handled = false;
		        if (actionId == EditorInfo.IME_ACTION_SEND) {
		        	String ins=getIntent().getStringExtra("caller");
		        	if(ins.equals("Security")){
		        	exit();
		            handled = true;}
		        }
		        return handled;
			}
		});
		
	}
public void exit(){
	int a=db.insert(input);
	if(a==1){
		Toast.makeText(getApplicationContext(), "sucesss", Toast.LENGTH_LONG).show();
	}
	this.finish();
} 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pin, menu);
		return true;
	}

}
