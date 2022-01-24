package ReferenceType.Class;

public class TestRole {

    public static void main(String[] args) {

        Weapon weapon = new Weapon("屠龙刀", 99999);
        Armour armour = new Armour("麒麟甲", 10000);
        Role role = new Role(1000000, "小琳");

        // 设置武器、盔甲属性
        role.setWeapon(weapon);
        role.setArmour(armour);

        role.showRole();

        // 攻击、穿盔甲
        role.attack();
        role.wear();

        role.showRole();
    }
}
