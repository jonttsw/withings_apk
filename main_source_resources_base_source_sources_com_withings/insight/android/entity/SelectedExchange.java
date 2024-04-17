package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.k0;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SelectedExchange.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/withings/insight/android/entity/SelectedExchange;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "messageId", "suggestionId", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/insight/android/entity/SelectedExchange;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessageId", "getSuggestionId", "setSuggestionId", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SelectedExchange implements Parcelable {
    public static final Parcelable.Creator<SelectedExchange> CREATOR = new Creator();
    private final String messageId;
    private String suggestionId;

    /* compiled from: SelectedExchange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<SelectedExchange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedExchange createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new SelectedExchange(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedExchange[] newArray(int i11) {
            return new SelectedExchange[i11];
        }
    }

    public SelectedExchange(String messageId, String str) {
        u.j(messageId, "messageId");
        this.messageId = messageId;
        this.suggestionId = str;
    }

    public static /* synthetic */ SelectedExchange copy$default(SelectedExchange selectedExchange, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = selectedExchange.messageId;
        }
        if ((i11 & 2) != 0) {
            str2 = selectedExchange.suggestionId;
        }
        return selectedExchange.copy(str, str2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.suggestionId;
    }

    public final SelectedExchange copy(String messageId, String str) {
        u.j(messageId, "messageId");
        return new SelectedExchange(messageId, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedExchange)) {
            return false;
        }
        SelectedExchange selectedExchange = (SelectedExchange) obj;
        if (u.e(this.messageId, selectedExchange.messageId) && u.e(this.suggestionId, selectedExchange.suggestionId)) {
            return true;
        }
        return false;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSuggestionId() {
        return this.suggestionId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.messageId.hashCode() * 31;
        String str = this.suggestionId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final void setSuggestionId(String str) {
        this.suggestionId = str;
    }

    public String toString() {
        return k0.c("SelectedExchange(messageId=", this.messageId, ", suggestionId=", this.suggestionId, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.messageId);
        out.writeString(this.suggestionId);
    }
}
