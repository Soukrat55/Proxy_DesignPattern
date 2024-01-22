package org.sid;

public class TransactionnalProxy implements IMetier {
    private IMetier metier;
    @Override
    public void process() {
        System.out.println("Begin Transaction");
        metier=new MetierImpl();
        metier.process();
        System.out.println("Rollback ou Commit");
    }
}
