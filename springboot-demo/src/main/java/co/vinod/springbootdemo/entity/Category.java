package co.vinod.springbootdemo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "category_id")
	private Integer categoryId;
	@Column(name = "category_name")
	private String categoryName;
	private String Description;
	@JsonIgnore
	private byte[] picture;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name="category_id")
	private List<Product> products;
}
