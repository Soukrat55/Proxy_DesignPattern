package org.sid;

public class Controller {
   // @Autowired
    private IMetier metier=new TransactionnalProxy();

    public String index(){
        metier.process();
        return "index";
    }
}
