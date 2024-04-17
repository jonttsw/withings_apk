package com.withings.wiscale2.device.common.feature.respiratoryscan;

import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.p;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
public final class h implements p<Integer, gi.b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0 f52453a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(n0 n0Var) {
        this.f52453a = n0Var;
    }

    @Override // ym0.p
    public final y invoke(Integer num, gi.b bVar) {
        int intValue = num.intValue();
        gi.b info = bVar;
        u.j(info, "info");
        this.f52453a.f76254a = intValue;
        return y.f85009a;
    }
}
