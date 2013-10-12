package com.example.lazyimageloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity 
{
	 ListView list;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		list=(ListView)findViewById(R.id.list);
		
		// создаем адаптер
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item, mAlphabet);
	    list.setAdapter(adapter);
	}
	
	//Button listener
	public void downloadImages(View view)
	{
		for(int i=0; i <25; ++i)
		{
			DownloadImageTask task = new DownloadImageTask();
			task.execute(i);
		}
	}

	private class DownloadImageTask extends AsyncTask<Integer, Void, Bitmap> 
	{
		private Integer imageId = 0;
		@Override
		protected Bitmap doInBackground(Integer... params) 
		{
			imageId = 0;
	        if( params.length > 0 ){
	        	imageId = params[0];		    	
	        }
			String url = mStrings[imageId];

	        InputStream input = null;
	        try {
	               URL urlConn = new URL(url);
	               input = urlConn.openStream(); 
	        }
	        catch (MalformedURLException e) {
	           	e.printStackTrace();
	        }
	        catch (IOException e) {
	        	e.printStackTrace();
	        }
	        
	        return BitmapFactory.decodeStream(input);
		}
		
		@Override
	    protected void onPostExecute(Bitmap result) {
	         super.onPostExecute(result);
	         //image.setImageBitmap(result);
	         View itemView = list.getChildAt(imageId);
	         ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
	         imageView.setImageBitmap(result);
	    }
		
	}
	
	private String[] mAlphabet={
			 "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u","v","x","y","z"};
	 private String[] mStrings={
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=a",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=b",
			 "mpandroid.filin.mail.ru/pic?email=example@mail.ru&width=90&height=90&name=c",
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
