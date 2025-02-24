/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Interfaces;

import Controller.Controller;
import View.TableModels.*;

import javax.swing.*;
import java.awt.event.ItemEvent;

/**
 * @author Lucca
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents(); // Código do NetBeans
        setTextFields(); // Coloca os TextFields que mostram os itens selecionados
        setLocationRelativeTo(null);
    }

    public void setTextFields() {
        Controller.setTextFields(selectedClientTextField, selectedAnimalNameTextField, selectedSpeciesTextField);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerSection = new javax.swing.JPanel();
        clinicNameLabel = new javax.swing.JLabel();
        profileButton = new javax.swing.JButton();
        contentSection = new javax.swing.JPanel();
        fixedInfoContent = new javax.swing.JPanel();
        selectedAnimalPanel = new javax.swing.JPanel();
        selectedAnimalLabel = new javax.swing.JLabel();
        selectedClientLabel = new javax.swing.JLabel();
        selectedClientTextField = new javax.swing.JTextField();
        selectedAnimalNameLabel = new javax.swing.JLabel();
        selectedAnimalNameTextField = new javax.swing.JTextField();
        selectedSpeciesLabel = new javax.swing.JLabel();
        selectedSpeciesTextField = new javax.swing.JTextField();
        appointmentsAndVaccinationPanel = new javax.swing.JPanel();
        recentAppointmentsLabel = new javax.swing.JLabel();
        recentAppointmentsScrollPane = new javax.swing.JScrollPane();
        recentAppointmentsTextArea = new javax.swing.JTextArea();
        nextVaccLabel = new javax.swing.JLabel();
        nextVaccTextField = new javax.swing.JTextField();
        pagesContent = new javax.swing.JPanel();
        pagesTabbedPane = new javax.swing.JTabbedPane();
        ClientAnimals = new javax.swing.JPanel();
        Top0 = new javax.swing.JPanel();
        Info1 = new javax.swing.JPanel();
        clientListLabel0 = new javax.swing.JLabel();
        clientListScrollPane0 = new javax.swing.JScrollPane();
        clientListTable0 = new javax.swing.JTable();
        newClientButton0 = new javax.swing.JButton();
        deleteClientButton0 = new javax.swing.JButton();
        clientSearchLabel0 = new javax.swing.JLabel();
        clientSearchTextField0 = new javax.swing.JTextField();
        Bottom0 = new javax.swing.JPanel();
        Info2 = new javax.swing.JPanel();
        animalListLabel0 = new javax.swing.JLabel();
        animalListScrollPane0 = new javax.swing.JScrollPane();
        animalListTable0 = new javax.swing.JTable();
        newAnimalButton0 = new javax.swing.JButton();
        deleteAnimalButton0 = new javax.swing.JButton();
        animalSearchLabel0 = new javax.swing.JLabel();
        animalSearchTextField0 = new javax.swing.JTextField();
        Treatment = new javax.swing.JPanel();
        Top1 = new javax.swing.JPanel();
        Info3 = new javax.swing.JPanel();
        treatmentListLabel1 = new javax.swing.JLabel();
        treatmentListScrollPane1 = new javax.swing.JScrollPane();
        treatmentListTable1 = new javax.swing.JTable();
        allTreatmentsButton1 = new javax.swing.JButton();
        selectedAnimalTreatmentsButton1 = new javax.swing.JButton();
        Bottom1 = new javax.swing.JPanel();
        Info4 = new javax.swing.JPanel();
        appointmentsListLabel1 = new javax.swing.JLabel();
        appointmentDetailsButton1 = new javax.swing.JButton();
        deleteAppointmentButton1 = new javax.swing.JButton();
        appointmentsListScrollPane1 = new javax.swing.JScrollPane();
        appointmentsListTable1 = new javax.swing.JTable();
        examListLabel1 = new javax.swing.JLabel();
        examListScrollPane1 = new javax.swing.JScrollPane();
        examListTable1 = new javax.swing.JTable();
        examDetailsButton3 = new javax.swing.JButton();
        deleteExamButton2 = new javax.swing.JButton();
        ScheduleAppointment = new javax.swing.JPanel();
        Top2 = new javax.swing.JPanel();
        Info5 = new javax.swing.JPanel();
        vetListLabel2 = new javax.swing.JLabel();
        vetListScrollPane2 = new javax.swing.JScrollPane();
        vetListTable2 = new javax.swing.JTable();
        vetSearchLabel2 = new javax.swing.JLabel();
        vetSearchTextField2 = new javax.swing.JTextField();
        Bottom2 = new javax.swing.JPanel();
        Info6 = new javax.swing.JPanel();
        newTreatmentCheckbox2 = new javax.swing.JCheckBox();
        newAppointmentLabel2 = new javax.swing.JLabel();
        appointmentDateLabel2 = new javax.swing.JLabel();
        appointmentDateTextField2 = new javax.swing.JTextField();
        appointmentVetLabel2 = new javax.swing.JLabel();
        appointmentVetTextField2 = new javax.swing.JTextField();
        appointmentTreatmentLabel2 = new javax.swing.JLabel();
        appointmentTreatmentComboBox2 = new javax.swing.JComboBox<>();
        appointmentTimeLabel2 = new javax.swing.JLabel();
        appointmentTimeTextField2 = new javax.swing.JTextField();
        appointmentSymptomsLabel2 = new javax.swing.JLabel();
        appointmentSymptomsScrollPane2 = new javax.swing.JScrollPane();
        appointmentSymptomsTextArea2 = new javax.swing.JTextArea();
        scheduleAppointmentButton2 = new javax.swing.JButton();
        ExamRequest = new javax.swing.JPanel();
        Top3 = new javax.swing.JPanel();
        Info7 = new javax.swing.JPanel();
        animalAppointmentsLabel3 = new javax.swing.JLabel();
        animalAppointmentsScrollPane3 = new javax.swing.JScrollPane();
        animalAppointmentsTable3 = new javax.swing.JTable();
        animalAppointmentsSearchLabel3 = new javax.swing.JLabel();
        animalAppointmentsSearchTextField3 = new javax.swing.JTextField();
        Bottom3 = new javax.swing.JPanel();
        Info8 = new javax.swing.JPanel();
        newExamRequestLabel3 = new javax.swing.JLabel();
        examRequestDateLabel3 = new javax.swing.JLabel();
        examTypeLabel3 = new javax.swing.JLabel();
        examTypeTextField3 = new javax.swing.JTextField();
        examAppointmentLabel3 = new javax.swing.JLabel();
        examAppointmentTextField3 = new javax.swing.JTextField();
        examDescriptionLabel3 = new javax.swing.JLabel();
        examDescriptionScrollPane3 = new javax.swing.JScrollPane();
        examDescriptionTextArea3 = new javax.swing.JTextArea();
        examRequestButton3 = new javax.swing.JButton();
        examRequestDateTextField3 = new javax.swing.JTextField();
        Vaccination = new javax.swing.JPanel();
        Top4 = new javax.swing.JPanel();
        Info10 = new javax.swing.JPanel();
        vetListLabel4 = new javax.swing.JLabel();
        vetListScrollPane4 = new javax.swing.JScrollPane();
        vetListTable4 = new javax.swing.JTable();
        vetSearchLabel4 = new javax.swing.JLabel();
        vetSearchTextField4 = new javax.swing.JTextField();
        Bottom4 = new javax.swing.JPanel();
        newVaccJPanel = new javax.swing.JPanel();
        newVaccLabel = new javax.swing.JLabel();
        selectedVetVaccLabel = new javax.swing.JLabel();
        selectedVetVaccTextField = new javax.swing.JTextField();
        vaccLabel = new javax.swing.JLabel();
        vaccTextField = new javax.swing.JTextField();
        vaccDateLabel = new javax.swing.JLabel();
        vaccNextDoseLabel = new javax.swing.JLabel();
        vaccDateTextField = new javax.swing.JTextField();
        vaccNextDoseTextField = new javax.swing.JTextField();
        newVaccButton = new javax.swing.JButton();
        selectedAnimalVaccsJPanel = new javax.swing.JPanel();
        selectedAnimalVaccsLabel = new javax.swing.JLabel();
        selectedAnimalVaccsScrollPane = new javax.swing.JScrollPane();
        selectedAnimalVaccsTextArea = new javax.swing.JTextArea();
        Hospitalize = new javax.swing.JPanel();
        Top5 = new javax.swing.JPanel();
        Info11 = new javax.swing.JPanel();
        vetListLabel5 = new javax.swing.JLabel();
        vetListScrollPane5 = new javax.swing.JScrollPane();
        vetListTable5 = new javax.swing.JTable();
        vetSearchLabel5 = new javax.swing.JLabel();
        vetSearchTextField5 = new javax.swing.JTextField();
        Bottom5 = new javax.swing.JPanel();
        newHospitalizeJPanel = new javax.swing.JPanel();
        newHospitalizeLabel = new javax.swing.JLabel();
        selectedVetHospitalizeLabel = new javax.swing.JLabel();
        selectedVetHospitalizeTextField = new javax.swing.JTextField();
        newHospitalizeDateLabel = new javax.swing.JLabel();
        newHospitalizeDateTextField = new javax.swing.JTextField();
        newHospitalizeButton = new javax.swing.JButton();
        followHospitalizeJPanel = new javax.swing.JPanel();
        followHospitalizeLabel = new javax.swing.JLabel();
        followHospitalizeScrollPane = new javax.swing.JScrollPane();
        followHospitalizeTextArea = new javax.swing.JTextArea();
        progressLabel = new javax.swing.JLabel();
        progressScrollPane = new javax.swing.JScrollPane();
        progressTextArea = new javax.swing.JTextArea();
        endHospitalizeCheckBox = new javax.swing.JCheckBox();
        addProgressButton = new javax.swing.JButton();
        Reports = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        reportScrollPane = new javax.swing.JScrollPane();
        reportTextArea = new javax.swing.JTextArea();
        generateNewReportButton = new javax.swing.JButton();
        sabeReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1270, 800));
        setName("mainFrame"); // NOI18N
        setSize(new java.awt.Dimension(1270, 820));

        headerSection.setBackground(new java.awt.Color(9, 163, 88));
        headerSection.setToolTipText("");
        headerSection.setMinimumSize(new java.awt.Dimension(1280, 50));
        headerSection.setPreferredSize(new java.awt.Dimension(1280, 50));

        clinicNameLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        clinicNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        clinicNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clinicNameLabel.setText("VITALPET");
        clinicNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clinicNameLabel.setPreferredSize(new java.awt.Dimension(209, 50));

        profileButton.setBackground(new java.awt.Color(44, 122, 28));
        profileButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Perfil");
        profileButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        profileButton.setBorderPainted(false);
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.setMaximumSize(new java.awt.Dimension(70, 30));
        profileButton.setMinimumSize(new java.awt.Dimension(70, 30));
        profileButton.setPreferredSize(new java.awt.Dimension(70, 30));
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerSectionLayout = new javax.swing.GroupLayout(headerSection);
        headerSection.setLayout(headerSectionLayout);
        headerSectionLayout.setHorizontalGroup(
            headerSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerSectionLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(clinicNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(317, 317, 317)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerSectionLayout.setVerticalGroup(
            headerSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clinicNameLabel, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(profileButton, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(headerSection, java.awt.BorderLayout.PAGE_START);

        contentSection.setBackground(new java.awt.Color(243, 243, 243));
        contentSection.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contentSection.setLayout(new java.awt.BorderLayout(0, 10));

        fixedInfoContent.setBackground(new java.awt.Color(243, 243, 243));
        fixedInfoContent.setToolTipText("");
        fixedInfoContent.setPreferredSize(new java.awt.Dimension(1280, 210));
        fixedInfoContent.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        selectedAnimalPanel.setBackground(new java.awt.Color(217, 217, 217));
        selectedAnimalPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        selectedAnimalPanel.setPreferredSize(new java.awt.Dimension(500, 190));

        selectedAnimalLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        selectedAnimalLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedAnimalLabel.setText("Animal Selecionado");

        selectedClientLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectedClientLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedClientLabel.setText("Cliente:");

        selectedClientTextField.setEditable(false);
        selectedClientTextField.setBackground(new java.awt.Color(250, 250, 250));
        selectedClientTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectedClientTextField.setForeground(new java.awt.Color(102, 102, 102));
        selectedClientTextField.setText("Selecione um Cliente...");

        selectedAnimalNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectedAnimalNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedAnimalNameLabel.setText("Animal:");

        selectedAnimalNameTextField.setEditable(false);
        selectedAnimalNameTextField.setBackground(new java.awt.Color(250, 250, 250));
        selectedAnimalNameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectedAnimalNameTextField.setForeground(new java.awt.Color(102, 102, 102));
        selectedAnimalNameTextField.setText("Selecione um Cliente...");

        selectedSpeciesLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectedSpeciesLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedSpeciesLabel.setText("Espécie:");

        selectedSpeciesTextField.setEditable(false);
        selectedSpeciesTextField.setBackground(new java.awt.Color(250, 250, 250));
        selectedSpeciesTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectedSpeciesTextField.setForeground(new java.awt.Color(102, 102, 102));
        selectedSpeciesTextField.setText("Selecione um Cliente...");

        javax.swing.GroupLayout selectedAnimalPanelLayout = new javax.swing.GroupLayout(selectedAnimalPanel);
        selectedAnimalPanel.setLayout(selectedAnimalPanelLayout);
        selectedAnimalPanelLayout.setHorizontalGroup(
            selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAnimalPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectedAnimalPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selectedAnimalPanelLayout.createSequentialGroup()
                                .addComponent(selectedClientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedClientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(selectedAnimalPanelLayout.createSequentialGroup()
                                .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectedSpeciesLabel)
                                    .addComponent(selectedAnimalNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectedAnimalNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                    .addComponent(selectedSpeciesTextField)))))
                    .addComponent(selectedAnimalLabel))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        selectedAnimalPanelLayout.setVerticalGroup(
            selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAnimalPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(selectedAnimalLabel)
                .addGap(18, 18, 18)
                .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedClientLabel)
                    .addComponent(selectedClientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedAnimalNameLabel)
                    .addComponent(selectedAnimalNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(selectedAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedSpeciesLabel)
                    .addComponent(selectedSpeciesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        fixedInfoContent.add(selectedAnimalPanel);

        appointmentsAndVaccinationPanel.setBackground(new java.awt.Color(217, 217, 217));
        appointmentsAndVaccinationPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        appointmentsAndVaccinationPanel.setPreferredSize(new java.awt.Dimension(700, 190));

        recentAppointmentsLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        recentAppointmentsLabel.setForeground(new java.awt.Color(0, 0, 0));
        recentAppointmentsLabel.setText("Consultas Recentes");

        recentAppointmentsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        recentAppointmentsTextArea.setEditable(false);
        recentAppointmentsTextArea.setBackground(new java.awt.Color(250, 250, 250));
        recentAppointmentsTextArea.setColumns(20);
        recentAppointmentsTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        recentAppointmentsTextArea.setForeground(new java.awt.Color(102, 102, 102));
        recentAppointmentsTextArea.setLineWrap(true);
        recentAppointmentsTextArea.setRows(5);
        recentAppointmentsTextArea.setToolTipText("");
        recentAppointmentsTextArea.setCaretColor(new java.awt.Color(153, 153, 153));
        recentAppointmentsTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recentAppointmentsScrollPane.setViewportView(recentAppointmentsTextArea);

        nextVaccLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        nextVaccLabel.setForeground(new java.awt.Color(0, 0, 0));
        nextVaccLabel.setText("Próxima Vacinação");

        nextVaccTextField.setEditable(false);
        nextVaccTextField.setBackground(new java.awt.Color(250, 250, 250));
        nextVaccTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nextVaccTextField.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout appointmentsAndVaccinationPanelLayout = new javax.swing.GroupLayout(appointmentsAndVaccinationPanel);
        appointmentsAndVaccinationPanel.setLayout(appointmentsAndVaccinationPanelLayout);
        appointmentsAndVaccinationPanelLayout.setHorizontalGroup(
            appointmentsAndVaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsAndVaccinationPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(appointmentsAndVaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextVaccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recentAppointmentsLabel)
                    .addComponent(recentAppointmentsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addComponent(nextVaccTextField))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        appointmentsAndVaccinationPanelLayout.setVerticalGroup(
            appointmentsAndVaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsAndVaccinationPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(recentAppointmentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recentAppointmentsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextVaccLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextVaccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        fixedInfoContent.add(appointmentsAndVaccinationPanel);

        contentSection.add(fixedInfoContent, java.awt.BorderLayout.PAGE_START);

        pagesContent.setBackground(new java.awt.Color(243, 243, 243));
        pagesContent.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        pagesTabbedPane.setBackground(new java.awt.Color(204, 204, 204));
        pagesTabbedPane.setForeground(java.awt.SystemColor.activeCaptionText);
        pagesTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        pagesTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pagesTabbedPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pagesTabbedPane.setPreferredSize(new java.awt.Dimension(1220, 500));
        pagesTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pagesTabbedPaneStateChanged(evt);
            }
        });

        ClientAnimals.setBackground(new java.awt.Color(217, 217, 217));
        ClientAnimals.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ClientAnimals.setForeground(new java.awt.Color(0, 0, 0));
        ClientAnimals.setLayout(new java.awt.GridLayout(2, 0));

        Top0.setBackground(new java.awt.Color(217, 217, 217));

        Info1.setBackground(new java.awt.Color(217, 217, 217));
        Info1.setPreferredSize(new java.awt.Dimension(1200, 220));

        clientListLabel0.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        clientListLabel0.setForeground(new java.awt.Color(0, 0, 0));
        clientListLabel0.setText("Selecionar Clientes");

        clientListScrollPane0.setBackground(new java.awt.Color(255, 255, 255));
        clientListScrollPane0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        clientListScrollPane0.setForeground(new java.awt.Color(255, 255, 255));

        clientListTable0.setBackground(new java.awt.Color(255, 255, 255));
        clientListTable0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clientListTable0.setForeground(new java.awt.Color(0, 0, 0));
        clientListTable0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        clientListTable0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientListTable0.setSelectionBackground(new java.awt.Color(9, 163, 88));
        clientListTable0.setSelectionForeground(new java.awt.Color(255, 255, 255));
        clientListTable0.setShowGrid(false);
        clientListTable0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientListTable0MousePressed(evt);
            }
        });
        clientListScrollPane0.setViewportView(clientListTable0);

        newClientButton0.setBackground(new java.awt.Color(255, 255, 255));
        newClientButton0.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        newClientButton0.setForeground(new java.awt.Color(0, 0, 0));
        newClientButton0.setText("Novo Cliente");
        newClientButton0.setAlignmentY(0.0F);
        newClientButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newClientButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClientButton0ActionPerformed(evt);
            }
        });

        deleteClientButton0.setBackground(new java.awt.Color(255, 255, 255));
        deleteClientButton0.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        deleteClientButton0.setForeground(new java.awt.Color(0, 0, 0));
        deleteClientButton0.setText("Excluir Cliente");
        deleteClientButton0.setAlignmentY(0.0F);
        deleteClientButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteClientButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButton0ActionPerformed(evt);
            }
        });

        clientSearchLabel0.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        clientSearchLabel0.setForeground(new java.awt.Color(0, 0, 0));
        clientSearchLabel0.setText("Buscar:");

        clientSearchTextField0.setBackground(new java.awt.Color(250, 250, 250));
        clientSearchTextField0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clientSearchTextField0.setForeground(new java.awt.Color(102, 102, 102));
        clientSearchTextField0.setText("Busque um Cliente...");
        clientSearchTextField0.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        clientSearchTextField0.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clientSearchTextField0FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clientSearchTextField0FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info1Layout = new javax.swing.GroupLayout(Info1);
        Info1.setLayout(Info1Layout);
        Info1Layout.setHorizontalGroup(
            Info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(clientListScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Info1Layout.createSequentialGroup()
                        .addComponent(clientListLabel0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newClientButton0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteClientButton0)
                        .addGap(18, 18, 18)
                        .addComponent(clientSearchLabel0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientSearchTextField0, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Info1Layout.setVerticalGroup(
            Info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientListLabel0, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clientSearchTextField0)
                        .addComponent(clientSearchLabel0))
                    .addComponent(newClientButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteClientButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientListScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Top0.add(Info1);

        ClientAnimals.add(Top0);

        Bottom0.setBackground(new java.awt.Color(217, 217, 217));

        Info2.setBackground(new java.awt.Color(217, 217, 217));
        Info2.setPreferredSize(new java.awt.Dimension(1200, 220));

        animalListLabel0.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        animalListLabel0.setForeground(new java.awt.Color(0, 0, 0));
        animalListLabel0.setText("Lista de Animais");

        animalListScrollPane0.setBackground(new java.awt.Color(255, 255, 255));
        animalListScrollPane0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        animalListScrollPane0.setForeground(new java.awt.Color(204, 204, 204));

        animalListTable0.setBackground(new java.awt.Color(250, 250, 250));
        animalListTable0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        animalListTable0.setForeground(new java.awt.Color(0, 0, 0));
        animalListTable0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        animalListTable0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalListTable0.setSelectionBackground(new java.awt.Color(9, 163, 88));
        animalListTable0.setSelectionForeground(new java.awt.Color(255, 255, 255));
        animalListTable0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                animalListTable0MousePressed(evt);
            }
        });
        animalListScrollPane0.setViewportView(animalListTable0);

        newAnimalButton0.setBackground(new java.awt.Color(255, 255, 255));
        newAnimalButton0.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        newAnimalButton0.setForeground(new java.awt.Color(0, 0, 0));
        newAnimalButton0.setText("Novo Animal");
        newAnimalButton0.setAlignmentY(0.0F);
        newAnimalButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAnimalButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAnimalButton0ActionPerformed(evt);
            }
        });

        deleteAnimalButton0.setBackground(new java.awt.Color(255, 255, 255));
        deleteAnimalButton0.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        deleteAnimalButton0.setForeground(new java.awt.Color(0, 0, 0));
        deleteAnimalButton0.setText("Excluir Animal");
        deleteAnimalButton0.setAlignmentY(0.0F);
        deleteAnimalButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAnimalButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAnimalButton0ActionPerformed(evt);
            }
        });

        animalSearchLabel0.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        animalSearchLabel0.setForeground(new java.awt.Color(0, 0, 0));
        animalSearchLabel0.setText("Buscar:");

        animalSearchTextField0.setBackground(new java.awt.Color(250, 250, 250));
        animalSearchTextField0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        animalSearchTextField0.setForeground(new java.awt.Color(102, 102, 102));
        animalSearchTextField0.setText("Busque um Animal...");
        animalSearchTextField0.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        animalSearchTextField0.setSelectionEnd(20);
        animalSearchTextField0.setSelectionStart(20);
        animalSearchTextField0.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                animalSearchTextField0FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                animalSearchTextField0FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info2Layout = new javax.swing.GroupLayout(Info2);
        Info2.setLayout(Info2Layout);
        Info2Layout.setHorizontalGroup(
            Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info2Layout.createSequentialGroup()
                        .addComponent(animalListScrollPane0, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(Info2Layout.createSequentialGroup()
                        .addComponent(animalListLabel0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newAnimalButton0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteAnimalButton0)
                        .addGap(18, 18, 18)
                        .addComponent(animalSearchLabel0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalSearchTextField0, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        Info2Layout.setVerticalGroup(
            Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalListLabel0)
                    .addGroup(Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(animalSearchTextField0)
                        .addComponent(animalSearchLabel0))
                    .addGroup(Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newAnimalButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteAnimalButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(animalListScrollPane0, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        Bottom0.add(Info2);

        ClientAnimals.add(Bottom0);

        pagesTabbedPane.addTab("<html> <b>Clientes e Animais<b> </html>", ClientAnimals);

        Treatment.setBackground(new java.awt.Color(217, 217, 217));
        Treatment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Treatment.setLayout(new java.awt.GridLayout(2, 0));

        Top1.setBackground(new java.awt.Color(217, 217, 217));

        Info3.setBackground(new java.awt.Color(217, 217, 217));
        Info3.setPreferredSize(new java.awt.Dimension(1200, 220));

        treatmentListLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        treatmentListLabel1.setForeground(new java.awt.Color(0, 0, 0));
        treatmentListLabel1.setText("Selecionar Tratamentos");

        treatmentListScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        treatmentListScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        treatmentListScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        treatmentListTable1.setBackground(new java.awt.Color(250, 250, 250));
        treatmentListTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        treatmentListTable1.setForeground(new java.awt.Color(0, 0, 0));
        treatmentListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        treatmentListTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        treatmentListTable1.setSelectionBackground(new java.awt.Color(9, 163, 88));
        treatmentListTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        treatmentListTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                treatmentListTable1MousePressed(evt);
            }
        });
        treatmentListScrollPane1.setViewportView(treatmentListTable1);

        allTreatmentsButton1.setBackground(new java.awt.Color(255, 255, 255));
        allTreatmentsButton1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        allTreatmentsButton1.setForeground(new java.awt.Color(0, 0, 0));
        allTreatmentsButton1.setText("Todos");
        allTreatmentsButton1.setAlignmentY(0.0F);
        allTreatmentsButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allTreatmentsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTreatmentsButton1ActionPerformed(evt);
            }
        });

        selectedAnimalTreatmentsButton1.setBackground(new java.awt.Color(255, 255, 255));
        selectedAnimalTreatmentsButton1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        selectedAnimalTreatmentsButton1.setForeground(new java.awt.Color(0, 0, 0));
        selectedAnimalTreatmentsButton1.setText("Do Animal Selecionado");
        selectedAnimalTreatmentsButton1.setAlignmentY(0.0F);
        selectedAnimalTreatmentsButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectedAnimalTreatmentsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedAnimalTreatmentsButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Info3Layout = new javax.swing.GroupLayout(Info3);
        Info3.setLayout(Info3Layout);
        Info3Layout.setHorizontalGroup(
            Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info3Layout.createSequentialGroup()
                        .addComponent(treatmentListLabel1)
                        .addGap(749, 749, 749)
                        .addComponent(allTreatmentsButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedAnimalTreatmentsButton1))
                    .addComponent(treatmentListScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Info3Layout.setVerticalGroup(
            Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treatmentListLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectedAnimalTreatmentsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(allTreatmentsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(treatmentListScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        Top1.add(Info3);

        Treatment.add(Top1);

        Bottom1.setBackground(new java.awt.Color(217, 217, 217));

        Info4.setBackground(new java.awt.Color(217, 217, 217));
        Info4.setPreferredSize(new java.awt.Dimension(1200, 220));

        appointmentsListLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        appointmentsListLabel1.setForeground(new java.awt.Color(0, 0, 0));
        appointmentsListLabel1.setText("Lista de Consultas");

        appointmentDetailsButton1.setBackground(new java.awt.Color(255, 255, 255));
        appointmentDetailsButton1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        appointmentDetailsButton1.setForeground(new java.awt.Color(0, 0, 0));
        appointmentDetailsButton1.setText("Acessar Detalhes");
        appointmentDetailsButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentDetailsButton1ActionPerformed(evt);
            }
        });

        deleteAppointmentButton1.setBackground(new java.awt.Color(255, 255, 255));
        deleteAppointmentButton1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        deleteAppointmentButton1.setForeground(new java.awt.Color(0, 0, 0));
        deleteAppointmentButton1.setText("Excluir Consulta");
        deleteAppointmentButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        appointmentsListScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        appointmentsListScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        appointmentsListScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        appointmentsListTable1.setBackground(new java.awt.Color(250, 250, 250));
        appointmentsListTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        appointmentsListTable1.setForeground(new java.awt.Color(0, 0, 0));
        appointmentsListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        appointmentsListTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentsListTable1.setSelectionBackground(new java.awt.Color(9, 163, 88));
        appointmentsListTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        appointmentsListTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appointmentsListTable1MousePressed(evt);
            }
        });
        appointmentsListScrollPane1.setViewportView(appointmentsListTable1);

        examListLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        examListLabel1.setForeground(new java.awt.Color(0, 0, 0));
        examListLabel1.setText("Lista de Exames");

        examListScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        examListScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        examListScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        examListTable1.setBackground(new java.awt.Color(250, 250, 250));
        examListTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        examListTable1.setForeground(new java.awt.Color(0, 0, 0));
        examListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        examListTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        examListTable1.setSelectionBackground(new java.awt.Color(9, 163, 88));
        examListTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        examListScrollPane1.setViewportView(examListTable1);

        examDetailsButton3.setBackground(new java.awt.Color(255, 255, 255));
        examDetailsButton3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        examDetailsButton3.setForeground(new java.awt.Color(0, 0, 0));
        examDetailsButton3.setText("AcessarDetalhes");
        examDetailsButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        examDetailsButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examDetailsButton3ActionPerformed(evt);
            }
        });

        deleteExamButton2.setBackground(new java.awt.Color(255, 255, 255));
        deleteExamButton2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        deleteExamButton2.setForeground(new java.awt.Color(0, 0, 0));
        deleteExamButton2.setText("Excluir Exame");
        deleteExamButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Info4Layout = new javax.swing.GroupLayout(Info4);
        Info4.setLayout(Info4Layout);
        Info4Layout.setHorizontalGroup(
            Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Info4Layout.createSequentialGroup()
                        .addComponent(appointmentsListLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appointmentDetailsButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteAppointmentButton1))
                    .addComponent(appointmentsListScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examListScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Info4Layout.createSequentialGroup()
                        .addComponent(examListLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examDetailsButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteExamButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Info4Layout.setVerticalGroup(
            Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info4Layout.createSequentialGroup()
                .addGroup(Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentsListLabel1)
                    .addComponent(deleteAppointmentButton1)
                    .addComponent(appointmentDetailsButton1)
                    .addComponent(examListLabel1)
                    .addComponent(examDetailsButton3)
                    .addComponent(deleteExamButton2))
                .addGap(8, 8, 8)
                .addGroup(Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examListScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(appointmentsListScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Bottom1.add(Info4);

        Treatment.add(Bottom1);

        pagesTabbedPane.addTab("<html> <b>Tratamentos<b> </html>", Treatment);

        ScheduleAppointment.setBackground(new java.awt.Color(217, 217, 217));
        ScheduleAppointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ScheduleAppointment.setLayout(new java.awt.GridLayout(2, 0));

        Top2.setBackground(new java.awt.Color(217, 217, 217));

        Info5.setBackground(new java.awt.Color(217, 217, 217));
        Info5.setPreferredSize(new java.awt.Dimension(1200, 220));

        vetListLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        vetListLabel2.setForeground(new java.awt.Color(0, 0, 0));
        vetListLabel2.setText("Selecionar Veterinário");

        vetListScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        vetListScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        vetListScrollPane2.setForeground(new java.awt.Color(204, 204, 204));

        vetListTable2.setBackground(new java.awt.Color(250, 250, 250));
        vetListTable2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vetListTable2.setForeground(new java.awt.Color(0, 0, 0));
        vetListTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        vetListTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vetListTable2.setSelectionBackground(new java.awt.Color(9, 163, 88));
        vetListTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        vetListTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vetListTable2MousePressed(evt);
            }
        });
        vetListScrollPane2.setViewportView(vetListTable2);

        vetSearchLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        vetSearchLabel2.setForeground(new java.awt.Color(0, 0, 0));
        vetSearchLabel2.setText("Buscar:");

        vetSearchTextField2.setBackground(new java.awt.Color(250, 250, 250));
        vetSearchTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vetSearchTextField2.setForeground(new java.awt.Color(102, 102, 102));
        vetSearchTextField2.setText("Busque um(a) Veterinário(a)...");
        vetSearchTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        vetSearchTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vetSearchTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vetSearchTextField2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info5Layout = new javax.swing.GroupLayout(Info5);
        Info5.setLayout(Info5Layout);
        Info5Layout.setHorizontalGroup(
            Info5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vetListScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Info5Layout.createSequentialGroup()
                        .addComponent(vetListLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vetSearchLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vetSearchTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Info5Layout.setVerticalGroup(
            Info5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vetListLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Info5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vetSearchTextField2)
                        .addComponent(vetSearchLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vetListScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Top2.add(Info5);

        ScheduleAppointment.add(Top2);

        Bottom2.setBackground(new java.awt.Color(217, 217, 217));

        Info6.setBackground(new java.awt.Color(217, 217, 217));
        Info6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Info6.setPreferredSize(new java.awt.Dimension(1170, 210));

        newTreatmentCheckbox2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        newTreatmentCheckbox2.setForeground(new java.awt.Color(102, 102, 102));
        newTreatmentCheckbox2.setText("Novo Tratamento?");
        newTreatmentCheckbox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newTreatmentCheckbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTreatmentCheckbox2ActionPerformed(evt);
            }
        });

        newAppointmentLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        newAppointmentLabel2.setForeground(new java.awt.Color(0, 0, 0));
        newAppointmentLabel2.setText("Agendar Nova Consulta");

        appointmentDateLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        appointmentDateLabel2.setForeground(new java.awt.Color(0, 0, 0));
        appointmentDateLabel2.setText("Data:");

        appointmentDateTextField2.setBackground(new java.awt.Color(255, 255, 255));
        appointmentDateTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        appointmentDateTextField2.setForeground(new java.awt.Color(102, 102, 102));
        appointmentDateTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                appointmentDateTextField2FocusLost(evt);
            }
        });

        appointmentVetLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        appointmentVetLabel2.setForeground(new java.awt.Color(0, 0, 0));
        appointmentVetLabel2.setText("Veterinário(a):");

        appointmentVetTextField2.setEditable(false);
        appointmentVetTextField2.setBackground(new java.awt.Color(250, 250, 250));
        appointmentVetTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        appointmentVetTextField2.setForeground(new java.awt.Color(102, 102, 102));
        appointmentVetTextField2.setText("Selecione um(a) Veterinário(a)");
        appointmentVetTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentVetTextField2ActionPerformed(evt);
            }
        });

        appointmentTreatmentLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        appointmentTreatmentLabel2.setForeground(new java.awt.Color(0, 0, 0));
        appointmentTreatmentLabel2.setText("Tratamento:");

        appointmentTreatmentComboBox2.setBackground(new java.awt.Color(250, 250, 250));
        appointmentTreatmentComboBox2.setEditable(true);
        appointmentTreatmentComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        appointmentTreatmentComboBox2.setForeground(new java.awt.Color(102, 102, 102));
        appointmentTreatmentComboBox2.setRequestFocusEnabled(true);
        appointmentTreatmentComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                appointmentTreatmentComboBox2ItemStateChanged(evt);
            }
        });

        appointmentTimeLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        appointmentTimeLabel2.setForeground(new java.awt.Color(0, 0, 0));
        appointmentTimeLabel2.setText("Horário:");

        appointmentTimeTextField2.setBackground(new java.awt.Color(255, 255, 255));
        appointmentTimeTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        appointmentTimeTextField2.setForeground(new java.awt.Color(102, 102, 102));
        appointmentTimeTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                appointmentTimeTextField2FocusLost(evt);
            }
        });

        appointmentSymptomsLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        appointmentSymptomsLabel2.setForeground(new java.awt.Color(0, 0, 0));
        appointmentSymptomsLabel2.setText("Sintomas:");

        appointmentSymptomsScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        appointmentSymptomsTextArea2.setBackground(new java.awt.Color(250, 250, 250));
        appointmentSymptomsTextArea2.setColumns(20);
        appointmentSymptomsTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        appointmentSymptomsTextArea2.setForeground(new java.awt.Color(102, 102, 102));
        appointmentSymptomsTextArea2.setLineWrap(true);
        appointmentSymptomsTextArea2.setRows(5);
        appointmentSymptomsTextArea2.setText("Coloque os sintomas aqui....");
        appointmentSymptomsTextArea2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                appointmentSymptomsTextArea2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                appointmentSymptomsTextArea2FocusLost(evt);
            }
        });
        appointmentSymptomsScrollPane2.setViewportView(appointmentSymptomsTextArea2);

        scheduleAppointmentButton2.setBackground(new java.awt.Color(255, 255, 255));
        scheduleAppointmentButton2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        scheduleAppointmentButton2.setForeground(new java.awt.Color(0, 0, 0));
        scheduleAppointmentButton2.setText("Agendar Consulta");
        scheduleAppointmentButton2.setActionCommand("");
        scheduleAppointmentButton2.setAlignmentY(0.0F);
        scheduleAppointmentButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleAppointmentButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppointmentButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Info6Layout = new javax.swing.GroupLayout(Info6);
        Info6.setLayout(Info6Layout);
        Info6Layout.setHorizontalGroup(
            Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info6Layout.createSequentialGroup()
                        .addComponent(newAppointmentLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Info6Layout.createSequentialGroup()
                        .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Info6Layout.createSequentialGroup()
                                .addComponent(newTreatmentCheckbox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE))
                            .addGroup(Info6Layout.createSequentialGroup()
                                .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(Info6Layout.createSequentialGroup()
                                        .addComponent(appointmentDateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(appointmentDateTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(appointmentTimeLabel2)
                                        .addGap(12, 12, 12)
                                        .addComponent(appointmentTimeTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                    .addGroup(Info6Layout.createSequentialGroup()
                                        .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(appointmentVetLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(appointmentTreatmentLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(appointmentTreatmentComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(appointmentVetTextField2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(appointmentSymptomsLabel2)
                                .addGap(12, 12, 12)))
                        .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appointmentSymptomsScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scheduleAppointmentButton2))
                        .addGap(16, 16, 16))))
        );
        Info6Layout.setVerticalGroup(
            Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(newAppointmentLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Info6Layout.createSequentialGroup()
                        .addComponent(appointmentSymptomsLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(appointmentDateTextField2)
                        .addComponent(appointmentDateLabel2)
                        .addComponent(appointmentTimeLabel2))
                    .addComponent(appointmentTimeTextField2))
                .addGap(18, 18, 18)
                .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentVetTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentVetLabel2))
                .addGap(18, 18, 18)
                .addGroup(Info6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentTreatmentComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointmentTreatmentLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTreatmentCheckbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Info6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appointmentSymptomsScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scheduleAppointmentButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        Bottom2.add(Info6);

        ScheduleAppointment.add(Bottom2);

        pagesTabbedPane.addTab("<html> <b>Consultas<b> </html>", ScheduleAppointment);

        ExamRequest.setBackground(new java.awt.Color(217, 217, 217));
        ExamRequest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ExamRequest.setLayout(new java.awt.GridLayout(2, 0));

        Top3.setBackground(new java.awt.Color(217, 217, 217));

        Info7.setBackground(new java.awt.Color(217, 217, 217));
        Info7.setPreferredSize(new java.awt.Dimension(1200, 220));

        animalAppointmentsLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        animalAppointmentsLabel3.setForeground(new java.awt.Color(0, 0, 0));
        animalAppointmentsLabel3.setText("Selecionar Consultas do Animal");

        animalAppointmentsScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        animalAppointmentsScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        animalAppointmentsScrollPane3.setForeground(new java.awt.Color(204, 204, 204));

        animalAppointmentsTable3.setBackground(new java.awt.Color(250, 250, 250));
        animalAppointmentsTable3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        animalAppointmentsTable3.setForeground(new java.awt.Color(0, 0, 0));
        animalAppointmentsTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        animalAppointmentsTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalAppointmentsTable3.setSelectionBackground(new java.awt.Color(9, 163, 88));
        animalAppointmentsTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        animalAppointmentsTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                animalAppointmentsTable3MousePressed(evt);
            }
        });
        animalAppointmentsScrollPane3.setViewportView(animalAppointmentsTable3);

        animalAppointmentsSearchLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        animalAppointmentsSearchLabel3.setForeground(new java.awt.Color(0, 0, 0));
        animalAppointmentsSearchLabel3.setText("Buscar:");

        animalAppointmentsSearchTextField3.setBackground(new java.awt.Color(250, 250, 250));
        animalAppointmentsSearchTextField3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        animalAppointmentsSearchTextField3.setForeground(new java.awt.Color(102, 102, 102));
        animalAppointmentsSearchTextField3.setText("Busque uma Consulta...");
        animalAppointmentsSearchTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        animalAppointmentsSearchTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                animalAppointmentsSearchTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                animalAppointmentsSearchTextField3FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info7Layout = new javax.swing.GroupLayout(Info7);
        Info7.setLayout(Info7Layout);
        Info7Layout.setHorizontalGroup(
            Info7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(animalAppointmentsScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Info7Layout.createSequentialGroup()
                        .addComponent(animalAppointmentsLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(animalAppointmentsSearchLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalAppointmentsSearchTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Info7Layout.setVerticalGroup(
            Info7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(animalAppointmentsSearchTextField3)
                        .addComponent(animalAppointmentsSearchLabel3))
                    .addComponent(animalAppointmentsLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(animalAppointmentsScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Top3.add(Info7);

        ExamRequest.add(Top3);

        Bottom3.setBackground(new java.awt.Color(217, 217, 217));

        Info8.setBackground(new java.awt.Color(217, 217, 217));
        Info8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Info8.setPreferredSize(new java.awt.Dimension(1170, 210));

        newExamRequestLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        newExamRequestLabel3.setForeground(new java.awt.Color(0, 0, 0));
        newExamRequestLabel3.setText("Solicitar Novo Exame");

        examRequestDateLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        examRequestDateLabel3.setForeground(new java.awt.Color(0, 0, 0));
        examRequestDateLabel3.setText("Data Solicitação:");

        examTypeLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        examTypeLabel3.setForeground(new java.awt.Color(0, 0, 0));
        examTypeLabel3.setText("Tipo:");

        examTypeTextField3.setBackground(new java.awt.Color(250, 250, 250));
        examTypeTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        examTypeTextField3.setForeground(new java.awt.Color(102, 102, 102));
        examTypeTextField3.setText("Especifique o tipo do Exame...");
        examTypeTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                examTypeTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                examTypeTextField3FocusLost(evt);
            }
        });

        examAppointmentLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        examAppointmentLabel3.setForeground(new java.awt.Color(0, 0, 0));
        examAppointmentLabel3.setText("Consulta:");

        examAppointmentTextField3.setEditable(false);
        examAppointmentTextField3.setBackground(new java.awt.Color(250, 250, 250));
        examAppointmentTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        examAppointmentTextField3.setForeground(new java.awt.Color(102, 102, 102));
        examAppointmentTextField3.setText("Selecione uma Consulta...");
        examAppointmentTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examAppointmentTextField3ActionPerformed(evt);
            }
        });

        examDescriptionLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        examDescriptionLabel3.setForeground(new java.awt.Color(0, 0, 0));
        examDescriptionLabel3.setText("Descrição:");

        examDescriptionTextArea3.setBackground(new java.awt.Color(250, 250, 250));
        examDescriptionTextArea3.setColumns(20);
        examDescriptionTextArea3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        examDescriptionTextArea3.setForeground(new java.awt.Color(102, 102, 102));
        examDescriptionTextArea3.setLineWrap(true);
        examDescriptionTextArea3.setRows(5);
        examDescriptionTextArea3.setText("Digite a descrição do Exame...");
        examDescriptionTextArea3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                examDescriptionTextArea3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                examDescriptionTextArea3FocusLost(evt);
            }
        });
        examDescriptionScrollPane3.setViewportView(examDescriptionTextArea3);

        examRequestButton3.setBackground(new java.awt.Color(255, 255, 255));
        examRequestButton3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        examRequestButton3.setForeground(new java.awt.Color(0, 0, 0));
        examRequestButton3.setText("Solicitar Exame");
        examRequestButton3.setActionCommand("");
        examRequestButton3.setAlignmentY(0.0F);
        examRequestButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        examRequestButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examRequestButton3ActionPerformed(evt);
            }
        });

        examRequestDateTextField3.setBackground(new java.awt.Color(255, 255, 255));
        examRequestDateTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        examRequestDateTextField3.setForeground(new java.awt.Color(102, 102, 102));
        examRequestDateTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                examRequestDateTextField3FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info8Layout = new javax.swing.GroupLayout(Info8);
        Info8.setLayout(Info8Layout);
        Info8Layout.setHorizontalGroup(
            Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info8Layout.createSequentialGroup()
                        .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Info8Layout.createSequentialGroup()
                                .addComponent(examRequestDateLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(examRequestDateTextField3))
                            .addGroup(Info8Layout.createSequentialGroup()
                                .addComponent(examTypeLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(examTypeTextField3))
                            .addGroup(Info8Layout.createSequentialGroup()
                                .addComponent(examAppointmentLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(examAppointmentTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addComponent(examDescriptionLabel3))
                    .addComponent(newExamRequestLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(examDescriptionScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examRequestButton3))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Info8Layout.setVerticalGroup(
            Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(newExamRequestLabel3)
                .addGap(18, 18, 18)
                .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Info8Layout.createSequentialGroup()
                        .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examRequestDateLabel3)
                            .addComponent(examDescriptionLabel3)
                            .addComponent(examRequestDateTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examTypeLabel3)
                            .addComponent(examTypeTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Info8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examAppointmentLabel3)
                            .addComponent(examAppointmentTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Info8Layout.createSequentialGroup()
                        .addComponent(examDescriptionScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(examRequestButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Bottom3.add(Info8);

        ExamRequest.add(Bottom3);

        pagesTabbedPane.addTab("<html> <b>Exames<b> </html>", ExamRequest);

        Vaccination.setBackground(new java.awt.Color(217, 217, 217));
        Vaccination.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Vaccination.setLayout(new java.awt.GridLayout(2, 0));

        Top4.setBackground(new java.awt.Color(217, 217, 217));

        Info10.setBackground(new java.awt.Color(217, 217, 217));
        Info10.setPreferredSize(new java.awt.Dimension(1200, 220));

        vetListLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        vetListLabel4.setForeground(new java.awt.Color(0, 0, 0));
        vetListLabel4.setText("Selecionar Veterinário");

        vetListScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        vetListScrollPane4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        vetListScrollPane4.setForeground(new java.awt.Color(204, 204, 204));

        vetListTable4.setBackground(new java.awt.Color(250, 250, 250));
        vetListTable4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vetListTable4.setForeground(new java.awt.Color(0, 0, 0));
        vetListTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        vetListTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vetListTable4.setSelectionBackground(new java.awt.Color(9, 163, 88));
        vetListTable4.setSelectionForeground(new java.awt.Color(255, 255, 255));
        vetListTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vetListTable4MousePressed(evt);
            }
        });
        vetListScrollPane4.setViewportView(vetListTable4);

        vetSearchLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        vetSearchLabel4.setForeground(new java.awt.Color(0, 0, 0));
        vetSearchLabel4.setText("Buscar:");

        vetSearchTextField4.setBackground(new java.awt.Color(250, 250, 250));
        vetSearchTextField4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vetSearchTextField4.setForeground(new java.awt.Color(102, 102, 102));
        vetSearchTextField4.setText("Busque um(a) Veterinário(a)...");
        vetSearchTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        vetSearchTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vetSearchTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vetSearchTextField4FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info10Layout = new javax.swing.GroupLayout(Info10);
        Info10.setLayout(Info10Layout);
        Info10Layout.setHorizontalGroup(
            Info10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vetListScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Info10Layout.createSequentialGroup()
                        .addComponent(vetListLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vetSearchLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vetSearchTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Info10Layout.setVerticalGroup(
            Info10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vetListLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Info10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vetSearchTextField4)
                        .addComponent(vetSearchLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vetListScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Top4.add(Info10);

        Vaccination.add(Top4);

        Bottom4.setBackground(new java.awt.Color(217, 217, 217));
        Bottom4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        newVaccJPanel.setBackground(new java.awt.Color(217, 217, 217));
        newVaccJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        newVaccJPanel.setPreferredSize(new java.awt.Dimension(580, 210));

        newVaccLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        newVaccLabel.setForeground(new java.awt.Color(0, 0, 0));
        newVaccLabel.setText("Nova Vacinação");

        selectedVetVaccLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        selectedVetVaccLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedVetVaccLabel.setText("Veterinário(a):");

        selectedVetVaccTextField.setEditable(false);
        selectedVetVaccTextField.setBackground(new java.awt.Color(250, 250, 250));
        selectedVetVaccTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectedVetVaccTextField.setForeground(new java.awt.Color(102, 102, 102));
        selectedVetVaccTextField.setText("Selecione um(a) Veterinário(a)");
        selectedVetVaccTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedVetVaccTextFieldActionPerformed(evt);
            }
        });

        vaccLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        vaccLabel.setForeground(new java.awt.Color(0, 0, 0));
        vaccLabel.setText("Vacina:");

        vaccTextField.setBackground(new java.awt.Color(250, 250, 250));
        vaccTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vaccTextField.setForeground(new java.awt.Color(102, 102, 102));
        vaccTextField.setText("Digite o nome da Vacina...");
        vaccTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccTextFieldActionPerformed(evt);
            }
        });

        vaccDateLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        vaccDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        vaccDateLabel.setText("Data Vacinação:");

        vaccNextDoseLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        vaccNextDoseLabel.setForeground(new java.awt.Color(0, 0, 0));
        vaccNextDoseLabel.setText("Próxima Dose:");

        vaccDateTextField.setBackground(new java.awt.Color(250, 250, 250));
        vaccDateTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vaccDateTextField.setForeground(new java.awt.Color(102, 102, 102));
        vaccDateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vaccDateTextFieldFocusLost(evt);
            }
        });

        vaccNextDoseTextField.setBackground(new java.awt.Color(250, 250, 250));
        vaccNextDoseTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vaccNextDoseTextField.setForeground(new java.awt.Color(102, 102, 102));
        vaccNextDoseTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vaccNextDoseTextFieldFocusLost(evt);
            }
        });

        newVaccButton.setBackground(new java.awt.Color(255, 255, 255));
        newVaccButton.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        newVaccButton.setForeground(new java.awt.Color(0, 0, 0));
        newVaccButton.setText("Nova Vacinação");
        newVaccButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newVaccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newVaccButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newVaccJPanelLayout = new javax.swing.GroupLayout(newVaccJPanel);
        newVaccJPanel.setLayout(newVaccJPanelLayout);
        newVaccJPanelLayout.setHorizontalGroup(
            newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newVaccJPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(newVaccJPanelLayout.createSequentialGroup()
                        .addComponent(vaccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vaccTextField))
                    .addGroup(newVaccJPanelLayout.createSequentialGroup()
                        .addComponent(selectedVetVaccLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedVetVaccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newVaccLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vaccNextDoseLabel)
                    .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(vaccNextDoseTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vaccDateTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vaccDateLabel))
                .addGap(31, 31, 31))
            .addGroup(newVaccJPanelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(newVaccButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        newVaccJPanelLayout.setVerticalGroup(
            newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newVaccJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(newVaccLabel)
                .addGap(7, 7, 7)
                .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vaccLabel)
                        .addComponent(vaccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newVaccJPanelLayout.createSequentialGroup()
                        .addComponent(vaccDateLabel)
                        .addGap(3, 3, 3)
                        .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newVaccJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(selectedVetVaccLabel)
                                .addComponent(selectedVetVaccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vaccDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(vaccNextDoseLabel)
                        .addGap(2, 2, 2)
                        .addComponent(vaccNextDoseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newVaccButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        Bottom4.add(newVaccJPanel);

        selectedAnimalVaccsJPanel.setBackground(new java.awt.Color(217, 217, 217));
        selectedAnimalVaccsJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        selectedAnimalVaccsJPanel.setPreferredSize(new java.awt.Dimension(580, 210));

        selectedAnimalVaccsLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        selectedAnimalVaccsLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedAnimalVaccsLabel.setText("Vacinações do Animal");

        selectedAnimalVaccsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        selectedAnimalVaccsTextArea.setEditable(false);
        selectedAnimalVaccsTextArea.setBackground(new java.awt.Color(250, 250, 250));
        selectedAnimalVaccsTextArea.setColumns(20);
        selectedAnimalVaccsTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectedAnimalVaccsTextArea.setForeground(new java.awt.Color(102, 102, 102));
        selectedAnimalVaccsTextArea.setLineWrap(true);
        selectedAnimalVaccsTextArea.setRows(5);
        selectedAnimalVaccsScrollPane.setViewportView(selectedAnimalVaccsTextArea);

        javax.swing.GroupLayout selectedAnimalVaccsJPanelLayout = new javax.swing.GroupLayout(selectedAnimalVaccsJPanel);
        selectedAnimalVaccsJPanel.setLayout(selectedAnimalVaccsJPanelLayout);
        selectedAnimalVaccsJPanelLayout.setHorizontalGroup(
            selectedAnimalVaccsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAnimalVaccsJPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(selectedAnimalVaccsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedAnimalVaccsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedAnimalVaccsLabel))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        selectedAnimalVaccsJPanelLayout.setVerticalGroup(
            selectedAnimalVaccsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedAnimalVaccsJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(selectedAnimalVaccsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedAnimalVaccsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Bottom4.add(selectedAnimalVaccsJPanel);

        Vaccination.add(Bottom4);

        pagesTabbedPane.addTab("<html> <b>Vacinações<b> </html>", Vaccination);

        Hospitalize.setBackground(new java.awt.Color(217, 217, 217));
        Hospitalize.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Hospitalize.setLayout(new java.awt.GridLayout(2, 0));

        Top5.setBackground(new java.awt.Color(217, 217, 217));

        Info11.setBackground(new java.awt.Color(217, 217, 217));
        Info11.setPreferredSize(new java.awt.Dimension(1200, 220));

        vetListLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        vetListLabel5.setForeground(new java.awt.Color(0, 0, 0));
        vetListLabel5.setText("Selecionar Veterinário");

        vetListScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        vetListScrollPane5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        vetListScrollPane5.setForeground(new java.awt.Color(204, 204, 204));

        vetListTable5.setBackground(new java.awt.Color(250, 250, 250));
        vetListTable5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vetListTable5.setForeground(new java.awt.Color(0, 0, 0));
        vetListTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        vetListTable5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vetListTable5.setSelectionBackground(new java.awt.Color(9, 163, 88));
        vetListTable5.setSelectionForeground(new java.awt.Color(255, 255, 255));
        vetListTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vetListTable5MousePressed(evt);
            }
        });
        vetListScrollPane5.setViewportView(vetListTable5);

        vetSearchLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        vetSearchLabel5.setForeground(new java.awt.Color(0, 0, 0));
        vetSearchLabel5.setText("Buscar:");

        vetSearchTextField5.setBackground(new java.awt.Color(250, 250, 250));
        vetSearchTextField5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vetSearchTextField5.setForeground(new java.awt.Color(102, 102, 102));
        vetSearchTextField5.setText("Busque um(a) Veterinário(a)...");
        vetSearchTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        vetSearchTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vetSearchTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vetSearchTextField5FocusLost(evt);
            }
        });

        javax.swing.GroupLayout Info11Layout = new javax.swing.GroupLayout(Info11);
        Info11.setLayout(Info11Layout);
        Info11Layout.setHorizontalGroup(
            Info11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Info11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vetListScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Info11Layout.createSequentialGroup()
                        .addComponent(vetListLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vetSearchLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vetSearchTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Info11Layout.setVerticalGroup(
            Info11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Info11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Info11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vetListLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Info11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vetSearchTextField5)
                        .addComponent(vetSearchLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vetListScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Top5.add(Info11);

        Hospitalize.add(Top5);

        Bottom5.setBackground(new java.awt.Color(217, 217, 217));

        newHospitalizeJPanel.setBackground(new java.awt.Color(217, 217, 217));
        newHospitalizeJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        newHospitalizeJPanel.setPreferredSize(new java.awt.Dimension(500, 210));

        newHospitalizeLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        newHospitalizeLabel.setForeground(new java.awt.Color(0, 0, 0));
        newHospitalizeLabel.setText("Nova Internação");

        selectedVetHospitalizeLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        selectedVetHospitalizeLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectedVetHospitalizeLabel.setText("Veterinário (a):");

        selectedVetHospitalizeTextField.setEditable(false);
        selectedVetHospitalizeTextField.setBackground(new java.awt.Color(250, 250, 250));
        selectedVetHospitalizeTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectedVetHospitalizeTextField.setForeground(new java.awt.Color(102, 102, 102));
        selectedVetHospitalizeTextField.setText("Selecione um(a) Veterinário(a)");
        selectedVetHospitalizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedVetHospitalizeTextFieldActionPerformed(evt);
            }
        });

        newHospitalizeDateLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        newHospitalizeDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        newHospitalizeDateLabel.setText("Data de Início:");

        newHospitalizeDateTextField.setBackground(new java.awt.Color(250, 250, 250));
        newHospitalizeDateTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        newHospitalizeDateTextField.setForeground(new java.awt.Color(102, 102, 102));
        newHospitalizeDateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newHospitalizeDateTextFieldFocusLost(evt);
            }
        });

        newHospitalizeButton.setBackground(new java.awt.Color(255, 255, 255));
        newHospitalizeButton.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        newHospitalizeButton.setForeground(new java.awt.Color(0, 0, 0));
        newHospitalizeButton.setText("Nova Internação");
        newHospitalizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newHospitalizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHospitalizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newHospitalizeJPanelLayout = new javax.swing.GroupLayout(newHospitalizeJPanel);
        newHospitalizeJPanel.setLayout(newHospitalizeJPanelLayout);
        newHospitalizeJPanelLayout.setHorizontalGroup(
            newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newHospitalizeJPanelLayout.createSequentialGroup()
                .addGroup(newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newHospitalizeJPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newHospitalizeLabel)
                            .addGroup(newHospitalizeJPanelLayout.createSequentialGroup()
                                .addGroup(newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectedVetHospitalizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(newHospitalizeDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newHospitalizeDateTextField)
                                    .addComponent(selectedVetHospitalizeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))))
                    .addGroup(newHospitalizeJPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(newHospitalizeButton)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        newHospitalizeJPanelLayout.setVerticalGroup(
            newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newHospitalizeJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(newHospitalizeLabel)
                .addGap(18, 18, 18)
                .addGroup(newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedVetHospitalizeLabel)
                    .addComponent(selectedVetHospitalizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(newHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newHospitalizeDateLabel)
                    .addComponent(newHospitalizeDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(newHospitalizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        followHospitalizeJPanel.setBackground(new java.awt.Color(217, 217, 217));
        followHospitalizeJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        followHospitalizeJPanel.setPreferredSize(new java.awt.Dimension(580, 210));

        followHospitalizeLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        followHospitalizeLabel.setForeground(new java.awt.Color(0, 0, 0));
        followHospitalizeLabel.setText("Acompanhar Internação");

        followHospitalizeScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        followHospitalizeTextArea.setEditable(false);
        followHospitalizeTextArea.setBackground(new java.awt.Color(250, 250, 250));
        followHospitalizeTextArea.setColumns(20);
        followHospitalizeTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        followHospitalizeTextArea.setForeground(new java.awt.Color(102, 102, 102));
        followHospitalizeTextArea.setLineWrap(true);
        followHospitalizeTextArea.setRows(5);
        followHospitalizeScrollPane.setViewportView(followHospitalizeTextArea);

        progressLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        progressLabel.setForeground(new java.awt.Color(0, 0, 0));
        progressLabel.setText("Evolução:");

        progressScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        progressTextArea.setEditable(false);
        progressTextArea.setBackground(new java.awt.Color(250, 250, 250));
        progressTextArea.setColumns(20);
        progressTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        progressTextArea.setForeground(new java.awt.Color(102, 102, 102));
        progressTextArea.setLineWrap(true);
        progressTextArea.setRows(5);
        progressTextArea.setText("Adicione uma nova evolução da internação...");
        progressTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        progressTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                progressTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                progressTextAreaFocusLost(evt);
            }
        });
        progressScrollPane.setViewportView(progressTextArea);

        endHospitalizeCheckBox.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        endHospitalizeCheckBox.setForeground(new java.awt.Color(102, 102, 102));
        endHospitalizeCheckBox.setText("Encerrar Internação?");
        endHospitalizeCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addProgressButton.setBackground(new java.awt.Color(255, 255, 255));
        addProgressButton.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        addProgressButton.setForeground(new java.awt.Color(0, 0, 0));
        addProgressButton.setText("Adicionar Evolução");
        addProgressButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProgressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProgressButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout followHospitalizeJPanelLayout = new javax.swing.GroupLayout(followHospitalizeJPanel);
        followHospitalizeJPanel.setLayout(followHospitalizeJPanelLayout);
        followHospitalizeJPanelLayout.setHorizontalGroup(
            followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followHospitalizeJPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(followHospitalizeJPanelLayout.createSequentialGroup()
                        .addComponent(followHospitalizeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(followHospitalizeJPanelLayout.createSequentialGroup()
                                .addComponent(endHospitalizeCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addProgressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(progressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(followHospitalizeJPanelLayout.createSequentialGroup()
                        .addComponent(followHospitalizeLabel)
                        .addGap(196, 196, 196)
                        .addComponent(progressLabel)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        followHospitalizeJPanelLayout.setVerticalGroup(
            followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(followHospitalizeJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(followHospitalizeLabel)
                    .addComponent(progressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(followHospitalizeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, followHospitalizeJPanelLayout.createSequentialGroup()
                        .addComponent(progressScrollPane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(followHospitalizeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endHospitalizeCheckBox)
                            .addComponent(addProgressButton))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Bottom5Layout = new javax.swing.GroupLayout(Bottom5);
        Bottom5.setLayout(Bottom5Layout);
        Bottom5Layout.setHorizontalGroup(
            Bottom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bottom5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(newHospitalizeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(followHospitalizeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        Bottom5Layout.setVerticalGroup(
            Bottom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bottom5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(Bottom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newHospitalizeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(followHospitalizeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Hospitalize.add(Bottom5);

        pagesTabbedPane.addTab("<html> <b>Internações<b> </html>", Hospitalize);

        Reports.setBackground(new java.awt.Color(217, 217, 217));
        Reports.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        reportLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(0, 0, 0));
        reportLabel.setText("Relatório:");

        reportScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        reportTextArea.setEditable(false);
        reportTextArea.setBackground(new java.awt.Color(255, 255, 255));
        reportTextArea.setColumns(20);
        reportTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        reportTextArea.setForeground(new java.awt.Color(51, 51, 51));
        reportTextArea.setLineWrap(true);
        reportTextArea.setRows(5);
        reportScrollPane.setViewportView(reportTextArea);

        generateNewReportButton.setBackground(new java.awt.Color(9, 163, 88));
        generateNewReportButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        generateNewReportButton.setForeground(new java.awt.Color(255, 255, 255));
        generateNewReportButton.setText("Gerar Novo Relatório");
        generateNewReportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sabeReportButton.setBackground(new java.awt.Color(9, 163, 88));
        sabeReportButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sabeReportButton.setForeground(new java.awt.Color(255, 255, 255));
        sabeReportButton.setText("Salvar Relatório");
        sabeReportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ReportsLayout = new javax.swing.GroupLayout(Reports);
        Reports.setLayout(ReportsLayout);
        ReportsLayout.setHorizontalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportLabel)
                    .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReportsLayout.createSequentialGroup()
                            .addComponent(generateNewReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sabeReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(reportScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        ReportsLayout.setVerticalGroup(
            ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(reportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sabeReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(generateNewReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pagesTabbedPane.addTab("<html> <b>Relatório<b> </html>", Reports);

        pagesContent.add(pagesTabbedPane);
        pagesTabbedPane.getAccessibleContext().setAccessibleName("");

        contentSection.add(pagesContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(contentSection, java.awt.BorderLayout.CENTER);
        contentSection.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newClientButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClientButton0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newClientButton0ActionPerformed

    private void deleteClientButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButton0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteClientButton0ActionPerformed

    private void newAnimalButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAnimalButton0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newAnimalButton0ActionPerformed

    private void deleteAnimalButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAnimalButton0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAnimalButton0ActionPerformed

    private void allTreatmentsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allTreatmentsButton1ActionPerformed
        Controller.loadAllTreatments(
                treatmentListTable1,
                appointmentsListTable1,
                examListTable1
        );
    }//GEN-LAST:event_allTreatmentsButton1ActionPerformed

    private void selectedAnimalTreatmentsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedAnimalTreatmentsButton1ActionPerformed
        if (Controller.getSelectedAnimal() != null) {
            Controller.loadTreatmentsByAnimal(
                    treatmentListTable1,
                    appointmentsListTable1,
                    examListTable1
            );
        } else {
            pleaseSelectAnAnimal();
        }

    }//GEN-LAST:event_selectedAnimalTreatmentsButton1ActionPerformed

    private void appointmentVetTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentVetTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentVetTextField2ActionPerformed

    private void scheduleAppointmentButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleAppointmentButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleAppointmentButton2ActionPerformed

    private void examRequestButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examRequestButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examRequestButton3ActionPerformed

    private void examAppointmentTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examAppointmentTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examAppointmentTextField3ActionPerformed

    private void selectedVetVaccTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedVetVaccTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedVetVaccTextFieldActionPerformed

    private void vaccTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccTextFieldActionPerformed

    private void newVaccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newVaccButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newVaccButtonActionPerformed

    private void selectedVetHospitalizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedVetHospitalizeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedVetHospitalizeTextFieldActionPerformed

    private void newHospitalizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newHospitalizeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newHospitalizeButtonActionPerformed

    private void addProgressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProgressButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addProgressButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // Abrir a interface principal
        new Profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileButtonActionPerformed


    // Muda as tabelas de acordo com as páginas
    private void pagesTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pagesTabbedPaneStateChanged
        int selectedIndex = pagesTabbedPane.getSelectedIndex();
        String selectedTabTitle = pagesTabbedPane.getTitleAt(selectedIndex);

        switch (selectedTabTitle) {
            case "<html> <b>Clientes e Animais<b> </html>":
                Controller.loadAllClients(clientListTable0);

                if (Controller.getSelectedClient() == null) {
                    Controller.loadEmptyAnimalTable(animalListTable0);
                }
                break;

            case "<html> <b>Tratamentos<b> </html>":
                Controller.loadAllTreatments(
                        treatmentListTable1,
                        appointmentsListTable1,
                        examListTable1
                );
                break;

            case "<html> <b>Consultas<b> </html>":
                Controller.loadAllVets(vetListTable2);
                // Coloca o TextField de Data  com a Data atual por padrão (mas é possível mudar)
                appointmentDateTextField2.setText(Controller.getCurrentDate());

                if (Controller.getSelectedAnimal() == null) {
                    pleaseSelectAnAnimal();
                    appointmentTreatmentComboBox2.getEditor().setItem("");
                } else {
                    // Popula o ComboBox dos Tratamentos
                    Controller.populateTreatmentComboBox(appointmentTreatmentComboBox2, newTreatmentCheckbox2);
                }

                break;

            case "<html> <b>Exames<b> </html>":
                if (Controller.getSelectedAnimal() == null) {
                    // A tabela de consultas deve ser do animal selecionado anteriormente
                    Controller.loadEmptyAppointmentsTable(animalAppointmentsTable3);
                    pleaseSelectAnAnimal();
                } else {
                    Controller.loadAppointmentsByAnimal(animalAppointmentsTable3);
                    // Coloca o TextField de Data da Solicitação com a Data atual por padrão (mas é possível mudar)
                    examRequestDateTextField3.setText(Controller.getCurrentDate());
                }
                break;

            case "<html> <b>Vacinações<b> </html>":
                Controller.loadAllVets(vetListTable4);

                if (Controller.getSelectedAnimal() == null) {
                    pleaseSelectAnAnimal();
                } else {
                    // Coloca o TextField de Data com a Data atual por padrão (mas é possível mudar)
                    vaccDateTextField.setText(Controller.getCurrentDate());
                    // Mostra as vacinações do Animal no TextArea
                    selectedAnimalVaccsTextArea.setText(Controller.loadAllAnimalVaccs());
                }
                break;

            case "<html> <b>Internações<b> </html>":
                Controller.loadAllVets(vetListTable5);
                // Coloca o TextField de Data com a Data atual por padrão (mas é possível mudar)
                newHospitalizeDateTextField.setText(Controller.getCurrentDate());
                break;

            default:
                System.out.println("Nenhuma ação para a aba: " + selectedTabTitle);
                break;
            }

    }//GEN-LAST:event_pagesTabbedPaneStateChanged

    private void pleaseSelectAnAnimal() {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um Animal.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        pagesTabbedPane.setSelectedIndex(0); // Redireciona para a aba de "Clientes e Animais"
    }

    private void clientListTable0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientListTable0MousePressed
        Controller.setSelected(((GenericTableModel)clientListTable0.getModel())
                .getItem(clientListTable0.getSelectedRow()));

        // Cria a tabela de Animais de acordo com o cliente selecionado
        Controller.loadAnimalsByOwner(animalListTable0);

        // Limpa as informações anteriores, se existirem, de Consultas Recentes e Próxima Vacinação
        recentAppointmentsTextArea.setText("");
        nextVaccTextField.setText("");

    }//GEN-LAST:event_clientListTable0MousePressed

    private void animalListTable0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalListTable0MousePressed
        Controller.setSelected(((GenericTableModel)animalListTable0.getModel())
                .getItem(animalListTable0.getSelectedRow()));

        // Modifica as outras informações (Consultas Recentes e Próxima Vacinação)
        recentAppointmentsTextArea.setText(Controller.loadAnimalRecentAppointments());
        nextVaccTextField.setText(Controller.loadAnimalNextVaccDate());

    }//GEN-LAST:event_animalListTable0MousePressed

    private void treatmentListTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treatmentListTable1MousePressed
        Controller.setSelected(((GenericTableModel)treatmentListTable1.getModel())
                .getItem(treatmentListTable1.getSelectedRow()));

        // Mostra as Consultas de acordo com o tratamento selecionado
        Controller.loadAppointmentsByTreatment(appointmentsListTable1);

        // Mostra TODOS os Exames de acordo com o tratamento selecionado
        Controller.loadExamsByTreatment(examListTable1);

    }//GEN-LAST:event_treatmentListTable1MousePressed

    private void appointmentsListTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsListTable1MousePressed
        Controller.setSelected(((GenericTableModel)appointmentsListTable1.getModel())
                .getItem(appointmentsListTable1.getSelectedRow()));

        // Mostra os Exames de acordo com a consulta selecionada
        Controller.loadExamsByAppointment(examListTable1);

    }//GEN-LAST:event_appointmentsListTable1MousePressed

    private void vetListTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vetListTable2MousePressed
        Controller.setSelected(((GenericTableModel)vetListTable2.getModel())
                .getItem(vetListTable2.getSelectedRow()));

        // Muda o TextField
        appointmentVetTextField2.setText(
                Controller.getSelectedVet().getName()
                + " - " + Controller.getSelectedVet().getSpecialty()
        );

    }//GEN-LAST:event_vetListTable2MousePressed

    private void animalAppointmentsTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalAppointmentsTable3MousePressed
        Controller.setSelected(((GenericTableModel)animalAppointmentsTable3.getModel())
                .getItem(animalAppointmentsTable3.getSelectedRow()));

        // Muda o TextField
        examAppointmentTextField3.setText(
                "Data: " + Controller.getSelectedAppointment().getDate()
                + " | Veterinário: " + Controller.getSelectedVet().getName()
        );
    }//GEN-LAST:event_animalAppointmentsTable3MousePressed

    private void vetListTable4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vetListTable4MousePressed
        Controller.setSelected(((GenericTableModel)vetListTable4.getModel())
                .getItem(vetListTable4.getSelectedRow()));

        // Muda o TextField
        selectedVetVaccTextField.setText(
                Controller.getSelectedVet().getName()
                + " - " + Controller.getSelectedVet().getSpecialty()
        );

    }//GEN-LAST:event_vetListTable4MousePressed

    private void vetListTable5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vetListTable5MousePressed
        Controller.setSelected(((GenericTableModel)vetListTable5.getModel())
                .getItem(vetListTable5.getSelectedRow()));

        // Muda o TextField
        selectedVetHospitalizeTextField.setText(
                Controller.getSelectedVet().getName()
                        + " - " + Controller.getSelectedVet().getSpecialty()
        );

    }//GEN-LAST:event_vetListTable5MousePressed

    private void appointmentDetailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentDetailsButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentDetailsButton1ActionPerformed

    private void examDetailsButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examDetailsButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examDetailsButton3ActionPerformed


    // ÁREA DE FOCO DE TEXT FIELDS

    private void clientSearchTextField0FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientSearchTextField0FocusGained
        if (clientSearchTextField0.getText().equals("Busque um Cliente...")) {
            clientSearchTextField0.setText("");
        }
    }//GEN-LAST:event_clientSearchTextField0FocusGained

    private void clientSearchTextField0FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clientSearchTextField0FocusLost
        if ((clientSearchTextField0.getText()).isBlank()) {
            clientSearchTextField0.setText("Busque um Cliente...");
        }
    }//GEN-LAST:event_clientSearchTextField0FocusLost

    private void animalSearchTextField0FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_animalSearchTextField0FocusGained
        if (animalSearchTextField0.getText().equals("Busque um Animal...")) {
            animalSearchTextField0.setText("");
        }
    }//GEN-LAST:event_animalSearchTextField0FocusGained

    private void animalSearchTextField0FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_animalSearchTextField0FocusLost
        if ((animalSearchTextField0.getText()).isBlank()) {
            animalSearchTextField0.setText("Busque um Animal...");
        }
    }//GEN-LAST:event_animalSearchTextField0FocusLost

    private void vetSearchTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetSearchTextField2FocusGained
        if (vetSearchTextField2.getText().equals("Busque um(a) Veterinário(a)...")) {
            vetSearchTextField2.setText("");
        }
    }//GEN-LAST:event_vetSearchTextField2FocusGained

    private void vetSearchTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetSearchTextField2FocusLost
        if ((vetSearchTextField2.getText()).isBlank()) {
            vetSearchTextField2.setText("Busque um(a) Veterinário(a)...");
        }
    }//GEN-LAST:event_vetSearchTextField2FocusLost

    private void appointmentSymptomsTextArea2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appointmentSymptomsTextArea2FocusGained
        if (appointmentSymptomsTextArea2.getText().equals("Coloque os sintomas aqui....")) {
            appointmentSymptomsTextArea2.setText("");
        }
    }//GEN-LAST:event_appointmentSymptomsTextArea2FocusGained

    private void appointmentSymptomsTextArea2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appointmentSymptomsTextArea2FocusLost
        if ((appointmentSymptomsTextArea2.getText()).isBlank()) {
            appointmentSymptomsTextArea2.setText("Coloque os sintomas aqui....");
        }
    }//GEN-LAST:event_appointmentSymptomsTextArea2FocusLost

    private void examTypeTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_examTypeTextField3FocusGained
        if (examTypeTextField3.getText().equals("Especifique o tipo do Exame...")) {
            examTypeTextField3.setText("");
        }
    }//GEN-LAST:event_examTypeTextField3FocusGained

    private void examTypeTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_examTypeTextField3FocusLost
        if ((examTypeTextField3.getText()).isBlank()) {
            examTypeTextField3.setText("Especifique o tipo do Exame...");
        }
    }//GEN-LAST:event_examTypeTextField3FocusLost

    private void examDescriptionTextArea3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_examDescriptionTextArea3FocusGained
        if (examDescriptionTextArea3.getText().equals("Digite a descrição do Exame...")) {
            examDescriptionTextArea3.setText("");
        }
    }//GEN-LAST:event_examDescriptionTextArea3FocusGained

    private void examDescriptionTextArea3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_examDescriptionTextArea3FocusLost
        if ((examDescriptionTextArea3.getText()).isBlank()) {
            examDescriptionTextArea3.setText("Digite a descrição do Exame...");
        }
    }//GEN-LAST:event_examDescriptionTextArea3FocusLost

    private void animalAppointmentsSearchTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_animalAppointmentsSearchTextField3FocusGained
        if (animalAppointmentsSearchTextField3.getText().equals("Busque uma Consulta...")) {
            animalAppointmentsSearchTextField3.setText("");
        }
    }//GEN-LAST:event_animalAppointmentsSearchTextField3FocusGained

    private void animalAppointmentsSearchTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_animalAppointmentsSearchTextField3FocusLost
        if ((animalAppointmentsSearchTextField3.getText()).isBlank()) {
            animalAppointmentsSearchTextField3.setText("Busque uma Consulta...");
        }
    }//GEN-LAST:event_animalAppointmentsSearchTextField3FocusLost

    private void vetSearchTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetSearchTextField4FocusGained
        if (vetSearchTextField4.getText().equals("Busque um(a) Veterinário(a)...")) {
            vetSearchTextField4.setText("");
        }
    }//GEN-LAST:event_vetSearchTextField4FocusGained

    private void vetSearchTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetSearchTextField4FocusLost
        if ((vetSearchTextField4.getText()).isBlank()) {
            vetSearchTextField4.setText("Busque um(a) Veterinário(a)...");
        }
    }//GEN-LAST:event_vetSearchTextField4FocusLost

    private void vetSearchTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetSearchTextField5FocusGained
        if (vetSearchTextField5.getText().equals("Busque um(a) Veterinário(a)...")) {
            vetSearchTextField5.setText("");
        }
    }//GEN-LAST:event_vetSearchTextField5FocusGained

    private void vetSearchTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetSearchTextField5FocusLost
        if ((vetSearchTextField5.getText()).isBlank()) {
            vetSearchTextField5.setText("Busque um(a) Veterinário(a)...");
        }
    }//GEN-LAST:event_vetSearchTextField5FocusLost

    private void progressTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_progressTextAreaFocusGained
        if (progressTextArea.getText().equals("Adicione uma nova evolução da internação...")) {
            progressTextArea.setText("");
        }
    }//GEN-LAST:event_progressTextAreaFocusGained

    private void progressTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_progressTextAreaFocusLost
        if ((progressTextArea.getText()).isBlank()) {
            progressTextArea.setText("Adicione uma nova evolução da internação...");
        }
    }//GEN-LAST:event_progressTextAreaFocusLost

    private void appointmentDateTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appointmentDateTextField2FocusLost
        checkDate(appointmentDateTextField2);
    }//GEN-LAST:event_appointmentDateTextField2FocusLost

    private void examRequestDateTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_examRequestDateTextField3FocusLost
        checkDate(examRequestDateTextField3);
    }//GEN-LAST:event_examRequestDateTextField3FocusLost

    private void vaccDateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vaccDateTextFieldFocusLost
        checkDate(vaccDateTextField);
    }//GEN-LAST:event_vaccDateTextFieldFocusLost

    private void vaccNextDoseTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vaccNextDoseTextFieldFocusLost
        checkDate(vaccNextDoseTextField);
    }//GEN-LAST:event_vaccNextDoseTextFieldFocusLost

    private void newHospitalizeDateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newHospitalizeDateTextFieldFocusLost
        checkDate(newHospitalizeDateTextField);
    }//GEN-LAST:event_newHospitalizeDateTextFieldFocusLost

    private void appointmentTimeTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appointmentTimeTextField2FocusLost
        if (!Controller.isValidTime(appointmentTimeTextField2)) {
            JOptionPane.showMessageDialog(null, "O horário é inválido. Coloque um horário no formáto (HH:mm).", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            appointmentTimeTextField2.setText("");
        }
    }//GEN-LAST:event_appointmentTimeTextField2FocusLost

    private void appointmentTreatmentComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_appointmentTreatmentComboBox2ItemStateChanged
        Controller.validateAndHandleTreatmentInput(appointmentTreatmentComboBox2, newTreatmentCheckbox2);
    }//GEN-LAST:event_appointmentTreatmentComboBox2ItemStateChanged

    private void newTreatmentCheckbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTreatmentCheckbox2ActionPerformed
        Controller.handleNewTreatmentCheckbox(appointmentTreatmentComboBox2, newTreatmentCheckbox2);
    }//GEN-LAST:event_newTreatmentCheckbox2ActionPerformed

    public void checkDate(JTextField dateTextField) {
        // Se estiver vazio, coloca a data atual
        if ((dateTextField.getText()).isBlank()) {
            dateTextField.setText(Controller.getCurrentDate());
        }

        // Verifica se a data é válida, se não for, mostra um Alerta
        if (!Controller.isValidDate(dateTextField)) {
            JOptionPane.showMessageDialog(null, "A data informada é inválida. Coloque uma data no formato (dd/MM/yyyy).", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bottom0;
    private javax.swing.JPanel Bottom1;
    private javax.swing.JPanel Bottom2;
    private javax.swing.JPanel Bottom3;
    private javax.swing.JPanel Bottom4;
    private javax.swing.JPanel Bottom5;
    private javax.swing.JPanel ClientAnimals;
    private javax.swing.JPanel ExamRequest;
    private javax.swing.JPanel Hospitalize;
    private javax.swing.JPanel Info1;
    private javax.swing.JPanel Info10;
    private javax.swing.JPanel Info11;
    private javax.swing.JPanel Info2;
    private javax.swing.JPanel Info3;
    private javax.swing.JPanel Info4;
    private javax.swing.JPanel Info5;
    private javax.swing.JPanel Info6;
    private javax.swing.JPanel Info7;
    private javax.swing.JPanel Info8;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel ScheduleAppointment;
    private javax.swing.JPanel Top0;
    private javax.swing.JPanel Top1;
    private javax.swing.JPanel Top2;
    private javax.swing.JPanel Top3;
    private javax.swing.JPanel Top4;
    private javax.swing.JPanel Top5;
    private javax.swing.JPanel Treatment;
    private javax.swing.JPanel Vaccination;
    private javax.swing.JButton addProgressButton;
    private javax.swing.JButton allTreatmentsButton1;
    private javax.swing.JLabel animalAppointmentsLabel3;
    private javax.swing.JScrollPane animalAppointmentsScrollPane3;
    private javax.swing.JLabel animalAppointmentsSearchLabel3;
    private javax.swing.JTextField animalAppointmentsSearchTextField3;
    private javax.swing.JTable animalAppointmentsTable3;
    private javax.swing.JLabel animalListLabel0;
    private javax.swing.JScrollPane animalListScrollPane0;
    private javax.swing.JTable animalListTable0;
    private javax.swing.JLabel animalSearchLabel0;
    private javax.swing.JTextField animalSearchTextField0;
    private javax.swing.JLabel appointmentDateLabel2;
    private javax.swing.JTextField appointmentDateTextField2;
    private javax.swing.JButton appointmentDetailsButton1;
    private javax.swing.JLabel appointmentSymptomsLabel2;
    private javax.swing.JScrollPane appointmentSymptomsScrollPane2;
    private javax.swing.JTextArea appointmentSymptomsTextArea2;
    private javax.swing.JLabel appointmentTimeLabel2;
    private javax.swing.JTextField appointmentTimeTextField2;
    private javax.swing.JComboBox<String> appointmentTreatmentComboBox2;
    private javax.swing.JLabel appointmentTreatmentLabel2;
    private javax.swing.JLabel appointmentVetLabel2;
    private javax.swing.JTextField appointmentVetTextField2;
    private javax.swing.JPanel appointmentsAndVaccinationPanel;
    private javax.swing.JLabel appointmentsListLabel1;
    private javax.swing.JScrollPane appointmentsListScrollPane1;
    private javax.swing.JTable appointmentsListTable1;
    private javax.swing.JLabel clientListLabel0;
    private javax.swing.JScrollPane clientListScrollPane0;
    private javax.swing.JTable clientListTable0;
    private javax.swing.JLabel clientSearchLabel0;
    private javax.swing.JTextField clientSearchTextField0;
    private javax.swing.JLabel clinicNameLabel;
    private javax.swing.JPanel contentSection;
    private javax.swing.JButton deleteAnimalButton0;
    private javax.swing.JButton deleteAppointmentButton1;
    private javax.swing.JButton deleteClientButton0;
    private javax.swing.JButton deleteExamButton2;
    private javax.swing.JCheckBox endHospitalizeCheckBox;
    private javax.swing.JLabel examAppointmentLabel3;
    private javax.swing.JTextField examAppointmentTextField3;
    private javax.swing.JLabel examDescriptionLabel3;
    private javax.swing.JScrollPane examDescriptionScrollPane3;
    private javax.swing.JTextArea examDescriptionTextArea3;
    private javax.swing.JButton examDetailsButton3;
    private javax.swing.JLabel examListLabel1;
    private javax.swing.JScrollPane examListScrollPane1;
    private javax.swing.JTable examListTable1;
    private javax.swing.JButton examRequestButton3;
    private javax.swing.JLabel examRequestDateLabel3;
    private javax.swing.JTextField examRequestDateTextField3;
    private javax.swing.JLabel examTypeLabel3;
    private javax.swing.JTextField examTypeTextField3;
    private javax.swing.JPanel fixedInfoContent;
    private javax.swing.JPanel followHospitalizeJPanel;
    private javax.swing.JLabel followHospitalizeLabel;
    private javax.swing.JScrollPane followHospitalizeScrollPane;
    private javax.swing.JTextArea followHospitalizeTextArea;
    private javax.swing.JButton generateNewReportButton;
    private javax.swing.JPanel headerSection;
    private javax.swing.JButton newAnimalButton0;
    private javax.swing.JLabel newAppointmentLabel2;
    private javax.swing.JButton newClientButton0;
    private javax.swing.JLabel newExamRequestLabel3;
    private javax.swing.JButton newHospitalizeButton;
    private javax.swing.JLabel newHospitalizeDateLabel;
    private javax.swing.JTextField newHospitalizeDateTextField;
    private javax.swing.JPanel newHospitalizeJPanel;
    private javax.swing.JLabel newHospitalizeLabel;
    private javax.swing.JCheckBox newTreatmentCheckbox2;
    private javax.swing.JButton newVaccButton;
    private javax.swing.JPanel newVaccJPanel;
    private javax.swing.JLabel newVaccLabel;
    private javax.swing.JLabel nextVaccLabel;
    private javax.swing.JTextField nextVaccTextField;
    private javax.swing.JPanel pagesContent;
    private javax.swing.JTabbedPane pagesTabbedPane;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JScrollPane progressScrollPane;
    private javax.swing.JTextArea progressTextArea;
    private javax.swing.JLabel recentAppointmentsLabel;
    private javax.swing.JScrollPane recentAppointmentsScrollPane;
    private javax.swing.JTextArea recentAppointmentsTextArea;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JScrollPane reportScrollPane;
    private javax.swing.JTextArea reportTextArea;
    private javax.swing.JButton sabeReportButton;
    private javax.swing.JButton scheduleAppointmentButton2;
    private javax.swing.JLabel selectedAnimalLabel;
    private javax.swing.JLabel selectedAnimalNameLabel;
    private javax.swing.JTextField selectedAnimalNameTextField;
    private javax.swing.JPanel selectedAnimalPanel;
    private javax.swing.JButton selectedAnimalTreatmentsButton1;
    private javax.swing.JPanel selectedAnimalVaccsJPanel;
    private javax.swing.JLabel selectedAnimalVaccsLabel;
    private javax.swing.JScrollPane selectedAnimalVaccsScrollPane;
    private javax.swing.JTextArea selectedAnimalVaccsTextArea;
    private javax.swing.JLabel selectedClientLabel;
    private javax.swing.JTextField selectedClientTextField;
    private javax.swing.JLabel selectedSpeciesLabel;
    private javax.swing.JTextField selectedSpeciesTextField;
    private javax.swing.JLabel selectedVetHospitalizeLabel;
    private javax.swing.JTextField selectedVetHospitalizeTextField;
    private javax.swing.JLabel selectedVetVaccLabel;
    private javax.swing.JTextField selectedVetVaccTextField;
    private javax.swing.JLabel treatmentListLabel1;
    private javax.swing.JScrollPane treatmentListScrollPane1;
    private javax.swing.JTable treatmentListTable1;
    private javax.swing.JLabel vaccDateLabel;
    private javax.swing.JTextField vaccDateTextField;
    private javax.swing.JLabel vaccLabel;
    private javax.swing.JLabel vaccNextDoseLabel;
    private javax.swing.JTextField vaccNextDoseTextField;
    private javax.swing.JTextField vaccTextField;
    private javax.swing.JLabel vetListLabel2;
    private javax.swing.JLabel vetListLabel4;
    private javax.swing.JLabel vetListLabel5;
    private javax.swing.JScrollPane vetListScrollPane2;
    private javax.swing.JScrollPane vetListScrollPane4;
    private javax.swing.JScrollPane vetListScrollPane5;
    private javax.swing.JTable vetListTable2;
    private javax.swing.JTable vetListTable4;
    private javax.swing.JTable vetListTable5;
    private javax.swing.JLabel vetSearchLabel2;
    private javax.swing.JLabel vetSearchLabel4;
    private javax.swing.JLabel vetSearchLabel5;
    private javax.swing.JTextField vetSearchTextField2;
    private javax.swing.JTextField vetSearchTextField4;
    private javax.swing.JTextField vetSearchTextField5;
    // End of variables declaration//GEN-END:variables
}
