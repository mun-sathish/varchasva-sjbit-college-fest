package com.varchasva.varva;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page extends Enroll {
	
    
	   @Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.page);
			
			Intent i = getIntent();
			Bundle bun = i.getExtras();
			String name = bun.getString("NAME");
			String colg = bun.getString("COLG");
			String bran = bun.getString("BRAN");
			String even = bun.getString("EVEN");
			String mob = bun.getString("MOB");
			String mail = bun.getString("MAIL");
			String dat = bun.getString("DAT");
			String pri = bun.getString("PRI");

			
			TextView student = (TextView) findViewById(R.id.textView1);
			TextView college = (TextView) findViewById(R.id.textView2);
			TextView branch = (TextView) findViewById(R.id.textView3);
			TextView event = (TextView) findViewById(R.id.textView4);
			TextView mobile = (TextView) findViewById(R.id.textView5);
			TextView email = (TextView) findViewById(R.id.textView6);
			TextView date = (TextView) findViewById(R.id.textView7);
			TextView price = (TextView) findViewById(R.id.textView8);
			
			
		    student.setText(name);
		    college.setText(colg);
		    branch.setText(bran);
		    event.setText(even);
		    mobile.setText(mob);
		    email.setText(mail);
		    date.setText(dat);
		    price.setText(pri);
			
		    Typeface sat = Typeface.createFromAsset(getAssets(), "font/Kavoon.otf");
			TextView sathish= (TextView) findViewById(R.id.developers);
			sathish.setTypeface(sat);
		   }
	   
	   public void done(View v) {

			Intent j = new Intent(getApplicationContext(), Register.class);
			startActivity(j);
			finish();
			
		}

	}


