package com.withings.wiscale2.heart.heartrate.events;

import androidx.lifecycle.l0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import ym0.l;
/* compiled from: HeartRateEventsActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class e implements l0, p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f57642a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(l lVar) {
        this.f57642a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0) || !(obj instanceof p)) {
            return false;
        }
        return u.e(this.f57642a, ((p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f57642a;
    }

    public final int hashCode() {
        return this.f57642a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f57642a.invoke(obj);
    }
}
