package com.den.lk_newcass.controllers;

import com.den.lk_newcass.db_model.*;
import com.den.lk_newcass.repository.posKkmRepository;
import com.den.lk_newcass.methods.mymethods;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


@Controller
public class newCassWebController {

  //private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private posKkmRepository PosKkmRepository;

  @RequestMapping(value = {"/","/main"})
  public String mainPage(Model model, HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException,IOException, NullPointerException {
//        logger.info("выполнен запрос main\n");
        String message = "";
        List<pos_kkm_view> listPosKkmTxt =  new ArrayList<pos_kkm_view>();  
        int a = (int) ( Math.random() * 1000 );
        listPosKkmTxt = mymethods.getListPosKkm(PosKkmRepository);
        model.addAttribute("listPosKkmTxt", listPosKkmTxt);
        model.addAttribute("rnd", Integer.toString(a));
        model.addAttribute("message", message);
        model.addAttribute("adm_user", "Admin");
        model.addAttribute("razdel", "pos-kkm");
        return "main3";
  }
  //****************************************************************
}
