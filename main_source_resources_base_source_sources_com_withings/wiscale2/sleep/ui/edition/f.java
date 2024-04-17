package com.withings.wiscale2.sleep.ui.edition;

import android.content.Intent;
import android.os.Parcelable;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.l;
import nm0.y;
import org.joda.time.Duration;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NightEditionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$undoNightEdition$1", f = "NightEditionActivity.kt", l = {222, 223}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60477a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NightEditionActivity f60478b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NightEditionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$undoNightEdition$1$1", f = "NightEditionActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends i implements p<CoroutineScope, qm0.d<? super Track>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f60479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Track track, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f60479a = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f60479a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            Track track = this.f60479a;
            track.setManualStartDate(null);
            track.setManualEndDate(null);
            track.setBlankVasistasFilled(false);
            Parcelable data = track.getData();
            u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            SleepTrackData sleepTrackData = (SleepTrackData) data;
            sleepTrackData.setManualAwakeDuration(new Duration(0L));
            sleepTrackData.setManualSleepDuration(new Duration(0L));
            track.setData(sleepTrackData);
            return ei0.i.f65410a.a(track, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NightEditionActivity nightEditionActivity, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f60478b = nightEditionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f60478b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60477a;
        NightEditionActivity nightEditionActivity = this.f60478b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    nightEditionActivity.startActivityForResult(new Intent(NightEditionActivity.F3(nightEditionActivity).getContext(), NightEditionFakeStuffActivity.class), 14);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            MutableSharedFlow mutableSharedFlow = nightEditionActivity.f60444l;
            this.f60477a = 1;
            obj = FlowKt.first(mutableSharedFlow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        a aVar = new a((Track) obj, null);
        this.f60477a = 2;
        if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        nightEditionActivity.startActivityForResult(new Intent(NightEditionActivity.F3(nightEditionActivity).getContext(), NightEditionFakeStuffActivity.class), 14);
        return y.f85009a;
    }
}
