package com.den.lk_newcass.methods;

import java.io.*;
import java.util.*;
//import java.text.*;
//import java.lang.*;

/*****/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.den.lk_newcass.db_model.*;
import com.den.lk_newcass.repository.posKkmRepository;

public class mymethods {

   private static final Logger logger = LoggerFactory.getLogger(mymethods.class);
   //****************
   public static List<pos_kkm_view> getListPosKkm(posKkmRepository PosKkmRepository) throws ClassNotFoundException,IOException {
	  //------------------------------------------------------ 
      List<pos_kkm_view> lv = new ArrayList<pos_kkm_view>();
      pos_kkm_view listV1;
      List<pos_kkm> posKkmLists = new ArrayList<pos_kkm>( PosKkmRepository.findAllListsForTxt() );
      int npp = 1;
	   for( pos_kkm vList:posKkmLists ){
		   listV1 = new pos_kkm_view();
         listV1.setNpp( Integer.toString(npp) );
         listV1.setKkmId(vList.getKkmId());
         listV1.setInn(vList.getInn());
         listV1.setKkmZavNum(vList.getKkmZavNum());
         listV1.setKkmModel(vList.getKkmModel());
         listV1.setKkmVersion(vList.getKkmVersion());
         listV1.setKkmFn(vList.getKkmFn());
         listV1.setKkmFnStatus(vList.getKkmFnStatus());
         listV1.setKkmRnn(vList.getKkmRnn());
         listV1.setGns(vList.getGns());
         listV1.setBilling(vList.getBilling());
         lv.add(listV1);
         npp++;
		   //------------------------------ 
	   }
      logger.info("выгружен список pos_kkm\n");
	  return lv;
   }
   //************************************************************
}