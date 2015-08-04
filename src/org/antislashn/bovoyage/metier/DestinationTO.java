package org.antislashn.bovoyage.metier;

import org.antislashn.bovoyage.entities.Destination;

public class DestinationTO {
	private long id;
	private String region;
	private String description;
	private String image;
	
	public DestinationTO(Destination destination) {
		id = destination.getId();
		region = destination.getRegion();
		description = destination.getDescription();
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
