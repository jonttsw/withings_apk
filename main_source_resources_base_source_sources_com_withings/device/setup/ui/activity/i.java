package com.withings.device.setup.ui.activity;

import com.withings.device.setup.ui.activity.a;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SetupActivity.kt */
/* loaded from: classes3.dex */
final class i extends w implements ym0.l<xi.b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupActivity f37524a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SetupActivity setupActivity) {
        super(1);
        this.f37524a = setupActivity;
    }

    @Override // ym0.l
    public final y invoke(xi.b bVar) {
        xi.b it = bVar;
        u.j(it, "it");
        this.f37524a.z3().g0(new a.C0490a(it));
        return y.f85009a;
    }
}
