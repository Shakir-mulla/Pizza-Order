package com.example.pizzaorder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
RadioGroup radioGroup;
RadioButton radioButton,r1,r2,r3;
CheckBox c1,c2,c3;
TextView textView,tv;
EditText ds;
String dsval;
Button buttonApply;
public int a=30;
public int b=40;
public int c=50;
public int sum=30;
public int rsum;
public int tsum;
public int x=200;
public int y=300;
public int z=500;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
		r1=(RadioButton)findViewById(R.id.radio_1);
		r2=(RadioButton)findViewById(R.id.radio_2);
		r3=(RadioButton)findViewById(R.id.radio_3);
		textView=(TextView)findViewById(R.id.text_view_selected);
		tv=(TextView)findViewById(R.id.textView1);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);
		buttonApply=(Button)findViewById(R.id.button1);
		ds=(EditText)findViewById(R.id.editText1);
		buttonApply.setOnClickListener(new OnClickListener() {
			@overide
			public void onClick(View v) {
				if (r1.isChecked()){
					rsum=x;
				}
				else if(r2.isChecked()){
					rsum=y;
				}
				else if(r3.isChecked()){
					rsum=z;
				};
				
				if(c1.isChecked())
				    {
					if(c2.isChecked()&&c3.isChecked())
					{
						sum=(a+b)+c;
					}
					else if(c2.isChecked())
					{
						sum=a+b;
					}
					else if(c3.isChecked())
					{
						sum=a+c;
					}
					else
						sum=a;
				    }
					else if (c2.isChecked())
					{
						if(c3.isChecked())
						{
							sum=b+c;
						}
						else
							sum=b;
					}
					else if (c3.isChecked())
				{
					sum=c;
					}
					else
						sum=0;
					
						
					
				
				
				tsum=(sum+rsum)+50;
				tv.setText(Integer.toString(tsum));
				int radioId = radioGroup.getCheckedRadioButtonId();
				radioButton =(RadioButton)findViewById(radioId);
				
		
				
				Intent intent=new Intent(MainActivity.this,Place.class);
			startActivity(intent);
			}
		});	
	}
public void checkButton(View v){
	int radioId = radioGroup.getCheckedRadioButtonId();
	radioButton =(RadioButton)findViewById(radioId);
	
	Toast.makeText(getApplicationContext(),"Pizza Size: " + radioButton.getText(),Toast.LENGTH_SHORT).show();
}
public void check(View v){
	if(c1.isChecked())
	{
		if ((c1.isChecked() && c2.isChecked()) && c3.isChecked())
	     {
		Toast.makeText(getApplicationContext(),"All Items are added",Toast.LENGTH_LONG).show();
	     }
	else if(c2.isChecked())
		{
			Toast.makeText(getApplicationContext()," Cheese Toppings are added",Toast.LENGTH_LONG).show();
		}
	else if(c3.isChecked())
		{
			Toast.makeText(getApplicationContext(),"Cheese and Veggies are added",Toast.LENGTH_LONG).show();
		}
	else
		Toast.makeText(getApplicationContext(),"Cheese is added",Toast.LENGTH_LONG).show();
	}
	else if(c2.isChecked())
	{
		if (c3.isChecked())
		{
			Toast.makeText(getApplicationContext(),"Veggies and Toppings are added",Toast.LENGTH_LONG).show();	
		}
		else
		Toast.makeText(getApplicationContext(),"Toppings is added",Toast.LENGTH_LONG).show();
	}
	else if(c3.isChecked())
	{
		Toast.makeText(getApplicationContext(),"Veggies is added",Toast.LENGTH_LONG).show();
	}
	else
	{
		Toast.makeText(getApplicationContext(),"Plane Pizza is Added",Toast.LENGTH_LONG).show();
	}
}

public void disc(View v){
	dsval=ds.getText().toString();
	if(dsval.equals("shakir") || tsum >500)
	{
		if (r1.isChecked()){
			rsum=x;
		}
		else if(r2.isChecked()){
			rsum=y;
		}
		else if(r3.isChecked()){
			rsum=z;
		};
		
		if(c1.isChecked())
		    {
			if(c2.isChecked()&&c3.isChecked())
			{
				sum=(a+b)+c;
			}
			else if(c2.isChecked())
			{
				sum=a+b;
			}
			else if(c3.isChecked())
			{
				sum=a+c;
			}
			else
				sum=a;
		    }
			else if (c2.isChecked())
			{
				if(c3.isChecked())
				{
					sum=b+c;
				}
				else
					sum=b;
			}
			else if (c3.isChecked())
		{
			sum=c;
			}
			else {
				sum=0;
			};
			
		if (tsum > 500 && dsval.equals("shakir")){
			tsum=(sum+rsum)-100;
			tv.setText(Integer.toString(tsum));
			
			Toast.makeText(getApplicationContext(),"You got free delivery and Rs.100 of",Toast.LENGTH_LONG).show();
		}
		else if (tsum > 500){
			tsum=(sum+rsum)-50;
			tv.setText(Integer.toString(tsum));
			
			Toast.makeText(getApplicationContext(),"You got free delivery",Toast.LENGTH_LONG).show();
		}
			else {
			tsum=((sum+rsum)+50);
			tv.setText(Integer.toString(tsum));
			
			Toast.makeText(getApplicationContext(),"Coupon applyed successfully",Toast.LENGTH_LONG).show();	
		}
			
		
	}
	else
	{
		Toast.makeText(getApplicationContext(),"Invalid Coupon",Toast.LENGTH_LONG).show();
	}
}
public void offer(View v){
	Intent intent=new Intent(MainActivity.this,Offers.class);
	startActivity(intent);
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
