package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f44946a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44947b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r8.n nVar, ym0.a<nm0.y> aVar) {
        super(0);
        this.f44946a = nVar;
        this.f44947b = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.navigation.e.L(this.f44946a, "permissionsFromWithings", null, 6);
        nm0.y yVar = nm0.y.f85009a;
        this.f44947b.invoke();
        return nm0.y.f85009a;
    }
}
