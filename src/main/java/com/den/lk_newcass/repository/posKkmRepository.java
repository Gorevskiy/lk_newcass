package com.den.lk_newcass.repository;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
import com.den.lk_newcass.db_model.pos_kkm; 
  
@Repository 
@Transactional
public interface posKkmRepository extends JpaRepository<pos_kkm, String>{
    ArrayList<pos_kkm> findAllPosKkm();
    void addPosKkm(pos_kkm Pos_kkm); 
	void deletePosKkm(pos_kkm Pos_kkm);
    pos_kkm getPosKkmById(String id);	
	//----------------------------------
    @Modifying
    @Query("DELETE FROM pos_kkm p WHERE p.kkm_id=:kkm_id")
    void deletePosKkmById( String kkm_id );
	//----------------------------------
    @Query("SELECT p FROM pos_kkm p ORDER BY p.inn,p.kkm_model,p.kkm_version")     
    ArrayList<pos_kkm> findAllListsForTxt();
	//----------------------------------
    @Query("SELECT count(p.kkm_id) FROM pos_kkm p")     
    Integer cntAllPosKkm();
	//----------------------------------
}