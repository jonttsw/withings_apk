package com.withings.ecg.webservices;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.work.impl.g;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import v6.b;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\t\u0010O\u001a\u00020\u001eHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\u0086\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u001e2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\bHÖ\u0001J\t\u0010\\\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b*\u0010!R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-¨\u0006]"}, d2 = {"Lcom/withings/ecg/webservices/SignalResponse;", "", "signalid", "", "signal", "", "userid", "deviceid", "", WsVasistasSerie.KEY_MODEL, "type", "timestamp", "metatype", "metafreq", "metaformat", "metasize", "metaresolution", "metachannel", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "Lorg/joda/time/DateTime;", "modified", "metagain", "metaqfix", "metatotalsize", "metaoffset", "metaduration", "metaWearPosition", "firmwareVersion", "brand", "deleted", "", "(JLjava/lang/String;JIIIJIIIIIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;IJJIJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getBrand", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreated", "()Lorg/joda/time/DateTime;", "getDeleted", "()Z", "getDeviceid", "()I", "getFirmwareVersion", "getMetaWearPosition", "getMetachannel", "getMetaduration", "()J", "getMetaformat", "getMetafreq", "getMetagain", "getMetaoffset", "getMetaqfix", "getMetaresolution", "getMetasize", "getMetatotalsize", "getMetatype", "getModel", "getModified", "getSignal", "()Ljava/lang/String;", "getSignalid", "getTimestamp", "getType", "getUserid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;JIIIJIIIIIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;IJJIJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/withings/ecg/webservices/SignalResponse;", "equals", "other", "hashCode", "toString", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SignalResponse {
    public static final int $stable = 8;
    private final Integer brand;
    private final DateTime created;
    private final boolean deleted;
    private final int deviceid;
    @SerializedName(WsVasistasSerie.KEY_FW)
    private final Integer firmwareVersion;
    @SerializedName("metawearposition")
    private final Integer metaWearPosition;
    private final int metachannel;
    private final long metaduration;
    private final int metaformat;
    private final int metafreq;
    private final int metagain;
    private final int metaoffset;
    private final long metaqfix;
    private final int metaresolution;
    private final int metasize;
    private final long metatotalsize;
    private final int metatype;
    private final int model;
    private final DateTime modified;
    private final String signal;
    private final long signalid;
    private final long timestamp;
    @SerializedName("signaltype")
    private final int type;
    private final long userid;

    public SignalResponse(long j5, String str, long j11, int i11, int i12, int i13, long j12, int i14, int i15, int i16, int i17, int i18, int i19, DateTime created, DateTime modified, int i21, long j13, long j14, int i22, long j15, Integer num, Integer num2, Integer num3, boolean z5) {
        u.j(created, "created");
        u.j(modified, "modified");
        this.signalid = j5;
        this.signal = str;
        this.userid = j11;
        this.deviceid = i11;
        this.model = i12;
        this.type = i13;
        this.timestamp = j12;
        this.metatype = i14;
        this.metafreq = i15;
        this.metaformat = i16;
        this.metasize = i17;
        this.metaresolution = i18;
        this.metachannel = i19;
        this.created = created;
        this.modified = modified;
        this.metagain = i21;
        this.metaqfix = j13;
        this.metatotalsize = j14;
        this.metaoffset = i22;
        this.metaduration = j15;
        this.metaWearPosition = num;
        this.firmwareVersion = num2;
        this.brand = num3;
        this.deleted = z5;
    }

    public final long component1() {
        return this.signalid;
    }

    public final int component10() {
        return this.metaformat;
    }

    public final int component11() {
        return this.metasize;
    }

    public final int component12() {
        return this.metaresolution;
    }

    public final int component13() {
        return this.metachannel;
    }

    public final DateTime component14() {
        return this.created;
    }

    public final DateTime component15() {
        return this.modified;
    }

    public final int component16() {
        return this.metagain;
    }

    public final long component17() {
        return this.metaqfix;
    }

    public final long component18() {
        return this.metatotalsize;
    }

    public final int component19() {
        return this.metaoffset;
    }

    public final String component2() {
        return this.signal;
    }

    public final long component20() {
        return this.metaduration;
    }

    public final Integer component21() {
        return this.metaWearPosition;
    }

    public final Integer component22() {
        return this.firmwareVersion;
    }

    public final Integer component23() {
        return this.brand;
    }

    public final boolean component24() {
        return this.deleted;
    }

    public final long component3() {
        return this.userid;
    }

    public final int component4() {
        return this.deviceid;
    }

    public final int component5() {
        return this.model;
    }

    public final int component6() {
        return this.type;
    }

    public final long component7() {
        return this.timestamp;
    }

    public final int component8() {
        return this.metatype;
    }

    public final int component9() {
        return this.metafreq;
    }

    public final SignalResponse copy(long j5, String str, long j11, int i11, int i12, int i13, long j12, int i14, int i15, int i16, int i17, int i18, int i19, DateTime created, DateTime modified, int i21, long j13, long j14, int i22, long j15, Integer num, Integer num2, Integer num3, boolean z5) {
        u.j(created, "created");
        u.j(modified, "modified");
        return new SignalResponse(j5, str, j11, i11, i12, i13, j12, i14, i15, i16, i17, i18, i19, created, modified, i21, j13, j14, i22, j15, num, num2, num3, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalResponse)) {
            return false;
        }
        SignalResponse signalResponse = (SignalResponse) obj;
        if (this.signalid == signalResponse.signalid && u.e(this.signal, signalResponse.signal) && this.userid == signalResponse.userid && this.deviceid == signalResponse.deviceid && this.model == signalResponse.model && this.type == signalResponse.type && this.timestamp == signalResponse.timestamp && this.metatype == signalResponse.metatype && this.metafreq == signalResponse.metafreq && this.metaformat == signalResponse.metaformat && this.metasize == signalResponse.metasize && this.metaresolution == signalResponse.metaresolution && this.metachannel == signalResponse.metachannel && u.e(this.created, signalResponse.created) && u.e(this.modified, signalResponse.modified) && this.metagain == signalResponse.metagain && this.metaqfix == signalResponse.metaqfix && this.metatotalsize == signalResponse.metatotalsize && this.metaoffset == signalResponse.metaoffset && this.metaduration == signalResponse.metaduration && u.e(this.metaWearPosition, signalResponse.metaWearPosition) && u.e(this.firmwareVersion, signalResponse.firmwareVersion) && u.e(this.brand, signalResponse.brand) && this.deleted == signalResponse.deleted) {
            return true;
        }
        return false;
    }

    public final Integer getBrand() {
        return this.brand;
    }

    public final DateTime getCreated() {
        return this.created;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final int getDeviceid() {
        return this.deviceid;
    }

    public final Integer getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final Integer getMetaWearPosition() {
        return this.metaWearPosition;
    }

    public final int getMetachannel() {
        return this.metachannel;
    }

    public final long getMetaduration() {
        return this.metaduration;
    }

    public final int getMetaformat() {
        return this.metaformat;
    }

    public final int getMetafreq() {
        return this.metafreq;
    }

    public final int getMetagain() {
        return this.metagain;
    }

    public final int getMetaoffset() {
        return this.metaoffset;
    }

    public final long getMetaqfix() {
        return this.metaqfix;
    }

    public final int getMetaresolution() {
        return this.metaresolution;
    }

    public final int getMetasize() {
        return this.metasize;
    }

    public final long getMetatotalsize() {
        return this.metatotalsize;
    }

    public final int getMetatype() {
        return this.metatype;
    }

    public final int getModel() {
        return this.model;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final String getSignal() {
        return this.signal;
    }

    public final long getSignalid() {
        return this.signalid;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserid() {
        return this.userid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Long.hashCode(this.signalid) * 31;
        String str = this.signal;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a11 = c.a(this.metaduration, h.a(this.metaoffset, c.a(this.metatotalsize, c.a(this.metaqfix, h.a(this.metagain, a.b(this.modified, a.b(this.created, h.a(this.metachannel, h.a(this.metaresolution, h.a(this.metasize, h.a(this.metaformat, h.a(this.metafreq, h.a(this.metatype, c.a(this.timestamp, h.a(this.type, h.a(this.model, h.a(this.deviceid, c.a(this.userid, (hashCode4 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.metaWearPosition;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (a11 + hashCode2) * 31;
        Integer num2 = this.firmwareVersion;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num3 = this.brand;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return Boolean.hashCode(this.deleted) + ((i13 + i11) * 31);
    }

    public String toString() {
        long j5 = this.signalid;
        String str = this.signal;
        long j11 = this.userid;
        int i11 = this.deviceid;
        int i12 = this.model;
        int i13 = this.type;
        long j12 = this.timestamp;
        int i14 = this.metatype;
        int i15 = this.metafreq;
        int i16 = this.metaformat;
        int i17 = this.metasize;
        int i18 = this.metaresolution;
        int i19 = this.metachannel;
        DateTime dateTime = this.created;
        DateTime dateTime2 = this.modified;
        int i21 = this.metagain;
        long j13 = this.metaqfix;
        long j14 = this.metatotalsize;
        int i22 = this.metaoffset;
        long j15 = this.metaduration;
        Integer num = this.metaWearPosition;
        Integer num2 = this.firmwareVersion;
        Integer num3 = this.brand;
        boolean z5 = this.deleted;
        StringBuilder sb2 = new StringBuilder("SignalResponse(signalid=");
        sb2.append(j5);
        sb2.append(", signal=");
        sb2.append(str);
        g.d(sb2, ", userid=", j11, ", deviceid=");
        b.a(sb2, i11, ", model=", i12, ", type=");
        sb2.append(i13);
        sb2.append(", timestamp=");
        sb2.append(j12);
        q2.c(sb2, ", metatype=", i14, ", metafreq=", i15);
        q2.c(sb2, ", metaformat=", i16, ", metasize=", i17);
        q2.c(sb2, ", metaresolution=", i18, ", metachannel=", i19);
        sb2.append(", created=");
        sb2.append(dateTime);
        sb2.append(", modified=");
        sb2.append(dateTime2);
        sb2.append(", metagain=");
        sb2.append(i21);
        sb2.append(", metaqfix=");
        sb2.append(j13);
        g.d(sb2, ", metatotalsize=", j14, ", metaoffset=");
        sb2.append(i22);
        sb2.append(", metaduration=");
        sb2.append(j15);
        sb2.append(", metaWearPosition=");
        sb2.append(num);
        sb2.append(", firmwareVersion=");
        sb2.append(num2);
        sb2.append(", brand=");
        sb2.append(num3);
        sb2.append(", deleted=");
        sb2.append(z5);
        sb2.append(")");
        return sb2.toString();
    }
}
