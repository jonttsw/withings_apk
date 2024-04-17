package com.withings.overview.ui;

import com.withings.partner.model.Partner;
import kotlin.collections.s0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: StartTrackingActivity.kt */
/* loaded from: classes4.dex */
final class g extends w implements l<Partner, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StartTrackingActivity f43358a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(StartTrackingActivity startTrackingActivity) {
        super(1);
        this.f43358a = startTrackingActivity;
    }

    @Override // ym0.l
    public final y invoke(Partner partner) {
        Partner it = partner;
        u.j(it, "it");
        int i11 = v70.a.f103433b;
        boolean z5 = true;
        v70.a.d("view_product", "view_product", s0.i(new nm0.j("flow_specificity", it.name())), true);
        StartTrackingActivity startTrackingActivity = this.f43358a;
        ch.d dVar = startTrackingActivity.f43345f;
        if (dVar != null) {
            ch.g a11 = dVar.a();
            int l5 = it.l();
            if (it != Partner.f43456n) {
                z5 = false;
            }
            startTrackingActivity.startActivity(ch.g.b(a11, startTrackingActivity, l5, z5, 8));
            return y.f85009a;
        }
        u.s("intentBuilder");
        throw null;
    }
}
