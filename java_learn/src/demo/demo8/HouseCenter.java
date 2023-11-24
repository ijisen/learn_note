package demo.demo8;

public class HouseCenter {
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
                    System.out.println(item.toString());
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
                System.out.println(item.toString());
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
            System.out.println(item.toString());
        }
    }
}