package com.varchasva.varva;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.varchasva.varva.NewsFeed.ListViewItem;
  
public class CustomListViewAdapter extends BaseAdapter
{  
	
	LayoutInflater inflater;
	List<ListViewItem> items;
	
    public CustomListViewAdapter(Activity context, List<ListViewItem> items) {  
        super();
		
        this.items = items;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    
    @Override  
    public int getCount() {  
        // TODO Auto-generated method stub  
        return items.size();  
    }  
  
    @Override  
    public Object getItem(int position) {  
        // TODO Auto-generated method stub  
    	
        return null;  
    }  
  
    @Override  
    public long getItemId(int position) {  
        // TODO Auto-generated method stub  
    	
    	
        return 0;  
    }
      
    @Override  
    public View getView(final int position, View convertView, ViewGroup parent) {  
        // TODO Auto-generated method stub  
    	ListViewItem item = items.get(position);
    	View vi=convertView;
        
        if(convertView==null)
            vi = inflater.inflate(R.layout.item_row, null);
            
        ImageView img = (ImageView) vi.findViewById(R.id.imgThumbnail);
        TextView ttitle = (TextView) vi.findViewById(R.id.txtTitle);
          TextView tsubtitle = (TextView) vi.findViewById(R.id.txtSubTitle);
          
          img.setImageResource(item.ThumbnailResource);
          ttitle.setText(item.title);
          tsubtitle.setText(item.subtitle);
        return vi;  
    }
}