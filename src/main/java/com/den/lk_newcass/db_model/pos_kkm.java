package com.den.lk_newcass.db_model;

import jakarta.persistence.*;

@Entity  
@Table( name = "pos_kkm" )  
public class pos_kkm {
    //********************************
    @Id
    private String kkm_id;

    @Column
    private String inn;

    @Column
    private String kkm_zav_num;

    @Column
    private String kkm_model;

    @Column
    private String kkm_version;

    @Column
    private String kkm_fn;

    @Column
    private String kkm_fn_status;

    @Column
    private String kkm_rnn;

    @Column
    private String gns;

    @Column
    private String billing;
    //********************************
    public void setKkmId( String kkm_id ) { this.kkm_id = kkm_id; }
    public String getKkmId() { return kkm_id; }
    //-----------------------------
    public void setInn( String inn ) { this.inn = inn; }
    public String getInn() { return inn; }
    //-----------------------------
    public void setKkmZavNum( String kkm_zav_num ) { this.kkm_zav_num = kkm_zav_num; }
    public String getKkmZavNum() { return kkm_zav_num; }
    //-----------------------------
    public void setKkmModel( String kkm_model ) { this.kkm_model = kkm_model; }
    public String getKkmModel() { return kkm_model; }
    //-----------------------------
    public void setKkmVersion( String kkm_version ) { this.kkm_version = kkm_version; }
    public String getKkmVersion() { return kkm_version; }
    //-----------------------------
    public void setKkmFn( String kkm_fn ) { this.kkm_fn = kkm_fn; }
    public String getKkmFn() { return kkm_fn; }
    //-----------------------------
    public void setKkmFnStatus( String kkm_fn_status ) { this.kkm_fn_status = kkm_fn_status; }
    public String getKkmFnStatus() { return kkm_fn_status; }
    //-----------------------------
    public void setKkmRnn( String kkm_rnn ) { this.kkm_rnn = kkm_rnn; }
    public String getKkmRnn() { return kkm_rnn; }
    //-----------------------------
    public void setGns( String gns ) { this.gns = gns; }
    public String getGns() { return gns; }
    //-----------------------------
    public void setBilling( String billing ) { this.billing = billing; }
    public String getBilling() { return billing; }
    //-----------------------------
}  