package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Intent;
/* compiled from: SleepDisorderActivity.kt */
/* loaded from: classes5.dex */
final class k extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Integer, ? extends Intent>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity f61376a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SleepDisorderActivity sleepDisorderActivity) {
        super(1);
        this.f61376a = sleepDisorderActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends Integer, ? extends Intent> jVar) {
        nm0.j<? extends Integer, ? extends Intent> jVar2 = jVar;
        if (jVar2 != null) {
            nm0.y yVar = (nm0.y) cr.a.a(jVar2, new j(this.f61376a));
        }
        return nm0.y.f85009a;
    }
}
