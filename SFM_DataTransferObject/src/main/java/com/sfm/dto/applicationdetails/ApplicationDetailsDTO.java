package com.sfm.dto.applicationdetails;

import com.sfm.dto.IModel;

public class ApplicationDetailsDTO implements IModel
{
	private static final long	serialVersionUID	= 1L;

	private int					id;
	private String				name;
	private String				ShortName;
	private String				description;
	private boolean				isActive;
	
	// Non Table Files
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getShortName()
	{
		return ShortName;
	}
	public void setShortName(String shortName)
	{
		ShortName = shortName;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public boolean isActive()
	{
		return isActive;
	}
	public void setActive(boolean isActive)
	{
		this.isActive = isActive;
	}

	@Override
	public String toString()
	{
		return "ApplicationDetailsDTO [id=" + id + ", name=" + name + ", ShortName=" + ShortName + ", description=" + description + ", isActive=" + isActive + "]";
	}
	
	

}
