package com.withings.device.setup.ui.activity;

import com.withings.device.setup.ui.activity.l;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: SetupActivity.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.l<i6.a, op.d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupActivity f37522a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f37523b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SetupActivity setupActivity, l lVar) {
        super(1);
        this.f37522a = setupActivity;
        this.f37523b = lVar;
    }

    @Override // ym0.l
    public final op.d invoke(i6.a aVar) {
        i6.a viewModel = aVar;
        u.j(viewModel, "$this$viewModel");
        op.e eVar = this.f37522a.f37497e;
        if (eVar != null) {
            return eVar.a(((l.c) this.f37523b).a());
        }
        u.s("searchViewModelFactory");
        throw null;
    }
}
