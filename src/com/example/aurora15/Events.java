package com.example.aurora15;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

/**
 * Created by Geek on 01-11-2014.
 */
public class Events extends Fragment {
    ImageButton corna,parivesh,auroraidol,dance,mnm,streetplay,treasurehunt,lol,artmela;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	return inflater.inflate(R.layout.events,container,false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onActivityCreated(savedInstanceState);
    	 corna=(ImageButton)getActivity().findViewById(R.id.corna);
         corna.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Corna.class);
                startActivity(i);
             }
         });
         parivesh=(ImageButton)getActivity().findViewById(R.id.parivesh);
         parivesh.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Parivesh.class);
                startActivity(i);
             }
         });
         auroraidol=(ImageButton)getActivity().findViewById(R.id.auroraidol);
         auroraidol.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Aurora_Idol.class);
                startActivity(i);
             }
         });
         dance=(ImageButton)getActivity().findViewById(R.id.dance);
         dance.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Dance_Carnival.class);
                startActivity(i);
             }
         });
         mnm=(ImageButton)getActivity().findViewById(R.id.mnm);
         mnm.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),MNM.class);
                startActivity(i);
             }
         });
         streetplay=(ImageButton)getActivity().findViewById(R.id.streetplay);
         streetplay.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Street_Play.class);
                startActivity(i);
             }
         });
         treasurehunt=(ImageButton)getActivity().findViewById(R.id.treasurehunt);
         treasurehunt.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Phoenix.class);
                startActivity(i);
             }
         });
         lol=(ImageButton)getActivity().findViewById(R.id.lol);
         lol.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Laugh_Out_Loud.class);
                startActivity(i);
             }
         });
         artmela=(ImageButton)getActivity().findViewById(R.id.artmela);
         artmela.setOnClickListener(new OnClickListener(){
             public void onClick(View v)
             {
                 Intent i;
                 i=new Intent(getActivity(),Art_Mela.class);
                startActivity(i);
             }
         });



    }


}
