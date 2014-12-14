package com.ysk.simplerssreader;

//Item.java
public class Item {
	// 記事のタイトル
	private CharSequence mTitle;
	// 記事の本文
	private CharSequence mDescription;

	public Item() {
		mTitle = "aaa";
		mDescription = "ccc";
	}

	public CharSequence getDescription() {
		return mDescription;
	}

	public void setDescription(CharSequence description) {
		mDescription = description;
	}

	public CharSequence getTitle() {
		return mTitle;
	}

	public void setTitle(CharSequence title) {
		mTitle = title;
	}
}
