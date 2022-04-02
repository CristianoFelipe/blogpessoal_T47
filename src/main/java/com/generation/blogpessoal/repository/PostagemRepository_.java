package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
<<<<<<< HEAD:src/main/java/com/generation/blogpessoal/repository/PostagemRepository_.java
}
=======
}
>>>>>>> 46b6cd92758bf6eff21cf827fae2f199d2b60484:src/main/java/com/generation/blogpessoal/repository/PostagemRepository.java
