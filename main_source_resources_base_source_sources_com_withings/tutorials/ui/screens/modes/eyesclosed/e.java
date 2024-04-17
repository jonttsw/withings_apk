package com.withings.tutorials.ui.screens.modes.eyesclosed;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EyesClosedMode.kt */
/* loaded from: classes4.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f45679a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r8.n nVar) {
        super(0);
        this.f45679a = nVar;
    }

    @Override // ym0.a
    public final y invoke() {
        androidx.navigation.e.L(this.f45679a, "turnOffConfirmationBottomSheet", null, 6);
        return y.f85009a;
    }
}
