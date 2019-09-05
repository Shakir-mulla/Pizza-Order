package com.example.pizzaorder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Mainmenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainmenu);
	}
	public void pizz(View v){
		Intent intent=new Intent(Mainmenu.this,MainActivity.class);
		startActivity(intent);
	}
	
	public void burg(View v){
		Intent intent=new Intent(Mainmenu.this,Burger.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_mainmenu, menu);
		return true;
	}

}
