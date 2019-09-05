package com.example.pizzaorder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

import android.widget.Toast;

public class Burger extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_burger);
		
	}
	public void burg(View v){
			Toast.makeText(getApplicationContext(),"Non-Veg Burger is added",Toast.LENGTH_LONG).show();
		Intent intent=new Intent(Burger.this,Place.class);
		startActivity(intent);
	}
	
	public void burg1(View v){
		Toast.makeText(getApplicationContext(),"Veg Burger is added",Toast.LENGTH_LONG).show();
	Intent intent=new Intent(Burger.this,Place.class);
	startActivity(intent);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_burger, menu);
		return true;
	}

}
