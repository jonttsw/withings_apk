package com.withings.factor.remote.repository;

import com.withings.factor.remote.repository.api.FactorRetrofit1Api;
import com.withings.factor.remote.repository.api.FactorRetrofit2Api;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitRemoteFactorRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/withings/factor/remote/repository/RetrofitRemoteFactorRepository;", "Lcom/withings/factor/remote/repository/RemoteFactorRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/factor/remote/repository/RemoteFactorRepository;", "", NavigationArguments.USER_ID, "lastUpdateInSeconds", "", "Lcom/withings/factor/remote/model/WsFactor;", "get", "(JLjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "", "factorType", "startDateInSeconds", "endDateInSeconds", "numberOfPills", "store", "(JIJLjava/lang/Long;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "factorId", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(JJJLjava/lang/Long;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "updateEnd", "(JJJLqm0/d;)Ljava/lang/Object;", "delete", "(JJLqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/factor/remote/repository/api/FactorRetrofit1Api;", "Lcom/withings/factor/remote/repository/api/FactorRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitRemoteFactorRepository implements RemoteFactorRepository {
    private final a<FactorRetrofit1Api, FactorRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitRemoteFactorRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, FactorRetrofit1Api.class, FactorRetrofit2Api.class);
    }

    @Override // com.withings.factor.remote.repository.RemoteFactorRepository
    public Object delete(long j5, long j11, d<? super y> dVar) {
        Object d11 = a.d(this.compatWS, new RetrofitRemoteFactorRepository$delete$2(j5, j11), new RetrofitRemoteFactorRepository$delete$3(j5, j11, null), null, false, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.withings.factor.remote.repository.RemoteFactorRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r9, java.lang.Long r11, qm0.d<? super java.util.List<com.withings.factor.remote.model.WsFactor>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$1
            if (r0 == 0) goto L14
            r0 = r12
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$1 r0 = (com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$1 r0 = new com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$1
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            nm0.l.b(r12)
            goto L4e
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            nm0.l.b(r12)
            s00.a<com.withings.factor.remote.repository.api.FactorRetrofit1Api, com.withings.factor.remote.repository.api.FactorRetrofit2Api> r1 = r8.compatWS
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$2 r12 = new com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$2
            r12.<init>(r9, r11)
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$3 r3 = new com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$get$3
            r4 = 0
            r3.<init>(r9, r11, r4)
            r6.label = r2
            r5 = 0
            r7 = 124(0x7c, float:1.74E-43)
            r2 = r12
            java.lang.Object r12 = s00.a.d(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L4e
            return r0
        L4e:
            hr.a r12 = (hr.a) r12
            java.util.List r9 = r12.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.factor.remote.repository.RetrofitRemoteFactorRepository.get(long, java.lang.Long, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.withings.factor.remote.repository.RemoteFactorRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object store(long r17, int r19, long r20, java.lang.Long r22, java.lang.Integer r23, qm0.d<? super java.lang.Long> r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            boolean r2 = r1 instanceof com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$1
            if (r2 == 0) goto L17
            r2 = r1
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$1 r2 = (com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$1 r2 = new com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            nm0.l.b(r1)
            goto L6a
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            nm0.l.b(r1)
            s00.a<com.withings.factor.remote.repository.api.FactorRetrofit1Api, com.withings.factor.remote.repository.api.FactorRetrofit2Api> r1 = r0.compatWS
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$2 r4 = new com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$2
            r6 = r4
            r7 = r17
            r9 = r19
            r10 = r20
            r12 = r22
            r13 = r23
            r6.<init>(r7, r9, r10, r12, r13)
            com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$3 r15 = new com.withings.factor.remote.repository.RetrofitRemoteFactorRepository$store$3
            r14 = 0
            r6 = r15
            r6.<init>(r7, r9, r10, r12, r13, r14)
            r2.label = r5
            r5 = 1
            r6 = 124(0x7c, float:1.74E-43)
            r7 = 0
            r17 = r1
            r18 = r4
            r19 = r15
            r20 = r7
            r21 = r5
            r22 = r2
            r23 = r6
            java.lang.Object r1 = s00.a.d(r17, r18, r19, r20, r21, r22, r23)
            if (r1 != r3) goto L6a
            return r3
        L6a:
            hr.b r1 = (hr.b) r1
            r1.getClass()
            java.lang.Long r1 = new java.lang.Long
            r2 = 0
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.factor.remote.repository.RetrofitRemoteFactorRepository.store(long, int, long, java.lang.Long, java.lang.Integer, qm0.d):java.lang.Object");
    }

    @Override // com.withings.factor.remote.repository.RemoteFactorRepository
    public Object update(long j5, long j11, long j12, Long l5, Integer num, d<? super y> dVar) {
        Object d11 = a.d(this.compatWS, new RetrofitRemoteFactorRepository$update$2(j5, j11, j12, l5, num), new RetrofitRemoteFactorRepository$update$3(j5, j11, j12, l5, num, null), null, true, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    @Override // com.withings.factor.remote.repository.RemoteFactorRepository
    public Object updateEnd(long j5, long j11, long j12, d<? super y> dVar) {
        Object d11 = a.d(this.compatWS, new RetrofitRemoteFactorRepository$updateEnd$2(j5, j11, j12), new RetrofitRemoteFactorRepository$updateEnd$3(j5, j11, j12, null), null, true, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    @Override // com.withings.factor.remote.repository.RemoteFactorRepository
    public RemoteFactorRepository withSyncContext(String str) {
        return new RetrofitRemoteFactorRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitRemoteFactorRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
