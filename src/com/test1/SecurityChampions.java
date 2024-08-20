package com.test1;

public class SecurityChampions {
	private Integer teamCode;
	private String policyCode;
	private boolean championAvailable;
	private Integer userId;
	private String emailId;
	private String applicationsStatus;
	private Integer lineManagerId;
	private Integer maxVulnerabilitiesAllowed;
	private String presentIssues;
	private Integer vptCount;
	private Integer nexusCount;
	private String status;
	private String remarks;

	public SecurityChampions() {

	}

	public SecurityChampions(Integer teamCode, String policyCode, boolean championAvailable, Integer userId,
			String emailId, String applicationsStatus, Integer lineManagerId, Integer maxVulnerabilitiesAllowed,
			String presentIssues, Integer vptCount, Integer nexusCount, String status, String remarks) {
		super();
		this.teamCode = teamCode;
		this.policyCode = policyCode;
		this.championAvailable = championAvailable;
		this.userId = userId;
		this.emailId = emailId;
		this.applicationsStatus = applicationsStatus;
		this.lineManagerId = lineManagerId;
		this.maxVulnerabilitiesAllowed = maxVulnerabilitiesAllowed;
		this.presentIssues = presentIssues;
		this.vptCount = vptCount;
		this.nexusCount = nexusCount;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(Integer teamCode) {
		this.teamCode = teamCode;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public boolean isChampionAvailable() {
		return championAvailable;
	}

	public void setChampionAvailable(boolean championAvailable) {
		this.championAvailable = championAvailable;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getApplicationsStatus() {
		return applicationsStatus;
	}

	public void setApplicationsStatus(String applicationsStatus) {
		this.applicationsStatus = applicationsStatus;
	}

	public Integer getLineManagerId() {
		return lineManagerId;
	}

	public void setLineManagerId(Integer lineManagerId) {
		this.lineManagerId = lineManagerId;
	}

	public Integer getMaxVulnerabilitiesAllowed() {
		return maxVulnerabilitiesAllowed;
	}

	public void setMaxVulnerabilitiesAllowed(Integer maxVulnerabilitiesAllowed) {
		this.maxVulnerabilitiesAllowed = maxVulnerabilitiesAllowed;
	}

	public String getPresentIssues() {
		return presentIssues;
	}

	public void setPresentIssues(String presentIssues) {
		this.presentIssues = presentIssues;
	}

	public Integer getVptCount() {
		return vptCount;
	}

	public void setVptCount(Integer vptCount) {
		this.vptCount = vptCount;
	}

	public Integer getNexusCount() {
		return nexusCount;
	}

	public void setNexusCount(Integer nexusCount) {
		this.nexusCount = nexusCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
