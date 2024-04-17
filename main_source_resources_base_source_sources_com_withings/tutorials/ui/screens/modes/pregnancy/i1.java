package com.withings.tutorials.ui.screens.modes.pregnancy;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class i1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s60.a f45954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Double f45955b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45956c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(s60.a aVar, Double d11, ym0.a<nm0.y> aVar2) {
        super(0);
        this.f45954a = aVar;
        this.f45955b = d11;
        this.f45956c = aVar2;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        s60.a aVar = this.f45954a;
        if (aVar.b() == null) {
            aVar.d(this.f45955b);
        }
        this.f45956c.invoke();
        return nm0.y.f85009a;
    }
}
