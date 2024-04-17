package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import androidx.compose.ui.platform.k4;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: VideoCallPhoneNumberScreen.kt */
/* loaded from: classes5.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f51933a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f51934b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51935c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k4 f51936d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z5, ym0.a<y> aVar, CoroutineScope coroutineScope, k4 k4Var) {
        super(0);
        this.f51933a = z5;
        this.f51934b = aVar;
        this.f51935c = coroutineScope;
        this.f51936d = k4Var;
    }

    @Override // ym0.a
    public final y invoke() {
        if (this.f51933a) {
            this.f51934b.invoke();
        }
        BuildersKt__Builders_commonKt.launch$default(this.f51935c, null, null, new i(this.f51936d, null), 3, null);
        return y.f85009a;
    }
}
