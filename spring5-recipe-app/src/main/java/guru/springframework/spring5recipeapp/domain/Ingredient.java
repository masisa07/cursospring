package guru.springframework.spring5recipeapp.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private BigDecimal amount;
	
	@ManyToOne
	private Recipe recipe;
	@OneToOne(fetch=FetchType.EAGER)
	private UnionOfMeasure uom;
}
