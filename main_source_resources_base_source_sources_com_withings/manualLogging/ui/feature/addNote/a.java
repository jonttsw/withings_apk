package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddCommentScreen.kt */
/* loaded from: classes4.dex */
final class a extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.a, nm0.y> f40714a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ fx.e f40715b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(ym0.l<? super fx.a, nm0.y> lVar, fx.e eVar) {
        super(1);
        this.f40714a = lVar;
        this.f40715b = eVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        long j5;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        fx.a g11 = this.f40715b.g();
        if (g11 != null) {
            j5 = g11.getId();
        } else {
            j5 = 0;
        }
        this.f40714a.invoke(new fx.a(it, j5, null, 4));
        return nm0.y.f85009a;
    }
}
