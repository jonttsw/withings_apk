package com.withings.wiscale2.device.common.ui;

import com.withings.comm.wpp.generated.object.LuminosityLevel;
import com.withings.views.view.ToggleCellView;
import com.withings.wiscale2.device.common.ui.a0;
import tb0.a3;
/* compiled from: DeviceBrightnessFragment.kt */
/* loaded from: classes5.dex */
public final class b0 implements com.withings.views.view.m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f53778a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a3 f53779b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(a0 a0Var, a3 a3Var) {
        this.f53778a = a0Var;
        this.f53779b = a3Var;
    }

    @Override // com.withings.views.view.m
    public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
        LuminosityLevel luminosityLevel;
        a0.a aVar;
        LuminosityLevel luminosityLevel2;
        kotlin.jvm.internal.u.j(toggleView, "toggleView");
        a0 a0Var = this.f53778a;
        luminosityLevel = a0Var.f53771d;
        if (luminosityLevel != null) {
            boolean z11 = !z5 ? 1 : 0;
            luminosityLevel.mode = z11 ? (short) 1 : (short) 0;
            a3 a3Var = this.f53779b;
            a3Var.f98857d.setEnabled(z11);
            aVar = a0Var.f53772e;
            if (aVar != null) {
                luminosityLevel2 = a0Var.f53771d;
                if (luminosityLevel2 != null) {
                    aVar.U(a0Var, luminosityLevel2);
                } else {
                    kotlin.jvm.internal.u.s("luminosityLevel");
                    throw null;
                }
            }
            a0.w1(a0Var, a3Var);
            return;
        }
        kotlin.jvm.internal.u.s("luminosityLevel");
        throw null;
    }
}
