package com.example.lazyimageloader;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity 
{
	 ListView list;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list=(ListView)findViewById(R.id.list);
		
	    LazyAdapter adapter = new LazyAdapter(this, mStrings);
	    list.setAdapter(adapter);
	}
	
	//Button listener
	public void downloadImages(View view)
	{
		list.invalidateViews();
	}
	
	private String[] mStrings={
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=a",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=b",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=c",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=d",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=e",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=f",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=g",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=h",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=i",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=j",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=k",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=l",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=m",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=n",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=o",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=p",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=q",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=r",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=s",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=t",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=u",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=v",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=x",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=y",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=z"
			 };
}
