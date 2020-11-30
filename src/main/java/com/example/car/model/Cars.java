package com.example.car.model;

public class Cars {
private int model;
private String name;
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Cars [model=" + model + ", name=" + name + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + model;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cars other = (Cars) obj;
	if (model != other.model)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public Cars(int model, String name) {
	super();
	this.model = model;
	this.name = name;
}
public Cars() {
	// TODO Auto-generated constructor stub
}



}


