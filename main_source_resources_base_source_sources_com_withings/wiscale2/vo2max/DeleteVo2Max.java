package com.withings.wiscale2.vo2max;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.track.data.Track;
import fy.v;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nj0.h;
import nm0.l;
import nm0.y;
import qm0.d;
import r70.c;
import ym0.p;
import ym0.q;
import zx.j;
/* compiled from: Vo2MaxGenerator.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/vo2max/DeleteVo2Max;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lcom/withings/wiscale2/vo2max/b;", "vo2MaxInformationItemInsertor", "Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;", "workoutManager", "Lr70/c;", "userRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/withings/wiscale2/vo2max/b;Lcom/withings/wiscale2/activity/workout/model/WorkoutManager;Lr70/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeleteVo2Max extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.wiscale2.vo2max.b f62604a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkoutManager f62605b;

    /* renamed from: c  reason: collision with root package name */
    private final c f62606c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2MaxGenerator.kt */
    @e(c = "com.withings.wiscale2.vo2max.DeleteVo2Max", f = "Vo2MaxGenerator.kt", l = {ConstantsWs.WS_STATUS_WRONGASSOCNAME}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f62607a;

        /* renamed from: c  reason: collision with root package name */
        int f62609c;

        a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62607a = obj;
            this.f62609c |= Integer.MIN_VALUE;
            return DeleteVo2Max.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2MaxGenerator.kt */
    @e(c = "com.withings.wiscale2.vo2max.DeleteVo2Max$doWork$2", f = "Vo2MaxGenerator.kt", l = {ConstantsWs.WS_STATUS_NOHEIGHT, ConstantsWs.WS_STATUS_MEASUPDATEERROR}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements p<CoroutineScope, d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        DeleteVo2Max f62610a;

        /* renamed from: b  reason: collision with root package name */
        int f62611b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Vo2MaxGenerator.kt */
        @e(c = "com.withings.wiscale2.vo2max.DeleteVo2Max$doWork$2$1$1", f = "Vo2MaxGenerator.kt", l = {ConstantsWs.WS_STATUS_WRONGTOKEN}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends i implements q<User, Track, d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62613a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ User f62614b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Track f62615c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ DeleteVo2Max f62616d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DeleteVo2Max deleteVo2Max, d<? super a> dVar) {
                super(3, dVar);
                this.f62616d = deleteVo2Max;
            }

            @Override // ym0.q
            public final Object invoke(User user, Track track, d<? super y> dVar) {
                a aVar = new a(this.f62616d, dVar);
                aVar.f62614b = user;
                aVar.f62615c = track;
                return aVar.invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f62613a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    User user = this.f62614b;
                    Track track = this.f62615c;
                    WiscaleDBH f11 = WiscaleDBH.f();
                    u.i(f11, "get(...)");
                    sw.a z5 = sw.a.z();
                    u.i(z5, "get(...)");
                    new h(new v(new zx.v(z5), f11, j.f111082d.a()));
                    h.a(user.getId(), track);
                    com.withings.wiscale2.vo2max.b bVar = this.f62616d.f62604a;
                    this.f62614b = null;
                    this.f62613a = 1;
                    if (bVar.b(track, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return y.f85009a;
            }
        }

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f62611b
                r2 = -1
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L22
                if (r1 == r5) goto L1c
                if (r1 != r4) goto L14
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L12
                goto L68
            L12:
                r9 = move-exception
                goto L6b
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                com.withings.wiscale2.vo2max.DeleteVo2Max r1 = r8.f62610a
                nm0.l.b(r9)     // Catch: java.lang.Throwable -> L12
                goto L40
            L22:
                nm0.l.b(r9)
                com.withings.wiscale2.vo2max.DeleteVo2Max r1 = com.withings.wiscale2.vo2max.DeleteVo2Max.this
                r70.c r9 = com.withings.wiscale2.vo2max.DeleteVo2Max.o(r1)     // Catch: java.lang.Throwable -> L12
                androidx.work.f r6 = r1.getInputData()     // Catch: java.lang.Throwable -> L12
                java.lang.String r7 = "userId"
                long r6 = r6.e(r7, r2)     // Catch: java.lang.Throwable -> L12
                r8.f62610a = r1     // Catch: java.lang.Throwable -> L12
                r8.f62611b = r5     // Catch: java.lang.Throwable -> L12
                java.lang.Object r9 = r70.d.b(r9, r6, r8)     // Catch: java.lang.Throwable -> L12
                if (r9 != r0) goto L40
                return r0
            L40:
                com.withings.wiscale2.activity.workout.model.WorkoutManager r5 = com.withings.wiscale2.vo2max.DeleteVo2Max.v(r1)     // Catch: java.lang.Throwable -> L12
                androidx.work.f r6 = r1.getInputData()     // Catch: java.lang.Throwable -> L12
                java.lang.String r7 = "trackId"
                long r2 = r6.e(r7, r2)     // Catch: java.lang.Throwable -> L12
                com.withings.wiscale2.track.data.Track r2 = r5.getWorkoutById(r2)     // Catch: java.lang.Throwable -> L12
                nm0.j r3 = new nm0.j     // Catch: java.lang.Throwable -> L12
                r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L12
                com.withings.wiscale2.vo2max.DeleteVo2Max$b$a r9 = new com.withings.wiscale2.vo2max.DeleteVo2Max$b$a     // Catch: java.lang.Throwable -> L12
                r2 = 0
                r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
                r8.f62610a = r2     // Catch: java.lang.Throwable -> L12
                r8.f62611b = r4     // Catch: java.lang.Throwable -> L12
                java.lang.Object r9 = cr.a.b(r3, r9, r8)     // Catch: java.lang.Throwable -> L12
                if (r9 != r0) goto L68
                return r0
            L68:
                nm0.y r9 = (nm0.y) r9     // Catch: java.lang.Throwable -> L12
                goto L6f
            L6b:
                nm0.k$a r9 = nm0.l.a(r9)
            L6f:
                java.lang.Throwable r0 = nm0.k.b(r9)
                if (r0 == 0) goto L78
                x70.b.n(r0)
            L78:
                java.lang.Throwable r0 = nm0.k.b(r9)
                if (r0 != 0) goto L86
                nm0.y r9 = (nm0.y) r9
                androidx.work.o$a$c r9 = new androidx.work.o$a$c
                r9.<init>()
                goto L8b
            L86:
                androidx.work.o$a$a r9 = new androidx.work.o$a$a
                r9.<init>()
            L8b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.DeleteVo2Max.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteVo2Max(Context context, WorkerParameters params, com.withings.wiscale2.vo2max.b vo2MaxInformationItemInsertor, WorkoutManager workoutManager, c userRepository) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(vo2MaxInformationItemInsertor, "vo2MaxInformationItemInsertor");
        u.j(workoutManager, "workoutManager");
        u.j(userRepository, "userRepository");
        this.f62604a = vo2MaxInformationItemInsertor;
        this.f62605b = workoutManager;
        this.f62606c = userRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.vo2max.DeleteVo2Max.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.vo2max.DeleteVo2Max$a r0 = (com.withings.wiscale2.vo2max.DeleteVo2Max.a) r0
            int r1 = r0.f62609c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62609c = r1
            goto L18
        L13:
            com.withings.wiscale2.vo2max.DeleteVo2Max$a r0 = new com.withings.wiscale2.vo2max.DeleteVo2Max$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f62607a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f62609c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.vo2max.DeleteVo2Max$b r2 = new com.withings.wiscale2.vo2max.DeleteVo2Max$b
            r4 = 0
            r2.<init>(r4)
            r0.f62609c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.DeleteVo2Max.doWork(qm0.d):java.lang.Object");
    }
}
