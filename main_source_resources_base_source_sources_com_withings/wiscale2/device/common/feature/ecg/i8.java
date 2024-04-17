package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class i8 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51429a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51430b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51431c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(WBS08EcgActivationActivity wBS08EcgActivationActivity, CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(0);
        this.f51429a = wBS08EcgActivationActivity;
        this.f51430b = coroutineScope;
        this.f51431c = k4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        R3 = this.f51429a.R3();
        R3.t1();
        BuildersKt__Builders_commonKt.launch$default(this.f51430b, null, null, new h8(this.f51431c, null), 3, null);
        return nm0.y.f85009a;
    }
}
