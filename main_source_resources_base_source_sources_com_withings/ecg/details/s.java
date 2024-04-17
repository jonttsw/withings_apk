package com.withings.ecg.details;

import com.withings.views.widget.LineCellView;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38305a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g gVar) {
        super(1);
        this.f38305a = gVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        int i11;
        String str2 = str;
        g gVar = this.f38305a;
        if (str2 != null) {
            LineCellView ecgDetailsHeartrate = gVar.I1().f78059f;
            kotlin.jvm.internal.u.i(ecgDetailsHeartrate, "ecgDetailsHeartrate");
            ecgDetailsHeartrate.setValue(str2);
        }
        LineCellView ecgDetailsHeartrate2 = gVar.I1().f78059f;
        kotlin.jvm.internal.u.i(ecgDetailsHeartrate2, "ecgDetailsHeartrate");
        if (str2 == null) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        ecgDetailsHeartrate2.setVisibility(i11);
        return nm0.y.f85009a;
    }
}
