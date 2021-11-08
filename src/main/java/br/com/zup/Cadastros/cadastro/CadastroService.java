package br.com.zup.Cadastros.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void salvarCadastros(Cadastro cadastro){
        cadastroRepository.save(cadastro);
    }

}
