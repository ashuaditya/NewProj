package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Entity
@Table(name="project_details")
@Data
public class ProjectDetails{

	
	@Id
	@GeneratedValue(generator = "pdId")
	@GenericGenerator(name="pdId", strategy = "increment")
	private int pdId;
	private String projName;
	private String cloudAccNumber;
	
	@OneToMany
	@JoinColumn(name="pIdFK")
	private List<PerformaInvoice> pi = new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="bIdFK")
	private List<Billing> bill = new ArrayList<>();
	public ProjectDetails() {
		super();
	}
	public ProjectDetails(String projName, String cloudAccNumber, List<PerformaInvoice> pi,
			List<com.app.model.Billing> bill) {
		super();
		this.projName = projName;
		this.cloudAccNumber = cloudAccNumber;
		this.pi = pi;
		this.bill = bill;
	}
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getCloudAccNumber() {
		return cloudAccNumber;
	}
	public void setCloudAccNumber(String cloudAccNumber) {
		this.cloudAccNumber = cloudAccNumber;
	}
	public List<PerformaInvoice> getPi() {
		return pi;
	}
	public void setPi(List<PerformaInvoice> pi) {
		this.pi = pi;
	}
	public List<Billing> getBill() {
		return bill;
	}
	public void setBill(List<Billing> bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "ProjectDetails [pdId=" + pdId + ", projName=" + projName + ", cloudAccNumber=" + cloudAccNumber
				+ ", pi=" + pi + ", bill=" + bill + "]";
	}

	
	
}
