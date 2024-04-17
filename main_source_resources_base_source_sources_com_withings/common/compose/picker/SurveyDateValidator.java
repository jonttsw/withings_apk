package com.withings.common.compose.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DateAndTimePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/picker/SurveyDateValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SurveyDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<SurveyDateValidator> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Long f35010a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f35011b;

    /* compiled from: DateAndTimePicker.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<SurveyDateValidator> {
        @Override // android.os.Parcelable.Creator
        public final SurveyDateValidator createFromParcel(Parcel parcel) {
            Long valueOf;
            u.j(parcel, "parcel");
            Long l5 = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                l5 = Long.valueOf(parcel.readLong());
            }
            return new SurveyDateValidator(valueOf, l5);
        }

        @Override // android.os.Parcelable.Creator
        public final SurveyDateValidator[] newArray(int i11) {
            return new SurveyDateValidator[i11];
        }
    }

    public SurveyDateValidator(Long l5, Long l6) {
        this.f35010a = l5;
        this.f35011b = l6;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean F0(long j5) {
        Long l5 = this.f35011b;
        Long l6 = this.f35010a;
        if (l6 != null && l5 != null) {
            DateTime dateTime = new DateTime(j5);
            long longValue = l5.longValue();
            if (!dateTime.isBefore(longValue) && dateTime.getMillis() != longValue) {
                return false;
            }
            DateTime dateTime2 = new DateTime(j5);
            long longValue2 = l6.longValue();
            if (!dateTime2.isAfter(longValue2) && dateTime2.getMillis() != longValue2) {
                return false;
            }
        } else if (l6 != null && l5 == null) {
            DateTime dateTime3 = new DateTime(j5);
            long longValue3 = l6.longValue();
            if (!dateTime3.isAfter(longValue3) && dateTime3.getMillis() != longValue3) {
                return false;
            }
        } else if (l6 == null && l5 != null) {
            DateTime dateTime4 = new DateTime(j5);
            long longValue4 = l5.longValue();
            if (!dateTime4.isBefore(longValue4) && dateTime4.getMillis() != longValue4) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        Long l5 = this.f35010a;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        Long l6 = this.f35011b;
        if (l6 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeLong(l6.longValue());
    }
}
