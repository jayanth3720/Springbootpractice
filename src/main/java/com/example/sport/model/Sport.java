package com.example.sport.model;

public class Sport {

	private int sportRank;
	private String sportType;
	private String sportName;
	@Override
	public String toString() {
		return "Sport [sportRank=" + sportRank + ", sportType=" + sportType + ", sportName=" + sportName + "]";
	}
	
	public Sport(int sportRank, String sportType, String sportName) {
		super();
		this.sportRank = sportRank;
		this.sportType = sportType;
		this.sportName = sportName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sportName == null) ? 0 : sportName.hashCode());
		result = prime * result + sportRank;
		result = prime * result + ((sportType == null) ? 0 : sportType.hashCode());
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
		Sport other = (Sport) obj;
		if (sportName == null) {
			if (other.sportName != null)
				return false;
		} else if (!sportName.equals(other.sportName))
			return false;
		if (sportRank != other.sportRank)
			return false;
		if (sportType == null) {
			if (other.sportType != null)
				return false;
		} else if (!sportType.equals(other.sportType))
			return false;
		return true;
	}
	public int getSportRank() {
		return sportRank;
	}
	public void setSportRank(int sportRank) {
		this.sportRank = sportRank;
	}
	public String getSportType() {
		return sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
}
