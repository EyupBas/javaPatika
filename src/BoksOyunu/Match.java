package BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            int i = 0;
            while(this.f1.healt > 0 && this.f2.healt > 0){
                System.out.println("====NEW ROUND=====");
                if (whoFirst()){
                    this.f2.healt = this.f1.hit(f2);
                    if (this.f2.healt < 0)
                        this.f2.healt = 0;
                    if (isWin()){
                        System.out.println("Winner iss" + this.f1.name);
                        break;
                    }
                    this.f1.healt = this.f2.hit(f1);
                    if (this.f1.healt < 0)
                        this.f2.healt = 0;
                    if (isWin()){
                        System.out.println("Winner iss" + this.f2.name);
                    }

                }else{
                    this.f2.healt = this.f1.hit(f2);
                    if (this.f2.healt < 0)
                        this.f2.healt = 0;
                    if (isWin()){
                        System.out.println("Winner iss" + this.f1.name);
                        break;
                    }
                    this.f1.healt = this.f2.hit(f1);
                    if (this.f1.healt < 0)
                        this.f2.healt = 0;
                    if (isWin()){
                        System.out.println("Winner iss" + this.f2.name);
                        break;
                    }
                }
            }
        }else {
            System.out.println("Sportsman weigth not match");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if (this.f1.healt == 0){
            return true;
        }
        if (this.f2.healt == 0){
            return true;
        }
        return false;
    }
    boolean whoFirst(){
        int fightNumber = (int) (Math.random() * 100);
        return (fightNumber > 50) ? true : false;
    }
}
