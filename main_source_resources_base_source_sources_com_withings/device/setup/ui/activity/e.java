package com.withings.device.setup.ui.activity;

import com.withings.device.setup.ui.activity.l;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import np.p0;
import np.q0;
/* compiled from: SetupActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.l<i6.a, p0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupActivity f37517a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f37518b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f37519c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SetupActivity setupActivity, l lVar, int i11) {
        super(1);
        this.f37517a = setupActivity;
        this.f37518b = lVar;
        this.f37519c = i11;
    }

    @Override // ym0.l
    public final p0 invoke(i6.a aVar) {
        i6.a viewModel = aVar;
        u.j(viewModel, "$this$viewModel");
        q0 q0Var = this.f37517a.f37498f;
        if (q0Var != null) {
            return q0Var.a(((l.a) this.f37518b).a(), this.f37519c);
        }
        u.s("configureViewModelFactory");
        throw null;
    }
}
