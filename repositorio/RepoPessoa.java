package repositorio;

import java.util.List;
import DAO.PessoaDAO;
import models.Pessoa;

public class RepoPessoa {
    private List<Pessoa> pessoas;

    public List<Pessoa> getAllPessoas() {
        return pessoas;
    }

    public RepoPessoa() {
        pessoas = PessoaDAO.getPessoas();
    }

    public void criarPessoaEIncluir() {
        Pessoa p = new Pessoa(0, null, null, null, null, null, null);
        PessoaDAO.salvarPessoa(p);
        pessoas.add(p);
    }

    public void deletarPessoa (Pessoa pessoa) {
        //pessoas.indexOf(pessoa);
        pessoas.remove(pessoa);
    }
    public void deletarPessoaById (int id) {
            Pessoa p = null;
            for(Pessoa p1 : pessoas) {
            if(p1.getId()==id) {
                p=p1;
            }
        }
        try {
            PessoaDAO.deletarPessoa(p.getId());
            pessoas.remove(p);
        } catch (NullPointerException e) {
            System.out.println("Id "+ id +" não encontrado");
            // TODO: handle exception
        }        
    }
}
