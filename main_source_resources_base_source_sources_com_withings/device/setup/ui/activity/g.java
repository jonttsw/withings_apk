package com.withings.device.setup.ui.activity;

import com.withings.device.setup.ui.activity.a;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SetupActivity.kt */
/* loaded from: classes3.dex */
final class g extends w implements ym0.l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupActivity f37521a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SetupActivity setupActivity) {
        super(1);
        this.f37521a = setupActivity;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        this.f37521a.z3().g0(new a.b(num.intValue()));
        return y.f85009a;
    }
}
