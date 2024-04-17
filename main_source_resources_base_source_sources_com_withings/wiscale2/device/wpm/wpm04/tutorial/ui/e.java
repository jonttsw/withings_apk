package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.content.Intent;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.Wpm04TutorialActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm04TutorialActivity.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.l<nm0.j<? extends Intent, ? extends Integer>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm04TutorialActivity f55861a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Wpm04TutorialActivity wpm04TutorialActivity) {
        super(1);
        this.f55861a = wpm04TutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(nm0.j<? extends Intent, ? extends Integer> jVar) {
        nm0.j<? extends Intent, ? extends Integer> jVar2 = jVar;
        if (jVar2 != null) {
            int intValue = jVar2.d().intValue();
            Wpm04TutorialActivity.a aVar = Wpm04TutorialActivity.f55848d;
            this.f55861a.startActivityForResult(jVar2.c(), intValue);
        }
        return y.f85009a;
    }
}
