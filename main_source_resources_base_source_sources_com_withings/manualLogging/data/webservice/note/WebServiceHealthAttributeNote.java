package com.withings.manualLogging.data.webservice.note;

import androidx.activity.result.c;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: WebServiceNote.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006-"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/WebServiceHealthAttributeNote;", "Lcom/withings/manualLogging/data/webservice/note/WebServiceNote;", "type", "", "wsId", "", "healthAttributeWsId", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "deleted", "", "isSerious", "minAge", "maxAge", "(IJJJJZZLjava/lang/Integer;Ljava/lang/Integer;)V", "getCreated", "()J", "getDeleted", "()Z", "getHealthAttributeWsId", "getMaxAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinAge", "getModified", "getType", "()I", "getWsId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJJJJZZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/manualLogging/data/webservice/note/WebServiceHealthAttributeNote;", "equals", "other", "", "hashCode", "toString", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebServiceHealthAttributeNote implements WebServiceNote {
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final long created;
    @SerializedName("deleted")
    private final boolean deleted;
    @SerializedName("id")
    private final long healthAttributeWsId;
    @SerializedName("is_serious")
    private final boolean isSerious;
    @SerializedName(WebServiceHealthAttribute.FIELD_MAX_AGE_NAME)
    private final Integer maxAge;
    @SerializedName(WebServiceHealthAttribute.FIELD_MIN_AGE_NAME)
    private final Integer minAge;
    @SerializedName("modified")
    private final long modified;
    @SerializedName("type")
    private final int type;
    @SerializedName("id_asso")
    private final long wsId;

    public WebServiceHealthAttributeNote(int i11, long j5, long j11, long j12, long j13, boolean z5, boolean z11, Integer num, Integer num2) {
        this.type = i11;
        this.wsId = j5;
        this.healthAttributeWsId = j11;
        this.created = j12;
        this.modified = j13;
        this.deleted = z5;
        this.isSerious = z11;
        this.minAge = num;
        this.maxAge = num2;
    }

    public static /* synthetic */ WebServiceHealthAttributeNote copy$default(WebServiceHealthAttributeNote webServiceHealthAttributeNote, int i11, long j5, long j11, long j12, long j13, boolean z5, boolean z11, Integer num, Integer num2, int i12, Object obj) {
        int i13;
        long j14;
        long j15;
        long j16;
        long j17;
        boolean z12;
        boolean z13;
        Integer num3;
        Integer num4;
        if ((i12 & 1) != 0) {
            i13 = webServiceHealthAttributeNote.type;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            j14 = webServiceHealthAttributeNote.wsId;
        } else {
            j14 = j5;
        }
        if ((i12 & 4) != 0) {
            j15 = webServiceHealthAttributeNote.healthAttributeWsId;
        } else {
            j15 = j11;
        }
        if ((i12 & 8) != 0) {
            j16 = webServiceHealthAttributeNote.created;
        } else {
            j16 = j12;
        }
        if ((i12 & 16) != 0) {
            j17 = webServiceHealthAttributeNote.modified;
        } else {
            j17 = j13;
        }
        if ((i12 & 32) != 0) {
            z12 = webServiceHealthAttributeNote.deleted;
        } else {
            z12 = z5;
        }
        if ((i12 & 64) != 0) {
            z13 = webServiceHealthAttributeNote.isSerious;
        } else {
            z13 = z11;
        }
        if ((i12 & 128) != 0) {
            num3 = webServiceHealthAttributeNote.minAge;
        } else {
            num3 = num;
        }
        if ((i12 & 256) != 0) {
            num4 = webServiceHealthAttributeNote.maxAge;
        } else {
            num4 = num2;
        }
        return webServiceHealthAttributeNote.copy(i13, j14, j15, j16, j17, z12, z13, num3, num4);
    }

    public final int component1() {
        return this.type;
    }

    public final long component2() {
        return this.wsId;
    }

    public final long component3() {
        return this.healthAttributeWsId;
    }

    public final long component4() {
        return this.created;
    }

    public final long component5() {
        return this.modified;
    }

    public final boolean component6() {
        return this.deleted;
    }

    public final boolean component7() {
        return this.isSerious;
    }

    public final Integer component8() {
        return this.minAge;
    }

    public final Integer component9() {
        return this.maxAge;
    }

    public final WebServiceHealthAttributeNote copy(int i11, long j5, long j11, long j12, long j13, boolean z5, boolean z11, Integer num, Integer num2) {
        return new WebServiceHealthAttributeNote(i11, j5, j11, j12, j13, z5, z11, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebServiceHealthAttributeNote)) {
            return false;
        }
        WebServiceHealthAttributeNote webServiceHealthAttributeNote = (WebServiceHealthAttributeNote) obj;
        if (this.type == webServiceHealthAttributeNote.type && this.wsId == webServiceHealthAttributeNote.wsId && this.healthAttributeWsId == webServiceHealthAttributeNote.healthAttributeWsId && this.created == webServiceHealthAttributeNote.created && this.modified == webServiceHealthAttributeNote.modified && this.deleted == webServiceHealthAttributeNote.deleted && this.isSerious == webServiceHealthAttributeNote.isSerious && u.e(this.minAge, webServiceHealthAttributeNote.minAge) && u.e(this.maxAge, webServiceHealthAttributeNote.maxAge)) {
            return true;
        }
        return false;
    }

    public final long getCreated() {
        return this.created;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final long getHealthAttributeWsId() {
        return this.healthAttributeWsId;
    }

    public final Integer getMaxAge() {
        return this.maxAge;
    }

    public final Integer getMinAge() {
        return this.minAge;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.withings.manualLogging.data.webservice.note.WebServiceNote
    public long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int a11 = y1.a(this.isSerious, y1.a(this.deleted, c.a(this.modified, c.a(this.created, c.a(this.healthAttributeWsId, c.a(this.wsId, Integer.hashCode(this.type) * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.minAge;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Integer num2 = this.maxAge;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return i12 + i11;
    }

    public final boolean isSerious() {
        return this.isSerious;
    }

    public String toString() {
        int i11 = this.type;
        long j5 = this.wsId;
        long j11 = this.healthAttributeWsId;
        long j12 = this.created;
        long j13 = this.modified;
        boolean z5 = this.deleted;
        boolean z11 = this.isSerious;
        Integer num = this.minAge;
        Integer num2 = this.maxAge;
        StringBuilder sb2 = new StringBuilder("WebServiceHealthAttributeNote(type=");
        sb2.append(i11);
        sb2.append(", wsId=");
        sb2.append(j5);
        g.d(sb2, ", healthAttributeWsId=", j11, ", created=");
        sb2.append(j12);
        g.d(sb2, ", modified=", j13, ", deleted=");
        sb2.append(z5);
        sb2.append(", isSerious=");
        sb2.append(z11);
        sb2.append(", minAge=");
        sb2.append(num);
        sb2.append(", maxAge=");
        sb2.append(num2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ WebServiceHealthAttributeNote(int i11, long j5, long j11, long j12, long j13, boolean z5, boolean z11, Integer num, Integer num2, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0 : i11, j5, j11, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) != 0 ? 0L : j13, (i12 & 32) != 0 ? false : z5, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : num2);
    }
}
