package shao.pi.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import shao.pi.biblioteca.models.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByNome(Aluno matriculaAluno);
    Aluno findByMatricula(Long long1);

   
}
