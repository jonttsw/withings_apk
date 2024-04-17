package com.withings.core.device;

import com.withings.core.device.FullScreenVideoActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class d extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullScreenVideoActivity.e f35351a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FullScreenVideoActivity.e eVar) {
        super(0);
        this.f35351a = eVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f35351a.f35328b, " fallbackImg"));
    }
}
