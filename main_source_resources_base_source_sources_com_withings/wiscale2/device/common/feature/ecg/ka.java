package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class ka extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51477b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51476a = wBS08EcgActivationActivity;
        this.f51477b = nVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [ym0.a, kotlin.jvm.internal.a] */
    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        r8.n nVar = this.f51477b;
        ?? aVar2 = new kotlin.jvm.internal.a(0, nVar, r8.n.class, "popBackStack", "popBackStack()Z", 8);
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51476a;
        WBS08EcgActivationActivity.C3(wBS08EcgActivationActivity, aVar2, new ja(nVar, wBS08EcgActivationActivity), aVar, 512);
        return nm0.y.f85009a;
    }
}
