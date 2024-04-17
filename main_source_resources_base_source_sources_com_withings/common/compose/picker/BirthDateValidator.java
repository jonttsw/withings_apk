package com.withings.common.compose.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DateAndTimePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/compose/picker/BirthDateValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "<init>", "()V", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BirthDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<BirthDateValidator> CREATOR = new Object();

    /* compiled from: DateAndTimePicker.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<BirthDateValidator> {
        @Override // android.os.Parcelable.Creator
        public final BirthDateValidator createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new BirthDateValidator();
        }

        @Override // android.os.Parcelable.Creator
        public final BirthDateValidator[] newArray(int i11) {
            return new BirthDateValidator[i11];
        }
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean F0(long j5) {
        return new DateTime(j5).isBeforeNow();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(1);
    }
}
