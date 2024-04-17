package com.withings.manualLogging.ui.feature.addNote;

import java.util.List;
/* compiled from: AddSymptomsScreen.kt */
/* loaded from: classes4.dex */
final class q1 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<fx.f, nm0.y> f41554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<fx.f> f41555b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q1(ym0.l<? super fx.f, nm0.y> lVar, List<fx.f> list) {
        super(1);
        this.f41554a = lVar;
        this.f41555b = list;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        this.f41554a.invoke(this.f41555b.get(num.intValue()));
        return nm0.y.f85009a;
    }
}
