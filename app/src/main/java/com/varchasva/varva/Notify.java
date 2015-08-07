package com.varchasva.varva;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Notify extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notify);
	
		
		TransitionDrawable transition = (TransitionDrawable) getResources().getDrawable(R.drawable.shape);
		transition.setCrossFadeEnabled(true);
		
		((ImageView) findViewById(R.id.imageView1)).setImageDrawable(transition);
		transition.startTransition(8000);
	}

	
}
