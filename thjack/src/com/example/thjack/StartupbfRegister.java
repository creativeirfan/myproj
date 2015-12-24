package com.example.thjack;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

public class StartupbfRegister extends ListActivity {

	private static String menulist[]={
		"Security","Theme","Wallpaper","Disable System Lock","Secureme"
	}; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startupbf_register);
        
        ListView ls=getListView();
        ls.setChoiceMode(ls.CHOICE_MODE_SINGLE);
        ls.setTextFilterEnabled(true);
        ls.setPadding(0,3, 0, 3);
        setListAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1,menulist));
        
    }

    public void onListItemClick(ListView parent, View v,int position,long id){
    	switch (position){
    	case 0:{
    		Intent i= new Intent(this,Security.class);
    		startActivity(i);
    		break;
    	}
    	case 1:{
    		Intent i= new Intent(this,Theme.class);
    		startActivity(i);
    		break;
    	}
    	case 2:{
    		Intent i= new Intent(this,Wallpaper.class);
    		startActivity(i);
    		break;
    	}
    	case 3:{
    		AlertDialog.Builder builder = new AlertDialog.Builder(this);
    		builder.setMessage("Look at this dialog!")
    		       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
    		           public void onClick(DialogInterface dialog, int id) {
    		                //do things
    		        	   KeyguardManager keyguardManager = (KeyguardManager)getSystemService(Activity.KEYGUARD_SERVICE);
    		        	   KeyguardLock lock = keyguardManager.newKeyguardLock(KEYGUARD_SERVICE);
    		        	   lock.disableKeyguard();
    		           }
    		       });
    		AlertDialog alert = builder.create();
    		alert.show();
    		break;
    	}
    	case 4:{
    		//Intent i= new Intent(this,Security.class);
    		//startActivity(i);
    		break;
    	}
    	}
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.startupbf_register, menu);
        return true;
    }
    
}
