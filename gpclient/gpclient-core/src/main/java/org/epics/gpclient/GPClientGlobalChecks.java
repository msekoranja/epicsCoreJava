/**
 * Copyright information and license terms for this software can be
 * found in the file LICENSE.TXT included with the distribution.
 */
package org.epics.gpclient;

import java.time.Duration;

/**
 *
 * @author carcassi
 */
class GPClientGlobalChecks {
    public static void validateMaxRate(Duration maxRate) {
        if (maxRate == null) {
            throw new IllegalArgumentException("maxRate cannot be null");
        }
        if (maxRate.getSeconds() == 0 && maxRate.toMillis() < 5) {
            throw new IllegalArgumentException("Current implementation limits the rate to >5ms or <200Hz (requested " + maxRate + "s)");
        }
    }
}
