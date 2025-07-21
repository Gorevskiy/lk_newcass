package com.den.lk_newcass.services;

import java.util.ArrayList; 
import com.den.lk_newcass.db_model.pos_kkm; 
public interface posKkmService {
    ArrayList<pos_kkm> findAllPosKkm();
    void addPosKkm(pos_kkm Pos_kkm); 
	void deletePosKkm(pos_kkm Pos_kkm);
    pos_kkm getPosKkmById(String id);	
}