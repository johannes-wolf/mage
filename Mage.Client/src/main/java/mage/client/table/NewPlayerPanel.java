package mage.client.table;

import java.awt.*;
import javax.swing.*;

import mage.client.components.DecklistChooser;
import mage.client.util.ClientDefaultSettings;

/**
 * Panel used for a player when creating or joining a table.
 *
 * @author BetaSteward_at_googlemail.com
 */
public class NewPlayerPanel extends javax.swing.JPanel {
    private DecklistChooser decklist;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPlayerDeck;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JSpinner spnLevel;
    private javax.swing.JTextField txtPlayerName;

    public NewPlayerPanel() {
        lblPlayerName = new javax.swing.JLabel("Name:");
        txtPlayerName = new javax.swing.JTextField(ClientDefaultSettings.computerName);
        lblPlayerDeck = new javax.swing.JLabel("Deck:");
        decklist = new DecklistChooser();
        lblLevel = new javax.swing.JLabel("Skill:");
        spnLevel = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(2, 1, 10, 1));

        initLayout();
    }

    /**
     * Fill the combobox with the recent 'n' filenames.
     */
    public void loadRecentDeckFiles() {
        decklist.update();
    }

    /**
     * Set the player name and disable changing it.
     *
     * @param playerName The name of the player
     */
    public void setPlayerName(String playerName) {
        txtPlayerName.setText(playerName);
        txtPlayerName.setEditable(false);
        txtPlayerName.setEnabled(false);
    }

    public String getPlayerName() {
        return txtPlayerName.getText();
    }

    public String getDeckFile() {
        return decklist.getFile();
    }

    public void setDeckFile(String filename) {
        decklist.setFile(filename);
    }

    public void setSkillLevel(int level) {
        spnLevel.setValue(level);
    }

    public int getSkillLevel() {
        return (Integer)spnLevel.getValue();
    }

    public void showLevel(boolean show) {
        spnLevel.setVisible(show);
        lblLevel.setVisible(show);
    }

    public void showDeckElements(boolean show) {
        lblPlayerDeck.setVisible(show);
        decklist.setVisible(show);
    }

    private void initLayout() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Label column
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        add(lblPlayerName, gbc);

        gbc.gridy = 1;
        add(lblPlayerDeck, gbc);

        // Control column
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;

        // Assemble the name and CPU player level row:
        //   [ name ] [Level:] [+-]
        JPanel nameRow = new JPanel(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.weightx = 1;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        nameRow.add(txtPlayerName, gbc2);

        if (spnLevel.isVisible()) {
            gbc2.ipadx = 4;
            gbc2.weightx = 0;
            gbc2.fill = GridBagConstraints.NONE;
            gbc2.gridx = 1;
            nameRow.add(lblLevel, gbc2);
            gbc2.ipadx = 0;
            gbc2.gridx = 2;
            nameRow.add(spnLevel, gbc2);
        }
        add(nameRow, gbc);

        gbc.gridy = 1;
        add(decklist, gbc);
    }
}
