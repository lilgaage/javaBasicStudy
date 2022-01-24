package ReferenceType.InterFace.MemberVariable;

public class Role {

    // interface作为成员变量，对它进行赋值的操作，实际上，是赋给它该接口的一个子类对象。
    FaShuSkill faShuSkill;

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }

    public void faShuSkillAttack() {

        System.out.print("发动法术攻击:");
        faShuSkill.faShuAttack();
        System.out.println("法术攻击完毕");

    }
}
