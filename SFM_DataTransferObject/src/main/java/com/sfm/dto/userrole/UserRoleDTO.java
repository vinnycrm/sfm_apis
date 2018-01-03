package com.sfm.dto.userrole;

import com.sfm.dto.IModel;

public class UserRoleDTO implements IModel
{
	private static final long	serialVersionUID	= 1L;

	private int					id;
	private String				name;
	private String				shortName;
	private String				description;
	private boolean				isActive;

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
		return shortName;
	}

	public void setShortName(String shortName)
	{
		this.shortName = shortName;
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
		return "UserRoleDTO [id=" + id + ", name=" + name + ", shortName=" + shortName + ", description=" + description + ", isActive=" + isActive + "]";
	}

}
