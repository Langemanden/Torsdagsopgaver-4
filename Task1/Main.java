public class Main {
    public static void main(String[] args) {

        Team t1 = new Team("Manchester United");
        t1.setRank(1);
        t1.addPlayer("Casemiro");
        t1.addPlayer("Fernandes");
        t1.addPlayer("Sesko");

        Team t2 = new Team("Chelsea");
        t2.setRank(2);
        t2.addPlayer("Garnacho");
        t2.addPlayer("Palmer");

        Team t3 = new Team("Tottenham");
        t3.setRank(3);
        t3.addPlayer("Richarlison");
        t3.addPlayer("Kulusevski");

        Team t4 = new Team("Liverpool");
        t4.setRank(4);
        t4.addPlayer("Salah");

        Team t5 = new Team("Manchester City");
        t5.setRank(5);
        t5.addPlayer("Silva");
        t5.addPlayer("Dias");

        Team t6 = new Team("Arsenal");
        t6.setRank(6);
        t6.addPlayer("Odegaard");
        t6.addPlayer("Saka");
        t6.addPlayer("Saliba");

        System.out.println(t1);
        System.out.println();
        System.out.println(t2);
        System.out.println();
        System.out.println(t3);
        System.out.println();
        System.out.println(t4);
        System.out.println();
        System.out.println(t5);
        System.out.println();
        System.out.println(t6);
    }
}

