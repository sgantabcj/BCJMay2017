package com.crmindz.departmentrecords.service;

import java.util.ArrayList;
import java.util.List;

import com.crmindz.departmentrecords.dao.DepartmentDao;
/**
 * this class holds methods that manipulates department data.
 * 
 * @author Sravan
 *
 */
public class DepartmentService {
	DepartmentDao deptDao = new DepartmentDao();
	/**
	 * saves the department data by passing it to dao layer.
	 * 
	 * @param departmentRecords - string passed to process and save it as a List.
	 */
	public void saveDepartmentData(String departmentRecords){
		List<String> departmentData = new ArrayList<String>();
		for(String record : departmentRecords.split(",")){
			departmentData.add(record);
		}
		deptDao.saveDepartmentData(departmentData);
	}
	/**
	 * fetches all the department data.
	 * 
	 * @return List<String> - returns department data as a List.
	 */
	public List<String> fetchDepartmentData(){
		return deptDao.getDepartmentData();
	}
	/**
	 * fetches the department record data that is matched with a string.
	 * 
	 * @param departmentName - the name of the department for which the value is required.
	 * @return int - returns an int value of the department record data.
	 */
	public int fetchDepartmentRecord(String departmentName){
		List<String> deptData = deptDao.getDepartmentData();
		for(String record : deptData){
			if(record.contains(departmentName)){
				return Integer.parseInt(record.split(":")[1]);
			}
		}
//		returns -1 when there is no match found.
		return -1;
	}
	
	
	
}
