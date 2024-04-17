package com.withings.library.ecg.filter;

import androidx.appcompat.app.h;
import com.withings.library.ecg.EcgSignalFormat;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.WearPosition;
import com.withings.library.ecg.filter.EcgFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: EcgFilterConfig.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/withings/library/ecg/filter/EcgFilterConfig;", "", "frequency", "", "nbSample", "wearPosition", "Lcom/withings/library/ecg/WearPosition;", "gain", "deviceModel", "ecgSignalFormat", "Lcom/withings/library/ecg/EcgSignalFormat;", "ecgSignalType", "Lcom/withings/library/ecg/EcgSignalType;", "hrListener", "Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "(IILcom/withings/library/ecg/WearPosition;IILcom/withings/library/ecg/EcgSignalFormat;Lcom/withings/library/ecg/EcgSignalType;Lcom/withings/library/ecg/filter/EcgFilter$HrListener;)V", "getDeviceModel", "()I", "getEcgSignalFormat", "()Lcom/withings/library/ecg/EcgSignalFormat;", "getEcgSignalType", "()Lcom/withings/library/ecg/EcgSignalType;", "getFrequency", "getGain", "getHrListener", "()Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "getNbSample", "getWearPosition", "()Lcom/withings/library/ecg/WearPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgFilterConfig {
    private final int deviceModel;
    private final EcgSignalFormat ecgSignalFormat;
    private final EcgSignalType ecgSignalType;
    private final int frequency;
    private final int gain;
    private final EcgFilter.HrListener hrListener;
    private final int nbSample;
    private final WearPosition wearPosition;

    public EcgFilterConfig(int i11, int i12, WearPosition wearPosition, int i13, int i14, EcgSignalFormat ecgSignalFormat, EcgSignalType ecgSignalType, EcgFilter.HrListener hrListener) {
        u.j(wearPosition, "wearPosition");
        u.j(ecgSignalFormat, "ecgSignalFormat");
        u.j(ecgSignalType, "ecgSignalType");
        this.frequency = i11;
        this.nbSample = i12;
        this.wearPosition = wearPosition;
        this.gain = i13;
        this.deviceModel = i14;
        this.ecgSignalFormat = ecgSignalFormat;
        this.ecgSignalType = ecgSignalType;
        this.hrListener = hrListener;
    }

    public static /* synthetic */ EcgFilterConfig copy$default(EcgFilterConfig ecgFilterConfig, int i11, int i12, WearPosition wearPosition, int i13, int i14, EcgSignalFormat ecgSignalFormat, EcgSignalType ecgSignalType, EcgFilter.HrListener hrListener, int i15, Object obj) {
        int i16;
        int i17;
        WearPosition wearPosition2;
        int i18;
        int i19;
        EcgSignalFormat ecgSignalFormat2;
        EcgSignalType ecgSignalType2;
        EcgFilter.HrListener hrListener2;
        if ((i15 & 1) != 0) {
            i16 = ecgFilterConfig.frequency;
        } else {
            i16 = i11;
        }
        if ((i15 & 2) != 0) {
            i17 = ecgFilterConfig.nbSample;
        } else {
            i17 = i12;
        }
        if ((i15 & 4) != 0) {
            wearPosition2 = ecgFilterConfig.wearPosition;
        } else {
            wearPosition2 = wearPosition;
        }
        if ((i15 & 8) != 0) {
            i18 = ecgFilterConfig.gain;
        } else {
            i18 = i13;
        }
        if ((i15 & 16) != 0) {
            i19 = ecgFilterConfig.deviceModel;
        } else {
            i19 = i14;
        }
        if ((i15 & 32) != 0) {
            ecgSignalFormat2 = ecgFilterConfig.ecgSignalFormat;
        } else {
            ecgSignalFormat2 = ecgSignalFormat;
        }
        if ((i15 & 64) != 0) {
            ecgSignalType2 = ecgFilterConfig.ecgSignalType;
        } else {
            ecgSignalType2 = ecgSignalType;
        }
        if ((i15 & 128) != 0) {
            hrListener2 = ecgFilterConfig.hrListener;
        } else {
            hrListener2 = hrListener;
        }
        return ecgFilterConfig.copy(i16, i17, wearPosition2, i18, i19, ecgSignalFormat2, ecgSignalType2, hrListener2);
    }

    public final int component1() {
        return this.frequency;
    }

    public final int component2() {
        return this.nbSample;
    }

    public final WearPosition component3() {
        return this.wearPosition;
    }

    public final int component4() {
        return this.gain;
    }

    public final int component5() {
        return this.deviceModel;
    }

    public final EcgSignalFormat component6() {
        return this.ecgSignalFormat;
    }

    public final EcgSignalType component7() {
        return this.ecgSignalType;
    }

    public final EcgFilter.HrListener component8() {
        return this.hrListener;
    }

    public final EcgFilterConfig copy(int i11, int i12, WearPosition wearPosition, int i13, int i14, EcgSignalFormat ecgSignalFormat, EcgSignalType ecgSignalType, EcgFilter.HrListener hrListener) {
        u.j(wearPosition, "wearPosition");
        u.j(ecgSignalFormat, "ecgSignalFormat");
        u.j(ecgSignalType, "ecgSignalType");
        return new EcgFilterConfig(i11, i12, wearPosition, i13, i14, ecgSignalFormat, ecgSignalType, hrListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcgFilterConfig)) {
            return false;
        }
        EcgFilterConfig ecgFilterConfig = (EcgFilterConfig) obj;
        if (this.frequency == ecgFilterConfig.frequency && this.nbSample == ecgFilterConfig.nbSample && this.wearPosition == ecgFilterConfig.wearPosition && this.gain == ecgFilterConfig.gain && this.deviceModel == ecgFilterConfig.deviceModel && this.ecgSignalFormat == ecgFilterConfig.ecgSignalFormat && this.ecgSignalType == ecgFilterConfig.ecgSignalType && u.e(this.hrListener, ecgFilterConfig.hrListener)) {
            return true;
        }
        return false;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final EcgSignalFormat getEcgSignalFormat() {
        return this.ecgSignalFormat;
    }

    public final EcgSignalType getEcgSignalType() {
        return this.ecgSignalType;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getGain() {
        return this.gain;
    }

    public final EcgFilter.HrListener getHrListener() {
        return this.hrListener;
    }

    public final int getNbSample() {
        return this.nbSample;
    }

    public final WearPosition getWearPosition() {
        return this.wearPosition;
    }

    public int hashCode() {
        int hashCode;
        int a11 = h.a(this.nbSample, Integer.hashCode(this.frequency) * 31, 31);
        int a12 = h.a(this.deviceModel, h.a(this.gain, (this.wearPosition.hashCode() + a11) * 31, 31), 31);
        int hashCode2 = (this.ecgSignalType.hashCode() + ((this.ecgSignalFormat.hashCode() + a12) * 31)) * 31;
        EcgFilter.HrListener hrListener = this.hrListener;
        if (hrListener == null) {
            hashCode = 0;
        } else {
            hashCode = hrListener.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "EcgFilterConfig(frequency=" + this.frequency + ", nbSample=" + this.nbSample + ", wearPosition=" + this.wearPosition + ", gain=" + this.gain + ", deviceModel=" + this.deviceModel + ", ecgSignalFormat=" + this.ecgSignalFormat + ", ecgSignalType=" + this.ecgSignalType + ", hrListener=" + this.hrListener + ')';
    }

    public /* synthetic */ EcgFilterConfig(int i11, int i12, WearPosition wearPosition, int i13, int i14, EcgSignalFormat ecgSignalFormat, EcgSignalType ecgSignalType, EcgFilter.HrListener hrListener, int i15, m mVar) {
        this(i11, i12, wearPosition, i13, i14, ecgSignalFormat, ecgSignalType, (i15 & 128) != 0 ? null : hrListener);
    }
}
