package com.example.pizzaorder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Place extends Activity {
TextView tv,t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_place);
		t=(TextView)findViewById(R.id.textView1);
		tv=(TextView)findViewById(R.id.textView2);
	}
	public void done(View v){
		tv.setText("Order placed Succussfully");
		t.setText("Order Placed");
		Toast.makeText(getApplicationContext(),"Thanks for shopping with us",Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_place, menu);
		return true;
	}

}
