package com.withings.wiscale2.device.wpa.wpa02.conversation;

import cj.d;
import com.withings.device.Device;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02Submitter.kt */
/* loaded from: classes5.dex */
public final class b extends w implements ym0.a<d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f55053a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f55053a = cVar;
    }

    @Override // ym0.a
    public final d invoke() {
        Device device;
        device = this.f55053a.f55054a;
        return jl.a.b(device);
    }
}
