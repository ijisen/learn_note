package demo.demo8;

public class Index {
    public static void main(String[] args) {
        HouseCenter houseCenter = new HouseCenter();
        houseCenter.getList();
        houseCenter.getInfo("jisen");
        houseCenter.deleteInfo("jisen");
        houseCenter.updateInfo(new House("jisen", 500, true));
        System.out.println("-----------------");
        houseCenter.addInfo(new House("jisen", 500, true));
        houseCenter.getList();
        houseCenter.addInfo(new House("jisen", 500, true));
        houseCenter.addInfo(new House("tomi", 5000, true));
        houseCenter.getList();
        houseCenter.addInfo(new House("lucy", 5000, true));
        houseCenter.getList();
        houseCenter.addInfo(new House("hmm", 5000, true));
        houseCenter.getList();
        houseCenter.updateInfo(new House("jisen", 5000, false));
        houseCenter.getList();
        houseCenter.getInfo("jisen");
        houseCenter.getInfo("jise2n");
        System.out.println("-------删除房源信息----------");
        houseCenter.deleteInfo("tomi");
        houseCenter.getList();
        houseCenter.addInfo(new House("jisen", 500, true));
    }
}

