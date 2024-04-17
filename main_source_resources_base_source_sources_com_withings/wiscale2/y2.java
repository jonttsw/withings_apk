package com.withings.wiscale2;

import android.os.Bundle;
/* compiled from: Spo2FeatureNavGraphDirections.kt */
/* loaded from: classes4.dex */
final class y2 implements r8.l {

    /* renamed from: a  reason: collision with root package name */
    private final int f62942a = C1987R.string.spo2_liveVideoTutorial_title;

    /* renamed from: b  reason: collision with root package name */
    private final int f62943b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62944c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62945d;

    public y2(int i11, int i12, boolean z5) {
        this.f62943b = i11;
        this.f62944c = i12;
        this.f62945d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        if (this.f62942a == y2Var.f62942a && this.f62943b == y2Var.f62943b && this.f62944c == y2Var.f62944c && this.f62945d == y2Var.f62945d) {
            return true;
        }
        return false;
    }

    @Override // r8.l
    public final int getActionId() {
        return C1987R.id.action_to_spo2_video;
    }

    @Override // r8.l
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("titleResId", this.f62942a);
        bundle.putInt("urlResId", this.f62943b);
        bundle.putInt("fallbackImg", this.f62944c);
        bundle.putBoolean("canSkip", this.f62945d);
        return bundle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62945d) + androidx.appcompat.app.h.a(this.f62944c, androidx.appcompat.app.h.a(this.f62943b, Integer.hashCode(this.f62942a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToSpo2Video(titleResId=");
        sb2.append(this.f62942a);
        sb2.append(", urlResId=");
        sb2.append(this.f62943b);
        sb2.append(", fallbackImg=");
        sb2.append(this.f62944c);
        sb2.append(", canSkip=");
        return androidx.appcompat.app.h.d(sb2, this.f62945d, ")");
    }
}
