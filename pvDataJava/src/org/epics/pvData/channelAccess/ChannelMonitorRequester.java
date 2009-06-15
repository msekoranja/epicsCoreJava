/**
 * Copyright - See the COPYRIGHT that is included with this distribution.
 * EPICS JavaIOC is distributed subject to a Software License Agreement found
 * in file LICENSE that is included with this distribution.
 */
package org.epics.pvData.channelAccess;

import org.epics.pvData.pv.Requester;

/**
 *  Requester that monitors a channel without requesting data.
 * @author mrk
 *
 */
public interface ChannelMonitorRequester extends Requester{
    /**
     * A monitor event has occured.
     */
    void monitorEvent();
    /**
     * unlisten 
     */
    void unlisten();
}
