package com.withings.tutorials.ui.screens.modes.pacemaker;

import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import nm0.y;
/* compiled from: PacemakerModeActivity.kt */
/* loaded from: classes4.dex */
final class k extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PacemakerModeActivity f45769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PacemakerModeActivity pacemakerModeActivity) {
        super(0);
        this.f45769a = pacemakerModeActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        PacemakerModeActivity pacemakerModeActivity = this.f45769a;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o(PacemakerModeActivity.z3(pacemakerModeActivity), null), 2, null);
        pacemakerModeActivity.t(PacemakerModeActivity.z3(pacemakerModeActivity).k0());
        pacemakerModeActivity.finish();
        return y.f85009a;
    }
}
