package helpers;

public class TrackTableModel implements Comparable<TrackTableModel>{

	private String startDate;
	private String endDate;
	private String type;
	private String status;
	private String employeeName;
	private String department;
	private String building;
	private int id;
	
	public void setId(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
	public int compareTo(TrackTableModel other) {
        return employeeName.compareTo(other.employeeName);
    }


}
