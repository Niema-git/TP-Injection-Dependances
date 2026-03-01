package base.pres;
import base.dao.DaoImpl;
import base.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);// injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
