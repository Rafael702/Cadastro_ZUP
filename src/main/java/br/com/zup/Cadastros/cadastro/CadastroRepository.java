package br.com.zup.Cadastros.cadastro;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CadastroRepository extends CrudRepository<Cadastro, String> {
}
