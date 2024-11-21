package View.Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class DetailEditorDialog extends JDialog {
    private final JPanel formPanel;
    private final Map<String, Object> data;

    public DetailEditorDialog(Frame owner, String title, Map<String, Object> data) {
        super(owner, title, true);
        this.data = data;
        this.formPanel = new JPanel(new GridLayout(data.size(), 2));

        // Adiciona os campos dinamicamente
        for (String key : data.keySet()) {
            JLabel label = new JLabel(key + ":");
            JTextField textField = new JTextField(data.get(key).toString());
            formPanel.add(label);
            formPanel.add(textField);
        }

        add(formPanel, BorderLayout.CENTER);

        // Botões de salvar e cancelar
        JPanel buttonPanel = new JPanel();
        JButton saveButton = new JButton("Salvar");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveData();
                dispose();
            }
        });

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.addActionListener(e -> dispose());
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(owner);
    }

    private void saveData() {
        Component[] components = formPanel.getComponents();
        for (int i = 0; i < components.length; i += 2) {
            JLabel label = (JLabel) components[i];
            JTextField textField = (JTextField) components[i + 1];
            data.put(label.getText().replace(":", ""), textField.getText());
        }
        System.out.println("Dados salvos: " + data);
    }
}
