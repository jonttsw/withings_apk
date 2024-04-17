package com.withings.wiscale2.settings;

import kotlinx.coroutines.flow.Flow;
/* compiled from: Zip.kt */
/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.a<Integer[]> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow[] f60091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Flow[] flowArr) {
        super(0);
        this.f60091a = flowArr;
    }

    @Override // ym0.a
    public final Integer[] invoke() {
        return new Integer[this.f60091a.length];
    }
}
