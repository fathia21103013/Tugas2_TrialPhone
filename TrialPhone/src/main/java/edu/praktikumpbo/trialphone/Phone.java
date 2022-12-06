/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.praktikumpbo.trialphone;

/**
 *
 * @author ASUS
 */
public interface Phone {
    int MaxVolume = 100;
    int MinVolume = 0;
    
    void PowerOn();
    void PowerOff();
    void VolumeUp();
    void VolumeDown();
}
