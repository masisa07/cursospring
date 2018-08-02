package guru.springframework.spring5recipeapp.domain;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	private BigDecimal amount;

	@ManyToMany(mappedBy = "categories")
	private Set<Recipe> recipes;
}