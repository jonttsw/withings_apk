package com.withings.wiscale2.profile;
/* compiled from: AllTimeStats.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class f implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ym0.l f59322a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ym0.l lVar) {
        this.f59322a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
            return false;
        }
        return kotlin.jvm.internal.u.e(this.f59322a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f59322a;
    }

    public final int hashCode() {
        return this.f59322a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f59322a.invoke(obj);
    }
}
