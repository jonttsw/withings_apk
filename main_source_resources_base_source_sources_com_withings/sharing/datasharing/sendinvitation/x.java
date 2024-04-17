package com.withings.sharing.datasharing.sendinvitation;
/* compiled from: SendInvitationNavGraph.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.r<l0.i, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SendInvitationViewModel f44248a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44249b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f44250c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SendInvitationViewModel sendInvitationViewModel, ym0.a aVar, r8.n nVar) {
        super(4);
        this.f44248a = sendInvitationViewModel;
        this.f44249b = aVar;
        this.f44250c = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.i iVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i composableWithHorizontalTransition = iVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composableWithHorizontalTransition, "$this$composableWithHorizontalTransition");
        kotlin.jvm.internal.u.j(it, "it");
        androidx.navigation.e eVar = this.f44250c;
        t tVar = new t(eVar);
        u uVar = new u(eVar);
        v vVar = new v(eVar);
        w wVar = new w(eVar);
        z40.l.b(this.f44248a, tVar, uVar, vVar, wVar, this.f44249b, aVar, 8);
        return nm0.y.f85009a;
    }
}
