package com.hongshi.wuliudidi.impl;

public interface ChildAfinalHttpCallBack extends AfinalHttpCallBack{
	@Override
	public void data(String t);
	public void onFailure(String errCode, String errMsg, Boolean errSerious);
}
