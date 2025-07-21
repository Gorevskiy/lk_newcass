package com.den.lk_newcass.repository;

import java.util.ArrayList; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.den.lk_newcass.db_model.pos_kkm;
import com.den.lk_newcass.services.posKkmService; 

@Service
public class posKkmRepositoryImpl implements posKkmService {

	@Autowired
	posKkmRepository PosKkmRepository; 

	@Override
	public ArrayList<pos_kkm> findAllPosKkm() { return (ArrayList<pos_kkm>) PosKkmRepository.findAll(); } 

	@Override
    public void addPosKkm(pos_kkm Pos_kkm) { PosKkmRepository.save(Pos_kkm); }		

	@Override
	public void deletePosKkm(pos_kkm Pos_kkm) { PosKkmRepository.delete(Pos_kkm); } 	

	@Override
	public pos_kkm getPosKkmById(String id) { return PosKkmRepository.getReferenceById(id); }
}
