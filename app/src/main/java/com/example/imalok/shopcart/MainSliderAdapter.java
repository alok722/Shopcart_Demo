package com.example.imalok.shopcart;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by iMalok on 09-02-2018.
 * Created for Main Activity Sliding View
 */

//For Slider effect on Main Activity Page

public class MainSliderAdapter extends PagerAdapter {

    //setting Image Resources for Slider
    private int[] image_resources = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3
    };
    private Context ctx;
    private LayoutInflater layoutInflater;

    public MainSliderAdapter (Context ctx){
        this.ctx=ctx;
    }

    @Override
    public int getCount(){
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View item_view = layoutInflater.inflate(R.layout.slider,container,false);

        ImageView imageView = (ImageView)item_view.findViewById(R.id.slider_image);

        imageView.setImageResource(image_resources[position]);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((LinearLayout)object);
    }

}
