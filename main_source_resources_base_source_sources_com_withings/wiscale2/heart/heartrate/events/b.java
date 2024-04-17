package com.withings.wiscale2.heart.heartrate.events;

import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: HeartRateEventsActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements l<List<? extends ng0.d>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateEventsActivity f57639a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HeartRateEventsActivity heartRateEventsActivity) {
        super(1);
        this.f57639a = heartRateEventsActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends ng0.d> list) {
        List<? extends ng0.d> list2 = list;
        u.g(list2);
        HeartRateEventsActivity.C3(this.f57639a, list2);
        return y.f85009a;
    }
}
