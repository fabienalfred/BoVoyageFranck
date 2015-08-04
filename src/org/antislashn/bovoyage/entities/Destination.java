package org.antislashn.bovoyage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="destinations")
@NamedQueries({
	@NamedQuery(name="Destination.all",
				query="from Destination")
})
public class Destination implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="kp_destination")
	private long id;
	private String region;
	private String description;
	
	@ElementCollection()
	@CollectionTable(name="images",joinColumns=@JoinColumn(name="ke_destination"))
	@Column(name="image")
	private List<String> images;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ke_destination")
	private List<DatesVoyage> datesVoyages;
	
	public DatesVoyage getDatesVoyage(int id){
		for(DatesVoyage dv : datesVoyages){
			if(id == dv.getId())
				return dv;
		}
		return null;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	
	public String getImage(){
		return images.get(0);
	}
	public List<DatesVoyage> getDatesVoyages() {
		return datesVoyages;
	}
	public void setDatesVoyages(List<DatesVoyage> datesVoyages) {
		this.datesVoyages = datesVoyages;
	}
	
	
}
