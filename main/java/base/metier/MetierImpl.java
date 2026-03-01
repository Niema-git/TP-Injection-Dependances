package base.metier;

import base.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;  //couplage faible
    //pour injecter dans l'attribut dao un objet d'une classe qui implemente IDao
    //au moment de l'instantiation
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t= dao.getData();
        double res=t*12*Math.PI/2*Math.cos(t);
        return res;
    }
    //pour injecter dans l'attribut dao un objet d'une classe qui implemente IDao
    //après l'instantiation de l'objet
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
