package byteBank;

class Conta{
    private String titular;
    private double saldo;
    
    Conta conta = new Conta();
    conta.setTitular("Fábio")
    conta.setSaldo(100.0);

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
    
   

}