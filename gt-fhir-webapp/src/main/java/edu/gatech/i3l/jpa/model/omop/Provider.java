package edu.gatech.i3l.jpa.model.omop;

import java.util.Collection;

import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.IdDt;

public class Provider extends BaseResourceTable {

	private Long id;
	private String npi;
	private String dea;
	private Concept specialtyConcept;
	private CareSite careSite;
	private String providerSourceValue;
	private String specialtySourceValue;
	
	public Provider() {
		super();
	}
	
	public Provider(Long id, String npi, String dea, Concept specialtyConcept, CareSite careSite,
			String providerSourceValue, String specialtySourceValue) {
		this.id = id;
		this.npi = npi;
		this.dea = dea;
		this.specialtyConcept = specialtyConcept;
		this.careSite = careSite;
		this.providerSourceValue = providerSourceValue;
		this.specialtySourceValue = specialtySourceValue;
	}
	
	public String getNpi() {
		return npi;
	}
	
	public void setNpi(String npi) {
		this.npi = npi;
	}
	
	public String getDea() {
		return dea;
	}
	
	public void setDea(String dea) {
		this.dea = dea;
	}
	
	public Concept getSpecialtyConcept() {
		return specialtyConcept;
	}
	
	public void setSpecialtyConcept(Concept specialtyConcept) {
		this.specialtyConcept = specialtyConcept;
	}
	
	public CareSite getCareSite() {
		return careSite;
	}
	
	public void setCareSite(CareSite careSite) {
		this.careSite = careSite;
	}
	
	public String getProviderSourceValue() {
		return providerSourceValue;
	}
	
	public void setProviderSourceValue(String providerSourceValue) {
		this.providerSourceValue = providerSourceValue;
	}
	
	public String getSpecialtySourceValue() {
		return specialtySourceValue;
	}
	
	public void setSpecialtySourceValue(String specialtySourceValue) {
		this.specialtySourceValue = specialtySourceValue;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Practitioner getRelatedResource() {
		Practitioner practitioner = new Practitioner();
		
		// TODO set parameters
		
		return practitioner;
	}

	@Override
	public Class<? extends IResource> getRelatedResourceType() {
		// TODO Auto-generated method stub
		return Practitioner.class;
	}

	@Override
	public BaseTag addTag(TagDefinition arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "Practitioner";
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