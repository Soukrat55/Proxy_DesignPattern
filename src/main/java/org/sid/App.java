package org.sid;

public class App {
     public static void main(String[] args){
         Client client=new Client();

         client.setStandard(new Proxy());          //remplace ce code client.setStandard(new StandardImpl1()); sauf il est avec message de sécurité

         client.process();

     }
}
