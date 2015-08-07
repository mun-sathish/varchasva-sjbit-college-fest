
	
	
	
	
	
	
	
	
	
	

package com.varchasva.varva;







import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Western extends Activity implements
		NavigationDrawerFragment.NavigationDrawerCallbacks {
	
	
	
	
	static String style[] = {"","anudi.ttf", "anudrg.ttf", "bold.otf", "Carousel.ttf", "Ceviche.otf",
			"comic.otf", "destroy.ttf", "District.ttf", "fearless.ttf", "Griffin.ttf",
			"Kavoon.otf", "nosifer.ttf", "Piedra.otf", "regular.otf", "rose.ttf",
			"vitamin.ttf", "vitamin1.ttf","roboto.ttf","jokerman.ttf"};
	
	
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
		
		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mTitle = getTitle();
		
		// Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	
	
		
		
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
			//mTitle = "DANCE";
			
			break;
		case 2:
			//mTitle = getString(R.string.title_section17);
			Intent b = new Intent(getApplicationContext(),First.class);
			startActivity(b);
			
			break;
		
		
		case 3:
			//mTitle = getString(R.string.title_section2);
			Intent i = new Intent(getApplicationContext(),NewsFeed.class);
			startActivity(i);
			
			break;
		case 4:
			//mTitle = getString(R.string.title_section3);
			Intent j = new Intent(getApplicationContext(),Register.class);
			startActivity(j);
			break;
			
		case 5:
			//mTitle = getString(R.string.title_section4);
			Intent k = new Intent(getApplicationContext(),Rules.class);
			startActivity(k);
			break;
		case 6:
			//mTitle = getString(R.string.title_section5);
			//Toast.makeText(getApplicationContext(), "Check Back Soon... Not updated!!!", Toast.LENGTH_LONG).show();
			Intent q = new Intent(getApplicationContext(),Coordinators.class);
			startActivity(q);
			break;
		case 7:
			//mTitle = getString(R.string.title_section6);
			Intent l = new Intent(getApplicationContext(),Dance.class);
			startActivity(l);
			break;
		case 8:
			//mTitle = getString(R.string.title_section7);
			Intent z = new Intent(getApplicationContext(),Music.class);
			startActivity(z);
			break;
		case 9:
			//mTitle = getString(R.string.title_section8);
			Intent r = new Intent(getApplicationContext(),Sports.class);
			startActivity(r);
			break;
		case 10:
			//mTitle = getString(R.string.title_section9);
			Intent t = new Intent(getApplicationContext(),Gaming.class);
			startActivity(t);
			break;
		case 11:
			//mTitle = getString(R.string.title_section10);
			Intent y = new Intent(getApplicationContext(),Art.class);
			startActivity(y);
			break;
		case 12:
			//mTitle = getString(R.string.title_section11);
			Intent u = new Intent(getApplicationContext(),Quiz.class);
			startActivity(u);
			break;
		case 13:
			//mTitle = getString(R.string.title_section12);
			Intent o = new Intent(getApplicationContext(),BigEvents.class);
			startActivity(o);
			break;
		case 14:
			//mTitle = getString(R.string.title_section13);
			Intent a = new Intent(getApplicationContext(),Informal.class);
			startActivity(a);
			break;
		case 15:
			//mTitle = getString(R.string.title_section14);
			//Toast.makeText(getApplicationContext(), "Check Back Soon... Not updated!!!", Toast.LENGTH_LONG).show();
			Intent s= new Intent(getApplicationContext(),Sponsor.class);
			startActivity(s);
			break;
		case 16:
			//mTitle = getString(R.string.title_section15);
			Intent d = new Intent(getApplicationContext(),Location.class);
			startActivity(d);
			break;
			
		case 17:
			//mTitle = getString(R.string.title_section16);
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
			View r = inflater.inflate(R.layout.western, container,
					false);
			Typeface e1 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[19]);
			TextView event1= (TextView) r.findViewById(R.id.event1);
			event1.setTypeface(e1);
			Typeface e2 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[11]);
			TextView event2= (TextView) r.findViewById(R.id.event2);
			event2.setTypeface(e2);
			Typeface e3 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[19]);
			TextView event3= (TextView) r.findViewById(R.id.event3);
			event3.setTypeface(e3);
			
			Typeface e4 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[11]);
			TextView event4= (TextView) r.findViewById(R.id.event4);
			event4.setTypeface(e4);
			Typeface e5 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[19]);
			TextView event5= (TextView) r.findViewById(R.id.event5);
			event5.setTypeface(e5);  
			Typeface e6 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[11]);
			TextView event6= (TextView) r.findViewById(R.id.event6);
			event6.setTypeface(e6);
			Typeface e7 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[19]);
			TextView event7= (TextView) r.findViewById(R.id.event7);
			event7.setTypeface(e7);
			Typeface e8 = Typeface.createFromAsset(getActivity().getAssets(), "font/"+style[11]);
			TextView event8= (TextView) r.findViewById(R.id.event8);
			event8.setTypeface(e8);
			
			
			
			
			
			
			return r;
		}

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			((Western) activity).onSectionAttached(getArguments().getInt(
					ARG_SECTION_NUMBER));
		}
	}

	
	
	
	
	
	
	
	
}
