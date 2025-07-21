package com.den.lk_newcass.controllers;

import com.den.lk_newcass.repository.posKkmRepository;

//import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.boot.configurationprocessor.json.JSONException;
import java.io.IOException;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;

import com.den.lk_newcass.methods.ajaxDisp;

@Controller
public class apiAjax {

   @Autowired
   private posKkmRepository PosKkmRepository;

    @PostMapping("/save-new-pos-kkm")
    public void saveNewPosKkm( @RequestParam(value="new_pos_kkm[]") List<String> newPosKkm, HttpServletResponse response ) throws IOException, ClassNotFoundException, SQLException, JSONException {
        ajaxDisp.savePosKkmNew( newPosKkm, PosKkmRepository, response );
    }

}
