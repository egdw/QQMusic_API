package com.model;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Volume {

	private double gain;
	private double lra;
	private double peak;

	public void setGain(double gain) {
		this.gain = gain;
	}

	public double getGain() {
		return gain;
	}

	public void setLra(double lra) {
		this.lra = lra;
	}

	public double getLra() {
		return lra;
	}

	public void setPeak(double peak) {
		this.peak = peak;
	}

	public double getPeak() {
		return peak;
	}

	@Override
	public String toString() {
		return "Volume [gain=" + gain + ", lra=" + lra + ", peak=" + peak + "]";
	}

}