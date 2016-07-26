package com.hzbc.app.admin.cms.service.impl;

import java.util.List;

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
	
	@Override
	public List<Active> findActiveById(Integer id){
		return activeDao.findActiveById(id);
	}

	@Override
	public List<Active> findActive() {
		return activeDao.findActive();
	}

	@Override
	public void deleteActiveById(Integer id) {
		activeDao.deleteActiveById(id);
	}

	@Override
	public void updateFlagById(Integer id) {
		activeDao.updateFlagById(id);
		
	}

	@Override
	public void delUpdateFlagById(Integer id) {
		activeDao.delUpdateFlagById(id);
		
	}

	@Override
	public List<Active> showFourth() {
		return activeDao.showFourth();
		
	}
	

}
