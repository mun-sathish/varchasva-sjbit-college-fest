package com.varchasva.varva;







import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class About extends Activity implements
		NavigationDrawerFragment.NavigationDrawerCallbacks {
	
	
	

	
	
	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private NavigationDrawerFragment mNavigationDrawerFragment;

	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */
	private CharSequence mTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.drawer1);
		
		
	/*	AlertDialog.Builder alert = new AlertDialog.Builder(this);

		alert.setTitle("VARCHASVA");

		alert.setMessage("Use the top Left Menu to traverse through the Application.");
		alert.setPositiveButton("OK", null);
	//	AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(null);
final AlertDialog alertDialog = alert.create();

alertDialog.show(); */
		
		
		//inittypeface();
		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mTitle = getTitle();
		
		// Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	
	
	//	
		
	}
	
	
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasFocus);
	
		if(hasFocus)
		{
			Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
		            .getBoolean("isFirstRun", true);

		    if (isFirstRun) {
		        //show start activity

		        startActivity(new Intent(About.this, Tutorial.class));
		        Toast.makeText(About.this, "Please Read Once", Toast.LENGTH_LONG)
		                .show();
		    }


		       getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
		                .putBoolean("isFirstRun", false).commit();
		}	
/*
		
		
	*/	
	}
	
	private static final int TIME_INTERVAL = 1000; // # milliseconds, desired time passed between two back presses.
	private long mBackPressed;

	@Override
	public void onBackPressed()
	{
	    if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) 
	    { 
	        super.onBackPressed(); 
	       
	        return;
	    }
	    else { Toast.makeText(getBaseContext(), "Leaving Us? :( Press Again", Toast.LENGTH_SHORT).show(); }

	    mBackPressed = System.currentTimeMillis();
	}
	
	
	@Override
	public void onNavigationDrawerItemSelected(int position) {
		// update the main content by replacing fragments
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager
				.beginTransaction()
				.replace(R.id.container,
						PlaceholderFragment.newInstance(position + 1)).commit();
	}

	public void onSectionAttached(int number) {
		switch (number) {
		case 1:
			mTitle = getString(R.string.title_section1);
			
			break;
		case 2:
			mTitle = getString(R.string.title_section1);
			Intent b = new Intent(getApplicationContext(),First.class);
			startActivity(b);
			break;
		
		
		case 3:
			mTitle = getString(R.string.title_section1);
			Intent i = new Intent(getApplicationContext(),NewsFeed.class);
			startActivity(i);
			
			break;
		case 4:
			mTitle = getString(R.string.title_section1);
			Intent j = new Intent(getApplicationContext(),Register.class);
			startActivity(j);
			break;
			
		case 5:
			mTitle = getString(R.string.title_section1);
			Intent k = new Intent(getApplicationContext(),Rules.class);
			startActivity(k);
			break;
		case 6:
			mTitle = getString(R.string.title_section1);
			//Toast.makeText(getApplicationContext(), "Check Back Soon... Not updated!!!", Toast.LENGTH_LONG).show();
			Intent q = new Intent(getApplicationContext(),Coordinators.class);
			startActivity(q);
			break;
		case 7:
			mTitle = getString(R.string.title_section1);
			Intent w = new Intent(getApplicationContext(),Dance.class);
			startActivity(w);
			break;
		case 8:
			mTitle = getString(R.string.title_section1);
			Intent z = new Intent(getApplicationContext(),Music.class);
			startActivity(z);
			break;
		case 9:
			mTitle = getString(R.string.title_section1);
			Intent r = new Intent(getApplicationContext(),Sports.class);
			startActivity(r);
			break;
		case 10:
			mTitle = getString(R.string.title_section1);
			Intent t = new Intent(getApplicationContext(),Gaming.class);
			startActivity(t);
			break;
		case 11:
			mTitle = getString(R.string.title_section1);
			Intent y = new Intent(getApplicationContext(),Art.class);
			startActivity(y);
			break;
		case 12:
			mTitle = getString(R.string.title_section1);
			Intent u = new Intent(getApplicationContext(),Quiz.class);
			startActivity(u);
			break;
		case 13:
			mTitle = getString(R.string.title_section1);
			Intent o = new Intent(getApplicationContext(),BigEvents.class);
			startActivity(o);
			break;
		case 14:
			mTitle = getString(R.string.title_section1);
			Intent a = new Intent(getApplicationContext(),Informal.class);
			startActivity(a);
			break;
		case 15:
			mTitle = getString(R.string.title_section1);
			//Toast.makeText(getApplicationContext(), "Check Back Soon... Not updated!!!", Toast.LENGTH_LONG).show();
			Intent s= new Intent(getApplicationContext(),Sponsor.class);
			startActivity(s);
			break;
		case 16:
			mTitle = getString(R.string.title_section1);
			Intent d = new Intent(getApplicationContext(),Location.class);
			startActivity(d);
			break;
			
		case 17:
			mTitle = getString(R.string.title_section1);
			Intent v = new Intent(getApplicationContext(),Developers.class);
			startActivity(v);
			break;
		
				
	
		}
	}

	public void restoreActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setTitle(mTitle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		if (!mNavigationDrawerFragment.isDrawerOpen()) {
			// Only show items in the action bar relevant to this screen
			// if the drawer is not showing. Otherwise, let the drawer
			// decide what to show in the action bar.
			getMenuInflater().inflate(R.menu.global, menu);
			restoreActionBar();
			return true;
		}
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.about, container,
					false);
			
			return rootView;
		}

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			((About) activity).onSectionAttached(getArguments().getInt(
					ARG_SECTION_NUMBER));
		}
	}

	

}
