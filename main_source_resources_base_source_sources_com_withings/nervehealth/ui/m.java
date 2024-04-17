package com.withings.nervehealth.ui;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class m extends kotlin.jvm.internal.s implements ym0.l<Boolean, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(NerveHealthViewModel nerveHealthViewModel) {
        super(1, nerveHealthViewModel, NerveHealthViewModel.class, "onShowNormalityChange", "onShowNormalityChange$nervehealth_ui_release(Z)V", 0);
    }

    @Override // ym0.l
    public final /* bridge */ /* synthetic */ nm0.y invoke(Boolean bool) {
        m(bool.booleanValue());
        return nm0.y.f85009a;
    }

    public final void m(boolean z5) {
        NerveHealthViewModel nerveHealthViewModel = (NerveHealthViewModel) this.receiver;
        nerveHealthViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(nerveHealthViewModel), Dispatchers.getIO(), null, new q0(nerveHealthViewModel, z5, null), 2, null);
    }
}
