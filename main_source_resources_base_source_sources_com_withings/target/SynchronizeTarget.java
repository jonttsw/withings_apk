package com.withings.target;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.target.data.TargetRepository;
import com.withings.target.data.api.TargetRemoteRepository;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.g;
import nm0.h;
import r70.c;
/* compiled from: SynchronizeTarget.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u00100\u001a\u00020*¢\u0006\u0004\b1\u00102J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/withings/target/SynchronizeTarget;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lorg/joda/time/DateTime;", "localLastUpdate", "Lnm0/y;", "getTargetFromApi", "(Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "saveUnsyncedWithApi", "(Lqm0/d;)Ljava/lang/Object;", "", "Lcom/withings/target/Target;", "targetsToSync", "sendDeactivatedTargets", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "target", "sendDeactivatedTarget", "(Lcom/withings/target/Target;Lqm0/d;)Ljava/lang/Object;", "list", "sendNewNotSyncedTargets", "run", "()V", "", "needsLastUpdate", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/withings/target/data/TargetRepository;", "repository", "Lcom/withings/target/data/TargetRepository;", "Lr70/c;", "userRepository", "Lr70/c;", "", NavigationArguments.USER_ID, "J", "getUserId", "()J", "Lcom/withings/target/data/api/TargetRemoteRepository;", "remoteRepoWithContext$delegate", "Lnm0/g;", "getRemoteRepoWithContext", "()Lcom/withings/target/data/api/TargetRemoteRepository;", "remoteRepoWithContext", "remoteRepository", "<init>", "(Lcom/withings/target/data/TargetRepository;Lr70/c;JLcom/withings/target/data/api/TargetRemoteRepository;)V", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SynchronizeTarget extends BaseSyncAction {
    private final g remoteRepoWithContext$delegate;
    private final TargetRepository repository;
    private final long userId;
    private final c userRepository;

    public SynchronizeTarget(TargetRepository repository, c userRepository, long j5, TargetRemoteRepository remoteRepository) {
        u.j(repository, "repository");
        u.j(userRepository, "userRepository");
        u.j(remoteRepository, "remoteRepository");
        this.repository = repository;
        this.userRepository = userRepository;
        this.userId = j5;
        this.remoteRepoWithContext$delegate = h.b(new SynchronizeTarget$remoteRepoWithContext$2(remoteRepository, this));
    }

    private final TargetRemoteRepository getRemoteRepoWithContext() {
        return (TargetRemoteRepository) this.remoteRepoWithContext$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTargetFromApi(org.joda.time.DateTime r9, qm0.d<? super nm0.y> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.target.SynchronizeTarget$getTargetFromApi$1
            if (r0 == 0) goto L14
            r0 = r10
            com.withings.target.SynchronizeTarget$getTargetFromApi$1 r0 = (com.withings.target.SynchronizeTarget$getTargetFromApi$1) r0
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
            com.withings.target.SynchronizeTarget$getTargetFromApi$1 r0 = new com.withings.target.SynchronizeTarget$getTargetFromApi$1
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.label
            r7 = 1
            if (r1 == 0) goto L39
            if (r1 != r7) goto L31
            java.lang.Object r9 = r6.L$1
            org.joda.time.DateTime r9 = (org.joda.time.DateTime) r9
            java.lang.Object r0 = r6.L$0
            com.withings.target.SynchronizeTarget r0 = (com.withings.target.SynchronizeTarget) r0
            nm0.l.b(r10)
            goto L73
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            nm0.l.b(r10)
            com.withings.webservices.legacy.lastupdate.LastUpdate r10 = r8.getLastUpdate()
            if (r10 == 0) goto L86
            long r1 = r8.userId
            com.withings.webservices.legacy.lastupdate.UserLastUpdate r10 = r10.getUser(r1)
            if (r10 == 0) goto L86
            org.joda.time.DateTime r10 = r10.getTarget()
            if (r10 == 0) goto L86
            boolean r10 = com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt.shouldMakeCallForLastUpdate(r10, r9)
            if (r10 != r7) goto L86
            long r1 = r9.getMillis()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r10
            long r4 = r1 / r3
            com.withings.target.data.api.TargetRemoteRepository r1 = r8.getRemoteRepoWithContext()
            long r2 = r8.userId
            r6.L$0 = r8
            r6.L$1 = r9
            r6.label = r7
            java.lang.Object r10 = r1.get(r2, r4, r6)
            if (r10 != r0) goto L72
            return r0
        L72:
            r0 = r8
        L73:
            com.withings.target.data.api.model.TargetSeriesWS r10 = (com.withings.target.data.api.model.TargetSeriesWS) r10
            com.withings.target.data.TargetRepository r1 = r0.repository
            long r2 = r0.userId
            java.util.List r9 = r1.getAllTargetForUserSince(r2, r9)
            com.withings.target.SynchronizeTarget$getTargetFromApi$2 r1 = new com.withings.target.SynchronizeTarget$getTargetFromApi$2
            r2 = 0
            r1.<init>(r0, r10, r9, r2)
            kotlinx.coroutines.BuildersKt.runBlocking$default(r2, r1, r7, r2)
        L86:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.SynchronizeTarget.getTargetFromApi(org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveUnsyncedWithApi(qm0.d<? super nm0.y> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.withings.target.SynchronizeTarget$saveUnsyncedWithApi$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.target.SynchronizeTarget$saveUnsyncedWithApi$1 r0 = (com.withings.target.SynchronizeTarget$saveUnsyncedWithApi$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.target.SynchronizeTarget$saveUnsyncedWithApi$1 r0 = new com.withings.target.SynchronizeTarget$saveUnsyncedWithApi$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r8)
            goto L6f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            com.withings.target.SynchronizeTarget r4 = (com.withings.target.SynchronizeTarget) r4
            nm0.l.b(r8)
            goto L61
        L3e:
            nm0.l.b(r8)
            com.withings.target.data.TargetRepository r8 = r7.repository
            long r5 = r7.userId
            java.util.List r2 = r8.getTargetsToSync(r5)
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r4
            if (r8 == 0) goto L72
            r0.L$0 = r7
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r8 = r7.sendDeactivatedTargets(r2, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r4 = r7
        L61:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = r4.sendNewNotSyncedTargets(r2, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            nm0.y r8 = nm0.y.f85009a
            return r8
        L72:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.SynchronizeTarget.saveUnsyncedWithApi(qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002e, B:30:0x0071, B:32:0x0079), top: B:52:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendDeactivatedTarget(com.withings.target.Target r32, qm0.d<? super com.withings.target.Target> r33) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.SynchronizeTarget.sendDeactivatedTarget(com.withings.target.Target, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009a -> B:30:0x009d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendDeactivatedTargets(java.util.List<com.withings.target.Target> r9, qm0.d<? super nm0.y> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.target.SynchronizeTarget$sendDeactivatedTargets$1
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.target.SynchronizeTarget$sendDeactivatedTargets$1 r0 = (com.withings.target.SynchronizeTarget$sendDeactivatedTargets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.target.SynchronizeTarget$sendDeactivatedTargets$1 r0 = new com.withings.target.SynchronizeTarget$sendDeactivatedTargets$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r10)
            goto Lbf
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.L$3
            com.withings.target.data.TargetRepository r9 = (com.withings.target.data.TargetRepository) r9
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$0
            com.withings.target.SynchronizeTarget r6 = (com.withings.target.SynchronizeTarget) r6
            nm0.l.b(r10)
            goto L9d
        L47:
            nm0.l.b(r10)
            com.withings.target.data.TargetRepository r10 = r8.repository
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L57:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.withings.target.Target r6 = (com.withings.target.Target) r6
            int r7 = r6.getMantissa()
            if (r7 == 0) goto L70
            boolean r6 = r6.isActive()
            if (r6 != 0) goto L57
        L70:
            r2.add(r5)
            goto L57
        L74:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
            r6 = r8
            r5 = r9
            r9 = r10
        L80:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto La5
            java.lang.Object r10 = r2.next()
            com.withings.target.Target r10 = (com.withings.target.Target) r10
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r10 = r6.sendDeactivatedTarget(r10, r0)
            if (r10 != r1) goto L9d
            return r1
        L9d:
            com.withings.target.Target r10 = (com.withings.target.Target) r10
            if (r10 == 0) goto L80
            r5.add(r10)
            goto L80
        La5:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r10 = kotlin.collections.x.Q0(r5)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r9 = r9.saveTargets(r10, r0)
            if (r9 != r1) goto Lbf
            return r1
        Lbf:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.SynchronizeTarget.sendDeactivatedTargets(java.util.List, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de A[Catch: all -> 0x005f, TryCatch #2 {all -> 0x005f, blocks: (B:22:0x005a, B:43:0x00d0, B:44:0x00d8, B:46:0x00de, B:47:0x00ef, B:49:0x00f5, B:51:0x0116, B:53:0x0120, B:58:0x012f, B:60:0x0135, B:62:0x015f, B:66:0x018a, B:65:0x0166, B:67:0x0191), top: B:96:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendNewNotSyncedTargets(java.util.List<com.withings.target.Target> r51, qm0.d<? super nm0.y> r52) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.SynchronizeTarget.sendNewNotSyncedTargets(java.util.List, qm0.d):java.lang.Object");
    }

    public boolean equals(Object obj) {
        SynchronizeTarget synchronizeTarget;
        if (obj instanceof SynchronizeTarget) {
            synchronizeTarget = (SynchronizeTarget) obj;
        } else {
            synchronizeTarget = null;
        }
        if (synchronizeTarget == null || this.userId != synchronizeTarget.userId) {
            return false;
        }
        return true;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (int) this.userId;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction
    public boolean needsLastUpdate() {
        return true;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        BuildersKt__BuildersKt.runBlocking$default(null, new SynchronizeTarget$run$1(this, null), 1, null);
    }
}
