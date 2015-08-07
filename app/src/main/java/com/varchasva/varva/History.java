package com.varchasva.varva;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class History extends Activity {
	String style[] = {"","anudi.ttf", "anudrg.ttf", "bold.otf", "Carousel.ttf", "Ceviche.otf",
			"comic.otf", "destroy.ttf", "District.ttf", "fearless.ttf", "Griffin.ttf",
			"Kavoon.otf", "nosifer.ttf", "Piedra.otf", "regular.otf", "rose.ttf",
			"vitamin.ttf", "vitamin1.ttf"};


	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newsfeed);
		
		inittypeface();
	}
	private void inittypeface() {
		// TODO Auto-generated method stub
		Typeface rose = Typeface.createFromAsset(getAssets(), "font/"+style[3]);
		TextView history= (TextView) findViewById(R.id.editText1);
		history.setTypeface(rose);
		
		Typeface hiscon = Typeface.createFromAsset(getAssets(), "font/"+style[5]);
		TextView content= (TextView) findViewById(R.id.editText2);
		content.setTypeface(hiscon);
		
	}
	

}
