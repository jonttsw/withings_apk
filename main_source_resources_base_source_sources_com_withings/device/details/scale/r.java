package com.withings.device.details.scale;

import android.content.Intent;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f37011a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f37012b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar, Intent intent) {
        super(0);
        this.f37011a = kVar;
        this.f37012b = intent;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f37011a.startActivity(this.f37012b);
        return nm0.y.f85009a;
    }
}
