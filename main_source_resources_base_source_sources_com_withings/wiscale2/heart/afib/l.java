package com.withings.wiscale2.heart.afib;

import com.withings.user.User;
import java.util.Collection;
/* compiled from: AFibLoader.kt */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final User f57192a;

    /* renamed from: b  reason: collision with root package name */
    private final fy.o f57193b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AFibLoader.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibLoader", f = "AFibLoader.kt", l = {46, 65, 76}, m = "getAFibMeasuresGroupForType")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        AFibType f57194a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f57195b;

        /* renamed from: d  reason: collision with root package name */
        int f57197d;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57195b = obj;
            this.f57197d |= Integer.MIN_VALUE;
            return l.this.c(null, 0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AFibLoader.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibLoader", f = "AFibLoader.kt", l = {26}, m = "getAFibMeasuresGroups")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        l f57198a;

        /* renamed from: b  reason: collision with root package name */
        AFibType[] f57199b;

        /* renamed from: c  reason: collision with root package name */
        Collection f57200c;

        /* renamed from: d  reason: collision with root package name */
        long f57201d;

        /* renamed from: e  reason: collision with root package name */
        long f57202e;

        /* renamed from: f  reason: collision with root package name */
        int f57203f;

        /* renamed from: g  reason: collision with root package name */
        int f57204g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f57205h;

        /* renamed from: j  reason: collision with root package name */
        int f57207j;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57205h = obj;
            this.f57207j |= Integer.MIN_VALUE;
            return l.this.d(null, 0L, 0L, this);
        }
    }

    public l(User user, fy.o getMeasuresGroupList) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(getMeasuresGroupList, "getMeasuresGroupList");
        this.f57192a = user;
        this.f57193b = getMeasuresGroupList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:20:0x0092). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.withings.wiscale2.heart.afib.AFibType[] r21, long r22, qm0.d r24) {
        /*
            r20 = this;
            r0 = r24
            boolean r1 = r0 instanceof com.withings.wiscale2.heart.afib.j
            if (r1 == 0) goto L17
            r1 = r0
            com.withings.wiscale2.heart.afib.j r1 = (com.withings.wiscale2.heart.afib.j) r1
            int r2 = r1.f57183j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f57183j = r2
            r2 = r20
            goto L1e
        L17:
            com.withings.wiscale2.heart.afib.j r1 = new com.withings.wiscale2.heart.afib.j
            r2 = r20
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f57181h
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r4 = r1.f57183j
            r5 = 1
            if (r4 == 0) goto L4b
            if (r4 != r5) goto L43
            int r4 = r1.f57180g
            int r6 = r1.f57179f
            long r7 = r1.f57178e
            long r9 = r1.f57177d
            java.util.Collection r11 = r1.f57176c
            java.util.Collection r11 = (java.util.Collection) r11
            com.withings.wiscale2.heart.afib.AFibType[] r12 = r1.f57175b
            com.withings.wiscale2.heart.afib.l r13 = r1.f57174a
            nm0.l.b(r0)
            r14 = r4
            r4 = r12
            r12 = r13
            r13 = r1
            r1 = r11
            r10 = r9
            goto L92
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4b:
            nm0.l.b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4 = r21
            int r6 = r4.length
            r7 = 0
            r9 = 0
            r16 = r0
            r13 = r1
            r12 = r2
            r14 = r6
            r10 = r7
            r15 = r9
            r0 = r22
        L62:
            if (r15 >= r14) goto L9f
            r7 = r4[r15]
            r13.f57174a = r12
            r13.f57175b = r4
            r6 = r16
            java.util.Collection r6 = (java.util.Collection) r6
            r13.f57176c = r6
            r13.f57177d = r10
            r13.f57178e = r0
            r13.f57179f = r15
            r13.f57180g = r14
            r13.f57183j = r5
            r6 = r12
            r8 = r10
            r17 = r10
            r10 = r0
            r19 = r12
            r12 = r13
            java.io.Serializable r6 = r6.b(r7, r8, r10, r12)
            if (r6 != r3) goto L89
            return r3
        L89:
            r7 = r0
            r0 = r6
            r6 = r15
            r1 = r16
            r10 = r17
            r12 = r19
        L92:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.x.n(r0, r1)
            int r15 = r6 + 1
            r16 = r1
            r0 = r7
            goto L62
        L9f:
            java.util.List r16 = (java.util.List) r16
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.l.a(com.withings.wiscale2.heart.afib.AFibType[], long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[LOOP:0: B:19:0x0056->B:21:0x005c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(com.withings.wiscale2.heart.afib.AFibType r9, long r10, long r12, qm0.d r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.withings.wiscale2.heart.afib.k
            if (r0 == 0) goto L14
            r0 = r14
            com.withings.wiscale2.heart.afib.k r0 = (com.withings.wiscale2.heart.afib.k) r0
            int r1 = r0.f57188d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f57188d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.wiscale2.heart.afib.k r0 = new com.withings.wiscale2.heart.afib.k
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f57186b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f57188d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.withings.wiscale2.heart.afib.AFibType r9 = r7.f57185a
            nm0.l.b(r14)
            goto L45
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            nm0.l.b(r14)
            r7.f57185a = r9
            r7.f57188d = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r14 = r1.c(r2, r3, r5, r7)
            if (r14 != r0) goto L45
            return r0
        L45:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = kotlin.collections.x.y(r14, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r14.iterator()
        L56:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L6e
            java.lang.Object r12 = r11.next()
            ky.d r12 = (ky.d) r12
            int r13 = r9.b()
            ky.a r12 = ly.a.d(r13, r12)
            r10.add(r12)
            goto L56
        L6e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.l.b(com.withings.wiscale2.heart.afib.AFibType, long, long, qm0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.withings.wiscale2.heart.afib.AFibType r18, long r19, long r21, qm0.d<? super java.util.List<ky.d>> r23) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.l.c(com.withings.wiscale2.heart.afib.AFibType, long, long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008d -> B:20:0x0097). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.withings.wiscale2.heart.afib.AFibType[] r23, long r24, long r26, qm0.d<? super java.util.List<ky.d>> r28) {
        /*
            r22 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.withings.wiscale2.heart.afib.l.b
            if (r1 == 0) goto L17
            r1 = r0
            com.withings.wiscale2.heart.afib.l$b r1 = (com.withings.wiscale2.heart.afib.l.b) r1
            int r2 = r1.f57207j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f57207j = r2
            r2 = r22
            goto L1e
        L17:
            com.withings.wiscale2.heart.afib.l$b r1 = new com.withings.wiscale2.heart.afib.l$b
            r2 = r22
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.f57205h
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r4 = r1.f57207j
            r5 = 1
            if (r4 == 0) goto L4e
            if (r4 != r5) goto L46
            int r4 = r1.f57204g
            int r6 = r1.f57203f
            long r7 = r1.f57202e
            long r9 = r1.f57201d
            java.util.Collection r11 = r1.f57200c
            java.util.Collection r11 = (java.util.Collection) r11
            com.withings.wiscale2.heart.afib.AFibType[] r12 = r1.f57199b
            com.withings.wiscale2.heart.afib.l r13 = r1.f57198a
            nm0.l.b(r0)
            r15 = r1
            r1 = r11
            r11 = r13
            r13 = r7
            r20 = r12
            r12 = r4
            r4 = r20
            goto L97
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4e:
            nm0.l.b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4 = r23
            int r6 = r4.length
            r7 = 0
            r13 = r26
            r16 = r0
            r15 = r1
            r11 = r2
            r12 = r6
            r10 = r7
            r0 = r24
        L64:
            if (r10 >= r12) goto La8
            r7 = r4[r10]
            r15.f57198a = r11
            r15.f57199b = r4
            r6 = r16
            java.util.Collection r6 = (java.util.Collection) r6
            r15.f57200c = r6
            r15.f57201d = r0
            r15.f57202e = r13
            r15.f57203f = r10
            r15.f57204g = r12
            r15.f57207j = r5
            r6 = r11
            r8 = r0
            r17 = r10
            r18 = r11
            r10 = r13
            r19 = r12
            r12 = r15
            java.lang.Object r6 = r6.c(r7, r8, r10, r12)
            if (r6 != r3) goto L8d
            return r3
        L8d:
            r9 = r0
            r0 = r6
            r1 = r16
            r6 = r17
            r11 = r18
            r12 = r19
        L97:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.x.n(r0, r1)
            int r0 = r6 + 1
            r16 = r1
            r20 = r9
            r10 = r0
            r0 = r20
            goto L64
        La8:
            java.util.List r16 = (java.util.List) r16
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.l.d(com.withings.wiscale2.heart.afib.AFibType[], long, long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r10, qm0.d r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.withings.wiscale2.heart.afib.n
            if (r0 == 0) goto L14
            r0 = r12
            com.withings.wiscale2.heart.afib.n r0 = (com.withings.wiscale2.heart.afib.n) r0
            int r1 = r0.f57216d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f57216d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.withings.wiscale2.heart.afib.n r0 = new com.withings.wiscale2.heart.afib.n
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f57214b
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f57216d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            boolean r10 = r7.f57213a
            nm0.l.b(r12)
            goto L4a
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            nm0.l.b(r12)
            com.withings.wiscale2.heart.afib.AFibType r12 = com.withings.wiscale2.heart.afib.AFibType.f57110d
            r8 = 0
            r7.f57213a = r8
            r7.f57216d = r2
            r3 = 0
            r1 = r9
            r2 = r12
            r5 = r10
            java.io.Serializable r12 = r1.b(r2, r3, r5, r7)
            if (r12 != r0) goto L49
            return r0
        L49:
            r10 = r8
        L4a:
            java.util.List r12 = (java.util.List) r12
            if (r10 == 0) goto L59
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            com.withings.wiscale2.heart.afib.m r10 = new com.withings.wiscale2.heart.afib.m
            r10.<init>()
            java.util.List r12 = kotlin.collections.x.D0(r12, r10)
        L59:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.l.e(long, qm0.d):java.lang.Object");
    }
}
