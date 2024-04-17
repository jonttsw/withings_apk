package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: InsightContainer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0007¨\u0006$"}, d2 = {"Lcom/withings/insight/android/entity/InsightContainer;", "Landroid/os/Parcelable;", "Lcom/withings/insight/android/entity/Insight;", "component1", "()Lcom/withings/insight/android/entity/Insight;", "Lorg/joda/time/DateTime;", "component2", "()Lorg/joda/time/DateTime;", InsightItemData.WS_TYPE, "modified", "copy", "(Lcom/withings/insight/android/entity/Insight;Lorg/joda/time/DateTime;)Lcom/withings/insight/android/entity/InsightContainer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withings/insight/android/entity/Insight;", "getInsight", "Lorg/joda/time/DateTime;", "getModified", "<init>", "(Lcom/withings/insight/android/entity/Insight;Lorg/joda/time/DateTime;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class InsightContainer implements Parcelable {
    public static final Parcelable.Creator<InsightContainer> CREATOR = new Creator();
    @SerializedName(InsightItemData.WS_TYPE)
    private final Insight insight;
    private final DateTime modified;

    /* compiled from: InsightContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InsightContainer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsightContainer createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new InsightContainer(parcel.readInt() == 0 ? null : Insight.CREATOR.createFromParcel(parcel), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsightContainer[] newArray(int i11) {
            return new InsightContainer[i11];
        }
    }

    public InsightContainer(Insight insight, DateTime dateTime) {
        this.insight = insight;
        this.modified = dateTime;
    }

    public static /* synthetic */ InsightContainer copy$default(InsightContainer insightContainer, Insight insight, DateTime dateTime, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            insight = insightContainer.insight;
        }
        if ((i11 & 2) != 0) {
            dateTime = insightContainer.modified;
        }
        return insightContainer.copy(insight, dateTime);
    }

    public final Insight component1() {
        return this.insight;
    }

    public final DateTime component2() {
        return this.modified;
    }

    public final InsightContainer copy(Insight insight, DateTime dateTime) {
        return new InsightContainer(insight, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsightContainer)) {
            return false;
        }
        InsightContainer insightContainer = (InsightContainer) obj;
        if (u.e(this.insight, insightContainer.insight) && u.e(this.modified, insightContainer.modified)) {
            return true;
        }
        return false;
    }

    public final Insight getInsight() {
        return this.insight;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public int hashCode() {
        int hashCode;
        Insight insight = this.insight;
        int i11 = 0;
        if (insight == null) {
            hashCode = 0;
        } else {
            hashCode = insight.hashCode();
        }
        int i12 = hashCode * 31;
        DateTime dateTime = this.modified;
        if (dateTime != null) {
            i11 = dateTime.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Insight insight = this.insight;
        DateTime dateTime = this.modified;
        return "InsightContainer(insight=" + insight + ", modified=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Insight insight = this.insight;
        if (insight == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            insight.writeToParcel(out, i11);
        }
        out.writeSerializable(this.modified);
    }

    public /* synthetic */ InsightContainer(Insight insight, DateTime dateTime, int i11, m mVar) {
        this(insight, (i11 & 2) != 0 ? null : dateTime);
    }
}
