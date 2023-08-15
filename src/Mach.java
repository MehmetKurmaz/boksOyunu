public class Mach {
    Fighter f1,f2;
    int minWeight,maxWeight;
    public Mach(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;

        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("========>>>>NEW ROUND<<<<========");
                if (whoFirst() == true) {
                    this.f2.health = this.f1.hit(this.f2);

                    if (isWin()) {
                        break;
                    }
                }
                else {
                    this.f1.health = this.f2.hit(this.f1);

                    if (isWin()) {
                        break;
                    }

                }
                if (isWin ()) {
                    break;
                }

                printScore();
            }

        } else {
            System.out.println("Sporcularin agirliklari uyusmuyor.");
        }


    }
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maci Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maci Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
    boolean whoFirst () {
        int randomNumber = (int) (Math.random() * 10);
        if (randomNumber<=5){
            return true;
        }
        return false;
    }

}
