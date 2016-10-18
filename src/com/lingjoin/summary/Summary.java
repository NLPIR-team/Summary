package com.lingjoin.summary;

public class Summary {

	public static boolean state=false;
	
	public static boolean init(String arg){
		state=CSummaryLibrary.Instance.DS_Init(arg, 1, "");
		if(state){
			return true;
		}else{
			System.out.println(CSummaryLibrary.Instance.DS_GetLastErrMsg());
			return false;
		}
	}
	
	public static String singleDoc(String sText, float fSumRate, int iSumLen,int bHtmlTagRemove){
		if(state){
			return CSummaryLibrary.Instance.DS_SingleDoc(sText, fSumRate, iSumLen, bHtmlTagRemove);
		}else
			return null;
	}
	
	public static String singleDocE(String sResult,String sText, float fSumRate, int iSumLen,int bHtmlTagRemove){
		if(state){
			return CSummaryLibrary.Instance.DS_SingleDocE(sResult, sText, fSumRate, iSumLen, bHtmlTagRemove);
		}else
			return null;
	}
	
	public static String fileProcess(String sTextFilename, float fSumRate, int iSumLen,int bHtmlTagRemove){
		if(state)
			return CSummaryLibrary.Instance.DS_FileProcess(sTextFilename, fSumRate, iSumLen, bHtmlTagRemove);
		else
			return null;
	}
	
	public static String getLastErrMsg(){
		 return CSummaryLibrary.Instance.DS_GetLastErrMsg();
	}
	
	public static void exit(){
		CSummaryLibrary.Instance.DS_Exit();
	}
}
