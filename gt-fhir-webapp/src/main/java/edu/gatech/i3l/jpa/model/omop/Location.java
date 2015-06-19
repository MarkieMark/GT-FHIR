package edu.gatech.i3l.jpa.model.omop;

import java.util.Collection;

import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;

public class Location extends BaseResourceTable{

	private Long id;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String locationSourceValue;

	public Location() {
		super();
	}

	public Location(String address1, String address2, String city,
			String state, String zipCode, String country,
			String locationSourceValue) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.locationSourceValue = locationSourceValue;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocationSourceValue() {
		return locationSourceValue;
	}

	public void setLocationSourceValue(String locationSourceValue) {
		this.locationSourceValue = locationSourceValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ca.uhn.fhir.model.dstu2.resource.Location getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.Location location =  new ca.uhn.fhir.model.dstu2.resource.Location();
		location.setId(new IdDt(this.getId()));
		location.getAddress().addLine(this.getAddress1()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState()).setCountry(this.getCountry());
		if(this.getAddress2() != null)
			location.getAddress().addLine(this.getAddress2()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState()).setCountry(this.getCountry());
		return location;
	}

	@Override
	public Class<? extends IResource> getRelatedResourceType() {
		return ca.uhn.fhir.model.dstu2.resource.Location.class;
	}

	@Override
	public BaseTag addTag(TagDefinition theDef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdDt getIdDt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends BaseTag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

}