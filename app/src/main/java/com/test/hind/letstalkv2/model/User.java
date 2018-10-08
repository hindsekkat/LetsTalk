package com.test.hind.letstalkv2.model;


import java.util.ArrayList;
import java.util.List;


public class User {

    public String name;
    /**/ public String password;
    public String email;
    /**/ public String sexe;
    /**/ public int userage;
    /**/ public String pays;
    /**/ public String language;
    /**/ public List<String> words = new ArrayList<>();

    public String avata;
    public Status status;
    public Message message;


    public User(){
        status = new Status();
        message = new Message();
        status.isOnline = false;
        status.timestamp = 0;
        message.idReceiver = "0";
        message.idSender = "0";
        message.text = "";
        message.timestamp = 0;
    }
}
