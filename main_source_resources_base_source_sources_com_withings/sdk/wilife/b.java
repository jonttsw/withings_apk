package com.withings.sdk.wilife;

import ah.h;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.camera.core.v;
import com.withings.sdk.wilife.data.update.remote.RemoteUpdateService;
import fn0.k;
import g4.e;
import java.io.FileNotFoundException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import r9.m;
import ym0.p;
/* compiled from: WilifeApplication.kt */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static s40.a f43973b;

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f43972a = {v.c(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: c  reason: collision with root package name */
    private static final f4.d f43974c = f4.b.a("settings", null, 14);

    /* renamed from: d  reason: collision with root package name */
    private static final e.a<Long> f43975d = h.f("last_wilife_update_check");

    /* compiled from: WilifeApplication.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$checkForWilifeUpdate$1", f = "WilifeApplication.kt", l = {77, 85, 90}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        s40.a f43976a;

        /* renamed from: b  reason: collision with root package name */
        int f43977b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t40.a f43978c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f43979d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r40.b f43980e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ sa.e f43981f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Application f43982g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WilifeApplication.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$checkForWilifeUpdate$1$1", f = "WilifeApplication.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.sdk.wilife.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0602a extends i implements p<g4.a, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f43983a;

            C0602a() {
                throw null;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.sdk.wilife.b$a$a, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                ?? iVar = new i(2, dVar);
                iVar.f43983a = obj;
                return iVar;
            }

            @Override // ym0.p
            public final Object invoke(g4.a aVar, qm0.d<? super y> dVar) {
                return ((C0602a) create(aVar, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                ((g4.a) this.f43983a).j(b.f43975d, new Long(System.currentTimeMillis()));
                return y.f85009a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WilifeApplication.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$checkForWilifeUpdate$1$2", f = "WilifeApplication.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.sdk.wilife.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0603b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s40.a f43984a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0603b(s40.a aVar, qm0.d<? super C0603b> dVar) {
                super(2, dVar);
                this.f43984a = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new C0603b(this.f43984a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((C0603b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                b.e(this.f43984a);
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t40.a aVar, m mVar, r40.b bVar, sa.e eVar, Application application, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f43978c = aVar;
            this.f43979d = mVar;
            this.f43980e = bVar;
            this.f43981f = eVar;
            this.f43982g = application;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f43978c, this.f43979d, this.f43980e, this.f43981f, this.f43982g, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[RETURN] */
        /* JADX WARN: Type inference failed for: r3v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r9.f43977b
                r2 = 3
                r3 = 1
                r4 = 0
                r5 = 2
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 == r5) goto L1d
                if (r1 != r2) goto L15
                nm0.l.b(r10)
                goto L90
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                s40.a r1 = r9.f43976a
                nm0.l.b(r10)
                goto L69
            L23:
                nm0.l.b(r10)
                goto L50
            L27:
                nm0.l.b(r10)
                s40.b r10 = new s40.b
                r9.m r1 = r9.f43979d
                java.lang.String r1 = r1.d()
                r40.b r6 = r9.f43980e
                java.lang.String r6 = r6.a()
                sa.e r7 = r9.f43981f
                java.lang.String r8 = r7.e()
                int r7 = r7.c()
                r10.<init>(r1, r6, r8, r7)
                r9.f43977b = r3
                t40.a r1 = r9.f43978c
                java.lang.Object r10 = r1.isUpdateAvailable(r10, r9)
                if (r10 != r0) goto L50
                return r0
            L50:
                r1 = r10
                s40.a r1 = (s40.a) r1
                android.app.Application r10 = r9.f43982g
                c4.h r10 = com.withings.sdk.wilife.b.a(r10)
                com.withings.sdk.wilife.b$a$a r3 = new com.withings.sdk.wilife.b$a$a
                r3.<init>(r5, r4)
                r9.f43976a = r1
                r9.f43977b = r5
                java.lang.Object r10 = g4.f.a(r10, r3, r9)
                if (r10 != r0) goto L69
                return r0
            L69:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r3 = "update detected "
                r10.<init>(r3)
                r10.append(r1)
                java.lang.String r10 = r10.toString()
                java.lang.String r3 = "Wilife-SDK"
                android.util.Log.d(r3, r10)
                kotlinx.coroutines.MainCoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getMain()
                com.withings.sdk.wilife.b$a$b r3 = new com.withings.sdk.wilife.b$a$b
                r3.<init>(r1, r4)
                r9.f43976a = r4
                r9.f43977b = r2
                java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r3, r9)
                if (r10 != r0) goto L90
                return r0
            L90:
                nm0.y r10 = nm0.y.f85009a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.sdk.wilife.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final c4.h a(Application application) {
        return f43974c.getValue(application, f43972a[0]);
    }

    public static final void c(Application application) {
        try {
            r40.b bVar = new r40.b(application);
            m mVar = new m(application);
            sa.e eVar = new sa.e((Context) application);
            BuildersKt.runBlocking(Dispatchers.getIO(), new a(new t40.a(new RemoteUpdateService()), mVar, bVar, eVar, application, null));
        } catch (FileNotFoundException e11) {
            Log.e("Wilife-SDK", "Missing version UUID file", e11);
            f43973b = null;
        }
    }

    public static final s40.a d() {
        return f43973b;
    }

    public static final void e(s40.a aVar) {
        f43973b = aVar;
    }
}
