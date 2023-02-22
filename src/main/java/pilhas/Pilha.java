package pilhas;

public class Pilha {

    private  No refnoEntradaPilha;

    public Pilha(){
        this.refnoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refnoEntradaPilha;
        refnoEntradaPilha = novoNo;
        refnoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No nopoped = refnoEntradaPilha;
            refnoEntradaPilha = refnoEntradaPilha.getRefNo();
            return nopoped;
        }
        return null;
    }

    public No top(){
        return refnoEntradaPilha;
    }

    public boolean isEmpty(){

//        if(refnoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refnoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){

        String stringRetorno = "-------------\n";
        stringRetorno +="    Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refnoEntradaPilha;

        while (true){
          if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
          } else {
              break;
          }

        }
        stringRetorno += "==============\n";
        return stringRetorno;

    }

}
