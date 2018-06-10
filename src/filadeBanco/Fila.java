package filadeBanco;

 // @author Cristiano Rocha Feitoza 
import javax.swing.DefaultListModel;

public class Fila {

    private Pessoa pessoa[];
    private int ini;
    private int fim;
    private int nElem;
    private int n;
    String msg = "";
    DefaultListModel list = new DefaultListModel(); // Listas para encaixar no componente JList do Java Swing
    DefaultListModel list2 = new DefaultListModel();

    public Fila() { // Fila Padrao com tamanho para 10 pessoas
        n = 10;
        pessoa = new Pessoa[n];
        ini = fim = -1;
        nElem = 0;
    }

    public Fila(int n) { // Cria Fila com o Tamanho Informado
        this.n = n;
        pessoa = new Pessoa[n];
        ini = fim = -1;
        nElem = 0;
    }

    public void enfileira(Pessoa dado) { // Insere a pessoa no final da fila
        if (nElem == 0) {
            ini = 0;
        }
        if (fim == n - 1) {
            msg = " \n \n          --------------------------   Fila Cheia   -------------------------   ";
        } else {
            fim++;
            pessoa[fim] = dado;
            nElem++;
            if (dado.getTipo() == "convencional") {
                list.addElement((pessoa[fim].toString(fim + 1)));
            } else {
                list2.addElement((pessoa[fim].toString(fim + 1)));
            }
            msg = " \n \n          --------------------------      Inserido      -------------------------   ";
        }
    }

    public void desenfileira() { //Atende o próximo da fila
        if (nElem == 0) {
            msg = " \n \n          --------------------------        Fila Vazia         -------------------------   ";
        } else {
            msg = "Saiu da Fila : \n \n" + pessoa[ini].toString(ini + 1);
             if (pessoa[ini].getTipo() == "convencional") {
                list.removeElement(pessoa[ini].toString(ini + 1));
                pessoa[ini] =null; //Limpa Memória
            }
            else {
                list2.removeElement(pessoa[ini].toString(ini + 1));
                pessoa[ini] =null; //Limpa Memória
            }
             fim--;
            ini++;
            nElem--;
        }
    }
    public void vazia() {
        if (nElem == 0) {
            msg = " \n \n          --------------------------        Fila Vazia         -------------------------   ";
        }else if (fim == n - 1) {
            cheia();
        } 
        else {
            msg = " \n \n          --------------------------        Fila Ativa         -------------------------   ";
        }
    }

    public void cheia() {
        if (fim == n - 1) {
            msg = " \n \n          --------------------------        Fila Cheia         -------------------------   ";
        } else {
            msg = " \n \n          --------------------------        Fila Ativa         -------------------------   ";
        }
    }

    public void proximo() { //Verifica quem é o Próximo a ser atendido
        if (nElem == 0) {
            msg = " \n \n          --------------------------   Não Tem Próximo   -------------------------   ";
        }else  if (pessoa[ini].getTipo() == "convencional") {
                msg = "Próximo : \n \n"+pessoa[ini].toString(ini + 1);                  
            }
       else if (pessoa[ini].getTipo() == "preferencial") {
                msg= "Próximo : \n \n"+pessoa[ini].toString(ini + 1);
            }else {
            msg = " \n \n          --------------------------   Não Tem Próximo   -------------------------   ";
        }
    }

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getnElem() {
        return nElem;
    }

}
