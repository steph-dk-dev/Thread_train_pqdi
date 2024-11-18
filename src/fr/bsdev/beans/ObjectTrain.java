package fr.bsdev.beans;

import java.util.Objects;

public class ObjectTrain {
	private int speedMin;
	private int speedTunnelMin;
	private String color;
	private String name;
	private String style;
	private String message;
	
	
	public ObjectTrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ObjectTrain(int speedMin, int speedTunnelMin, String color, String name, String style,String message) {
		super();
		this.speedMin = speedMin;
		this.speedTunnelMin = speedTunnelMin;
		this.color = color;
		this.name = name;
		this.style = style;
		this.message = message;
	}

	public int getSpeedMin() {
		return speedMin;
	}

	public void setSpeedMin(int speedMin) {
		this.speedMin = speedMin;
	}

	public int getSpeedTunnelMin() {
		return speedTunnelMin;
	}

	public void setSpeedTunnelMin(int speedTunnelMin) {
		this.speedTunnelMin = speedTunnelMin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, message, name, speedMin, speedTunnelMin, style);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectTrain other = (ObjectTrain) obj;
		return Objects.equals(color, other.color) && Objects.equals(message, other.message)
				&& Objects.equals(name, other.name) && speedMin == other.speedMin
				&& speedTunnelMin == other.speedTunnelMin && Objects.equals(style, other.style);
	}

	@Override
	public String toString() {
		return "ObjectTrain [speedMin=" + speedMin + ", speedTunnelMin=" + speedTunnelMin + ", color=" + color
				+ ", name=" + name + ", style=" + style + ", message=" + message + "]";
	}
	

	

}
