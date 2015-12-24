package com.thjack.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LockListener extends BroadcastReceiver {
	
	public static int locktype;
	@Override
	public void onReceive(Context cxt, Intent intent) {
		// TODO Auto-generated method stub
		if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)
				|| intent.getAction().equals(Intent.ACTION_SCREEN_ON)
				|| intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
			start_lockscreen(cxt);
		}
	}

	public void start_lockscreen(Context ct){
		switch (locktype){
		case 0:{
			Intent in=new Intent(ct,Slide.class);
			ct.startActivity(in);
			break;
		}
		case 1:{
			Intent in=new Intent(ct,Pin.class);
			in.putExtra("caller","Lock");
			ct.startActivity(in);
			break;
		}
		case 2:{
			Intent in=new Intent(ct,ImagePin.class);
			ct.startActivity(in);
			break;
		}
		case 4:{
			Intent in=new Intent(ct,Color.class);
			ct.startActivity(in);
			break;
		}
		}
	}
}
