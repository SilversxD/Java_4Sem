package Task7.bridge.network;

/**
 * Абстракция сеть
 */
public interface Network {
    boolean isConnected();

    void connectToInternet();

    void disconnect();
}