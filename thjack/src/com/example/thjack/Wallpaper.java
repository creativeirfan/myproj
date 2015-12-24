package com.example.thjack;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Wallpaper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wallpaper);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wallpaper, menu);
		return true;
	}

}
