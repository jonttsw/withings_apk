package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import og.y;
/* compiled from: Wpm04TutorialProcessingFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/ProcessingTextInfo;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProcessingTextInfo implements Parcelable {
    public static final Parcelable.Creator<ProcessingTextInfo> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f55845a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55846b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f55847c;

    /* compiled from: Wpm04TutorialProcessingFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<ProcessingTextInfo> {
        @Override // android.os.Parcelable.Creator
        public final ProcessingTextInfo createFromParcel(Parcel parcel) {
            Integer valueOf;
            u.j(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new ProcessingTextInfo(readInt, readInt2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ProcessingTextInfo[] newArray(int i11) {
            return new ProcessingTextInfo[i11];
        }
    }

    public ProcessingTextInfo(int i11, int i12, Integer num) {
        this.f55845a = i11;
        this.f55846b = i12;
        this.f55847c = num;
    }

    public final Integer a() {
        return this.f55847c;
    }

    public final int b() {
        return this.f55846b;
    }

    public final int c() {
        return this.f55845a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessingTextInfo)) {
            return false;
        }
        ProcessingTextInfo processingTextInfo = (ProcessingTextInfo) obj;
        if (this.f55845a == processingTextInfo.f55845a && this.f55846b == processingTextInfo.f55846b && u.e(this.f55847c, processingTextInfo.f55847c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a11 = androidx.appcompat.app.h.a(this.f55846b, Integer.hashCode(this.f55845a) * 31, 31);
        Integer num = this.f55847c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return a11 + hashCode;
    }

    public final String toString() {
        return "ProcessingTextInfo(title=" + this.f55845a + ", subtitle=" + this.f55846b + ", info=" + this.f55847c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f55845a);
        out.writeInt(this.f55846b);
        Integer num = this.f55847c;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
    }
}
