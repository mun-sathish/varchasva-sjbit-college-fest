package com.varchasva.varva;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	
	String events[] = { "NewsFeed","Register","Rules","Coordinators", "Dance", 
			"Quiz", "Sports","Gaming","Art", "Informal","BigEvents",
			"Location","Sponsors", "Developers"  };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);                     //tis is used to 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  //  make fullscreen
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//setContentView(R.layout.activity_main);
	
		setListAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, events));
	
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		try
		{
           // down... a method or way to start an activity too
			String cheese = events[position];
			Class ourclass = Class.forName("com.varchasva.varva." + cheese);
		   Intent ourintent = new Intent(MainActivity.this, ourclass);
           startActivity(ourintent);
	    }
		catch(ClassNotFoundException e)
		{
			 e.printStackTrace();
		}

	
	}

	
}
