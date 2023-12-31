package vidaalemdasgrades.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "curso")
public class Cursos {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String link;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario;

	@Override
	public String toString() {
		return "Cursos [id=" + id + ", descricao=" + descricao + ", link=" + link + ", usuario=" + usuario + "]";
	}
	
	
	
}

	