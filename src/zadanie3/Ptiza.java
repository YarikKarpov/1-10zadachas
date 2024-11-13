package zadanie3;
class Ptiza {
    void Fly(){
        System.out.println("Птица летит");
    }
    void Sing(){
        System.out.println("Птица поет");
    }
    void Eggs(){
        System.out.println("Птица несет яйца");
    }
    void Bornbirds(){
    }

}
class Kukushka extends Ptiza {
    void Sing() {
        System.out.println("Кукушка кукует");
    }
}

class Nasedka{
    Ptiza ptiza;
    Kukushka kukushka;
    public Nasedka() {
        this.ptiza = new Ptiza();
        this.kukushka = new Kukushka();
    }
    void Fly(){
        ptiza.Fly();
    }
    void Sing(){
        kukushka.Sing();
    }
    void Eggs(){
        ptiza.Eggs();
    }
    void Bornbirds(){
        ptiza.Bornbirds();
        System.out.println("Наседка высиживает птенцов");
    }

}
class Main{
    public static void main(String[]args){
        Nasedka nasedka = new Nasedka();
        nasedka.Fly();
        nasedka.Sing();
        nasedka.Eggs();
        nasedka.Bornbirds();
    }
}

