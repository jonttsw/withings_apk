package com.withings.appnavigation.api.sample.activity;

import ah.o;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SampleNavigationActivity.kt */
/* loaded from: classes3.dex */
public final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SampleNavigationActivity f31286a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f31287b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31288c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SampleNavigationActivity sampleNavigationActivity, String str, int i11) {
        super(2);
        this.f31286a = sampleNavigationActivity;
        this.f31287b = str;
        this.f31288c = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f31288c | 1);
        SampleNavigationActivity.z3(this.f31286a, this.f31287b, aVar, g11);
        return y.f85009a;
    }
}
