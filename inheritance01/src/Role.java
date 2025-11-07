public class Role
{
    //腳色名稱
    private String name ;
    //生命值
    private int health;
    //攻擊力
    private int attackPower ;

    //建構子:初使劃角色的名稱
    public Role(String name, int health, int attackPower)
    {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getAttackPower(){
        return  attackPower;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public boolean isAlive()
    {
        return  health>0;
    }
    public String toString()
    {
        return "角色名稱:" + name + ", 生命值:" + health;
    }

}


