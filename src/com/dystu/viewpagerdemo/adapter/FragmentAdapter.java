package com.dystu.viewpagerdemo.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * 
 * 
 * 1.FragmentPagerAdapter继承自PagerAdapter
 * 
 * 
 * 2.只需要实现： getItem getCount
 * 
 * @author
 *
 */

public class FragmentAdapter extends FragmentPagerAdapter {

	private List<Fragment> mFragments;

	public FragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
		super(fm);
		mFragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		return mFragments.get(position);
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}

}
