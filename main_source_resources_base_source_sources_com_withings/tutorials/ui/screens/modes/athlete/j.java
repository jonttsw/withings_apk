package com.withings.tutorials.ui.screens.modes.athlete;

import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import nm0.y;
/* compiled from: AthleteModeActivity.kt */
/* loaded from: classes4.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AthleteModeActivity f45600a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AthleteModeActivity athleteModeActivity) {
        super(0);
        this.f45600a = athleteModeActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        AthleteModeActivity athleteModeActivity = this.f45600a;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new n(AthleteModeActivity.z3(athleteModeActivity), null), 2, null);
        athleteModeActivity.t(AthleteModeActivity.z3(athleteModeActivity).k0());
        athleteModeActivity.finish();
        return y.f85009a;
    }
}
