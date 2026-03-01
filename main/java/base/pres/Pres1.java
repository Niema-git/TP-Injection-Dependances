package base.pres;
import base.dao.DaoImpl;
import base.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(dao);// injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
