package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import androidx.compose.ui.platform.k4;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: VideoCallPhoneNumberScreen.kt */
/* loaded from: classes5.dex */
final class h extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51930a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k4 f51931b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CoroutineScope coroutineScope, k4 k4Var) {
        super(0);
        this.f51930a = coroutineScope;
        this.f51931b = k4Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51930a, null, null, new g(this.f51931b, null), 3, null);
        return y.f85009a;
    }
}
