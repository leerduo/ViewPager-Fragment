package com.dystu.viewpagerdemo;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.dystu.viewpagerdemo.adapter.FragmentAdapter;
import com.dystu.viewpagerdemo.fragment.Fragment1;
import com.dystu.viewpagerdemo.fragment.Fragment2;
import com.dystu.viewpagerdemo.fragment.Fragment3;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		List<Fragment> fragments = new ArrayList<Fragment>();
		
		fragments.add(new Fragment1());
		fragments.add(new Fragment2());
		fragments.add(new Fragment3());
		
		FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), fragments);
		
		ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
		
		pager.setAdapter(adapter);
		

	}

}
