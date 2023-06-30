package org.javaSolution;

import org.cxxnative.HelloTriangleApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DEMO_settings_window extends JFrame implements ActionListener {

    HelloTriangleApplication demo = new HelloTriangleApplication();
    JTextField rotateAngle, moveAmount, scaleAmount;
    JLabel rotationLabel, movementLabel, scaleLabel;
    JCheckBox rotateX, rotateY, rotateZ, moveX, moveY, moveZ, scaleX, scaleY, scaleZ;
    JButton applyButton;
    public DEMO_settings_window(){
        rotationLabel =new JLabel("Rotate");
        rotationLabel.setBounds(60,10, 250,20);
        movementLabel =new JLabel("Move");
        movementLabel.setBounds(160,10, 250,20);
        scaleLabel =new JLabel("Scale");
        scaleLabel.setBounds(260,10, 250,20);

        rotateAngle =new JTextField();
        rotateAngle.setBounds(60,50, 50,20);
        moveAmount =new JTextField();
        moveAmount.setBounds(160,50, 50,20);
        scaleAmount =new JTextField();
        scaleAmount.setBounds(260,50, 50,20);

        rotateX =new JCheckBox("X");
        rotateX.setBounds(40,90,100,20);
        rotateY =new JCheckBox("Y");
        rotateY.setBounds(40,130,100,20);
        rotateZ =new JCheckBox("Z");
        rotateZ.setBounds(40,170,100,20);

        moveX =new JCheckBox("X");
        moveX.setBounds(140,90,100,20);
        moveY =new JCheckBox("Y");
        moveY.setBounds(140,130,100,20);
        moveZ =new JCheckBox("Z");
        moveZ.setBounds(140,170,100,20);

        scaleX =new JCheckBox("X");
        scaleX.setBounds(240,90,100,20);
        scaleY =new JCheckBox("Y");
        scaleY.setBounds(240,130,100,20);
        scaleZ =new JCheckBox("Z");
        scaleZ.setBounds(240,170,100,20);

        applyButton =new JButton("Apply");
        applyButton.setBounds(140,210,80,40);
        applyButton.addActionListener(this);

        add(rotateAngle);
        add(moveAmount);
        add(scaleAmount);
        add(rotationLabel);
        add(movementLabel);
        add(scaleLabel);
        add(rotateX);
        add(rotateY);
        add(rotateZ);
        add(moveX);
        add(moveY);
        add(moveZ);
        add(scaleX);
        add(scaleY);
        add(scaleZ);
        add(applyButton);

        setSize(380,300);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == applyButton) {
            float rotation = Float.parseFloat(rotateAngle.getText());
            float movement = Float.parseFloat(moveAmount.getText());
            float scale = Float.parseFloat(scaleAmount.getText());
/*
            demo.scale(scale, scaleX.isSelected(), scaleY.isSelected(), scaleZ.isSelected());
            demo.rotate(rotation, rotateX.isSelected(), rotateY.isSelected(), rotateZ.isSelected());
            demo.move(movement, moveX.isSelected(), moveY.isSelected(), moveZ.isSelected());
            */
            demo.run();

        }
    }
}
