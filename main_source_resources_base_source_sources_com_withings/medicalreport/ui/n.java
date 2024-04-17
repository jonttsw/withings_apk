package com.withings.medicalreport.ui;

import android.os.Bundle;
import android.os.Parcelable;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateSelectionFragmentDirections.kt */
/* loaded from: classes4.dex */
public final class n implements r8.l {

    /* renamed from: a  reason: collision with root package name */
    private final String f42260a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f42261b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f42262c;

    public n(String str, DateTime dateTime, DateTime dateTime2) {
        this.f42260a = str;
        this.f42261b = dateTime;
        this.f42262c = dateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.u.e(this.f42260a, nVar.f42260a) && kotlin.jvm.internal.u.e(this.f42261b, nVar.f42261b) && kotlin.jvm.internal.u.e(this.f42262c, nVar.f42262c)) {
            return true;
        }
        return false;
    }

    @Override // r8.l
    public final int getActionId() {
        return C1987R.id.action_dateSelection_to_pdfPreviewFragment;
    }

    @Override // r8.l
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("contactKey", this.f42260a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        DateTime dateTime = this.f42261b;
        if (isAssignableFrom) {
            kotlin.jvm.internal.u.h(dateTime, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("startDate", (Parcelable) dateTime);
        } else if (Serializable.class.isAssignableFrom(DateTime.class)) {
            kotlin.jvm.internal.u.h(dateTime, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("startDate", dateTime);
        } else {
            throw new UnsupportedOperationException(DateTime.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(DateTime.class);
        DateTime dateTime2 = this.f42262c;
        if (isAssignableFrom2) {
            kotlin.jvm.internal.u.h(dateTime2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("endDate", (Parcelable) dateTime2);
        } else if (Serializable.class.isAssignableFrom(DateTime.class)) {
            kotlin.jvm.internal.u.h(dateTime2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("endDate", dateTime2);
        } else {
            throw new UnsupportedOperationException(DateTime.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f42260a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f42262c.hashCode() + com.google.android.gms.internal.mlkit_common.a.b(this.f42261b, hashCode * 31, 31);
    }

    public final String toString() {
        return "ActionDateSelectionToPdfPreviewFragment(contactKey=" + this.f42260a + ", startDate=" + this.f42261b + ", endDate=" + this.f42262c + ")";
    }
}
