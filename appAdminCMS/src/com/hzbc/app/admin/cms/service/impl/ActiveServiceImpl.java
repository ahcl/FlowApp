package com.hzbc.app.admin.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzbc.app.admin.cms.dao.ActiveDao;
import com.hzbc.app.admin.cms.entity.Active;
import com.hzbc.app.admin.cms.service.ActiveService;

@Transactional
@Service("activeService")
public class ActiveServiceImpl implements ActiveService {

	@Autowired
	public ActiveDao activeDao;
	@Override
	public void addActive(Active active) {
		activeDao.addActive(active);
	}

}
