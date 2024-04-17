package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddNotesViewModel.kt */
/* loaded from: classes4.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<fx.e, fx.e>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final g1 f41460a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Boolean invoke(nm0.j<fx.e, fx.e> jVar) {
        boolean z5;
        nm0.j<fx.e, fx.e> jVar2 = jVar;
        fx.e a11 = jVar2.a();
        fx.e b10 = jVar2.b();
        kotlin.jvm.internal.u.g(b10);
        if (a11.containsAll(b10) && b10.containsAll(a11)) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
