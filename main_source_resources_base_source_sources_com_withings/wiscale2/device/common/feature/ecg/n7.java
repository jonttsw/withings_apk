package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class n7 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51537a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51538b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51539c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(WBS08EcgActivationActivity wBS08EcgActivationActivity, CoroutineScope coroutineScope, androidx.compose.ui.platform.k4 k4Var) {
        super(0);
        this.f51537a = wBS08EcgActivationActivity;
        this.f51538b = coroutineScope;
        this.f51539c = k4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        R3 = this.f51537a.R3();
        R3.s1();
        BuildersKt__Builders_commonKt.launch$default(this.f51538b, null, null, new m7(this.f51539c, null), 3, null);
        return nm0.y.f85009a;
    }
}
