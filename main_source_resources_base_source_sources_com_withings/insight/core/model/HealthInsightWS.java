package com.withings.insight.core.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HealthInsightWS.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0006HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00062"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightWS;", "", "crmId", "", "objectStructure", "objectType", "", "objectId", "", "timestamp", "timeToLive", "url", "title", HealthConstants.FoodInfo.DESCRIPTION, ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCreated", "()J", "getCrmId", "()Ljava/lang/String;", "getDescription", "getObjectId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getObjectStructure", "getObjectType", "()I", "getTimeToLive", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimestamp", "getTitle", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/withings/insight/core/model/HealthInsightWS;", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthInsightWS {
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final long created;
    @SerializedName("crmid")
    private final String crmId;
    @SerializedName(HealthConstants.FoodInfo.DESCRIPTION)
    private final String description;
    @SerializedName("object_id")
    private final Long objectId;
    @SerializedName("object_structure")
    private final String objectStructure;
    @SerializedName("object_type")
    private final int objectType;
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE)
    private final Integer timeToLive;
    @SerializedName("timestamp")
    private final long timestamp;
    @SerializedName("title")
    private final String title;
    @SerializedName("url")
    private final String url;

    public HealthInsightWS(String crmId, String objectStructure, int i11, Long l5, long j5, Integer num, String url, String title, String description, long j11) {
        u.j(crmId, "crmId");
        u.j(objectStructure, "objectStructure");
        u.j(url, "url");
        u.j(title, "title");
        u.j(description, "description");
        this.crmId = crmId;
        this.objectStructure = objectStructure;
        this.objectType = i11;
        this.objectId = l5;
        this.timestamp = j5;
        this.timeToLive = num;
        this.url = url;
        this.title = title;
        this.description = description;
        this.created = j11;
    }

    public static /* synthetic */ HealthInsightWS copy$default(HealthInsightWS healthInsightWS, String str, String str2, int i11, Long l5, long j5, Integer num, String str3, String str4, String str5, long j11, int i12, Object obj) {
        String str6;
        String str7;
        int i13;
        Long l6;
        long j12;
        Integer num2;
        String str8;
        String str9;
        String str10;
        long j13;
        if ((i12 & 1) != 0) {
            str6 = healthInsightWS.crmId;
        } else {
            str6 = str;
        }
        if ((i12 & 2) != 0) {
            str7 = healthInsightWS.objectStructure;
        } else {
            str7 = str2;
        }
        if ((i12 & 4) != 0) {
            i13 = healthInsightWS.objectType;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            l6 = healthInsightWS.objectId;
        } else {
            l6 = l5;
        }
        if ((i12 & 16) != 0) {
            j12 = healthInsightWS.timestamp;
        } else {
            j12 = j5;
        }
        if ((i12 & 32) != 0) {
            num2 = healthInsightWS.timeToLive;
        } else {
            num2 = num;
        }
        if ((i12 & 64) != 0) {
            str8 = healthInsightWS.url;
        } else {
            str8 = str3;
        }
        if ((i12 & 128) != 0) {
            str9 = healthInsightWS.title;
        } else {
            str9 = str4;
        }
        if ((i12 & 256) != 0) {
            str10 = healthInsightWS.description;
        } else {
            str10 = str5;
        }
        if ((i12 & 512) != 0) {
            j13 = healthInsightWS.created;
        } else {
            j13 = j11;
        }
        return healthInsightWS.copy(str6, str7, i13, l6, j12, num2, str8, str9, str10, j13);
    }

    public final String component1() {
        return this.crmId;
    }

    public final long component10() {
        return this.created;
    }

    public final String component2() {
        return this.objectStructure;
    }

    public final int component3() {
        return this.objectType;
    }

    public final Long component4() {
        return this.objectId;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final Integer component6() {
        return this.timeToLive;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.description;
    }

    public final HealthInsightWS copy(String crmId, String objectStructure, int i11, Long l5, long j5, Integer num, String url, String title, String description, long j11) {
        u.j(crmId, "crmId");
        u.j(objectStructure, "objectStructure");
        u.j(url, "url");
        u.j(title, "title");
        u.j(description, "description");
        return new HealthInsightWS(crmId, objectStructure, i11, l5, j5, num, url, title, description, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthInsightWS)) {
            return false;
        }
        HealthInsightWS healthInsightWS = (HealthInsightWS) obj;
        if (u.e(this.crmId, healthInsightWS.crmId) && u.e(this.objectStructure, healthInsightWS.objectStructure) && this.objectType == healthInsightWS.objectType && u.e(this.objectId, healthInsightWS.objectId) && this.timestamp == healthInsightWS.timestamp && u.e(this.timeToLive, healthInsightWS.timeToLive) && u.e(this.url, healthInsightWS.url) && u.e(this.title, healthInsightWS.title) && u.e(this.description, healthInsightWS.description) && this.created == healthInsightWS.created) {
            return true;
        }
        return false;
    }

    public final long getCreated() {
        return this.created;
    }

    public final String getCrmId() {
        return this.crmId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getObjectId() {
        return this.objectId;
    }

    public final String getObjectStructure() {
        return this.objectStructure;
    }

    public final int getObjectType() {
        return this.objectType;
    }

    public final Integer getTimeToLive() {
        return this.timeToLive;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int a11 = h.a(this.objectType, d.c(this.objectStructure, this.crmId.hashCode() * 31, 31), 31);
        Long l5 = this.objectId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a12 = c.a(this.timestamp, (a11 + hashCode) * 31, 31);
        Integer num = this.timeToLive;
        if (num != null) {
            i11 = num.hashCode();
        }
        return Long.hashCode(this.created) + d.c(this.description, d.c(this.title, d.c(this.url, (a12 + i11) * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.crmId;
        String str2 = this.objectStructure;
        int i11 = this.objectType;
        Long l5 = this.objectId;
        long j5 = this.timestamp;
        Integer num = this.timeToLive;
        String str3 = this.url;
        String str4 = this.title;
        String str5 = this.description;
        long j11 = this.created;
        StringBuilder b10 = l0.b("HealthInsightWS(crmId=", str, ", objectStructure=", str2, ", objectType=");
        b10.append(i11);
        b10.append(", objectId=");
        b10.append(l5);
        b10.append(", timestamp=");
        b10.append(j5);
        b10.append(", timeToLive=");
        b10.append(num);
        b.d(b10, ", url=", str3, ", title=", str4);
        b10.append(", description=");
        b10.append(str5);
        b10.append(", created=");
        return android.support.v4.media.session.c.c(b10, j11, ")");
    }
}
