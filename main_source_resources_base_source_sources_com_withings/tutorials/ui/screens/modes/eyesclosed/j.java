package com.withings.tutorials.ui.screens.modes.eyesclosed;

import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import nm0.y;
/* compiled from: EyesClosedModeActivity.kt */
/* loaded from: classes4.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeActivity f45685a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(EyesClosedModeActivity eyesClosedModeActivity) {
        super(0);
        this.f45685a = eyesClosedModeActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        EyesClosedModeActivity eyesClosedModeActivity = this.f45685a;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new n(EyesClosedModeActivity.z3(eyesClosedModeActivity), null), 2, null);
        eyesClosedModeActivity.t(EyesClosedModeActivity.z3(eyesClosedModeActivity).k0());
        eyesClosedModeActivity.finish();
        return y.f85009a;
    }
}
