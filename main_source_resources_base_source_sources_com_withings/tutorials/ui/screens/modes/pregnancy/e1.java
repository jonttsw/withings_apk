package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.camera.core.y1;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class e1 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f45937a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(String str) {
        super(3);
        this.f45937a = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        nk.a.g(0, 0, 0, 61, 0L, aVar, null, null, y1.e(new StringBuilder("*Based on this start date your baby is due on "), this.f45937a, "*"));
        return nm0.y.f85009a;
    }
}
