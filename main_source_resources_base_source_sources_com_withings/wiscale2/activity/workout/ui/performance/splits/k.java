package com.withings.wiscale2.activity.workout.ui.performance.splits;

import java.util.List;
import kotlin.jvm.internal.w;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class k extends w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f50022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list) {
        super(1);
        this.f50022a = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        this.f50022a.get(num.intValue());
        return null;
    }
}
