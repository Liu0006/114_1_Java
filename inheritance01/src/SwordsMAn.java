public class SwordsMAn extends  Role
{

    public SwordsMAn(String name, int health, int attackPower)
    {
       super(name, health, attackPower);
    }

    //攻擊對手
    public void attack(SwordsMAn opponent)
    {
        opponent.setHealth(opponent.getHealth() - this.getAttackPower());
        System.out.println(this.getName() + "攻擊" );

    }
}
