package com.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class FtpUtilTest {

	@Test
	public void ftpUploadTest() {
		String host="114.55.67.115";
		int port=21;
		String username="ftpuser";
		String password="8520ftp";
		//因为linux 服务器设置了此用户的目录为/home/ftpuser，所以这里直接填/相当于此根目录，
		//如果填绝对路径/home/ftpuser则创建文件夹失败
		String basePath="/";
		String filePath="/2012/8/12";
		String filename="456.png";
		FileInputStream input=null;
		try {
			input = new FileInputStream(new File("C:\\Users\\heng\\Desktop\\111.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean success = FtpUtil.uploadFile(host, port, username, password, basePath,
				filePath, filename, input);
		System.out.println(success);
	}
}
