package com.withings.wiscale2.device.common.feature.respiratoryscan;

import android.view.View;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
final class g extends w implements ym0.l<View, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanActivationActivity f52451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n0 f52452b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RespiratoryScanActivationActivity respiratoryScanActivationActivity, n0 n0Var) {
        super(1);
        this.f52451a = respiratoryScanActivationActivity;
        this.f52452b = n0Var;
    }

    @Override // ym0.l
    public final y invoke(View view) {
        View it = view;
        u.j(it, "it");
        RespiratoryScanActivationActivity.C3(this.f52451a).A0(this.f52452b.f76254a);
        return y.f85009a;
    }
}
