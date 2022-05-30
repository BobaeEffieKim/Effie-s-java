package com.yedam.jave.ch0901;

public class Button {

	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
	
	
}
