package com.hzbc.app.admin.cms.dao;

import com.hzbc.app.admin.cms.annotation.MyAnnotation;
import com.hzbc.app.admin.cms.entity.Active;

@MyAnnotation
public interface ActiveDao {
	public void addActive(Active active);
}
