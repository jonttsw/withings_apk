package com.withings.ecg.details;

import com.withings.ecg.details.g;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends Boolean>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38340a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g gVar) {
        super(1);
        this.f38340a = gVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends Boolean> cVar) {
        xw.c<? extends Boolean> cVar2 = cVar;
        if (cVar2 != null && cVar2.a() != null) {
            g.a aVar = g.f38200q;
            g gVar = this.f38340a;
            qc.b B = new qc.b(gVar.requireContext()).B(gVar.getString(C1987R.string.ecg_detail_settingsDeleteConfirmation));
            B.A(gVar.getString(C1987R.string._YES_), new dq.f(gVar, 1));
            B.w(C1987R.string._CANCEL_, new f(gVar, 0)).s();
        }
        return nm0.y.f85009a;
    }
}
