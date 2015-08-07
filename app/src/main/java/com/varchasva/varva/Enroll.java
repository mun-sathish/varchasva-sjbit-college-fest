package com.varchasva.varva;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Enroll extends Activity implements OnItemSelectedListener{
	
	String name ;
	String colg;
	String bran;
	String even;
	String mob;
	String mail;
	String dat;
	String pri ;
	
	
      Spinner spin;
      Spinner spin1;
      Spinner spin2;
      TextView price;
      EditText student;
      EditText college;
      EditText mobile;
      EditText email;    
    
      
      NotificationManager nm;
      static final int id = 234;
      
 	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.enroll);
		
		
		nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		
		
		
		ConnectivityManager cman = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
		NetworkInfo ninfo = cman.getActiveNetworkInfo();
		if(ninfo != null && ninfo.isConnected())
		{
			
		}
		else
		{
			Toast.makeText(getApplicationContext(), "     Internet is needed for \nREGISTRATION OF TICKETS", Toast.LENGTH_SHORT).show();
			finish();
		}
		
		
		
		price=(TextView)findViewById(R.id.pricers);
	    spin=(Spinner) findViewById(R.id.Branch);
	    spin1=(Spinner) findViewById(R.id.event);
	    spin2=(Spinner) findViewById(R.id.date);
		ArrayAdapter adapter=ArrayAdapter.createFromResource(this, R.array.branch,android.R.layout.simple_spinner_dropdown_item);
		
		ArrayAdapter adapter1=ArrayAdapter.createFromResource(this, R.array.event,android.R.layout.simple_spinner_dropdown_item);
		
		ArrayAdapter adapter2=ArrayAdapter.createFromResource(this, R.array.date,android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(adapter);
		spin1.setAdapter(adapter1);
		spin2.setAdapter(adapter2);
		spin.setOnItemSelectedListener(this);
		spin1.setOnItemSelectedListener(this);
		spin2.setOnItemSelectedListener(this);
        student= (EditText) findViewById(R.id.student);
        college= (EditText) findViewById(R.id.college);
        mobile= (EditText) findViewById(R.id.mobile);
        email= (EditText) findViewById(R.id.email);
		
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) 
	{
		String value=spin1.getSelectedItem().toString();
		
	
		if(new String("CALL OF DUTY 4 (GAMING)").equals(value))
		{
			price.setText("200");
		}
		if(new String("ADAPTIVE SOLO DANCE (DANCE)").equals(value))
		{
			price.setText("200");
		}
		if(new String("BATTLE OF THE BANDS (MUSIC)").equals(value))
		{
			price.setText("500");
		}
		
		if(new String("GROUP DANCE EASTERN (DANCE)").equals(value))
		{
			price.setText("400");
		}
		if(new String("GROUP DANCE WESTERN (DANCE)").equals(value))
		{
			price.setText("400");
		}
		
		if(new String("JODI NO 1 (DANCE)").equals(value))
		{
			price.setText("300");
		}
		
		if(new String("SOLO DANCE NON-CLASSICAL (DANCE)").equals(value))
		{
			price.setText("200");
		}
		
		if(new String("SUDOKU (MIND TALENTED)").equals(value))
		{
			price.setText("50");
		}
		
		if(new String("CREATIVE WRIING (MIND TALENTED)").equals(value))
		{
			price.setText("50");
		}
		
		if(new String("QUIZ BENGALURU (MIND TALENTED)").equals(value))
		{
			price.setText("100");
		}
		if(new String("QUIZ GENERAL (MIND TALENTED)").equals(value))
		{
			price.setText("50");
		}
		if(new String("TREASURE HUNT (MIND TALENTED)").equals(value))
		{
			price.setText("100");
		}
		if(new String("DUMB CHARADES (INFORMAL)").equals(value))
		{
			price.setText("60");
		}
		if(new String("MAD ADS (INFORMAL)").equals(value))
		{
			price.setText("300");
		}
		if(new String("COLLAGE (INFORMAL)").equals(value))
		{
			price.setText("100");
		}
		if(new String("FILMY FUNDA (INFORMAL)").equals(value))
		{
			price.setText("150");
		}
		if(new String("ANTAKSHARI (INFORMAL)").equals(value))
		{
			price.setText("60");
		}
		if(new String("SLOW DRAG RACE (INFORMAL)").equals(value))
		{
			price.setText("50");
		}
		if(new String("HOGATHON (INFORMAL)").equals(value))
		{
			price.setText("50");
		}
		if(new String("MINI CRICKET (SPORTS)").equals(value))
		{
			price.setText("300");
		}
		if(new String("MINI SOCCER (SPORTS)").equals(value))
		{
			price.setText("300");
		}
		if(new String("MINI VOLLEYBALL (SPORTS)").equals(value))
		{
			price.setText("200");
		}
		if(new String("MINI BASKETBALL (SPORTS)").equals(value))
		{
			price.setText("200");
		}
		if(new String("LAGORI (SPORTS)").equals(value))
		{
			price.setText("100");
		}
		if(new String("TUG OF WAR (SPORTS)").equals(value))
		{
			price.setText("70");
		}
		if(new String("COUNTER STRIKE (GAMING)").equals(value))
		{
			price.setText("200");
		}
		if(new String("NFS MOST WANTED (GAMING)").equals(value))
		{
			price.setText("50");
		}
		if(new String("DOTA 2 (GAMING)").equals(value))
		{
			price.setText("250");
		}
		if(new String("FIFA (GAMING)").equals(value))
		{
			price.setText("50");
		}
		if(new String("ROAD RASH FOR GIRLS (GAMING)").equals(value))
		{
			price.setText("50");
		}
		if(new String("SPOT CLICK (GAMING)").equals(value))
		{
			price.setText("50");
		}
		if(new String("RANGOLI (ART)").equals(value))
		{
			price.setText("50");
		}
		
		if(new String("MEHANDI (ART)").equals(value))
		{
			price.setText("50");
		}
		if(new String("SKETCHING (ART)").equals(value))
		{
			price.setText("50");
		}
		if(new String("FACE PAINTING (ART)").equals(value))
		{
			price.setText("50");
		}
		if(new String("INSTRUMENTAL SOLO PERCUSSION (MUSIC)").equals(value))
		{
			price.setText("50");
		}
		if(new String("INSTRUMENTAL SOLO NON-PERCUSSION (MUSIC)").equals(value))
		{
			price.setText("50");
		}
		
		if(new String("LIGHT VOCALS SOLO (MUSIC)").equals(value))
		{
			price.setText("50");
		}
		if(new String("FASHION SHOW (BIG EVENTS)").equals(value))
		{
			price.setText("1500");
		}
		//if(new String("KTM STUNT SHOW (BIG EVENTS)").equals(value))
	//	{
	//		price.setText("3800");
	//	}
		if(new String("STREET DANCE (BIG EVENTS)").equals(value))
		{
			price.setText("500");
		}
		
		
		
		
	//Toast.makeText(this,"youselected"+vi.getText(),Toast.LENGTH_LONG).show();	
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	
   public void reset(View v)
   {
	   
	   ((EditText) findViewById(R.id.student)).setText("");
	   ((EditText) findViewById(R.id.college)).setText(""); 
	   ((EditText) findViewById(R.id.mobile)).setText(""); 
	   ((EditText) findViewById(R.id.email)).setText(""); 
	   
   }
  
   @SuppressWarnings("deprecation")
public void submit(View v)
   {
	   
	   
	   
	   
	   
	   if(student.getText().toString().trim().equals(""))
	   {
		   student.setError("Student name is required!");
		   Toast.makeText(getApplicationContext(), "Some Fields are Empty" , 6000).show();
		      
	   }
	   else if(college.getText().toString().trim().equals(""))
	   {
		   college.setError("College name is required!");
		   Toast.makeText(getApplicationContext(), "Some Fields are Empty" , 6000).show();
		   
	   }
	   else if(mobile.getText().toString().trim().equals(""))
	   {
		   Toast.makeText(getApplicationContext(), "Some Fields are Empty" , 6000).show();
		   mobile.setError("Mobile NO is required!");
	   }
	   else if(email.getText().toString().trim().equals(""))
	   {
		   Toast.makeText(getApplicationContext(), "Some Fields are Empty" , 6000).show();
		   email.setError("Email is required!");
	   }
	   else
	   {
		   
		   ConnectivityManager cman = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
			NetworkInfo ninfo = cman.getActiveNetworkInfo();
			if(ninfo != null && ninfo.isConnected())
		{
		   
		   Intent intent = new Intent(this, Notify.class);
		   
		   PendingIntent pi = PendingIntent.getActivity(this, 0, intent, 0);
		   String body = "Email Has Been Sent-THANK YOU";
		   String Title = "HIT ME!! - VARCHASVA";
		   Notification n = new Notification(R.drawable.a, body, System.currentTimeMillis());
		   n.setLatestEventInfo(this, Title, body, pi);
		   n.defaults = Notification.DEFAULT_ALL;
		   nm.notify(id,n);
		   
		   
		   
		   		finish();
				 new AddData().execute();	
				 Toast.makeText(getApplicationContext(), "Enrollment of Ticket is DONE!!!\n               (: HAV FUN :)" , Toast.LENGTH_LONG).show();
		    	   
				   name = student.getText().toString();
					 colg = college.getText().toString();
					 bran= spin.getSelectedItem().toString();
					 even=spin1.getSelectedItem().toString();
					 mob=mobile.getText().toString();
					 mail=email.getText().toString();
					 dat=spin2.getSelectedItem().toString();
					 pri = price.getText().toString();
				   
				   
						Intent i = new Intent(getApplicationContext(), Page.class);
						i.putExtra("NAME", name);
						i.putExtra("COLG", colg);
						i.putExtra("BRAN", bran);
						i.putExtra("EVEN", even);
						i.putExtra("MOB", mob);
						i.putExtra("MAIL", mail);
						i.putExtra("DAT", dat);
						i.putExtra("PRI", pri);
				          startActivity(i);
					
			}
			else
			{
				Toast.makeText(getApplicationContext(), "     Internet is needed for \nREGISTRATION OF TICKETS", Toast.LENGTH_SHORT).show();
				
		}
			
		   
		  
			   
		   
		
		   
	   }
   }

   
   /**
    * Background Async Task to Create new product
    * */
   class AddData extends AsyncTask<String, String, String> {

       /**
        * Before starting background thread Show Progress Dialog
        * */
	   ProgressDialog pDialog;
	   String url = "";
       @Override
       protected void onPreExecute() {
           super.onPreExecute();
           pDialog = new ProgressDialog(Enroll.this);
           pDialog.setMessage("Registerting Ticket..\nPlease Wait");
           pDialog.setIndeterminate(false);
           pDialog.setCancelable(true);
           pDialog.show();
       }

		@Override
		protected String doInBackground(String... params) 
		{
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse response;
			JSONObject noticeDetailsJson = new JSONObject();
			
			JSONArray noticeJsonArray1 = new JSONArray();
			Log.i("DoInBg :", "array json object created");
			
			 name = student.getText().toString();
			 colg = college.getText().toString();
			 bran= spin.getSelectedItem().toString();
			 even=spin1.getSelectedItem().toString();
			 mob=mobile.getText().toString();
			 mail=email.getText().toString();
			 dat=spin2.getSelectedItem().toString();
			 pri = price.getText().toString();
			try {
				noticeDetailsJson.put("name", name);
				
				noticeDetailsJson.put("colg", colg);
				noticeDetailsJson.put("bran", bran);
				noticeDetailsJson.put("even", even);
				noticeDetailsJson.put("mob", mob);
				noticeDetailsJson.put("mail", mail);
				noticeDetailsJson.put("dat", dat);
				noticeDetailsJson.put("pri", pri);
				noticeJsonArray1.put(noticeDetailsJson);
				
				Log.i("DoInBg :", "jsonarray values put");
				// POSTING DATA TO PHP MYSQL 	
					HttpPost post2 = new HttpPost("http://www.shivshakticoal.in/varva/enroll.php");
					Log.i("DoInBg :", "url set");
					List<NameValuePair> nVP1 = new ArrayList<NameValuePair>(1);
					
					nVP1.add(new BasicNameValuePair("json2", noticeJsonArray1.toString()));  //Json is the JSON input
					
					Log.i("DoInBg :", "NVP set");
					Log.i("noticeJsonArray", noticeJsonArray1.toString());
					
					UrlEncodedFormEntity entity = new UrlEncodedFormEntity(nVP1);
					post2.setEntity(entity);
					
					response = httpClient.execute(post2);
					Log.i("DoInBg :", "httpclient executed");
				
					}catch(Exception e){
						e.printStackTrace();
					}
			
			return null;
		}

       /**
        * After completing background task Dismiss the progress dialog
        * **/
       protected void onPostExecute() {
           // dismiss the dialog once done
    	   pDialog.dismiss();
           
       }

   }
}
   
