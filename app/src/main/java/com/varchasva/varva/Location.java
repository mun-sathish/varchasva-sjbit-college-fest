package com.varchasva.varva;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Location extends Activity {
	//sjbit - 12.900135, 77.495928
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		
Intent intent=null,chooser=null;
		
		intent =new Intent(android.content.Intent.ACTION_VIEW);
		intent.setData(Uri.parse("geo:12.900135,77.495928"));
		chooser=Intent.createChooser(intent, "launch");
		startActivity(chooser);
		finish();
		
	}
	

}
