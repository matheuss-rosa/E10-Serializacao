import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

public class Conta implements Serializable{

    private String Nome;
    private int Idade;
    private double SaldoConta;
    private int NumeroConta;


    public Conta (String Nome, int Idade, double SaldoConta, int NumeroConta) {

        this.Nome = Nome;
        this.Idade = Idade;
        this.SaldoConta = SaldoConta;
        this.NumeroConta = NumeroConta;


    }

    //Getter e Setter Do Numero Da Conta

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }
    
    
    // Getter e Setter Do Saldo

    public double getSaldoConta() {
        return SaldoConta;
    }

    public void setSaldoConta(Double SaldoConta) {
        this.SaldoConta = SaldoConta;
    }


    //Getter e Setter do Nome

    public String getNome() {
        return Nome;
    }

    public void setNome (String Nome) {
        this.Nome = Nome;
    }


    //Getter e Setter da Idade

    public int getIdade() {
        return Idade;
    }

    public void Idade (int Idade) {
        this.Idade = Idade;
    }


    public void SalvarNoArquivo() {

        String NomeArquivo = Nome  + ".ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NomeArquivo))){

            oos.writeObject(this);
            System.out.println("Conta salva com sucesso!");

        } catch (IOException e) {

            System.out.println("Nao foi possivel salvar a conta.");

        }

    }


    public static Conta CarregarArquivo (String Nome) {

        String NomeArquivo = Nome + ".ser";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NomeArquivo))){

            return (Conta) ois.readObject();

    } catch (IOException | ClassNotFoundException e) {

        System.out.println("Nao foi possivel carregar a conta.");
        return null;
    }
}

}