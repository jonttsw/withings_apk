package com.withings.tutorials.ui.screens.tab;

import kotlin.jvm.internal.s;
import nm0.y;
/* compiled from: TabPresentationActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class k extends s implements ym0.a<y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(TabPresentationActivity tabPresentationActivity) {
        super(0, tabPresentationActivity, TabPresentationActivity.class, "onDone", "onDone()V", 0);
    }

    @Override // ym0.a
    public final y invoke() {
        TabPresentationActivity tabPresentationActivity = (TabPresentationActivity) this.receiver;
        fn0.k<Object>[] kVarArr = TabPresentationActivity.f46244h;
        tabPresentationActivity.setResult(42);
        tabPresentationActivity.finish();
        return y.f85009a;
    }
}
