package com.withings.wiscale2.device.common.feature.spo2;

import android.os.Bundle;
import kotlin.jvm.internal.u;
/* compiled from: SpO2DoneFragmentArgs.kt */
/* loaded from: classes5.dex */
public final class c implements r8.f {

    /* renamed from: a  reason: collision with root package name */
    private final int f52523a;

    public c(int i11) {
        this.f52523a = i11;
    }

    public static final c fromBundle(Bundle bundle) {
        u.j(bundle, "bundle");
        bundle.setClassLoader(c.class.getClassLoader());
        if (bundle.containsKey("result")) {
            return new c(bundle.getInt("result"));
        }
        throw new IllegalArgumentException("Required argument \"result\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f52523a == ((c) obj).f52523a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52523a);
    }

    public final String toString() {
        return androidx.camera.camera2.internal.e.c(new StringBuilder("SpO2DoneFragmentArgs(result="), this.f52523a, ")");
    }
}
