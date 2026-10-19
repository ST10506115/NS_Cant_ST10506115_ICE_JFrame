/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalinformationpage;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Nathan Cant
 */
public class PersonalInformationPage extends JFrame 
{
    // different options for JFrame
    private JLabel firstNameLabel, surnameLabel, provinceLabel, hobbiesLabel;
    private JTextField firstNameField, surnameField;
    private JComboBox<String> provinceCombo;
    private JCheckBox cricketBox, rugbyBox, footballBox, volleyballBox;
    private JButton submitButton;
    
    public PersonalInformationPage() 
    {
// Setting up the frame
        setTitle("Personal Information Page using JFrame");
        setSize(500, 275);
        
// centre on screen
        setLocationRelativeTo(null);                    
 
// Creating the options/content
        firstNameLabel = new JLabel("First name :");
        surnameLabel = new JLabel("Surname :");
        provinceLabel = new JLabel("Province of residence :");
        hobbiesLabel = new JLabel("Please select hobbies :");
 
        firstNameField = new JTextField(15);
        surnameField = new JTextField(15);
        
 // dropdown list for provinces
        String[] provinces = {"Gauteng", "Western Cape", "Eastern Cape", "Mpumalanga", "Free State"};
        provinceCombo = new JComboBox<>(provinces);
 
// creating checkboxes for hobbies
        cricketBox = new JCheckBox("Cricket");
        rugbyBox = new JCheckBox("Rugby");
        footballBox = new JCheckBox("Football");
        volleyballBox = new JCheckBox("Volleyball");
 
        submitButton = new JButton("Submit");
        
//close the frame when clicking on "submit"
        submitButton.addActionListener(e -> System.exit(0));

        
//=============================Layout===========================================
// GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
//spacing and area
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        
//First name
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(firstNameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(firstNameField, gbc);
        
//surname
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(surnameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(surnameField, gbc);
// provinccer
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(provinceLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(provinceCombo, gbc);
 
// Hobbies panel 
        JPanel hobbiesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
        hobbiesPanel.add(cricketBox);
        hobbiesPanel.add(rugbyBox);
        hobbiesPanel.add(footballBox);
        hobbiesPanel.add(volleyballBox);
 
        JPanel hobbiesSection = new JPanel(new BorderLayout());
        hobbiesSection.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        hobbiesSection.add(hobbiesLabel, BorderLayout.NORTH);
        hobbiesSection.add(hobbiesPanel, BorderLayout.CENTER);
 
// Button panel 
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        buttonPanel.add(submitButton);
 
// Main content: stack the sections with BorderLayout 
        JPanel centrePanel = new JPanel(new BorderLayout());
        centrePanel.add(formPanel, BorderLayout.NORTH);
        centrePanel.add(hobbiesSection, BorderLayout.CENTER);
        centrePanel.add(buttonPanel, BorderLayout.SOUTH);
 
        setLayout(new BorderLayout());
        add(centrePanel, BorderLayout.NORTH);
    }
 
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater
        (() -> 
        {
            PersonalInformationPage page = new PersonalInformationPage();
            page.setVisible(true);
        }
        );
    }
}

