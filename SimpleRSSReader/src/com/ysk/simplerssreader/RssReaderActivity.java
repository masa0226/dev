package com.ysk.simplerssreader;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.ListActivity;

//RssReaderActivity.java
public class RssReaderActivity extends ListActivity {
	private ArrayList<Item> mItems;
	private RssListAdapter mAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rss_reader);

		// Itemオブジェクトを保持するためのリストを生成し、アダプタに追加する
		mItems = new ArrayList<Item>();
		mAdapter = new RssListAdapter(this, mItems);

		// アダプタをリストビューにセットする
		setListAdapter(mAdapter);

		// サンプル用に空のItemオブジェクトをセットする
		for (int i = 0; i < 10; i++) {
			mAdapter.add(new Item());
		}
	}
}