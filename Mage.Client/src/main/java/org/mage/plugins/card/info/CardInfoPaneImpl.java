package org.mage.plugins.card.info;

import java.awt.Component;
import javax.swing.JEditorPane;
import mage.client.util.GUISizeHelper;
import mage.client.util.gui.GuiDisplayUtil;
import mage.client.util.gui.GuiDisplayUtil.TextLines;
import mage.components.CardInfoPane;
import mage.view.CardView;
import org.mage.card.arcane.UI;

/**
 * GUI: card info pane for displaying card rules (example: text mode for popup card). Supports drawing mana symbols.
 *
 * @author nantuko
 */
public class CardInfoPaneImpl extends JEditorPane implements CardInfoPane {

    public static final int TOOLTIP_WIDTH_MIN = 160;

    public static final int TOOLTIP_HEIGHT_MIN = 120;
    public static final int TOOLTIP_HEIGHT_MAX = 300;

    public static final int TOOLTIP_BORDER_WIDTH = 80;

    private int addWidth;
    private int addHeight;

    public CardInfoPaneImpl() {
        UI.setHTMLEditorKit(this);
        setEditable(false);
        setGUISize();
    }

    public void changeGUISize() {
        setGUISize();
        this.revalidate();
        this.repaint();
    }

    private void setGUISize() {
        addWidth = GUISizeHelper.cardTooltipLargeTextWidth;
        addHeight = GUISizeHelper.cardTooltipLargeTextHeight;
    }

    @Override
    public void setCard(final CardView card, final Component container) {
        try {
            UI.invokeAndWait(() -> {
                TextLines textLines = GuiDisplayUtil.getTextLinesfromCardView(card);
                StringBuilder buffer = GuiDisplayUtil.getRulesFromCardView(card, textLines);
                setText(buffer.toString());
                resizeTooltipIfNeeded(container, textLines.getBasicTextLength(), textLines.getLines().size());
                setCaretPosition(0);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resizeTooltipIfNeeded(Component container, int ruleLength, int rules) {
        // TODO: fix bug with long image path here?
        if (container == null) {
            return;
        }

        boolean makeBig = (rules > 5 || ruleLength > 350);
        if (makeBig) {
            container.setSize(addWidth + TOOLTIP_WIDTH_MIN + TOOLTIP_BORDER_WIDTH,
                              addHeight + TOOLTIP_HEIGHT_MAX + TOOLTIP_BORDER_WIDTH);
            this.setSize(addWidth + TOOLTIP_WIDTH_MIN,
                         addHeight + TOOLTIP_HEIGHT_MAX);
        } else {
            container.setSize(addWidth + TOOLTIP_WIDTH_MIN + TOOLTIP_BORDER_WIDTH,
                              addHeight + TOOLTIP_HEIGHT_MIN + TOOLTIP_BORDER_WIDTH);
            this.setSize(addWidth + TOOLTIP_WIDTH_MIN,
                         addHeight + TOOLTIP_HEIGHT_MIN);
        }
    }
}
