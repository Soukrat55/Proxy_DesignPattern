package org.sid;

import java.util.Random;

public class Proxy implements Standard{//proxy verifie client avec qu'il envois au inteface
    private StandardImpl1 standardImpl1=new StandardImpl1();
    @Override
    public void process() {
        System.out.println("Vérification du contexte de sécurité");
        boolean b=new Random().nextBoolean();
        if(b){
            System.out.println("Avant  l'appel");
            standardImpl1=new StandardImpl1();
            standardImpl1.process();
            System.out.println("Aprés l'appel");
        }else{
            throw new RuntimeException("Forbidden 403");
        }
    }
}
