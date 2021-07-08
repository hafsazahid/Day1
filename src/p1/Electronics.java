package p1;

public class Electronics {
	int power,memory,weight;
	String bluetooth;
public Electronics() {
	// TODO Auto-generated constructor stub
}
Electronics(int power, int memory,int weight, String bluetooth)
{
	this.power= power;
	this.memory=memory;
	this.weight=weight;
	this.bluetooth=bluetooth;
	
}

public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}
public int getMemory() {
	return memory;
}
public void setMemory(int memory) {
	this.memory = memory;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getBluetooth() {
	return bluetooth;
}
public void setBluetooth(String bluetooth) {
	this.bluetooth = bluetooth;
}

public void PowerInput()
{
	power= power*10;
	System.out.println("Power -" +power);
}
}
