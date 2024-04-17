package com.withings.ecg.fullscreen;

import com.withings.ecg.fullscreen.FullScreenEcgActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class c extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullScreenEcgActivity.e f38384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FullScreenEcgActivity.e eVar) {
        super(0);
        this.f38384a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f38384a.f38381b, "ecg_id"));
    }
}
