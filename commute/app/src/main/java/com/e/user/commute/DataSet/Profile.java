package com.e.user.commute.DataSet;

import android.app.Application;

public class Profile extends Application{

    private String name = "홍길동";
   public int num = 12345;

   public void setName(String n){
       name = n;

   }
    public String getName(){
       return name;
    }


   public void setNum(int i){
       num = i;
   }
    public int getNum(){
        return num;
    }
}
