package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import androidx.compose.ui.platform.k4;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: VideoCallCodeCheckScreen.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51881a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f51882b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k4 f51883c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k4 k4Var, ym0.a aVar, CoroutineScope coroutineScope) {
        super(0);
        this.f51881a = coroutineScope;
        this.f51882b = aVar;
        this.f51883c = k4Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f51881a, null, null, new b(this.f51883c, null), 3, null);
        this.f51882b.invoke();
        return y.f85009a;
    }
}
