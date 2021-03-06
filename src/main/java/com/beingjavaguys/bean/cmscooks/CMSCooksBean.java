package com.beingjavaguys.bean.cmscooks;

/**
 * This is cook class
 * @author amishra210
 *
 */
public class CMSCooksBean {
	private int id;
	private String name;
	private String description;
	private String specility;
	private String gender;
	private String mobileno;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpecility() {
		return specility;
	}

	public void setSpecility(String specility) {
		this.specility = specility;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CMSCooksBean [name=" + name + ", description=" + description
				+ ", specility=" + specility + ", gender=" + gender
				+ ", mobileno=" + mobileno + ", address=" + address + "]";
	}

}
