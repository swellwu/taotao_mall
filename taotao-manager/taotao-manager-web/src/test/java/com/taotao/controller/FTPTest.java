package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	@Test
	public void testFtpClient() throws Exception{
		//创建FtpClient对象
		FTPClient ftpClient=new FTPClient();
		//创建ftp连接
		ftpClient.connect("114.55.67.115",21);
		//登录ftp服务器，使用用户名和密码
		ftpClient.login("ftpuser", "8520ftp");
		//远程路径
		ftpClient.changeWorkingDirectory("/");
		FileInputStream inputStream=new FileInputStream(new File("C:\\Users\\heng\\Desktop\\111.png"));
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//上传文件
		boolean success = ftpClient.storeFile("222.png", inputStream);
		System.out.println(success);
		//关闭连接
		inputStream.close();
		ftpClient.logout();
	}
}
