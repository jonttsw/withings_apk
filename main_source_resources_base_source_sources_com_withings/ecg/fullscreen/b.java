package com.withings.ecg.fullscreen;

import com.withings.ecg.graph.EcgEntry;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: FullScreenEcgActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements l<nq.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullScreenEcgActivity f38383a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FullScreenEcgActivity fullScreenEcgActivity) {
        super(1);
        this.f38383a = fullScreenEcgActivity;
    }

    @Override // ym0.l
    public final y invoke(nq.c cVar) {
        nq.c ecgWithData = cVar;
        u.j(ecgWithData, "ecgWithData");
        FullScreenEcgActivity fullScreenEcgActivity = this.f38383a;
        FullScreenEcgActivity.C3(fullScreenEcgActivity).setEntries(ecgWithData.a());
        EcgEntry ecgEntry = ecgWithData.a().get(ecgWithData.a().size() / 2);
        FullScreenEcgActivity.C3(fullScreenEcgActivity).u(ecgEntry.e(), ecgEntry.b());
        return y.f85009a;
    }
}
