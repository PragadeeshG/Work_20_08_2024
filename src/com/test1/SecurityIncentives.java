package com.test1;

public class SecurityIncentives {
	private Integer resourceId;
	private Integer userId;
	private String incentiveCode;
	private String voucherCode;
	private String certificationVoucher;
	private String ecommerceVoucher;
	private boolean voucherValidityOffered;
	private String incentiveStrategy;
	private String moduleRating;
	private String securityChampionName;
	private String sdlCyclePresence;
	private String capabilityIndicator;
	private String actionableItems;
	private String status;

	public SecurityIncentives() {

	}

	public SecurityIncentives(Integer resourceId, Integer userId, String incentiveCode, String voucherCode,
			String certificationVoucher, String ecommerceVoucher, boolean voucherValidityOffered,
			String incentiveStrategy, String moduleRating, String securityChampionName, String sdlCyclePresence,
			String capabilityIndicator, String actionableItems, String status) {
		super();
		this.resourceId = resourceId;
		this.userId = userId;
		this.incentiveCode = incentiveCode;
		this.voucherCode = voucherCode;
		this.certificationVoucher = certificationVoucher;
		this.ecommerceVoucher = ecommerceVoucher;
		this.voucherValidityOffered = voucherValidityOffered;
		this.incentiveStrategy = incentiveStrategy;
		this.moduleRating = moduleRating;
		this.securityChampionName = securityChampionName;
		this.sdlCyclePresence = sdlCyclePresence;
		this.capabilityIndicator = capabilityIndicator;
		this.actionableItems = actionableItems;
		this.status = status;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getIncentiveCode() {
		return incentiveCode;
	}

	public void setIncentiveCode(String incentiveCode) {
		this.incentiveCode = incentiveCode;
	}

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getCertificationVoucher() {
		return certificationVoucher;
	}

	public void setCertificationVoucher(String certificationVoucher) {
		this.certificationVoucher = certificationVoucher;
	}

	public String getEcommerceVoucher() {
		return ecommerceVoucher;
	}

	public void setEcommerceVoucher(String ecommerceVoucher) {
		this.ecommerceVoucher = ecommerceVoucher;
	}

	public boolean isVoucherValidityOffered() {
		return voucherValidityOffered;
	}

	public void setVoucherValidityOffered(boolean voucherValidityOffered) {
		this.voucherValidityOffered = voucherValidityOffered;
	}

	public String getIncentiveStrategy() {
		return incentiveStrategy;
	}

	public void setIncentiveStrategy(String incentiveStrategy) {
		this.incentiveStrategy = incentiveStrategy;
	}

	public String getModuleRating() {
		return moduleRating;
	}

	public void setModuleRating(String moduleRating) {
		this.moduleRating = moduleRating;
	}

	public String getSecurityChampionName() {
		return securityChampionName;
	}

	public void setSecurityChampionName(String securityChampionName) {
		this.securityChampionName = securityChampionName;
	}

	public String getSdlCyclePresence() {
		return sdlCyclePresence;
	}

	public void setSdlCyclePresence(String sdlCyclePresence) {
		this.sdlCyclePresence = sdlCyclePresence;
	}

	public String getCapabilityIndicator() {
		return capabilityIndicator;
	}

	public void setCapabilityIndicator(String capabilityIndicator) {
		this.capabilityIndicator = capabilityIndicator;
	}

	public String getActionableItems() {
		return actionableItems;
	}

	public void setActionableItems(String actionableItems) {
		this.actionableItems = actionableItems;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
