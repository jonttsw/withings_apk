package com.withings.wiscale2.partner.ui;
/* compiled from: PartnerActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class x implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ym0.l f59237a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(ym0.l lVar) {
        this.f59237a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
            return false;
        }
        return kotlin.jvm.internal.u.e(this.f59237a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f59237a;
    }

    public final int hashCode() {
        return this.f59237a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f59237a.invoke(obj);
    }
}
