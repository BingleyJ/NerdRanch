package com.example.bangban;

public class TrueFalse {
	private int mQuestion;
	
	private boolean mTrueQuestion;
	
	public TrueFalse(int question, boolean trueQeustion){
		mQuestion = question;
		mTrueQuestion = trueQeustion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}

}
