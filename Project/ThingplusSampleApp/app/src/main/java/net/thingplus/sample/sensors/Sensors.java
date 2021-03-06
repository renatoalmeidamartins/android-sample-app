/*
 * Copyright (c) 2015, Daliworks. All rights reserved.
 *
 * Reproduction and/or distribution in source and binary forms
 * without the written consent of Daliworks, Inc. is prohibited.
 *
 */

package net.thingplus.sample.sensors;

public interface Sensors {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final String NOT_IMPLEMENTED = "Not Implemented";
    public static final long ONE_SECONDE = 1000;
    public static final long ONE_MINUTE = 60;
    public static final String SECONDS_AGO = " seconds ago";
    public static final String MINUTES_AGO = " minutes ago";

    public String getSensorType();
    public int getSensorIcon();
    public String getSensorName();
    public String getSensorValue();
    public String getSensorUnit();
    public String getSensorUpdatedTime();
}
