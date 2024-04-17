package com.withings.wiscale2.healthsync.google.fit;

import androidx.work.o;
import com.withings.partner.model.Partner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.p0;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: FitSyncWorker.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.FitSyncWorker$doWork$2", f = "FitSyncWorker.kt", l = {33, 34}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    p0 f56429a;

    /* renamed from: b  reason: collision with root package name */
    FitSyncWorker f56430b;

    /* renamed from: c  reason: collision with root package name */
    Partner f56431c;

    /* renamed from: d  reason: collision with root package name */
    p0 f56432d;

    /* renamed from: e  reason: collision with root package name */
    long f56433e;

    /* renamed from: f  reason: collision with root package name */
    int f56434f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ FitSyncWorker f56435g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FitSyncWorker.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.FitSyncWorker$doWork$2$1$1$1", f = "FitSyncWorker.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FitSyncWorker f56437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Partner f56438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FitSyncWorker fitSyncWorker, Partner partner, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f56437b = fitSyncWorker;
            this.f56438c = partner;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f56437b, this.f56438c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56436a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f56436a = 1;
                obj = this.f56437b.t(this.f56438c, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FitSyncWorker fitSyncWorker, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f56435g = fitSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f56435g, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.o$a$c, T] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
