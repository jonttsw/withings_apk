package com.withings.wiscale2.device.common.tutorial.media;

import com.withings.wiscale2.device.common.tutorial.media.MediaTutorialActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class g extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity.f f53621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MediaTutorialActivity.f fVar) {
        super(0);
        this.f53621a = fVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f53621a.f53606b, "EXTRA_START_DESTINATION"));
    }
}
