package com.example.pizzaorder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class Dominos extends Activity {

	EditText user,pass;
	String uval,pval;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dominos);
		user=(EditText)findViewById(R.id.editText1);
		pass=(EditText)findViewById(R.id.editText2);
	}

	public void login(View v){
		uval=user.getText().toString();
		pval=pass.getText().toString();
		if(uval.equals("shakir")&&pval.equals("shakir"))
		{
			Toast.makeText(getApplicationContext(),"Welcome to Domino's Pizza",Toast.LENGTH_LONG).show();
			Intent intent=new Intent(Dominos.this,Mainmenu.class);
			startActivity(intent);
		}
		else
		{
			Toast.makeText(getApplicationContext(),"Invalid User or Password",Toast.LENGTH_LONG).show();
		}
	}
	
	public void reg(View v){
		Toast.makeText(getApplicationContext(),"Register your account",Toast.LENGTH_LONG).show();
		Intent intent=new Intent(Dominos.this,Reg.class);
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_dominos, menu);
		return true;
	}

}
