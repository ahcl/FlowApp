package com.hzbc.app.admin.cms.entity;

import java.sql.Date;

public class Active {
	private Integer id;
	private String activeName;
	private String activeContent;
	private String activeUpDate;
	private String activeImg;
	private Integer adminId;
	private Integer activeFlag;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getActiveName() {
		return activeName;
	}
	public void setActiveName(String activeName) {
		this.activeName = activeName;
	}
	public String getActiveContent() {
		return activeContent;
	}
	public void setActiveContent(String activeContent) {
		this.activeContent = activeContent;
	}
	public String getActiveUpDate() {
		return activeUpDate;
	}
	public void setActiveUpDate(String string) {
		this.activeUpDate = string;
	}
	public String getActiveImg() {
		return activeImg;
	}
	public void setActiveImg(String activeImg) {
		this.activeImg = activeImg;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Integer getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((activeContent == null) ? 0 : activeContent.hashCode());
		result = prime * result
				+ ((activeFlag == null) ? 0 : activeFlag.hashCode());
		result = prime * result
				+ ((activeImg == null) ? 0 : activeImg.hashCode());
		result = prime * result
				+ ((activeName == null) ? 0 : activeName.hashCode());
		result = prime * result
				+ ((activeUpDate == null) ? 0 : activeUpDate.hashCode());
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Active other = (Active) obj;
		if (activeContent == null) {
			if (other.activeContent != null)
				return false;
		} else if (!activeContent.equals(other.activeContent))
			return false;
		if (activeFlag == null) {
			if (other.activeFlag != null)
				return false;
		} else if (!activeFlag.equals(other.activeFlag))
			return false;
		if (activeImg == null) {
			if (other.activeImg != null)
				return false;
		} else if (!activeImg.equals(other.activeImg))
			return false;
		if (activeName == null) {
			if (other.activeName != null)
				return false;
		} else if (!activeName.equals(other.activeName))
			return false;
		if (activeUpDate == null) {
			if (other.activeUpDate != null)
				return false;
		} else if (!activeUpDate.equals(other.activeUpDate))
			return false;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Active [id=" + id + ", activeName=" + activeName
				+ ", activeContent=" + activeContent + ", activeUpDate="
				+ activeUpDate + ", activeImg=" + activeImg + ", adminId="
				+ adminId + ", activeFlag=" + activeFlag + "]";
	}
	public Active(Integer id, String activeName, String activeContent,
			String activeUpDate, String activeImg, Integer adminId,
			Integer activeFlag) {
		super();
		this.id = id;
		this.activeName = activeName;
		this.activeContent = activeContent;
		this.activeUpDate = activeUpDate;
		this.activeImg = activeImg;
		this.adminId = adminId;
		this.activeFlag = activeFlag;
	}
	public Active() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
