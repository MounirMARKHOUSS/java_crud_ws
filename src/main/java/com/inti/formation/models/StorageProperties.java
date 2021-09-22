package com.inti.formation.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = {"com.inti.formation.Ipml","com.inti.formation.models"
})
@ConfigurationProperties(prefix = "storage")
@EntityScan("com.inti.formation.models")
@EnableJpaRepositories("com.inti.formation.repositories")
@Entity
public class StorageProperties {
	@Id
	private Long idSp;
    private String location;
	public StorageProperties(Long idSp, String location) {
		super();
		this.idSp = idSp;
		this.location = location;
	}
	public StorageProperties() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdSp() {
		return idSp;
	}
	public void setIdSp(Long idSp) {
		this.idSp = idSp;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "StorageProperties [idSp=" + idSp + ", location=" + location + "]";
	}
    
    
    
}
