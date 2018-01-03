package com.sfm.dto.userdetails;

import java.util.Date;
import java.util.List;

import com.sfm.dto.IModel;
import com.sfm.dto.applicationdetails.ApplicationDetailsDTO;

public class UserDetailsDTO implements IModel
{
	private static final long			serialVersionUID	= 1L;

	private int							id;
	private String						firstName;
	private String						lastName;
	private String						userName;
	private int							divisionId;
	private boolean						isActive;
	private boolean						isDeleted;
	private Date						createdon;
	private int							createdby;
	private Date						updatedon;
	private int							updatedby;

	// Non Table Fields

	private String						divisionName;

	private List<ApplicationDetailsDTO>	appsList;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public int getDivisionId()
	{
		return divisionId;
	}

	public void setDivisionId(int divisionId)
	{
		this.divisionId = divisionId;
	}

	public boolean isActive()
	{
		return isActive;
	}

	public void setActive(boolean isActive)
	{
		this.isActive = isActive;
	}

	public boolean isDeleted()
	{
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted)
	{
		this.isDeleted = isDeleted;
	}

	public Date getCreatedon()
	{
		return createdon;
	}

	public void setCreatedon(Date createdon)
	{
		this.createdon = createdon;
	}

	public int getCreatedby()
	{
		return createdby;
	}

	public void setCreatedby(int createdby)
	{
		this.createdby = createdby;
	}

	public Date getUpdatedon()
	{
		return updatedon;
	}

	public void setUpdatedon(Date updatedon)
	{
		this.updatedon = updatedon;
	}

	public int getUpdatedby()
	{
		return updatedby;
	}

	public void setUpdatedby(int updatedby)
	{
		this.updatedby = updatedby;
	}

	public String getDivisionName()
	{
		return divisionName;
	}

	public void setDivisionName(String divisionName)
	{
		this.divisionName = divisionName;
	}

	public List<ApplicationDetailsDTO> getAppsList()
	{
		return appsList;
	}

	public void setAppsList(List<ApplicationDetailsDTO> appsList)
	{
		this.appsList = appsList;
	}

	@Override
	public String toString()
	{
		return "UserDetailsDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", divisionId=" + divisionId
				+ ", isActive=" + isActive + ", isDeleted=" + isDeleted + ", createdon=" + createdon + ", createdby=" + createdby + ", updatedon=" + updatedon
				+ ", updatedby=" + updatedby + ", divisionName=" + divisionName + ", appsList=" + appsList + "]";
	}

}
