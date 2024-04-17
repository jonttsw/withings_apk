package com.withings.details.height;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36629a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<String, List<MeasuresGroup>> f36630b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f36631c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(HeightListActivity heightListActivity, Map<String, ? extends List<? extends MeasuresGroup>> map, int i11) {
        super(2);
        this.f36629a = heightListActivity;
        this.f36630b = map;
        this.f36631c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36631c | 1);
        HeightListActivity.G3(this.f36629a, this.f36630b, aVar, g11);
        return nm0.y.f85009a;
    }
}
