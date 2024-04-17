package com.withings.wiscale2.spo2;

import com.withings.vasistas.model.Vasistas;
import ji0.c0;
/* compiled from: SpO2MeasuresListActivity.kt */
/* loaded from: classes5.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<Vasistas, c0.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SpO2MeasuresListActivity f61679a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SpO2MeasuresListActivity spO2MeasuresListActivity) {
        super(1);
        this.f61679a = spO2MeasuresListActivity;
    }

    @Override // ym0.l
    public final c0.a invoke(Vasistas vasistas) {
        Vasistas vasistas2 = vasistas;
        kotlin.jvm.internal.u.j(vasistas2, "vasistas");
        kn.e eVar = this.f61679a.f61606n;
        if (eVar != null) {
            return new c0.a(vasistas2, eVar);
        }
        kotlin.jvm.internal.u.s("deviceManager");
        throw null;
    }
}
