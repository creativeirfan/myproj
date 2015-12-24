package com.example.thjack;

import com.thjack.security.LockListener;
import com.thjack.security.Pin;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Security extends ListActivity {
	private static String menu[]={
		"Slide","Pin","picture password","password","Audio","color image"
	}; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_security);
		ListView ls=getListView();
	    ls.setChoiceMode(ls.CHOICE_MODE_SINGLE);
	    ls.setTextFilterEnabled(true);
	    setListAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1,menu));
	   
	}
	public void onListItemClick(ListView parent, View v,int position,long id){
    	switch (position){
    	case 0:{
    		LockListener.locktype=0;
    		finishActivity(0);
    		break;
    	}
    	case 1:{
    		LockListener.locktype=1;
    		Intent i=new Intent(this,Pin.class);
    		i.putExtra("caller", "Security");
    		startActivityForResult(i, 1);
    		break;
    	}
    	case 2:{
    		LockListener.locktype=0;
    		finishActivity(0);
    	}
    	case 3:{
    		LockListener.locktype=0;
    		finishActivity(0);
    	}
    	case 4 :{
    		
    	}
    	
    	}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.security, menu);
		return true;
	}

}

