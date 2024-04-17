package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f41418a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41419b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41420c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41421d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<CycleRegularity, nm0.y> f41422e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g3 f41423f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41424g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41425h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i11, int i12, a0 a0Var, g3 g3Var, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.l lVar) {
        super(2);
        this.f41418a = a0Var;
        this.f41419b = aVar;
        this.f41420c = aVar2;
        this.f41421d = aVar3;
        this.f41422e = lVar;
        this.f41423f = g3Var;
        this.f41424g = i11;
        this.f41425h = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f41424g | 1);
        this.f41418a.b(g11, this.f41425h, aVar, this.f41423f, this.f41419b, this.f41420c, this.f41421d, this.f41422e);
        return nm0.y.f85009a;
    }
}
