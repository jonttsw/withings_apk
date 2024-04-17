package com.withings.ecg.live;

import com.withings.ecg.graph.EcgEntry;
import java.util.List;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<EcgEntry> f38693a;

    public k0(List<EcgEntry> list) {
        this.f38693a = list;
    }

    public final List<EcgEntry> a() {
        return this.f38693a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k0) && kotlin.jvm.internal.u.e(this.f38693a, ((k0) obj).f38693a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38693a.hashCode();
    }

    public final String toString() {
        return defpackage.d.i(new StringBuilder("LiveStreamData(filtered="), this.f38693a, ")");
    }
}
