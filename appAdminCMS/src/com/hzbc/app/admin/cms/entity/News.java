package com.hzbc.app.admin.cms.entity;

public class News {
	public Integer id;
	public String newsName;
	public String newsContent;
	public String newsImg;
	public String newsUpDate;
	public Integer newsFlag;
	public Integer adminId;
	public Integer newsCount;
	public Integer newsTop;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsImg() {
		return newsImg;
	}
	public void setNewsImg(String newsImg) {
		this.newsImg = newsImg;
	}
	public String getNewsUpDate() {
		return newsUpDate;
	}
	public void setNewsUpDate(String newsUpDate) {
		this.newsUpDate = newsUpDate;
	}
	public Integer getNewsFlag() {
		return newsFlag;
	}
	public void setNewsFlag(Integer newsFlag) {
		this.newsFlag = newsFlag;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Integer getNewsCount() {
		return newsCount;
	}
	public void setNewsCount(Integer newsCount) {
		this.newsCount = newsCount;
	}
	
	public Integer getNewsTop() {
		return newsTop;
	}
	public void setNewsTop(Integer newsTop) {
		this.newsTop = newsTop;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((newsContent == null) ? 0 : newsContent.hashCode());
		result = prime * result
				+ ((newsCount == null) ? 0 : newsCount.hashCode());
		result = prime * result
				+ ((newsFlag == null) ? 0 : newsFlag.hashCode());
		result = prime * result + ((newsImg == null) ? 0 : newsImg.hashCode());
		result = prime * result
				+ ((newsName == null) ? 0 : newsName.hashCode());
		result = prime * result + ((newsTop == null) ? 0 : newsTop.hashCode());
		result = prime * result
				+ ((newsUpDate == null) ? 0 : newsUpDate.hashCode());
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
		News other = (News) obj;
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
		if (newsContent == null) {
			if (other.newsContent != null)
				return false;
		} else if (!newsContent.equals(other.newsContent))
			return false;
		if (newsCount == null) {
			if (other.newsCount != null)
				return false;
		} else if (!newsCount.equals(other.newsCount))
			return false;
		if (newsFlag == null) {
			if (other.newsFlag != null)
				return false;
		} else if (!newsFlag.equals(other.newsFlag))
			return false;
		if (newsImg == null) {
			if (other.newsImg != null)
				return false;
		} else if (!newsImg.equals(other.newsImg))
			return false;
		if (newsName == null) {
			if (other.newsName != null)
				return false;
		} else if (!newsName.equals(other.newsName))
			return false;
		if (newsTop == null) {
			if (other.newsTop != null)
				return false;
		} else if (!newsTop.equals(other.newsTop))
			return false;
		if (newsUpDate == null) {
			if (other.newsUpDate != null)
				return false;
		} else if (!newsUpDate.equals(other.newsUpDate))
			return false;
		return true;
	}
	public News(Integer id, String newsName, String newsContent,
			String newsImg, String newsUpDate, Integer newsFlag,
			Integer adminId, Integer newsCount, Integer newsTop) {
		super();
		this.id = id;
		this.newsName = newsName;
		this.newsContent = newsContent;
		this.newsImg = newsImg;
		this.newsUpDate = newsUpDate;
		this.newsFlag = newsFlag;
		this.adminId = adminId;
		this.newsCount = newsCount;
		this.newsTop = newsTop;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", newsName=" + newsName + ", newsContent="
				+ newsContent + ", newsImg=" + newsImg + ", newsUpDate="
				+ newsUpDate + ", newsFlag=" + newsFlag + ", adminId="
				+ adminId + ", newsCount=" + newsCount + ", newsTop=" + newsTop
				+ "]";
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
