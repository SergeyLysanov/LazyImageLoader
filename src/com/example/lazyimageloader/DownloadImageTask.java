package com.example.lazyimageloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> 
{
	private ImageView imageView;
	
	
	public DownloadImageTask(ImageView imageView)
	{
		this.imageView = imageView;
	}
	
	@Override
	protected Bitmap doInBackground(String... params) 
	{
		String url = "";
        if( params.length > 0 ){
        	url = params[0];		    	
        }

        InputStream input = null;
        try {
               URL urlConn = new URL(url);
               HttpURLConnection conn = (HttpURLConnection)urlConn.openConnection();
               conn.setConnectTimeout(30000);
               conn.setReadTimeout(30000);
               conn.setInstanceFollowRedirects(true);
               input = conn.getInputStream();
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
         imageView.setImageBitmap(result);
    }
	
}