import javax.xml.namespace.QName;

public class athletics {
    class Player{
        String name;
        private int lifevalue;
        private int attackpower;
        private int defensiveness;

        public String getName() {
            System.out.println("请输入玩家的名称：");
            return name;
        }

        public int getLifevalue() {
            System.out.println("请输入初始生命值：");
            return lifevalue;
        }

        public int getAttackpower() {
            System.out.println("请输入攻击力：");
            return attackpower;
        }

        public int getDefensiveness() {
            System.out.println("请输入防御力：");
            return defensiveness;
        }
    }
    class Monster{
        private String name;
        private int lifevalue;
        private int attackpower;

        public String getName() {
            System.out.println("请输入怪兽的名字：");
            return name;
        }

        public int getLifevalue() {
            System.out.println("请输入生命值：");
            return lifevalue;
        }

        public int getAttackpower() {
            System.out.println("请输入攻击力：");
            return attackpower;
        }
        }
         class PlayerAndMonster{
            public  void main(String[] args) {
                Player p1 = new Player();
                Player p2 = new Player();
                Monster m1 = new Monster();
                Monster m2 = new Monster();


            }
            }

        }





