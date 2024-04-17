package com.withings.device;

import com.withings.device.ws.Association;
import com.withings.device.ws.DeviceProperties;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.joda.time.DateTime;
import u70.i;
/* loaded from: classes3.dex */
public class Device implements Serializable {
    private String advertiseKey;
    private DateTime associationDate;
    private String color;
    private int debugMask;
    private int firmware;

    /* renamed from: id  reason: collision with root package name */
    private long f36650id;
    private String klSecret;
    private DateTime lastUseDate;
    private double latitude;
    private Long linkId;
    private double longitude;
    private i macAddress;
    private String manualGeoloc;
    private int maxScreenCount;
    private int measurementIntervalTime;
    private int modelId;
    private String name;
    private int network;
    private Boolean notificationsDisplayEnabled;
    private DevicePictures pictures;
    private String preferredLanguage;
    private String timezone;
    private int trackerWearPosition;
    private int type;
    private String udi;
    private String upgradeUrl;
    private Long userId;
    private Boolean vuMeter;
    private DateTime modifiedDate = DateTime.now();
    private int batteryLevel = -1;
    private int batteryState = -1;
    private boolean impedanceEnabled = true;
    private boolean debugEnabled = false;
    private boolean alarmsEnabled = true;
    private boolean notificationsEnabled = false;
    private int position = -1;
    private boolean isMicMuted = false;
    private boolean isExtraSensitivityEnabled = false;
    private boolean glanceEnabled = true;
    private int consumer = 1;
    private Integer classification = null;
    private boolean workoutAlwaysOnEnabled = false;
    private boolean syncDisabled = false;
    private boolean customScreens = false;
    private String companionMac = null;
    private boolean moveHandsEnabled = true;

    public Device() {
    }

    public boolean areAlarmsEnabled() {
        return this.alarmsEnabled;
    }

