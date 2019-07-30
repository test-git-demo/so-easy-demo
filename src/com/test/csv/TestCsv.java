package com.test.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestCsv {

	public static void main(String[] args) {
		String [] title={"SYS_CODE","USERNAME","PASSWORD","FUNC_CODE","VERSION",//
			     "MAIL_NUM","CLCT_DATE","WEIGHT","CLCT_CITY",//
			     "DEST_CD","DEST_PROV","DEST_CITY","AMOUNT"};
		StringBuffer str=new StringBuffer();
		for(int i=0;i<title.length;i++) {
			str.append(title[i]+"\t");
			if(i==(title.length)-1) {
				str.append("\r\n");
			}
		}
		//封装数据
		for(int j=0;j<title.length;j++) {
			str.append(j+"\t\t");
			if(j==(title.length)-1) {
				str.append("\r\n");
			}
		}
		System.out.println(str);
		File file=new File("D:\\web1\\test.csv");
		try {
			FileOutputStream out=new FileOutputStream(file);
			byte[] b =new byte[1024];
			out.write(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
