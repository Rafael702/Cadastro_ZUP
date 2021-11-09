package br.com.zup.Cadastros.cadastro;

import br.com.zup.Cadastros.cadastro.exception.CadastroDuplicadoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void salvarCadastros(Cadastro cadastro) {
        if (cadastroRepository.existsById(cadastro.getCpf())) {
            throw new CadastroDuplicadoException();
        }
        cadastro.setDataDoCadastro(LocalDate.now());

        cadastroRepository.save(cadastro);
    }

//    public boolean validaCadastro(){
//        Cadastro cadastro;
//
//        if(!cadastro.getCpf().isEmpty() & !cadastro.)
//
//    }


}
