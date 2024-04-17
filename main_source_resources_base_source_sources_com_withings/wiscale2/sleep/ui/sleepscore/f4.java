package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
final class f4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Track> f60970a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y3 f60971b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ tb0.c3 f60972c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(tb0.c3 c3Var, y3 y3Var, List list) {
        super(2);
        this.f60970a = list;
        this.f60971b = y3Var;
        this.f60972c = c3Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), 0.0f, yk.h.q(), 0.0f, yk.h.c(), 5);
            List<Track> list = this.f60970a;
            androidx.compose.material.x0.a(j5, null, 0L, 0, s1.b.b(aVar2, 162715396, new e4(this.f60972c, this.f60971b, list)), aVar2, 1769472, 30);
        }
        return nm0.y.f85009a;
    }
}
