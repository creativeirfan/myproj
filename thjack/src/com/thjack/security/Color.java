package com.thjack.security;

import com.example.thjack.R;
import com.example.thjack.R.layout;
import com.example.thjack.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Color extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.color, menu);
		return true;
	}

}
