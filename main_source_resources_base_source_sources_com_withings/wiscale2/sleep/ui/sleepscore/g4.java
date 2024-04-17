package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
final class g4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Track> f60979a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y3 f60980b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ tb0.c3 f60981c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(tb0.c3 c3Var, y3 y3Var, List list) {
        super(2);
        this.f60979a = list;
        this.f60980b = y3Var;
        this.f60981c = c3Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            List<Track> list = this.f60979a;
            yk.o.b(false, s1.b.b(aVar2, -1397056505, new f4(this.f60981c, this.f60980b, list)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
