package com.withings.nervehealth.ui;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class y implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ym0.l f42816a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(ym0.l lVar) {
        this.f42816a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
            return false;
        }
        return kotlin.jvm.internal.u.e(this.f42816a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f42816a;
    }

    public final int hashCode() {
        return this.f42816a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f42816a.invoke(obj);
    }
}
