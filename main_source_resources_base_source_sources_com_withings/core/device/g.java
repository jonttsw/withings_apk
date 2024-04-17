package com.withings.core.device;

import com.withings.core.device.FullscreenVideoFragment;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class g extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullscreenVideoFragment.e f35354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FullscreenVideoFragment.e eVar) {
        super(0);
        this.f35354a = eVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(yq.b.b(this.f35354a.f35343b, "fallbackImg"));
    }
}
