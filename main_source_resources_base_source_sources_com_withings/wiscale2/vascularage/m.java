package com.withings.wiscale2.vascularage;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivity f62426a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(VascularAgeActivity vascularAgeActivity) {
        super(2);
        this.f62426a = vascularAgeActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.core.ui.b.a(s1.b.b(aVar2, 732357914, new l(this.f62426a)), aVar2, 6);
        }
        return nm0.y.f85009a;
    }
}
