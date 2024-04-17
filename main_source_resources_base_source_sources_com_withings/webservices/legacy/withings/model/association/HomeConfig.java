package com.withings.webservices.legacy.withings.model.association;

import com.withings.webservices.legacy.withings.model.timeline.AlertEnvironmentItemData;
import com.withings.webservices.legacy.withings.model.timeline.MovementDetectedItemData;
import com.withings.webservices.legacy.withings.model.timeline.NoiseDetectedItemData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class HomeConfig implements Serializable {
    private static final int DEFAULT_VOC_THRESHOLD = 1200;
    public static final int MODE_ALERT_MONITORING = 2;
    public static final int MODE_BABYPHONE = 3;
    public static final int MODE_CAMERA_OFFLINE = 0;
    public static final int MODE_DO_NOT_DISTURB = 1;
    public boolean babyphone;
    public boolean modeChanged;
    public String nightVision;
    public boolean push;
    public boolean recording;
    public boolean visualNotifOnline;
    public boolean visualNotifVoc;
    public int alertVoc = 2;
    public int personDetected = 2;
    public int movementDetected = 2;
    public int noiseDetected = 2;
    public int connection = 2;
    public int vocThreshold = DEFAULT_VOC_THRESHOLD;
    public int movementThreshold = 0;
    public int noiseThreshold = 0;

    /* loaded from: classes4.dex */
    public static class ModeChangeEvent {
    }

    /* loaded from: classes4.dex */
    public enum SettingType {
        Account(1),
        Device(2);
        
        private final int value;

        SettingType(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Map<String, Object> getMapForSetSettings(SettingType settingType) {
        HashMap hashMap = new HashMap();
        if (settingType == SettingType.Account) {
            hashMap.put(AlertEnvironmentItemData.WS_TYPE, Integer.valueOf(this.alertVoc));
            hashMap.put("person_detected", Integer.valueOf(this.personDetected));
            hashMap.put(MovementDetectedItemData.WS_TYPE, Integer.valueOf(this.movementDetected));
            hashMap.put(NoiseDetectedItemData.WS_TYPE, Integer.valueOf(this.noiseDetected));
            hashMap.put("push", Boolean.valueOf(this.push));
            hashMap.put("connection", Integer.valueOf(this.connection));
        } else {
            hashMap.put("voc_th", Integer.valueOf(this.vocThreshold));
            hashMap.put("movement_th", Integer.valueOf(this.movementThreshold));
            hashMap.put("noise_th", Integer.valueOf(this.noiseThreshold));
            hashMap.put("recording", Boolean.valueOf(this.recording));
            hashMap.put("babyphone", Boolean.valueOf(this.babyphone));
            hashMap.put("mode_changed", Boolean.valueOf(this.modeChanged));
            hashMap.put("night_vision", this.nightVision);
            hashMap.put("visual_notif_voc", Boolean.valueOf(this.visualNotifVoc));
            hashMap.put("visual_notif_online", Boolean.valueOf(this.visualNotifOnline));
        }
        return hashMap;
    }

    public int getMode() {
        if (!this.recording) {
            return 0;
        }
        if (!this.babyphone) {
            if (!this.push) {
                return 1;
            }
            return 2;
        }
        return 3;
    }

    public void setMode(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        this.recording = true;
                        this.push = true;
                        this.babyphone = true;
                    }
                } else {
                    this.recording = true;
                    this.push = true;
                    this.babyphone = false;
                }
            } else {
                this.recording = true;
                this.push = false;
                this.babyphone = false;
            }
        } else {
            this.recording = false;
            this.push = false;
            this.babyphone = false;
        }
        if (i11 == 2 && this.noiseDetected == 0 && this.movementDetected == 0 && this.alertVoc == 0) {
            this.noiseDetected = 2;
            this.movementDetected = 2;
            this.alertVoc = 2;
        }
    }
}
