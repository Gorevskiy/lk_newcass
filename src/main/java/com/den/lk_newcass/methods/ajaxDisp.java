package com.den.lk_newcass.methods;

import java.io.*;
/*****/
import java.util.*;
//import java.text.*;
//import java.lang.*;
/*****/
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
/*****/
import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.Cookie;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.boot.configurationprocessor.json.JSONObject;
//import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;

//import java.text.SimpleDateFormat;
/**********************************************/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.den.lk_newcass.db_model.*;
import com.den.lk_newcass.repository.posKkmRepository;

public class ajaxDisp {
   private static final Logger logger = LoggerFactory.getLogger(ajaxDisp.class);
   //****************
   public static void savePosKkmNew( List<String> newPosKkm, posKkmRepository PosKkmRepository, HttpServletResponse response ) throws ClassNotFoundException,SQLException,IOException,JSONException {

	  //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
     //Calendar cal = new GregorianCalendar();	
  	  //String datToday = dateFormat.format(cal.getTime());

	  UUID randomUuid = UUID.randomUUID();
     pos_kkm PosKkm = new pos_kkm();

     PosKkm.setKkmId(randomUuid.toString());
     PosKkm.setInn(newPosKkm.get(0));
     PosKkm.setKkmZavNum(newPosKkm.get(1));
     PosKkm.setKkmModel(newPosKkm.get(2));
     PosKkm.setKkmVersion(newPosKkm.get(3));
     PosKkm.setKkmFn(newPosKkm.get(4));
     PosKkm.setKkmFnStatus(newPosKkm.get(5));
     PosKkm.setKkmRnn(newPosKkm.get(6));
     PosKkm.setGns(newPosKkm.get(7));
     PosKkm.setBilling(newPosKkm.get(8));
	  PosKkmRepository.addPosKkm(PosKkm);

	  logger.info("добавлен новый pos_kkm  " + newPosKkm.get(0) + "\n" );

	  JSONObject jsonTmp = new JSONObject();
	  response.setContentType("application/json");
	  response.setCharacterEncoding("UTF-8");
	  PrintWriter out = response.getWriter();
	  jsonTmp.put("status", "ok" );
	  out.print(jsonTmp);
	  out.flush();
   }
   //************************************************************
}