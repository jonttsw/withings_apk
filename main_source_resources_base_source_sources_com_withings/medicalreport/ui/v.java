package com.withings.medicalreport.ui;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: PdfPreviewFragmentArgs.kt */
/* loaded from: classes4.dex */
public final class v implements r8.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f42293a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f42294b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f42295c;

    public v(String str, DateTime dateTime, DateTime dateTime2) {
        this.f42293a = str;
        this.f42294b = dateTime;
        this.f42295c = dateTime2;
    }

    public static final v fromBundle(Bundle bundle) {
        kotlin.jvm.internal.u.j(bundle, "bundle");
        bundle.setClassLoader(v.class.getClassLoader());
        if (bundle.containsKey("contactKey")) {
            String string = bundle.getString("contactKey");
            if (bundle.containsKey("startDate")) {
                if (!Parcelable.class.isAssignableFrom(DateTime.class) && !Serializable.class.isAssignableFrom(DateTime.class)) {
                    throw new UnsupportedOperationException(DateTime.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                DateTime dateTime = (DateTime) bundle.get("startDate");
                if (dateTime != null) {
                    if (bundle.containsKey("endDate")) {
                        if (!Parcelable.class.isAssignableFrom(DateTime.class) && !Serializable.class.isAssignableFrom(DateTime.class)) {
                            throw new UnsupportedOperationException(DateTime.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                        }
                        DateTime dateTime2 = (DateTime) bundle.get("endDate");
                        if (dateTime2 != null) {
                            return new v(string, dateTime, dateTime2);
                        }
                        throw new IllegalArgumentException("Argument \"endDate\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"endDate\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Argument \"startDate\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"contactKey\" is missing and does not have an android:defaultValue");
    }

    public final String a() {
        return this.f42293a;
    }

    public final DateTime b() {
        return this.f42295c;
    }

    public final DateTime c() {
        return this.f42294b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.u.e(this.f42293a, vVar.f42293a) && kotlin.jvm.internal.u.e(this.f42294b, vVar.f42294b) && kotlin.jvm.internal.u.e(this.f42295c, vVar.f42295c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f42293a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f42295c.hashCode() + com.google.android.gms.internal.mlkit_common.a.b(this.f42294b, hashCode * 31, 31);
    }

    public final String toString() {
        return "PdfPreviewFragmentArgs(contactKey=" + this.f42293a + ", startDate=" + this.f42294b + ", endDate=" + this.f42295c + ")";
    }
}
