public class test {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new test().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        final javax.swing.JFrame frame = new javax.swing.JFrame("Formulario");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setLocationRelativeTo(null);

        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.anchor = java.awt.GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new javax.swing.JLabel("Nombre:"), gbc);

        gbc.gridx = 1;
        final javax.swing.JTextField nombreField = new javax.swing.JTextField(15);
        panel.add(nombreField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        javax.swing.JButton enviarBtn = new javax.swing.JButton("Enviar");
        panel.add(enviarBtn, gbc);

        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                javax.swing.JOptionPane.showMessageDialog(frame, "Enviado: " + nombreField.getText());
            }
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}