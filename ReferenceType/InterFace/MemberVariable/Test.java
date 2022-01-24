package ReferenceType.InterFace.MemberVariable;

public class Test {

    public static void main(String[] args) {

        // 使用接口作为成员变量，以便随时更换技能，设计更为灵活，增强了程序的扩展性。

        Role role = new Role();
        // 设置角色法术技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("纵横天下");
            }
        });

        // 发动法术攻击
        role.faShuSkillAttack();

        // 更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("逆转乾坤");
            }
        });

        role.faShuSkillAttack();
    }
}
