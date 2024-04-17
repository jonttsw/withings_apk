package com.withings.wiscale2.track.data;

import ah.o;
import com.withings.wiscale2.track.data.SleepStatsFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepScoreHelper.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldg/a;", "invoke", "()Ldg/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepStatsFactory$activeSessionProvider$2 extends w implements a<dg.a> {
    final /* synthetic */ SleepStatsFactory this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStatsFactory$activeSessionProvider$2(SleepStatsFactory sleepStatsFactory) {
        super(0);
        this.this$0 = sleepStatsFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final dg.a invoke() {
        return ((SleepStatsFactory.SleepStatsFactoryEntryPoint) o.c(this.this$0.getContext(), SleepStatsFactory.SleepStatsFactoryEntryPoint.class)).getActiveSessionProvider();
    }
}
