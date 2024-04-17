package com.withings.wiscale2.profile;

import com.withings.user.User;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AllTimeStats.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.AllTimeStatLiveData$loadAllStats$1$1", f = "AllTimeStats.kt", l = {58, 61, 64}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f59301a;

    /* renamed from: b  reason: collision with root package name */
    Object f59302b;

    /* renamed from: c  reason: collision with root package name */
    Collection f59303c;

    /* renamed from: d  reason: collision with root package name */
    int f59304d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f59305e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ om.a f59306f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ User f59307g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllTimeStats.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.AllTimeStatLiveData$loadAllStats$1$1$allTimeStats$1$1", f = "AllTimeStats.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f59308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Stat f59309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f59310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ jm.a f59311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, Stat stat, g gVar, jm.a aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f59308a = cVar;
            this.f59309b = stat;
            this.f59310c = gVar;
            this.f59311d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f59308a, this.f59309b, this.f59310c, this.f59311d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super b> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return c.B(this.f59308a, this.f59309b, this.f59310c, this.f59311d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, om.a aVar, User user, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f59305e = cVar;
        this.f59306f = aVar;
        this.f59307g = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f59305e, this.f59306f, this.f59307g, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[LOOP:1: B:22:0x0098->B:24:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f1 -> B:32:0x00f3). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.profile.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
