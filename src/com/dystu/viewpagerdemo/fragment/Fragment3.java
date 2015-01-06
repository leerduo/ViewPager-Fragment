package com.dystu.viewpagerdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dystu.viewpagerdemo.R;

public class Fragment3 extends Fragment {

	private static final String TAG = "Fragment3";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		Log.d(TAG, "onCreateView");

		View view = inflater.inflate(R.layout.layout3, container, false);

		return view;
	}

}
