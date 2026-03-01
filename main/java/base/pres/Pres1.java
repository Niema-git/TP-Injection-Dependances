package base.pres;
import base.dao.DaoImpl;
import base.metier.MetierImpl;
import base.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        //DaoImpl d = new DaoImpl();
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);// injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
