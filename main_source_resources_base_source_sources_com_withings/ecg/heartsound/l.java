package com.withings.ecg.heartsound;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class l extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38484a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar) {
        super(1);
        this.f38484a = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        r rVar;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        rVar = this.f38484a.f38437o;
        if (rVar != null) {
            rVar.F0(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
