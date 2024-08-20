package com.test1;

public class SecurityDevelopmentCycle {
	private String applications;
	private String sdlGuide;
	private String originStage;
	private String targetStage;
	private String threatModelling;
	private String securityTesting;
	private String mandatoryTrainings;
	private String academyRegulatory;
	private String demoHackathons;
	private String status;

	public SecurityDevelopmentCycle() {

	}

	public SecurityDevelopmentCycle(String applications, String sdlGuide, String originStage, String targetStage,
			String threatModelling, String securityTesting, String mandatoryTrainings, String academyRegulatory,
			String demoHackathons, String status) {
		super();
		this.applications = applications;
		this.sdlGuide = sdlGuide;
		this.originStage = originStage;
		this.targetStage = targetStage;
		this.threatModelling = threatModelling;
		this.securityTesting = securityTesting;
		this.mandatoryTrainings = mandatoryTrainings;
		this.academyRegulatory = academyRegulatory;
		this.demoHackathons = demoHackathons;
		this.status = status;
	}

	public String getApplications() {
		return applications;
	}

	public void setApplications(String applications) {
		this.applications = applications;
	}

	public String getSdlGuide() {
		return sdlGuide;
	}

	public void setSdlGuide(String sdlGuide) {
		this.sdlGuide = sdlGuide;
	}

	public String getOriginStage() {
		return originStage;
	}

	public void setOriginStage(String originStage) {
		this.originStage = originStage;
	}

	public String getTargetStage() {
		return targetStage;
	}

	public void setTargetStage(String targetStage) {
		this.targetStage = targetStage;
	}

	public String getThreatModelling() {
		return threatModelling;
	}

	public void setThreatModelling(String threatModelling) {
		this.threatModelling = threatModelling;
	}

	public String getSecurityTesting() {
		return securityTesting;
	}

	public void setSecurityTesting(String securityTesting) {
		this.securityTesting = securityTesting;
	}

	public String getMandatoryTrainings() {
		return mandatoryTrainings;
	}

	public void setMandatoryTrainings(String mandatoryTrainings) {
		this.mandatoryTrainings = mandatoryTrainings;
	}

	public String getAcademyRegulatory() {
		return academyRegulatory;
	}

	public void setAcademyRegulatory(String academyRegulatory) {
		this.academyRegulatory = academyRegulatory;
	}

	public String getDemoHackathons() {
		return demoHackathons;
	}

	public void setDemoHackathons(String demoHackathons) {
		this.demoHackathons = demoHackathons;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
