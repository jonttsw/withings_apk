package com.withings.wiscale2.device.common.feature.afib;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AfibSettingsActivity.kt */
/* loaded from: classes5.dex */
final class o extends w implements ym0.l<nm0.j<? extends Boolean, ? extends Boolean>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AfibSettingsActivity f51032a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AfibSettingsActivity afibSettingsActivity) {
        super(1);
        this.f51032a = afibSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(nm0.j<? extends Boolean, ? extends Boolean> jVar) {
        nm0.j<? extends Boolean, ? extends Boolean> jVar2 = jVar;
        if (jVar2 != null) {
            AfibSettingsActivity.C3(this.f51032a, jVar2);
        }
        return y.f85009a;
    }
}
