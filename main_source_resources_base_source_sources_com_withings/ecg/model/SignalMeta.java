package com.withings.ecg.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.work.impl.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import v6.b;
/* compiled from: HeartSignalMeasurement.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001a¨\u00067"}, d2 = {"Lcom/withings/ecg/model/SignalMeta;", "", "timeWindow", "", "duration", "", "totalSize", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "gain", "qfix", "type", "samplingFreq", "channel", "", WsVasistasSerie.KEY_FORMAT, "size", "resolution", "filterBank", "(IJJIIJIISSSSJ)V", "getChannel", "()S", "getDuration", "()J", "getFilterBank", "getFormat", "getGain", "()I", "getOffset", "getQfix", "getResolution", "getSamplingFreq", "getSize", "getTimeWindow", "getTotalSize", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SignalMeta {
    public static final int $stable = 0;
    private final short channel;
    private final long duration;
    private final long filterBank;
    private final short format;
    private final int gain;
    private final int offset;
    private final long qfix;
    private final short resolution;
    private final int samplingFreq;
    private final short size;
    private final int timeWindow;
    private final long totalSize;
    private final int type;

    public SignalMeta() {
        this(0, 0L, 0L, 0, 0, 0L, 0, 0, (short) 0, (short) 0, (short) 0, (short) 0, 0L, 8191, null);
    }

    public static /* synthetic */ SignalMeta copy$default(SignalMeta signalMeta, int i11, long j5, long j11, int i12, int i13, long j12, int i14, int i15, short s11, short s12, short s13, short s14, long j13, int i16, Object obj) {
        int i17;
        long j14;
        long j15;
        int i18;
        int i19;
        long j16;
        int i21;
        int i22;
        short s15;
        short s16;
        short s17;
        short s18;
        long j17;
        if ((i16 & 1) != 0) {
            i17 = signalMeta.timeWindow;
        } else {
            i17 = i11;
        }
        if ((i16 & 2) != 0) {
            j14 = signalMeta.duration;
        } else {
            j14 = j5;
        }
        if ((i16 & 4) != 0) {
            j15 = signalMeta.totalSize;
        } else {
            j15 = j11;
        }
        if ((i16 & 8) != 0) {
            i18 = signalMeta.offset;
        } else {
            i18 = i12;
        }
        if ((i16 & 16) != 0) {
            i19 = signalMeta.gain;
        } else {
            i19 = i13;
        }
        if ((i16 & 32) != 0) {
            j16 = signalMeta.qfix;
        } else {
            j16 = j12;
        }
        if ((i16 & 64) != 0) {
            i21 = signalMeta.type;
        } else {
            i21 = i14;
        }
        if ((i16 & 128) != 0) {
            i22 = signalMeta.samplingFreq;
        } else {
            i22 = i15;
        }
        if ((i16 & 256) != 0) {
            s15 = signalMeta.channel;
        } else {
            s15 = s11;
        }
        if ((i16 & 512) != 0) {
            s16 = signalMeta.format;
        } else {
            s16 = s12;
        }
        if ((i16 & 1024) != 0) {
            s17 = signalMeta.size;
        } else {
            s17 = s13;
        }
        short s19 = s17;
        if ((i16 & ModuleCopy.f28574b) != 0) {
            s18 = signalMeta.resolution;
        } else {
            s18 = s14;
        }
        short s21 = s16;
        short s22 = s18;
        if ((i16 & 4096) != 0) {
            j17 = signalMeta.filterBank;
        } else {
            j17 = j13;
        }
        return signalMeta.copy(i17, j14, j15, i18, i19, j16, i21, i22, s15, s21, s19, s22, j17);
    }

    public final int component1() {
        return this.timeWindow;
    }

    public final short component10() {
        return this.format;
    }

    public final short component11() {
        return this.size;
    }

    public final short component12() {
        return this.resolution;
    }

    public final long component13() {
        return this.filterBank;
    }

    public final long component2() {
        return this.duration;
    }

    public final long component3() {
        return this.totalSize;
    }

    public final int component4() {
        return this.offset;
    }

    public final int component5() {
        return this.gain;
    }

    public final long component6() {
        return this.qfix;
    }

    public final int component7() {
        return this.type;
    }

    public final int component8() {
        return this.samplingFreq;
    }

    public final short component9() {
        return this.channel;
    }

    public final SignalMeta copy(int i11, long j5, long j11, int i12, int i13, long j12, int i14, int i15, short s11, short s12, short s13, short s14, long j13) {
        return new SignalMeta(i11, j5, j11, i12, i13, j12, i14, i15, s11, s12, s13, s14, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalMeta)) {
            return false;
        }
        SignalMeta signalMeta = (SignalMeta) obj;
        if (this.timeWindow == signalMeta.timeWindow && this.duration == signalMeta.duration && this.totalSize == signalMeta.totalSize && this.offset == signalMeta.offset && this.gain == signalMeta.gain && this.qfix == signalMeta.qfix && this.type == signalMeta.type && this.samplingFreq == signalMeta.samplingFreq && this.channel == signalMeta.channel && this.format == signalMeta.format && this.size == signalMeta.size && this.resolution == signalMeta.resolution && this.filterBank == signalMeta.filterBank) {
            return true;
        }
        return false;
    }

    public final short getChannel() {
        return this.channel;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getFilterBank() {
        return this.filterBank;
    }

    public final short getFormat() {
        return this.format;
    }

    public final int getGain() {
        return this.gain;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final long getQfix() {
        return this.qfix;
    }

    public final short getResolution() {
        return this.resolution;
    }

    public final int getSamplingFreq() {
        return this.samplingFreq;
    }

    public final short getSize() {
        return this.size;
    }

    public final int getTimeWindow() {
        return this.timeWindow;
    }

    public final long getTotalSize() {
        return this.totalSize;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int a11 = h.a(this.samplingFreq, h.a(this.type, c.a(this.qfix, h.a(this.gain, h.a(this.offset, c.a(this.totalSize, c.a(this.duration, Integer.hashCode(this.timeWindow) * 31, 31), 31), 31), 31), 31), 31), 31);
        int hashCode = Short.hashCode(this.format);
        int hashCode2 = Short.hashCode(this.size);
        int hashCode3 = Short.hashCode(this.resolution);
        return Long.hashCode(this.filterBank) + ((hashCode3 + ((hashCode2 + ((hashCode + ((Short.hashCode(this.channel) + a11) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        int i11 = this.timeWindow;
        long j5 = this.duration;
        long j11 = this.totalSize;
        int i12 = this.offset;
        int i13 = this.gain;
        long j12 = this.qfix;
        int i14 = this.type;
        int i15 = this.samplingFreq;
        short s11 = this.channel;
        short s12 = this.format;
        short s13 = this.size;
        short s14 = this.resolution;
        long j13 = this.filterBank;
        StringBuilder sb2 = new StringBuilder("SignalMeta(timeWindow=");
        sb2.append(i11);
        sb2.append(", duration=");
        sb2.append(j5);
        g.d(sb2, ", totalSize=", j11, ", offset=");
        b.a(sb2, i12, ", gain=", i13, ", qfix=");
        sb2.append(j12);
        sb2.append(", type=");
        sb2.append(i14);
        q2.c(sb2, ", samplingFreq=", i15, ", channel=", s11);
        q2.c(sb2, ", format=", s12, ", size=", s13);
        sb2.append(", resolution=");
        sb2.append((int) s14);
        sb2.append(", filterBank=");
        return android.support.v4.media.session.c.c(sb2, j13, ")");
    }

    public SignalMeta(int i11, long j5, long j11, int i12, int i13, long j12, int i14, int i15, short s11, short s12, short s13, short s14, long j13) {
        this.timeWindow = i11;
        this.duration = j5;
        this.totalSize = j11;
        this.offset = i12;
        this.gain = i13;
        this.qfix = j12;
        this.type = i14;
        this.samplingFreq = i15;
        this.channel = s11;
        this.format = s12;
        this.size = s13;
        this.resolution = s14;
        this.filterBank = j13;
    }

    public /* synthetic */ SignalMeta(int i11, long j5, long j11, int i12, int i13, long j12, int i14, int i15, short s11, short s12, short s13, short s14, long j13, int i16, m mVar) {
        this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0L : j5, (i16 & 4) != 0 ? 0L : j11, (i16 & 8) != 0 ? 0 : i12, (i16 & 16) != 0 ? 0 : i13, (i16 & 32) != 0 ? 0L : j12, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? 0 : i15, (i16 & 256) != 0 ? (short) 0 : s11, (i16 & 512) != 0 ? (short) 0 : s12, (i16 & 1024) != 0 ? (short) 0 : s13, (i16 & ModuleCopy.f28574b) != 0 ? (short) 0 : s14, (i16 & 4096) != 0 ? 0L : j13);
    }
}
