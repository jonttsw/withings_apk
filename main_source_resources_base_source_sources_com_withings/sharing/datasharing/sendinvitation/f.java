package com.withings.sharing.datasharing.sendinvitation;

import com.withings.sharing.core.model.TimeSharePeriod;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectTimeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SelectTimeViewModel$onSelectPeriod$1", f = "SelectTimeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f44163a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f44164b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SelectTimeViewModel f44165c;

    /* compiled from: SelectTimeViewModel.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<TimeSharePeriod> f44166a = sm0.b.a(TimeSharePeriod.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11, SelectTimeViewModel selectTimeViewModel, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f44164b = i11;
        this.f44165c = selectTimeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f fVar = new f(this.f44164b, this.f44165c, dVar);
        fVar.f44163a = obj;
        return fVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        TimeSharePeriod sharingPeriod;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f44163a;
        sm0.a<TimeSharePeriod> aVar = a.f44166a;
        int M = kotlin.collections.x.M(aVar);
        int i11 = this.f44164b;
        if (i11 <= M) {
            mutableStateFlow = this.f44165c.f44100a;
            do {
                value = mutableStateFlow.getValue();
                sharingPeriod = (TimeSharePeriod) a.f44166a.get(i11);
                ((z40.i) value).getClass();
                kotlin.jvm.internal.u.j(sharingPeriod, "sharingPeriod");
            } while (!mutableStateFlow.compareAndSet(value, new z40.i(sharingPeriod)));
            return nm0.y.f85009a;
        }
        dx.a.f64529a.b(coroutineScope, androidx.appcompat.app.h.c("Invalid period id/index: ", i11, ", when selections until (and including) ", kotlin.collections.x.M(aVar), " are possible"), new Object[0]);
        return nm0.y.f85009a;
    }
}
