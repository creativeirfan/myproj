package com.example.thjack;

import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.util.*;

public class Theme extends Activity{
	private static final int SELECT_PICTURE = 1;
	 
	private String selectedImagePath;
	private ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_theme);
		 img = (ImageView)findViewById(R.id.imageView1);

		    ((Button) findViewById(R.id.button1))
		            .setOnClickListener(new OnClickListener() {
		                public void onClick(View arg0) {
		                    Intent intent = new Intent();
		                    intent.setType("image/*");
		                    intent.setAction(Intent.ACTION_GET_CONTENT);
		                    startActivityForResult(Intent.createChooser(intent,"Select Picture"), SELECT_PICTURE);
		                }
		            });
	}

	@SuppressWarnings("deprecation")
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (resultCode == RESULT_OK) {
	        if (requestCode == SELECT_PICTURE) {
	            Uri selectedImageUri = data.getData();
	            selectedImagePath = getPath(selectedImageUri);
	            //System.out.println("Image Path : " + selectedImagePath);
	          /*  View ll=findViewById(R.layout.activity_theme);
	            Bitmap bitmap = BitmapFactory.decodeFile(selectedImagePath); // your image file stream from a path
	            BitmapDrawable bg = new BitmapDrawable(bitmap);
	            ll.setBackgroundDrawable(bg);*/
	            img.setImageURI(selectedImageUri);
	        }
	    }
	}

	public String getPath(Uri uri) {
	    String[] projection = { MediaStore.Images.Media.DATA };
	    Cursor cursor = managedQuery(uri, projection, null, null, null);
	    int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
	    cursor.moveToFirst();
	    return cursor.getString(column_index);
	}

	

}
