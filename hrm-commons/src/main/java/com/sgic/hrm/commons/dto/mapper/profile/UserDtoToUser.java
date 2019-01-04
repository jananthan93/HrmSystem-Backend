package com.sgic.hrm.commons.dto.mapper.profile;


import com.sgic.hrm.commons.dto.profile.UserSaveDto;
import com.sgic.hrm.commons.entity.Role;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.trainee.TraineeDepartment;

public class UserDtoToUser {
	public static User map(UserSaveDto userSaveDto)
	{
		User user =new User();
		user.setId(userSaveDto.getId());
		user.setFullName(userSaveDto.getFullName());
		user.setDateOfBirth(userSaveDto.getDateOfBirth());
		user.setEmail(userSaveDto.getEmail());
		user.setGender(userSaveDto.getGender());
		user.setJoinDate(userSaveDto.getJoinDate());
		user.setMaritalStatus(userSaveDto.getMaritalStatus());
		user.setMobileNumber(userSaveDto.getMaritalStatus());
		user.setNationality(userSaveDto.getNationality());
		user.setNic(userSaveDto.getNic());
		user.setPermenentAddress(userSaveDto.getPermenentAddress());
		user.setResidentialAddress(userSaveDto.getResidentialAddress());
		user.setReligion(userSaveDto.getReligion());
		user.setTelephoneNumber(userSaveDto.getTelephoneNumber());
		user.setServicePeriod(userSaveDto.getServicePeriod());
		user.setProfilePhoto(userSaveDto.getProfilePhoto());
		
		TraineeDepartment traineeDepartment=new TraineeDepartment();
		traineeDepartment.setId(userSaveDto.getDepartment());
		
		Role role =new Role();
		role.setId(userSaveDto.getRole());
		
		return user;
		
		
		
	}
}
