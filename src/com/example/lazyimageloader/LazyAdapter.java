package com.example.lazyimageloader;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class LazyAdapter extends BaseAdapter
{
    private Activity activity;
    private String[] data;
    private static LayoutInflater inflater=null; 
    
    public LazyAdapter(Activity a, String[] d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.item, null);

        TextView text=(TextView)vi.findViewById(R.id.text);;
        ImageView image=(ImageView)vi.findViewById(R.id.image);
        text.setText("item "+position);
        imageLoader.DisplayImage(data[position], image);
        return vi;
    }

}
