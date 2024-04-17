package com.withings.device.setup.ui.select.uc;

import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LoadOnDemandModuleUseCase.kt */
/* loaded from: classes3.dex */
final class a extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0<Integer> f37630a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p0<Integer> p0Var) {
        super(1);
        this.f37630a = p0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Integer] */
    @Override // ym0.l
    public final y invoke(Integer num) {
        this.f37630a.f76257a = num;
        return y.f85009a;
    }
}
