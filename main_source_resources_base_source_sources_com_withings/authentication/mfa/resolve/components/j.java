package com.withings.authentication.mfa.resolve.components;

import ah.o;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectFactorBottomSheet.kt */
/* loaded from: classes3.dex */
public final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthFactorContent f32031a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32032b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32033c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AuthFactorContent authFactorContent, ym0.a<y> aVar, int i11) {
        super(2);
        this.f32031a = authFactorContent;
        this.f32032b = aVar;
        this.f32033c = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f32033c | 1);
        k.b(this.f32031a, this.f32032b, aVar, g11);
        return y.f85009a;
    }
}
