package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35733a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35734b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35735c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<Long, nm0.y> f35736d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35737e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.l<? super Long, nm0.y> lVar, CycleTrackingActivity cycleTrackingActivity) {
        super(4);
        this.f35733a = aVar;
        this.f35734b = aVar2;
        this.f35735c = aVar3;
        this.f35736d = lVar;
        this.f35737e = cycleTrackingActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        q qVar = new q(this.f35737e);
        ym0.l<Long, nm0.y> lVar = this.f35736d;
        i1.d(this.f35733a, qVar, this.f35734b, this.f35735c, lVar, null, aVar, 0, 32);
        return nm0.y.f85009a;
    }
}
