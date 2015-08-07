package com.varchasva.varva;



import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class NewsFeed extends Activity  {

	

	
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
		setContentView(R.layout.feedlist);
		
		ListView lv = (ListView) findViewById(R.id.listView);
		List<ListViewItem> items =  new ArrayList<NewsFeed.ListViewItem>();
		items.add(new ListViewItem()
		{{
			ThumbnailResource = R.drawable.rohan;
			title = "DJ NIGHT";
			subtitle = "DJ STARRING - ROHAN KAPOOR, 18TH APRIL AT 5.00PM";
				
		}});
		
		items.add(new ListViewItem()
		{{
			ThumbnailResource = R.drawable.tbp;
			title = "STUNT SHOW";
			subtitle = "STUNT TEAM - TEAM BALANCE POINT(TBP), 17TH APRIL AT 3.00PM";
				
		}});
		
		items.add(new ListViewItem()
		{{
			ThumbnailResource = R.drawable.icon;
			title = "VARCHASVA";
			subtitle = "COLLEGE FEST IS HELD ON 17th & 18th OF APRIL";
				
		}});
		
		items.add(new ListViewItem()
		{{
			ThumbnailResource = R.drawable.a;
			title = "REGISTRAION";
			subtitle = "Online Booking of tickets will be closed on 18th of April... \nBook Fastly.. Shows are up...  ROcknRolL";
				
		}});
		
		items.add(new ListViewItem()
		{{
			ThumbnailResource = R.drawable.b;
			title = "UPDATE";
			subtitle = "Update of VARCHASVA will be done Continously till 18th of April !!!";
				
		}});
		
		items.add(new ListViewItem()
		{{
			ThumbnailResource = R.drawable.c;
			title = "DEVELOPER";
			subtitle = "Check the developer page to know more about the developers";
				
		}});
		
		
		
		CustomListViewAdapter adapter =  new CustomListViewAdapter(this, items);
		lv.setAdapter(adapter);
		
		
		
		
	}
	
	
	
	



	
	class ListViewItem
	{
		public int ThumbnailResource;
		public String title;
		public String subtitle;
	}
	
	
}
