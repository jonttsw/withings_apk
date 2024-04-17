package com.withings.target.data.api.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.camera.core.y1;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import org.joda.time.DateTime;
/* compiled from: TargetWS.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J®\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\"R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\"R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b&\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b*\u0010 ¨\u0006A"}, d2 = {"Lcom/withings/target/data/api/model/TargetWS;", "", "id", "", "wsId", NavigationArguments.USER_ID, "type", "", "measureType", ValidateElement.RangeValidateElement.METHOD, "mantissa", "exponent", "isActive", "", "deactivated", "Lorg/joda/time/DateTime;", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "date", "isSyncedWithApi", "attrib", "(Ljava/lang/Long;Ljava/lang/Long;JIILjava/lang/Integer;IIZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/Integer;)V", "getAttrib", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreated", "()Lorg/joda/time/DateTime;", "getDate", "getDeactivated", "getExponent", "()I", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getMantissa", "getMeasureType", "getModified", "getRange", "getType", "getUserId", "()J", "getWsId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;JIILjava/lang/Integer;IIZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/Integer;)Lcom/withings/target/data/api/model/TargetWS;", "equals", "other", "hashCode", "toString", "", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TargetWS {
    private final Integer attrib;
    private final DateTime created;
    private final DateTime date;
    private final DateTime deactivated;
    private final int exponent;

    /* renamed from: id  reason: collision with root package name */
    private final Long f44538id;
    @SerializedName("active")
    private final boolean isActive;
    private final boolean isSyncedWithApi;
    private final int mantissa;
    @SerializedName("target_id")
    private final int measureType;
    private final DateTime modified;
    private final Integer range;
    @SerializedName("target_type")
    private final int type;
    @SerializedName("userid")
    private final long userId;
    @SerializedName("targetid")
    private final Long wsId;

    public TargetWS(Long l5, Long l6, long j5, int i11, int i12, Integer num, int i13, int i14, boolean z5, DateTime dateTime, DateTime created, DateTime modified, DateTime date, boolean z11, Integer num2) {
        u.j(created, "created");
        u.j(modified, "modified");
        u.j(date, "date");
        this.f44538id = l5;
        this.wsId = l6;
        this.userId = j5;
        this.type = i11;
        this.measureType = i12;
        this.range = num;
        this.mantissa = i13;
        this.exponent = i14;
        this.isActive = z5;
        this.deactivated = dateTime;
        this.created = created;
        this.modified = modified;
        this.date = date;
        this.isSyncedWithApi = z11;
        this.attrib = num2;
    }

    public static /* synthetic */ TargetWS copy$default(TargetWS targetWS, Long l5, Long l6, long j5, int i11, int i12, Integer num, int i13, int i14, boolean z5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z11, Integer num2, int i15, Object obj) {
        Long l11;
        Long l12;
        long j11;
        int i16;
        int i17;
        Integer num3;
        int i18;
        int i19;
        boolean z12;
        DateTime dateTime5;
        DateTime dateTime6;
        DateTime dateTime7;
        DateTime dateTime8;
        boolean z13;
        Integer num4;
        if ((i15 & 1) != 0) {
            l11 = targetWS.f44538id;
        } else {
            l11 = l5;
        }
        if ((i15 & 2) != 0) {
            l12 = targetWS.wsId;
        } else {
            l12 = l6;
        }
        if ((i15 & 4) != 0) {
            j11 = targetWS.userId;
        } else {
            j11 = j5;
        }
        if ((i15 & 8) != 0) {
            i16 = targetWS.type;
        } else {
            i16 = i11;
        }
        if ((i15 & 16) != 0) {
            i17 = targetWS.measureType;
        } else {
            i17 = i12;
        }
        if ((i15 & 32) != 0) {
            num3 = targetWS.range;
        } else {
            num3 = num;
        }
        if ((i15 & 64) != 0) {
            i18 = targetWS.mantissa;
        } else {
            i18 = i13;
        }
        if ((i15 & 128) != 0) {
            i19 = targetWS.exponent;
        } else {
            i19 = i14;
        }
        if ((i15 & 256) != 0) {
            z12 = targetWS.isActive;
        } else {
            z12 = z5;
        }
        if ((i15 & 512) != 0) {
            dateTime5 = targetWS.deactivated;
        } else {
            dateTime5 = dateTime;
        }
        if ((i15 & 1024) != 0) {
            dateTime6 = targetWS.created;
        } else {
            dateTime6 = dateTime2;
        }
        if ((i15 & ModuleCopy.f28574b) != 0) {
            dateTime7 = targetWS.modified;
        } else {
            dateTime7 = dateTime3;
        }
        if ((i15 & 4096) != 0) {
            dateTime8 = targetWS.date;
        } else {
            dateTime8 = dateTime4;
        }
        DateTime dateTime9 = dateTime8;
        if ((i15 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z13 = targetWS.isSyncedWithApi;
        } else {
            z13 = z11;
        }
        if ((i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            num4 = targetWS.attrib;
        } else {
            num4 = num2;
        }
        return targetWS.copy(l11, l12, j11, i16, i17, num3, i18, i19, z12, dateTime5, dateTime6, dateTime7, dateTime9, z13, num4);
    }

    public final Long component1() {
        return this.f44538id;
    }

    public final DateTime component10() {
        return this.deactivated;
    }

    public final DateTime component11() {
        return this.created;
    }

    public final DateTime component12() {
        return this.modified;
    }

    public final DateTime component13() {
        return this.date;
    }

    public final boolean component14() {
        return this.isSyncedWithApi;
    }

    public final Integer component15() {
        return this.attrib;
    }

    public final Long component2() {
        return this.wsId;
    }

    public final long component3() {
        return this.userId;
    }

    public final int component4() {
        return this.type;
    }

    public final int component5() {
        return this.measureType;
    }

    public final Integer component6() {
        return this.range;
    }

    public final int component7() {
        return this.mantissa;
    }

    public final int component8() {
        return this.exponent;
    }

    public final boolean component9() {
        return this.isActive;
    }

    public final TargetWS copy(Long l5, Long l6, long j5, int i11, int i12, Integer num, int i13, int i14, boolean z5, DateTime dateTime, DateTime created, DateTime modified, DateTime date, boolean z11, Integer num2) {
        u.j(created, "created");
        u.j(modified, "modified");
        u.j(date, "date");
        return new TargetWS(l5, l6, j5, i11, i12, num, i13, i14, z5, dateTime, created, modified, date, z11, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetWS)) {
            return false;
        }
        TargetWS targetWS = (TargetWS) obj;
        if (u.e(this.f44538id, targetWS.f44538id) && u.e(this.wsId, targetWS.wsId) && this.userId == targetWS.userId && this.type == targetWS.type && this.measureType == targetWS.measureType && u.e(this.range, targetWS.range) && this.mantissa == targetWS.mantissa && this.exponent == targetWS.exponent && this.isActive == targetWS.isActive && u.e(this.deactivated, targetWS.deactivated) && u.e(this.created, targetWS.created) && u.e(this.modified, targetWS.modified) && u.e(this.date, targetWS.date) && this.isSyncedWithApi == targetWS.isSyncedWithApi && u.e(this.attrib, targetWS.attrib)) {
            return true;
        }
        return false;
    }

    public final Integer getAttrib() {
        return this.attrib;
    }

    public final DateTime getCreated() {
        return this.created;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final DateTime getDeactivated() {
        return this.deactivated;
    }

    public final int getExponent() {
        return this.exponent;
    }

    public final Long getId() {
        return this.f44538id;
    }

    public final int getMantissa() {
        return this.mantissa;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final Integer getRange() {
        return this.range;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Long l5 = this.f44538id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = hashCode * 31;
        Long l6 = this.wsId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = h.a(this.measureType, h.a(this.type, c.a(this.userId, (i12 + hashCode2) * 31, 31), 31), 31);
        Integer num = this.range;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int a12 = y1.a(this.isActive, h.a(this.exponent, h.a(this.mantissa, (a11 + hashCode3) * 31, 31), 31), 31);
        DateTime dateTime = this.deactivated;
        if (dateTime == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = dateTime.hashCode();
        }
        int a13 = y1.a(this.isSyncedWithApi, a.b(this.date, a.b(this.modified, a.b(this.created, (a12 + hashCode4) * 31, 31), 31), 31), 31);
        Integer num2 = this.attrib;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return a13 + i11;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSyncedWithApi() {
        return this.isSyncedWithApi;
    }

    public String toString() {
        Long l5 = this.f44538id;
        Long l6 = this.wsId;
        long j5 = this.userId;
        int i11 = this.type;
        int i12 = this.measureType;
        Integer num = this.range;
        int i13 = this.mantissa;
        int i14 = this.exponent;
        boolean z5 = this.isActive;
        DateTime dateTime = this.deactivated;
        DateTime dateTime2 = this.created;
        DateTime dateTime3 = this.modified;
        DateTime dateTime4 = this.date;
        boolean z11 = this.isSyncedWithApi;
        Integer num2 = this.attrib;
        StringBuilder sb2 = new StringBuilder("TargetWS(id=");
        sb2.append(l5);
        sb2.append(", wsId=");
        sb2.append(l6);
        sb2.append(", userId=");
        sb2.append(j5);
        sb2.append(", type=");
        sb2.append(i11);
        sb2.append(", measureType=");
        sb2.append(i12);
        sb2.append(", range=");
        sb2.append(num);
        q2.c(sb2, ", mantissa=", i13, ", exponent=", i14);
        sb2.append(", isActive=");
        sb2.append(z5);
        sb2.append(", deactivated=");
        sb2.append(dateTime);
        sb2.append(", created=");
        sb2.append(dateTime2);
        sb2.append(", modified=");
        sb2.append(dateTime3);
        sb2.append(", date=");
        sb2.append(dateTime4);
        sb2.append(", isSyncedWithApi=");
        sb2.append(z11);
        sb2.append(", attrib=");
        sb2.append(num2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ TargetWS(Long l5, Long l6, long j5, int i11, int i12, Integer num, int i13, int i14, boolean z5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, boolean z11, Integer num2, int i15, m mVar) {
        this((i15 & 1) != 0 ? null : l5, (i15 & 2) != 0 ? null : l6, (i15 & 4) != 0 ? 0L : j5, (i15 & 8) != 0 ? 0 : i11, (i15 & 16) != 0 ? 0 : i12, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) != 0 ? 0 : i14, (i15 & 256) != 0 ? false : z5, (i15 & 512) != 0 ? null : dateTime, dateTime2, dateTime3, dateTime4, (i15 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? true : z11, (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2);
    }
}
