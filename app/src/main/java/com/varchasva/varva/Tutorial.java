package com.varchasva.varva;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Tutorial extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial);
		
		//requestWindowFeature(Window.FEATURE_NO_TITLE);                     //tis is used to 
	     getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  //  make fullscreen
				WindowManager.LayoutParams.FLAG_FULLSCREEN);              // bfore the menu starts
	
	   
	inittypeface();
	}

	
	private void inittypeface() {
		// TODO Auto-generated method stub
		Typeface e1 = Typeface.createFromAsset(getAssets(), "font/nosifer.ttf");
		TextView event1= (TextView) findViewById(R.id.event1);
		event1.setTypeface(e1);
		
		Typeface e2 = Typeface.createFromAsset(getAssets(), "font/Kavoon.otf");
		Button event2= (Button) findViewById(R.id.event2);
		event2.setTypeface(e2);
		
	}
	
	public void finish(View v)

	{
		Intent intent = new Intent(this, Whatsnew.class);
		startActivity(intent);
		finish();
	}
	
}
