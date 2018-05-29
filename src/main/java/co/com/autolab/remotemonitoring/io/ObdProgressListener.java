package co.com.autolab.remotemonitoring.io;

public interface ObdProgressListener {

    void stateUpdate(final ObdCommandJob job);

}