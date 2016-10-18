package com.lingjoin.summary;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CSummaryLibrary extends Library {
	
	CSummaryLibrary Instance=(CSummaryLibrary) Native.loadLibrary("LJSummary", CSummaryLibrary.class);
	
	public boolean DS_Init(String sPath,int nEncoding,String sLicenseCode);
	
	public String DS_SingleDoc(String sText, float fSumRate, int iSumLen,int bHtmlTagRemove);
	
	public String DS_SingleDocE(String sResult,String sText, float fSumRate, int iSumLen,int bHtmlTagRemove);
	
	public String DS_FileProcess(String sTextFilename, float fSumRate, int iSumLen,int bHtmlTagRemove);
	
	public void DS_Exit();
	
	public String DS_GetLastErrMsg();
}
