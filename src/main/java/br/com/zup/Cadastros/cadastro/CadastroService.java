package br.com.zup.Cadastros.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void salvarCadastros(Cadastro cadastro) {
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
