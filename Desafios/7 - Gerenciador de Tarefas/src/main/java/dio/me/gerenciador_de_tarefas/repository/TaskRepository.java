package dio.me.gerenciador_de_tarefas.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import dio.me.gerenciador_de_tarefas.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
