package com.withings.insight.android.entity;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.Instant;
/* compiled from: HealthInsightDb.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0002\u0010\u0013J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u0094\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006;"}, d2 = {"Lcom/withings/insight/android/entity/HealthInsightDb;", "", "id", "", "crmId", "", NavigationArguments.USER_ID, "objectStructure", "objectType", "", "objectId", "timestamp", "Lorg/joda/time/Instant;", "timeToLive", "expirationDate", "url", "title", HealthConstants.FoodInfo.DESCRIPTION, ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "(Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Long;Lorg/joda/time/Instant;ILorg/joda/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/Instant;)V", "getCreated", "()Lorg/joda/time/Instant;", "getCrmId", "()Ljava/lang/String;", "getDescription", "getExpirationDate", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getObjectId", "getObjectStructure", "getObjectType", "()I", "getTimeToLive", "getTimestamp", "getTitle", "getUrl", "getUserId", "()J", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Long;Lorg/joda/time/Instant;ILorg/joda/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/Instant;)Lcom/withings/insight/android/entity/HealthInsightDb;", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthInsightDb {
    private final Instant created;
    private final String crmId;
    private final String description;
    private final Instant expirationDate;

    /* renamed from: id  reason: collision with root package name */
    private final Long f40590id;
    private final Long objectId;
    private final String objectStructure;
    private final int objectType;
    private final int timeToLive;
    private final Instant timestamp;
    private final String title;
    private final String url;
    private final long userId;

    public HealthInsightDb(Long l5, String crmId, long j5, String objectStructure, int i11, Long l6, Instant timestamp, int i12, Instant expirationDate, String url, String title, String description, Instant created) {
        u.j(crmId, "crmId");
        u.j(objectStructure, "objectStructure");
        u.j(timestamp, "timestamp");
        u.j(expirationDate, "expirationDate");
        u.j(url, "url");
        u.j(title, "title");
        u.j(description, "description");
        u.j(created, "created");
        this.f40590id = l5;
        this.crmId = crmId;
        this.userId = j5;
        this.objectStructure = objectStructure;
        this.objectType = i11;
        this.objectId = l6;
        this.timestamp = timestamp;
        this.timeToLive = i12;
        this.expirationDate = expirationDate;
        this.url = url;
        this.title = title;
        this.description = description;
        this.created = created;
    }

    public static /* synthetic */ HealthInsightDb copy$default(HealthInsightDb healthInsightDb, Long l5, String str, long j5, String str2, int i11, Long l6, Instant instant, int i12, Instant instant2, String str3, String str4, String str5, Instant instant3, int i13, Object obj) {
        Long l11;
        String str6;
        long j11;
        String str7;
        int i14;
        Long l12;
        Instant instant4;
        int i15;
        Instant instant5;
        String str8;
        String str9;
        String str10;
        Instant instant6;
        if ((i13 & 1) != 0) {
            l11 = healthInsightDb.f40590id;
        } else {
            l11 = l5;
        }
        if ((i13 & 2) != 0) {
            str6 = healthInsightDb.crmId;
        } else {
            str6 = str;
        }
        if ((i13 & 4) != 0) {
            j11 = healthInsightDb.userId;
        } else {
            j11 = j5;
        }
        if ((i13 & 8) != 0) {
            str7 = healthInsightDb.objectStructure;
        } else {
            str7 = str2;
        }
        if ((i13 & 16) != 0) {
            i14 = healthInsightDb.objectType;
        } else {
            i14 = i11;
        }
        if ((i13 & 32) != 0) {
            l12 = healthInsightDb.objectId;
        } else {
            l12 = l6;
        }
        if ((i13 & 64) != 0) {
            instant4 = healthInsightDb.timestamp;
        } else {
            instant4 = instant;
        }
        if ((i13 & 128) != 0) {
            i15 = healthInsightDb.timeToLive;
        } else {
            i15 = i12;
        }
        if ((i13 & 256) != 0) {
            instant5 = healthInsightDb.expirationDate;
        } else {
            instant5 = instant2;
        }
        if ((i13 & 512) != 0) {
            str8 = healthInsightDb.url;
        } else {
            str8 = str3;
        }
        if ((i13 & 1024) != 0) {
            str9 = healthInsightDb.title;
        } else {
            str9 = str4;
        }
        if ((i13 & ModuleCopy.f28574b) != 0) {
            str10 = healthInsightDb.description;
        } else {
            str10 = str5;
        }
        if ((i13 & 4096) != 0) {
            instant6 = healthInsightDb.created;
        } else {
            instant6 = instant3;
        }
        return healthInsightDb.copy(l11, str6, j11, str7, i14, l12, instant4, i15, instant5, str8, str9, str10, instant6);
    }

    public final Long component1() {
        return this.f40590id;
    }

    public final String component10() {
        return this.url;
    }

    public final String component11() {
        return this.title;
    }

    public final String component12() {
        return this.description;
    }

    public final Instant component13() {
        return this.created;
    }

    public final String component2() {
        return this.crmId;
    }

    public final long component3() {
        return this.userId;
    }

    public final String component4() {
        return this.objectStructure;
    }

    public final int component5() {
        return this.objectType;
    }

    public final Long component6() {
        return this.objectId;
    }

    public final Instant component7() {
        return this.timestamp;
    }

    public final int component8() {
        return this.timeToLive;
    }

    public final Instant component9() {
        return this.expirationDate;
    }

    public final HealthInsightDb copy(Long l5, String crmId, long j5, String objectStructure, int i11, Long l6, Instant timestamp, int i12, Instant expirationDate, String url, String title, String description, Instant created) {
        u.j(crmId, "crmId");
        u.j(objectStructure, "objectStructure");
        u.j(timestamp, "timestamp");
        u.j(expirationDate, "expirationDate");
        u.j(url, "url");
        u.j(title, "title");
        u.j(description, "description");
        u.j(created, "created");
        return new HealthInsightDb(l5, crmId, j5, objectStructure, i11, l6, timestamp, i12, expirationDate, url, title, description, created);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthInsightDb)) {
            return false;
        }
        HealthInsightDb healthInsightDb = (HealthInsightDb) obj;
        if (u.e(this.f40590id, healthInsightDb.f40590id) && u.e(this.crmId, healthInsightDb.crmId) && this.userId == healthInsightDb.userId && u.e(this.objectStructure, healthInsightDb.objectStructure) && this.objectType == healthInsightDb.objectType && u.e(this.objectId, healthInsightDb.objectId) && u.e(this.timestamp, healthInsightDb.timestamp) && this.timeToLive == healthInsightDb.timeToLive && u.e(this.expirationDate, healthInsightDb.expirationDate) && u.e(this.url, healthInsightDb.url) && u.e(this.title, healthInsightDb.title) && u.e(this.description, healthInsightDb.description) && u.e(this.created, healthInsightDb.created)) {
            return true;
        }
        return false;
    }

    public final Instant getCreated() {
        return this.created;
    }

    public final String getCrmId() {
        return this.crmId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Instant getExpirationDate() {
        return this.expirationDate;
    }

    public final Long getId() {
        return this.f40590id;
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

    public final int getTimeToLive() {
        return this.timeToLive;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        Long l5 = this.f40590id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a11 = h.a(this.objectType, d.c(this.objectStructure, c.a(this.userId, d.c(this.crmId, hashCode * 31, 31), 31), 31), 31);
        Long l6 = this.objectId;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return this.created.hashCode() + d.c(this.description, d.c(this.title, d.c(this.url, b.a(this.expirationDate, h.a(this.timeToLive, b.a(this.timestamp, (a11 + i11) * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        Long l5 = this.f40590id;
        String str = this.crmId;
        long j5 = this.userId;
        String str2 = this.objectStructure;
        int i11 = this.objectType;
        Long l6 = this.objectId;
        Instant instant = this.timestamp;
        int i12 = this.timeToLive;
        Instant instant2 = this.expirationDate;
        String str3 = this.url;
        String str4 = this.title;
        String str5 = this.description;
        Instant instant3 = this.created;
        StringBuilder sb2 = new StringBuilder("HealthInsightDb(id=");
        sb2.append(l5);
        sb2.append(", crmId=");
        sb2.append(str);
        sb2.append(", userId=");
        sb2.append(j5);
        sb2.append(", objectStructure=");
        sb2.append(str2);
        sb2.append(", objectType=");
        sb2.append(i11);
        sb2.append(", objectId=");
        sb2.append(l6);
        sb2.append(", timestamp=");
        sb2.append(instant);
        sb2.append(", timeToLive=");
        sb2.append(i12);
        sb2.append(", expirationDate=");
        sb2.append(instant2);
        sb2.append(", url=");
        sb2.append(str3);
        b.d(sb2, ", title=", str4, ", description=", str5);
        sb2.append(", created=");
        sb2.append(instant3);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ HealthInsightDb(Long l5, String str, long j5, String str2, int i11, Long l6, Instant instant, int i12, Instant instant2, String str3, String str4, String str5, Instant instant3, int i13, m mVar) {
        this((i13 & 1) != 0 ? null : l5, str, j5, str2, i11, l6, instant, i12, instant2, str3, str4, str5, instant3);
    }
}
