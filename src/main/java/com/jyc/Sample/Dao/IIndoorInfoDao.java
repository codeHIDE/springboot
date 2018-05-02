package com.jyc.Sample.Dao;

import java.util.ArrayList;

import com.jyc.Sample.Entyties.IndoorCheckItemEntity;

public interface IIndoorInfoDao {
	public ArrayList<IndoorCheckItemEntity> getWscheckItemsOfIndoor();
}
