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
	}
	
	private String[] mAlphabet={
			 "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u","v","x","y","z"};
	 private String[] mStrings={
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=a",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=b",
			 "http://mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=c",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=d",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=e",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=f",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=g",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=h",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=i",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=j",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=k",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=l",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=m",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=n",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=o",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=p",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=q",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=r",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=s",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=t",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=u",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=v",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=x",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=y",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=z"
			 };
}
