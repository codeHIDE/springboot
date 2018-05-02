package com.jyc.Sample.ServiceImp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyc.Sample.Dao.IIndoorInfoDao;
import com.jyc.Sample.Dao.PcacMapper;
import com.jyc.Sample.Entyties.IndoorCheckItemEntity;

 

@Service
public class ControllerService   {
	@Autowired
	private IIndoorInfoDao dao;
	@Autowired
	private PcacMapper pcacMapper;
	
	private static Logger logger = Logger.getLogger(ControllerService.class);

	public ArrayList<IndoorCheckItemEntity> getIndoorCheckItemEntities() {
		return dao.getWscheckItemsOfIndoor();
	}
	
	
	
	public void testRun() {
		List<Map> mchtList = pcacMapper.testGet();
		int size = mchtList.size();
		logger.info("共有"+size+"条数据");
		for(Map map:mchtList){
			Set<Map.Entry<String, String>> set = map.entrySet();
	        for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext();) {
	            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
	            System.out.println(entry.getKey() + "--->" + entry.getValue());
	        }
	        System.out.println("----------------------------");
		}
	}
	
}