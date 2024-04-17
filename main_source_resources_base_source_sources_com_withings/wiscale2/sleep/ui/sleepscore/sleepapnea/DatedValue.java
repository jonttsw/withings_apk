package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderPagerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/sleepapnea/DatedValue;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DatedValue implements Parcelable {
    public static final Parcelable.Creator<DatedValue> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f61227a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f61228b;

    /* compiled from: SleepDisorderPagerViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<DatedValue> {
        @Override // android.os.Parcelable.Creator
        public final DatedValue createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.u.j(parcel, "parcel");
            return new DatedValue((DateTime) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DatedValue[] newArray(int i11) {
            return new DatedValue[i11];
        }
    }

    public DatedValue(DateTime date, int i11) {
        kotlin.jvm.internal.u.j(date, "date");
        this.f61227a = i11;
        this.f61228b = date;
    }

    public final DateTime a() {
        return this.f61228b;
    }

    public final int b() {
        return this.f61227a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatedValue)) {
            return false;
        }
        DatedValue datedValue = (DatedValue) obj;
        if (this.f61227a == datedValue.f61227a && kotlin.jvm.internal.u.e(this.f61228b, datedValue.f61228b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f61228b.hashCode() + (Integer.hashCode(this.f61227a) * 31);
    }

    public final String toString() {
        return "DatedValue(value=" + this.f61227a + ", date=" + this.f61228b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.u.j(out, "out");
        out.writeInt(this.f61227a);
        out.writeSerializable(this.f61228b);
    }
}
