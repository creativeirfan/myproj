package com.example.thjack;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecureMe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secure_me);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secure_me, menu);
		return true;
	}

}
