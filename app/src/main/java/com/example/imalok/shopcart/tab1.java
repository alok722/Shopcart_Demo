package com.example.imalok.shopcart;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class tab1 extends Fragment{
    GridView gridView;

    String letterlist[]={"Alok","Alok","Alok","Alok","Alok","Alok","Alok","Alok","Alok"};

    int letterIcon[]={R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
            R.drawable.p7,
            R.drawable.p8,
            R.drawable.p9};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        gridView=(GridView)rootView.findViewById(R.id.gridView);

        GridAdapter adapter=new GridAdapter(getContext(),letterIcon,letterlist);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(),Main3Activity.class);
                startActivity(i);
            }
        });

        return rootView;
    }
}
