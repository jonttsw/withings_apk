package com.withings.wiscale2.device.hwa03bs.ui;

import android.view.View;
import com.withings.views.explanation.Explanation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hwa03PostInstallActivity.kt */
/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.p<Explanation, View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa03PostInstallActivity f54279a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        super(2);
        this.f54279a = hwa03PostInstallActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Explanation explanation, View view) {
        qc0.q qVar;
        kotlin.jvm.internal.u.j(explanation, "<anonymous parameter 0>");
        kotlin.jvm.internal.u.j(view, "<anonymous parameter 1>");
        qVar = this.f54279a.f54241h;
        if (qVar != null) {
            qVar.M0();
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("postInstallViewModel");
        throw null;
    }
}
