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

class House {
    private String name;
    private double price;
    private boolean isOut;

    public House(String name, double price, boolean isOut) {
        this.name = name;
        this.price = price;
        this.isOut = isOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean out) {
        isOut = out;
    }
}

class HouseCenter {
    private House[] houses = new House[0];

    boolean isExist(String name) {
        boolean isExist = false;
        for (House item : this.houses) {
            if (name.equals(item.getName())) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public void addInfo(House house) {
        int len = this.houses.length;
        if (len == 0) {
            this.houses = new House[]{house};
            System.out.println("房屋信息添加成功： " + this.houses.length);
        } else {
            if (!isExist(house.getName())) {
                House[] _houses = new House[len + 1];
                _houses[len] = house;

//                System.arraycopy(this.houses, 0, houses, 0, len);
                for (int i = 0; i < len; i++) {
                    _houses[i] = this.houses[i];
                }
                for (House item : _houses) {
                    System.out.println(item.getName() + " " + item.getPrice() + " " + item.isOut());
                }
                this.houses = _houses;
                System.out.println("房屋信息添加成功： " + this.houses.length);
            } else {
                System.out.println("房屋信息已经存在： " + house.getName());
            }
        }
    }

    public void deleteInfo(String name) {
        if (isExist(name)) {
            int len = this.houses.length;
            House[] newHouse = new House[len - 1];
            int k = 0;
            for (int i = 0; i < len; i++) {
                House item = this.houses[i];
                if (item.getName().equals(name)) {
                    System.out.println("房屋信息删除成功： " + name);
                } else {
                    newHouse[k] = item;
                    k++;
                }
            }
            this.houses = newHouse;
        } else {
            System.out.println("未找到房源信息");
        }
    }

    public void getInfo(String name) {
        boolean isExist = false;
        for (House item : this.houses) {
            if (item.getName().equals(name)) {
                isExist = true;
                System.out.println(item.getName() + " " + item.getPrice() + " " + item.isOut());
            }
        }
        if (!isExist) {
            System.out.println("未找到房源信息");
        }
    }

    public void updateInfo(House house) {
        boolean isExist = false;
        int len = this.houses.length;
        for (int i = 0; i < len; i++) {
            if (this.houses[i].getName().equals(house.getName())) {
                this.houses[i] = house;
                isExist = true;
                System.out.println("房屋信息更新成功： " + house.getName());
            }
        }
        if (!isExist) {
            System.out.println("未找到房源信息");
        }
    }

    public void getList() {
        for (House item : this.houses) {
            System.out.println(item.getName() + " " + item.getPrice() + " " + item.isOut());
        }
    }
}