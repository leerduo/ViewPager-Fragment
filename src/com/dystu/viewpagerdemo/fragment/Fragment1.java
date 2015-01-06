package com.dystu.viewpagerdemo.fragment;

import com.dystu.viewpagerdemo.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
	
	private static final String TAG = "Fragment1";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		Log.d(TAG, "onCreateView");
		
		View view = inflater.inflate(R.layout.layout1, container, false);
		
		Button btn1 = (Button) view.findViewById(R.id.btn1);
		
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "点击了第一个按钮", 0).show();
				
			}
		});
		
		return view;
	}

}
