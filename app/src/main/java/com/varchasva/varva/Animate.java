package com.varchasva.varva;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

public class Animate extends Activity {
	
	String style = "jokerman.ttf";
	TextView txt;
	ImageView i1;
	ImageView i2;
	ImageView i3;
	ImageView i4;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.animate);
	txt = (TextView) findViewById(R.id.textView1);
	Typeface e1 = Typeface.createFromAsset(getAssets(), "font/"+style);
	
	txt.setTypeface(e1);
	
	Thread t = new Thread() {

		public void run() {
			try {
				Thread.sleep(3500);
				//Class ourclass = Class.forName("com.example.vai.MainActivity");
				Intent i = new Intent(getApplicationContext(),About.class);
					finish();   
				//Intent i = new Intent(First.this, ourclass);
				//i.setClassName("com.example.vai", "com.example.vai.MainActivity");
				startActivity(i);
				

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};
	t.start(); 
}

@Override
public void onWindowFocusChanged(boolean hasFocus) {
	// TODO Auto-generated method stub
	super.onWindowFocusChanged(hasFocus);
	
	i1 = (ImageView) findViewById(R.id.imageView1);
	i2 = (ImageView) findViewById(R.id.imageView2);
	i3 = (ImageView) findViewById(R.id.imageView3);
	i4 = (ImageView) findViewById(R.id.imageView4);
	
	if(hasFocus)
	{
		rotate.run();
		scale.run();
	}
}


Runnable fadeIn = new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		txt.animate().setDuration(3000).withEndAction(rotate);
		
	}
};

Runnable rotate = new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		i1.animate().setDuration(4000)
			.setInterpolator(new AccelerateInterpolator())
			.rotationBy(720.0f).withEndAction(rotate);
		i2.animate().setDuration(4000)
		.setInterpolator(new AccelerateInterpolator())
		.rotationBy(720.0f).withEndAction(rotate);
		i3.animate().setDuration(4000)
		.setInterpolator(new AccelerateInterpolator())
		.rotationBy(720.0f).withEndAction(rotate);
		i4.animate().setDuration(4000)
		.setInterpolator(new AccelerateInterpolator())
		.rotationBy(720.0f).withEndAction(rotate);
	}
};


Runnable scale = new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		txt.animate().setDuration(1500).setInterpolator(new AnticipateInterpolator())
		 		.scaleXBy(0.5f).scaleYBy(0.5f).withEndAction(scales);
		
	}
};

Runnable scales = new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		txt.animate().setDuration(1500).setInterpolator(new AnticipateInterpolator())
		 		.scaleXBy(-0.5f).scaleYBy(-0.5f).withEndAction(scale);
		
	}
};



}
