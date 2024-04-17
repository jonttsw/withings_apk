package com.withings.wiscale2.device.hwa08.postinstall;

import android.view.View;
import com.withings.views.explanation.Explanation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hwa08PostInstallActivity.kt */
/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.w implements ym0.p<Explanation, View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity f54430a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        super(2);
        this.f54430a = hwa08PostInstallActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Explanation explanation, View view) {
        kotlin.jvm.internal.u.j(explanation, "<anonymous parameter 0>");
        kotlin.jvm.internal.u.j(view, "<anonymous parameter 1>");
        Hwa08PostInstallActivity.G3(this.f54430a, 1);
        return nm0.y.f85009a;
    }
}
