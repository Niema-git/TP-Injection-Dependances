package base.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        system.out.printlin("version base de données");
        double t=34;
        return t;
    }
}
