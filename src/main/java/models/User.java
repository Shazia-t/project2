/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Shaurya Magar
 */
public class User {
        private String fname;
        private String lname;
        private String dob;
        private int wardno;
        private int voterid;
        
//    public User(String fname,String lname,String dob,int wardno,int voterid){
//        this.fname=fname;
//        this.lname=lname;
//        this.dob=dob;
//        this.voterid=voterid;
//        this.wardno=wardno;
//    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getWardno() {
        return wardno;
    }

    public void setWardno(int wardno) {
        this.wardno = wardno;
    }

    public int getVoterid() {
        return voterid;
    }

    public void setVoterid(int voterid) {
        this.voterid = voterid;
    }
        
    
}
