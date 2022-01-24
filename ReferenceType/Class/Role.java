package ReferenceType.Class;

public class Role {

    int id; // 角色id
    int blood; // 生命值
    String name; // 角色名称

    // 类作为成员变量时，对它进行赋值的操作，实际上是赋给它该类的一个对象
    // 添加武器属性
    Weapon weapon;
    // 添加盔甲属性
    Armour armour;

    public Role() {

    }

    public Role(int blood, String name) {

        this.blood = blood;
        this.name = name;

    }

    // 提供get、set方法
    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;
    }

    public Armour getArmour() {

        return armour;
    }

    public void setArmour(Armour armour) {

        this.armour = armour;
    }

    // 攻击方法
    public void attack() {

        this.blood -= weapon.getHurt();
        System.out.println("使用" + weapon.getName() + "，造成" + weapon.getHurt() + "伤害");
    }

    // 穿戴盔甲
    public void wear() {
        // 增加防御就是增加blood值
        this.blood += armour.getProtect();
        System.out.println("穿上" + armour.getName() + "，生命值增加了" +armour.getProtect());
    }

    public void showRole() {
        System.out.println(name + "血量还有：" + blood);
    }
}
