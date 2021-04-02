package itec3030.assignments.a2;

import itec3030.smarthome.standards.*;
import oldtempinc.drivers.OldTempSensor;



public class OldTempSensorAdapter implements TemperatureSensor{

	private OldTempSensor oldTempsensor = new OldTempSensor();
	
	private ControllerInterface controllerInterface;

	private String ID;

	private int temperature;

	private boolean enable;

	
	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		return this.controllerInterface;
	}

	@Override
	public void setController(ControllerInterface paramControllerInterface) {
		this.controllerInterface = paramControllerInterface;
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	@Override
	public void setID(String paramString) {
		this.ID = paramString;
		
	}

	@Override
	public void enable() {
		this.enable = true;
	}

	@Override
	public void disable() {
		this.enable = false;
		
	}

	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return enable;
	}

	@Override
	public int getReading() {
		// TODO Auto-generated method stub
		this.temperature = (int) this.oldTempsensor.getTemperature();
		return temperature;
	}

	@Override
	public void newTemperature(int paramInt) {
		
		this.oldTempsensor.newTemperature(paramInt);
		
	}
	
	
	
	

}
