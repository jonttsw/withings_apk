package com.withings.authentication.mfa.resolve.components;

import ah.o;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TooManyRequestsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class m extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f32047a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32048b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32049c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i11, int i12, ym0.a aVar) {
        super(2);
        this.f32047a = i11;
        this.f32048b = aVar;
        this.f32049c = i12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f32049c | 1);
        n.a(this.f32047a, g11, aVar, this.f32048b);
        return y.f85009a;
    }
}