    public boolean areNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Device) && ((Device) obj).getId() == getId()) {
            return true;
        }
        return false;
    }

    public String getAdvertiseKey() {
        return this.advertiseKey;
    }

    public DateTime getAssociationDate() {
        return this.associationDate;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public int getBatteryState() {
        return this.batteryState;
    }

    public Integer getClassification() {
        return this.classification;
    }

    public String getColor() {
        return this.color;
    }

    public String getCompanionMac() {
        return this.companionMac;
    }

    public int getConsumer() {
        int i11 = this.consumer;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public int getDebugMask() {
        return this.debugMask;
    }

    public int getFirmware() {
        return this.firmware;
    }

    public long getId() {
        return this.f36650id;
    }

    public String getKlSecret() {
        return this.klSecret;
    }

    public DateTime getLastUseDate() {
        return this.lastUseDate;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public Long getLinkId() {
        return this.linkId;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public i getMacAddress() {
        return this.macAddress;
    }

    public String getManualGeoloc() {
        return this.manualGeoloc;
    }

    public int getMaxScreenCount() {
        return this.maxScreenCount;
    }

    public int getMeasurementIntervalTime() {
        return this.measurementIntervalTime;
    }

    public DeviceModel getModel() {
        return new DeviceModel(getModelId(), this.color);
    }

    public int getModelId() {
        int i11 = this.modelId;
        if (i11 == 59) {
            return 55;
        }
        return i11;
    }

    public DateTime getModifiedDate() {
        return this.modifiedDate;
    }

    public String getName() {
        return this.name;
    }

    public int getNetwork() {
        return this.network;
    }

    public Boolean getNotificationsDisplayEnabled() {
        return this.notificationsDisplayEnabled;
    }

    public DevicePictures getPictures() {
        return this.pictures;
    }

    public int getPosition() {
        return this.position;
    }

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public int getRealModelId() {
        return this.modelId;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getTrackerWearPosition() {
        return this.trackerWearPosition;
    }

    public int getType() {
        return this.type;
    }

    public String getUdi() {
        return this.udi;
    }

    public String getUpgradeUrl() {
        return this.upgradeUrl;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Boolean getVuMeter() {
        return this.vuMeter;
    }

    public int hashCode() {
        return (int) this.f36650id;
    }

    public void initWithAssociation(Association association) {
        initWithDeviceProperties(association.deviceproperties);
        setAssociationDate(association.created);
        setKlSecret(association.klSecret);
        setName(association.devicename);
        if (association.modified.isAfter(this.modifiedDate)) {
            this.modifiedDate = association.modified;
        }
    }

    public void initWithDeviceProperties(DeviceProperties deviceProperties) {
        boolean z5;
        setId(deviceProperties.f37679id);
        setUserId(deviceProperties.linkuserid);
        setLastUseDate(deviceProperties.lastweighindate);
        if (deviceProperties.type == 16 && deviceProperties.lastsessiondate.isAfter(deviceProperties.lastweighindate)) {
            setLastUseDate(deviceProperties.lastsessiondate);
        }
        setModifiedDate(deviceProperties.modified);
        setMacAddress(i.c(deviceProperties.macaddress));
        setFirmware(Long.valueOf(deviceProperties.f37678fw).intValue());
        setPreferredLanguage(deviceProperties.preflang);
        setLatitude(deviceProperties.latitude);
        setLongitude(deviceProperties.longitude);
        setTimezone(deviceProperties.timezone);
        setManualGeoloc(deviceProperties.manualGeoloc);
        setBatteryLevel(deviceProperties.batterylvl);
        boolean z11 = false;
        if (deviceProperties.impedancemeter == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        setImpedanceEnabled(z5);
        if (deviceProperties.debug == 1) {
            z11 = true;
        }
        setDebugEnabled(z11);
        setDebugMask(deviceProperties.debugMask);
        setModelId(deviceProperties.model);
        setColor(deviceProperties.color);
        setType(deviceProperties.type);
        setLinkId(deviceProperties.linkid);
        setNetwork(deviceProperties.network);
        setAdvertiseKey(deviceProperties.advertiseKey);
        setIsMicMuted(deviceProperties.isMicMuted);
        setConsumer(deviceProperties.consumer);
        setExtraSensitivityEnabled(deviceProperties.isExtraSensitivityEnabled);
        setMeasurementIntervalTime(deviceProperties.measurementIntervalTime);
        setClassification(deviceProperties.classification);
        List<DeviceProperties.Picture> list = deviceProperties.pictures;
        if (list != null) {
            setPictures(new DevicePictures(list));
        } else {
            setPictures(new DevicePictures(Collections.emptyList()));
        }
        setVuMeter(deviceProperties.vuMeter);
        setCustomScreens(deviceProperties.customScreens);
    }

    public boolean isCustomScreens() {
        return this.customScreens;
    }

    public boolean isDebugEnabled() {
        return this.debugEnabled;
    }

    public boolean isExtraSensitivityEnabled() {
        return this.isExtraSensitivityEnabled;
    }

    public boolean isGlanceEnabled() {
        return this.glanceEnabled;
    }

    public boolean isImpedanceEnabled() {
        return this.impedanceEnabled;
    }

    public boolean isMicMuted() {
        return this.isMicMuted;
    }

    public boolean isMoveHandsEnabled() {
        return this.moveHandsEnabled;
    }

    public boolean isSyncDisabled() {
        return this.syncDisabled;
    }

    public boolean isWorkoutAlwaysOnEnabled() {
        return this.workoutAlwaysOnEnabled;
    }

    public void setAdvertiseKey(String str) {
        this.advertiseKey = str;
    }

    public void setAlarmsEnabled(boolean z5) {
        this.alarmsEnabled = z5;
    }

    public void setAssociationDate(DateTime dateTime) {
        this.associationDate = dateTime;
    }

    public void setBatteryLevel(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.batteryLevel = i11;
    }

    public void setBatteryState(int i11) {
        this.batteryState = i11;
    }

    public void setClassification(Integer num) {
        this.classification = num;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setCompanionMac(String str) {
        this.companionMac = str;
    }

    public void setConsumer(int i11) {
        if (i11 == 0) {
            this.consumer = 1;
        } else {
            this.consumer = i11;
        }
    }

    public void setCustomScreens(boolean z5) {
        this.customScreens = z5;
    }

    public void setDebugEnabled(boolean z5) {
        this.debugEnabled = z5;
    }

    public void setDebugMask(int i11) {
        this.debugMask = i11;
    }

    public void setExtraSensitivityEnabled(boolean z5) {
        this.isExtraSensitivityEnabled = z5;
    }

    public void setFirmware(int i11) {
        this.firmware = i11;
    }

    public void setGlanceEnabled(boolean z5) {
        this.glanceEnabled = z5;
    }

    public void setId(long j5) {
        this.f36650id = j5;
    }

    public void setImpedanceEnabled(boolean z5) {
        this.impedanceEnabled = z5;
    }

    public void setIsMicMuted(boolean z5) {
        this.isMicMuted = z5;
    }

    public void setKlSecret(String str) {
        this.klSecret = str;
    }

    public void setLastUseDate(DateTime dateTime) {
        this.lastUseDate = dateTime;
    }

    public void setLatitude(double d11) {
        this.latitude = d11;
    }

    public void setLinkId(Long l5) {
        this.linkId = l5;
    }

    public void setLongitude(double d11) {
        this.longitude = d11;
    }

    public void setMacAddress(i iVar) {
        this.macAddress = iVar;
    }

    public void setManualGeoloc(String str) {
        this.manualGeoloc = str;
    }

    public void setMaxScreenCount(int i11) {
        this.maxScreenCount = i11;
    }

    public void setMeasurementIntervalTime(int i11) {
        this.measurementIntervalTime = i11;
    }

    public void setModelId(int i11) {
        this.modelId = i11;
    }

    public void setModifiedDate(DateTime dateTime) {
        this.modifiedDate = dateTime;
    }

    public void setMoveHandsEnabled(boolean z5) {
        this.moveHandsEnabled = z5;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetwork(int i11) {
        this.network = i11;
    }

    public void setNotificationsDisplayEnabled(Boolean bool) {
        this.notificationsDisplayEnabled = bool;
    }

    public void setNotificationsEnabled(boolean z5) {
        this.notificationsEnabled = z5;
    }

    public void setPictures(DevicePictures devicePictures) {
        this.pictures = devicePictures;
    }

    public void setPosition(int i11) {
        this.position = i11;
    }

    public void setPreferredLanguage(String str) {
        this.preferredLanguage = str;
    }

    public void setSyncDisabled(boolean z5) {
        this.syncDisabled = z5;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTrackerWearPosition(int i11) {
        this.trackerWearPosition = i11;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setUdi(String str) {
        this.udi = str;
    }

    public void setUpgradeUrl(String str) {
        this.upgradeUrl = str;
    }

    public void setUserId(Long l5) {
        this.userId = l5;
    }

    public void setVuMeter(Boolean bool) {
        this.vuMeter = bool;
    }

    public void setWorkoutAlwaysOnEnabled(boolean z5) {
        this.workoutAlwaysOnEnabled = z5;
    }

    public String toString() {
        return String.format("Device %s (id: %d, modelId: %d)", this.macAddress, Long.valueOf(this.f36650id), Integer.valueOf(this.modelId));
    }

    public boolean usesWifi() {
        if (this.network == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: clone */
    public Device m22clone() {
        Device device = new Device();
        device.f36650id = this.f36650id;
        device.userId = this.userId;
        device.associationDate = this.associationDate;
        device.lastUseDate = this.lastUseDate;
        device.modifiedDate = this.modifiedDate;
        device.macAddress = this.macAddress;
        device.firmware = this.firmware;
        device.preferredLanguage = this.preferredLanguage;
        device.latitude = this.latitude;
        device.longitude = this.longitude;
        device.timezone = this.timezone;
        device.manualGeoloc = this.manualGeoloc;
        device.batteryLevel = this.batteryLevel;
        device.batteryState = this.batteryState;
        device.type = this.type;
        device.modelId = this.modelId;
        device.color = this.color;
        device.impedanceEnabled = this.impedanceEnabled;
        device.debugEnabled = this.debugEnabled;
        device.debugMask = this.debugMask;
        device.upgradeUrl = this.upgradeUrl;
        device.linkId = this.linkId;
        device.klSecret = this.klSecret;
        device.name = this.name;
        device.network = this.network;
        device.alarmsEnabled = this.alarmsEnabled;
        device.notificationsEnabled = this.notificationsEnabled;
        device.advertiseKey = this.advertiseKey;
        device.position = this.position;
        device.isMicMuted = this.isMicMuted;
        device.isExtraSensitivityEnabled = this.isExtraSensitivityEnabled;
        device.consumer = this.consumer;
        device.pictures = this.pictures;
        device.setMeasurementIntervalTime(this.measurementIntervalTime);
        device.setGlanceEnabled(this.glanceEnabled);
        device.udi = this.udi;
        device.trackerWearPosition = this.trackerWearPosition;
        device.classification = this.classification;
        device.maxScreenCount = this.maxScreenCount;
        device.vuMeter = this.vuMeter;
        device.notificationsDisplayEnabled = this.notificationsDisplayEnabled;
        device.setWorkoutAlwaysOnEnabled(this.workoutAlwaysOnEnabled);
        device.setSyncDisabled(this.syncDisabled);
        device.customScreens = this.customScreens;
        device.companionMac = this.companionMac;
        device.moveHandsEnabled = this.moveHandsEnabled;
        return device;
    }

    public void setTimezone(TimeZone timeZone) {
        this.timezone = timeZone.getID();
    }

    public Device(DeviceProperties deviceProperties) {
        initWithDeviceProperties(deviceProperties);
    }

    public Device(Association association) {
        initWithAssociation(association);
    }
}
