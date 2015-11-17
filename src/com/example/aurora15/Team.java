package com.example.aurora15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Team extends Activity implements OnItemClickListener {
	
    String[] NAMES = new String[] {
    		"amit",
			"ayush",
			"ayushmba",
			"kk",
			"mukesh",
			"nikhil",
			"nimiya",
			"sahil"
    };
    String[] phone = new String[] {
    		"9826779645",
			"1826779645",
			"2826779645",
			"3826779645",
			"4826779645",
			"5826779645",
			"6826779645",
			"7826779645"
    };
    
    int[] IMAGE = new int[]{
    		 R.drawable.amit,
			 R.drawable.ayush,
			 R.drawable.ayushmba,
			 R.drawable.kk,
			 R.drawable.mukesh,
			 R.drawable.nikhil,
			 R.drawable.nimiya,
			 R.drawable.sahil
    };
	
    String[] WORK = new String[]{
    	"EMT",
    	"EMT",
    	"COORDINATOR",
    	"EMT",
    	"COORDINATOR ",
    	"EMT ",
    	"EMT",
    	"COORDINATOR",
 
    };
    
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
      
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        
        
        for(int i=0;i<8;i++){
        	HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "NAME : " + NAMES[i]);
            hm.put("cur","DESCRIPTION : " + WORK[i]);
            hm.put("flag", Integer.toString(IMAGE[i]) );            
            aList.add(hm);        
        }
        
        String[] from = { "flag","txt","cur" };
        
        int[] to = { R.id.flag,R.id.txt,R.id.cur};        
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout, from, to);
        ListView listView = ( ListView ) findViewById(R.id.listview);
        listView.setBackgroundResource(R.layout.coustomshape);
        listView.setAdapter(adapter);     
        listView.setOnItemClickListener(this);
       
    }
    
    
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
      long id) {

    	Intent i=new Intent(Intent.ACTION_CALL);
		Uri data1=Uri.parse("tel:"+phone[+position]);
		i.setData(data1);
		startActivity(i);
  
    }
}