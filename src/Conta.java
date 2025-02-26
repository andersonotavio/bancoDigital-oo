public abstract class Conta implements Iconta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;



    public Conta(){
        this.agency = Conta.AGENCIA_PADRAO;
        this.number = SEQUENCIAL++;
    }

    @Override
    public  void withdraw( double value){
        balance -= value;
    }


    @Override
    public  void deposit( double value){
        balance += value;
    }

    @Override
    public  void transfer( double value, Conta contaDestino){
        this.withdraw(value);
        contaDestino.deposit(value);
    }


    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }


    public double getBalane() {
        return balance;
    }


    public void setBalane(double balane) {
        this.balance = balane;
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Agencia: %d", this.number));
        System.out.println(String.format("Agencia: %.2f", this.balance));
    }

}
