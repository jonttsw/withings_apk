package com.withings.wiscale2.profile;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q qVar) {
        super(2);
        this.f59471a = qVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(androidx.compose.foundation.layout.x0.f(androidx.compose.ui.e.f8927a, yk.h.d()), "Share with family", null, false, null, null, false, new v(this.f59471a), aVar2, 48, 124);
        }
        return nm0.y.f85009a;
    }
}
