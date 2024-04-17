package com.withings.medicalreport.ui;

import android.os.Bundle;
/* compiled from: RecipientListFragmentArgs.kt */
/* loaded from: classes4.dex */
public final class d0 implements r8.f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f42240a;

    public d0(boolean z5) {
        this.f42240a = z5;
    }

    public static final d0 fromBundle(Bundle bundle) {
        kotlin.jvm.internal.u.j(bundle, "bundle");
        bundle.setClassLoader(d0.class.getClassLoader());
        if (bundle.containsKey("shareToProfessional")) {
            return new d0(bundle.getBoolean("shareToProfessional"));
        }
        throw new IllegalArgumentException("Required argument \"shareToProfessional\" is missing and does not have an android:defaultValue");
    }

    public final boolean a() {
        return this.f42240a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d0) && this.f42240a == ((d0) obj).f42240a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42240a);
    }

    public final String toString() {
        return androidx.appcompat.app.h.d(new StringBuilder("RecipientListFragmentArgs(shareToProfessional="), this.f42240a, ")");
    }
}
