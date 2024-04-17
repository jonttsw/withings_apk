package com.withings.wiscale2;

import android.os.Bundle;
/* compiled from: Spo2FeatureNavGraphDirections.kt */
/* loaded from: classes4.dex */
final class x2 implements r8.l {

    /* renamed from: a  reason: collision with root package name */
    private final int f62937a;

    public x2(int i11) {
        this.f62937a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x2) && this.f62937a == ((x2) obj).f62937a) {
            return true;
        }
        return false;
    }

    @Override // r8.l
    public final int getActionId() {
        return C1987R.id.action_to_spo2_done;
    }

    @Override // r8.l
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("result", this.f62937a);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62937a);
    }

    public final String toString() {
        return androidx.camera.camera2.internal.e.c(new StringBuilder("ActionToSpo2Done(result="), this.f62937a, ")");
    }
}
