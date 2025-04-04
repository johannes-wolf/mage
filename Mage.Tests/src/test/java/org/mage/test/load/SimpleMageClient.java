package org.mage.test.load;

import mage.interfaces.MageClient;
import mage.interfaces.callback.ClientCallback;
import mage.remote.Session;
import mage.utils.MageVersion;
import mage.view.GameView;
import org.apache.log4j.Logger;

import java.util.UUID;

/**
 * For tests only
 *
 * @author noxx, JayDi85
 */
public class SimpleMageClient implements MageClient {

    private final UUID clientId;
    private static final MageVersion version = new MageVersion(MageClient.class);

    private static final Logger log = Logger.getLogger(SimpleMageClient.class);

    private final LoadCallbackClient callbackClient;

    public SimpleMageClient(boolean joinGameChat, String logsPrefix, Boolean showLogsAsHtml) {
        clientId = UUID.randomUUID();
        callbackClient = new LoadCallbackClient(joinGameChat, logsPrefix, showLogsAsHtml);
    }

    protected void updateGlobalProgress(String globalProgress) {
        callbackClient.updateGlobalProgress(globalProgress);
    }

    @Override
    public MageVersion getVersion() {
        return version;
    }

    @Override
    public void connected(String message) {
        // do nothing
    }

    @Override
    public void disconnected(boolean askToReconnect, boolean keepMySessionActive) {
        // do nothing
    }

    @Override
    public void showMessage(String message) {
        log.info(message);
    }

    @Override
    public void showError(String message) {
        log.error(message);
    }

    @Override
    public void onNewConnection() {
        callbackClient.onNewConnection();
    }

    @Override
    public void onCallback(ClientCallback callback) {
        try {
            callbackClient.onCallback(callback);
        } catch (Throwable e) {
            log.error(e.getMessage(), e);
        }
    }

    public void setSession(Session session) {
        callbackClient.setSession(session);
    }

    public boolean isGameOver() {
        return callbackClient.isGameOver();
    }

    public void setConcede(boolean needToConcede) {
        this.callbackClient.setConcede(needToConcede);
    }

    public String getLastGameResult() {
        return this.callbackClient.getLastGameResult();
    }

    public GameView getLastGameView() {
        return this.callbackClient.getLastGameView();
    }
}
