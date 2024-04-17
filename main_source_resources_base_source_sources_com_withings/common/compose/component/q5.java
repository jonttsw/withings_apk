package com.withings.common.compose.component;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.media3.datasource.d;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: VideoPlayer.kt */
/* loaded from: classes3.dex */
public final class q5 {

    /* renamed from: a  reason: collision with root package name */
    public static final q5 f34614a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static androidx.media3.datasource.cache.i f34615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoPlayer.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.VideoCache$preloadVideoInCache$2", f = "VideoPlayer.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f34616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, int i11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f34616a = context;
            this.f34617b = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f34616a, this.f34617b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Context context = this.f34616a;
            kotlin.jvm.internal.u.j(context, "context");
            HashSet q11 = q5.b(context).q();
            int i11 = this.f34617b;
            if (q11.contains(context.getString(i11))) {
                return nm0.y.f85009a;
            }
            String string = context.getString(i11);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            new t6.c(new androidx.media3.datasource.cache.a(q5.b(context), new d.a().a()), new s6.d(Uri.parse(string))).a();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoPlayer.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.VideoCache", f = "VideoPlayer.kt", l = {95}, m = "preloadVideosInCache")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Context f34618a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f34619b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f34620c;

        /* renamed from: e  reason: collision with root package name */
        int f34622e;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34620c = obj;
            this.f34622e |= Integer.MIN_VALUE;
            return q5.this.d(null, null, this);
        }
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        androidx.media3.datasource.cache.i iVar = f34615b;
        if (iVar != null) {
            iVar.s();
        }
        f34615b = null;
        File file = new File(context.getCacheDir(), "video");
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.database.sqlite.SQLiteOpenHelper, r6.b] */
    public static androidx.media3.datasource.cache.i b(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        if (f34615b == null) {
            f34615b = new androidx.media3.datasource.cache.i(new File(context.getCacheDir(), "video"), new t6.g(), new SQLiteOpenHelper(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1));
        }
        androidx.media3.datasource.cache.i iVar = f34615b;
        kotlin.jvm.internal.u.h(iVar, "null cannot be cast to non-null type androidx.media3.datasource.cache.SimpleCache");
        return iVar;
    }

    public static Object c(Context context, int i11, qm0.d dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new a(context, i11, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return nm0.y.f85009a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r6, java.util.List<java.lang.Integer> r7, qm0.d<? super nm0.y> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withings.common.compose.component.q5.b
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.common.compose.component.q5$b r0 = (com.withings.common.compose.component.q5.b) r0
            int r1 = r0.f34622e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34622e = r1
            goto L18
        L13:
            com.withings.common.compose.component.q5$b r0 = new com.withings.common.compose.component.q5$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34620c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f34622e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r6 = r0.f34619b
            android.content.Context r7 = r0.f34618a
            nm0.l.b(r8)
            goto L3f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            nm0.l.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L3f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r6.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f34618a = r7
            r0.f34619b = r6
            r0.f34622e = r3
            java.lang.Object r8 = c(r7, r8, r0)
            if (r8 != r1) goto L3f
            return r1
        L5c:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.q5.d(android.content.Context, java.util.List, qm0.d):java.lang.Object");
    }
}
