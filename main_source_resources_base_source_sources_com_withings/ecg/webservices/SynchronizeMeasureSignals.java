package com.withings.ecg.webservices;

import android.content.Context;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementFixer;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
import com.withings.user.User;
import com.withings.webservices.legacy.WsFailer;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import cp0.e0;
import cp0.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import mq.f;
import nm0.j;
import org.joda.time.DateTime;
import pm0.a;
/* compiled from: SynchronizeMeasureSignals.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B?\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b6\u00107J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104¨\u00069"}, d2 = {"Lcom/withings/ecg/webservices/SynchronizeMeasureSignals;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "heartSignalMeasurement", "Lnm0/y;", "deleteRelatedEntities", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)V", "deleteMeasurement", "(Lcom/withings/ecg/model/HeartSignalMeasurement;Lqm0/d;)Ljava/lang/Object;", "softDeleteNoteGroup", "", "localLastUpdate", "insertOrUpdateSignals", "(J)V", "resolveConflicts", "()V", "Lorg/joda/time/DateTime;", "", "Lcom/withings/ecg/webservices/SignalResponse;", "fetchSignals", "(Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "run", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "Lcom/withings/ecg/model/HeartSignalRepository;", "repository", "Lcom/withings/ecg/model/HeartSignalRepository;", "Lcom/withings/note/model/NoteRepository;", "noteRepository", "Lcom/withings/note/model/NoteRepository;", "Lmq/f;", "signalFileProvider", "Lmq/f;", "Lcom/withings/ecg/model/HeartSignalMeasurementFixer;", "heartSignalMeasurementFixer", "Lcom/withings/ecg/model/HeartSignalMeasurementFixer;", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "signalRemoteRepository", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "wsUpdatedSignals", "Ljava/util/List;", "notSynchronizedSignals", "<init>", "(Landroid/content/Context;Lcom/withings/user/User;Lcom/withings/ecg/model/HeartSignalRepository;Lcom/withings/note/model/NoteRepository;Lmq/f;Lcom/withings/ecg/model/HeartSignalMeasurementFixer;Lcom/withings/ecg/webservices/SignalRemoteRepository;)V", "Companion", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SynchronizeMeasureSignals extends BaseSyncAction {
    private static final int NUMBER_OF_SIGNALS_TO_DOWNLOAD = 7;
    private final Context context;
    private final HeartSignalMeasurementFixer heartSignalMeasurementFixer;
    private List<HeartSignalMeasurement> notSynchronizedSignals;
    private final NoteRepository noteRepository;
    private final HeartSignalRepository repository;
    private final f signalFileProvider;
    private final SignalRemoteRepository signalRemoteRepository;
    private final User user;
    private List<HeartSignalMeasurement> wsUpdatedSignals;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SynchronizeMeasureSignals.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/webservices/SynchronizeMeasureSignals$Companion;", "", "()V", "NUMBER_OF_SIGNALS_TO_DOWNLOAD", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public SynchronizeMeasureSignals(Context context, User user, HeartSignalRepository repository, NoteRepository noteRepository, f signalFileProvider, HeartSignalMeasurementFixer heartSignalMeasurementFixer, SignalRemoteRepository signalRemoteRepository) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(repository, "repository");
        u.j(noteRepository, "noteRepository");
        u.j(signalFileProvider, "signalFileProvider");
        u.j(heartSignalMeasurementFixer, "heartSignalMeasurementFixer");
        u.j(signalRemoteRepository, "signalRemoteRepository");
        this.context = context;
        this.user = user;
        this.repository = repository;
        this.noteRepository = noteRepository;
        this.signalFileProvider = signalFileProvider;
        this.heartSignalMeasurementFixer = heartSignalMeasurementFixer;
        this.signalRemoteRepository = signalRemoteRepository;
        i0 i0Var = i0.f76187a;
        this.wsUpdatedSignals = i0Var;
        this.notSynchronizedSignals = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|8|(1:(2:11|12)(2:18|19))(5:20|21|(3:23|(1:25)(1:31)|(2:27|(1:29)(1:30)))|14|15)|13|14|15))|34|6|7|8|(0)(0)|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        nm0.l.a(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteMeasurement(com.withings.ecg.model.HeartSignalMeasurement r9, qm0.d<? super nm0.y> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.withings.ecg.webservices.SynchronizeMeasureSignals$deleteMeasurement$1
            if (r0 == 0) goto L14
            r0 = r10
            com.withings.ecg.webservices.SynchronizeMeasureSignals$deleteMeasurement$1 r0 = (com.withings.ecg.webservices.SynchronizeMeasureSignals$deleteMeasurement$1) r0
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
            com.withings.ecg.webservices.SynchronizeMeasureSignals$deleteMeasurement$1 r0 = new com.withings.ecg.webservices.SynchronizeMeasureSignals$deleteMeasurement$1
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.label
            r7 = 1
            if (r1 == 0) goto L3b
            if (r1 != r7) goto L33
            java.lang.Object r9 = r6.L$1
            com.withings.ecg.model.HeartSignalMeasurement r9 = (com.withings.ecg.model.HeartSignalMeasurement) r9
            java.lang.Object r0 = r6.L$0
            com.withings.ecg.webservices.SynchronizeMeasureSignals r0 = (com.withings.ecg.webservices.SynchronizeMeasureSignals) r0
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L76
        L31:
            r9 = move-exception
            goto L82
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            nm0.l.b(r10)
            com.withings.ecg.model.Signal r10 = r9.getSignal()     // Catch: java.lang.Throwable -> L31
            java.lang.Long r10 = r10.getSignalId()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L85
            long r1 = r9.getModified()     // Catch: java.lang.Throwable -> L31
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L53
            goto L54
        L53:
            r10 = 0
        L54:
            if (r10 == 0) goto L85
            long r4 = r10.longValue()     // Catch: java.lang.Throwable -> L31
            com.withings.ecg.webservices.SignalRemoteRepository r10 = r8.signalRemoteRepository     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r8.getSyncContext()     // Catch: java.lang.Throwable -> L31
            com.withings.ecg.webservices.SignalRemoteRepository r1 = r10.withSyncContext(r1)     // Catch: java.lang.Throwable -> L31
            long r2 = r9.getUserID()     // Catch: java.lang.Throwable -> L31
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L31
            r6.L$1 = r9     // Catch: java.lang.Throwable -> L31
            r6.label = r7     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r1.deleteSignal(r2, r4, r6)     // Catch: java.lang.Throwable -> L31
            if (r10 != r0) goto L75
            return r0
        L75:
            r0 = r8
        L76:
            com.withings.ecg.model.HeartSignalRepository r10 = r0.repository     // Catch: java.lang.Throwable -> L31
            long r0 = r9.getId()     // Catch: java.lang.Throwable -> L31
            r10.flagAsDeletedById(r0, r7)     // Catch: java.lang.Throwable -> L31
            nm0.y r9 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L31
            goto L85
        L82:
            nm0.l.a(r9)
        L85:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.webservices.SynchronizeMeasureSignals.deleteMeasurement(com.withings.ecg.model.HeartSignalMeasurement, qm0.d):java.lang.Object");
    }

    private final void deleteRelatedEntities(HeartSignalMeasurement heartSignalMeasurement) {
        softDeleteNoteGroup(heartSignalMeasurement);
        this.signalFileProvider.b(heartSignalMeasurement.getSignal().getMeta().getType(), heartSignalMeasurement.getTimestamp().getMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b0 -> B:32:0x00b3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSignals(org.joda.time.DateTime r14, qm0.d<? super java.util.List<com.withings.ecg.webservices.SignalResponse>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.withings.ecg.webservices.SynchronizeMeasureSignals$fetchSignals$1
            if (r0 == 0) goto L13
            r0 = r15
            com.withings.ecg.webservices.SynchronizeMeasureSignals$fetchSignals$1 r0 = (com.withings.ecg.webservices.SynchronizeMeasureSignals$fetchSignals$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.ecg.webservices.SynchronizeMeasureSignals$fetchSignals$1 r0 = new com.withings.ecg.webservices.SynchronizeMeasureSignals$fetchSignals$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.L$2
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r2 = r0.L$1
            org.joda.time.DateTime r2 = (org.joda.time.DateTime) r2
            java.lang.Object r4 = r0.L$0
            com.withings.ecg.webservices.SynchronizeMeasureSignals r4 = (com.withings.ecg.webservices.SynchronizeMeasureSignals) r4
            nm0.l.b(r15)
            r12 = r2
            r2 = r14
            r14 = r12
            goto Lb3
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            nm0.l.b(r15)
            com.withings.webservices.legacy.lastupdate.LastUpdate r15 = r13.getLastUpdate()
            r4 = 0
            if (r15 == 0) goto L5c
            com.withings.user.User r2 = r13.user
            long r6 = r2.q()
            com.withings.webservices.legacy.lastupdate.UserLastUpdate r15 = r15.getUser(r6)
            if (r15 == 0) goto L5c
            org.joda.time.DateTime r15 = r15.getSignal()
            if (r15 != 0) goto L61
        L5c:
            org.joda.time.DateTime r15 = new org.joda.time.DateTime
            r15.<init>(r4)
        L61:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            long r6 = r15.getMillis()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto Lcd
            org.joda.time.DateTime r6 = new org.joda.time.DateTime
            r6.<init>(r4)
            boolean r4 = kotlin.jvm.internal.u.e(r14, r6)
            if (r4 != 0) goto L7f
            boolean r15 = r14.isBefore(r15)
            if (r15 == 0) goto Lcd
        L7f:
            r15 = 0
            r7 = r15
            r15 = r13
        L82:
            com.withings.ecg.webservices.SignalRemoteRepository r4 = r15.signalRemoteRepository
            java.lang.String r5 = r15.getSyncContext()
            com.withings.ecg.webservices.SignalRemoteRepository r4 = r4.withSyncContext(r5)
            com.withings.user.User r5 = r15.user
            long r5 = r5.q()
            long r8 = r14.getMillis()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r10
            long r8 = r8 / r10
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            r0.L$0 = r15
            r0.L$1 = r14
            r0.L$2 = r2
            r0.label = r3
            r8 = r10
            r9 = r0
            java.lang.Object r4 = r4.getSignals(r5, r7, r8, r9)
            if (r4 != r1) goto Lb0
            return r1
        Lb0:
            r12 = r4
            r4 = r15
            r15 = r12
        Lb3:
            com.withings.ecg.webservices.GetSignalsResponse r15 = (com.withings.ecg.webservices.GetSignalsResponse) r15
            java.util.List r5 = r15.getSignals()
            if (r5 == 0) goto Lc0
            java.util.Collection r5 = (java.util.Collection) r5
            r2.addAll(r5)
        Lc0:
            int r7 = r15.getOffset()
            boolean r15 = com.withings.ecg.webservices.ModelsKt.hasMore(r15)
            if (r15 != 0) goto Lcb
            return r2
        Lcb:
            r15 = r4
            goto L82
        Lcd:
            kotlin.collections.i0 r14 = kotlin.collections.i0.f76187a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.webservices.SynchronizeMeasureSignals.fetchSignals(org.joda.time.DateTime, qm0.d):java.lang.Object");
    }

    private final void insertOrUpdateSignals(long j5) {
        e0 y11 = n.y(n.h(x.t(this.wsUpdatedSignals), new SynchronizeMeasureSignals$insertOrUpdateSignals$1(j5)), new Comparator() { // from class: com.withings.ecg.webservices.SynchronizeMeasureSignals$insertOrUpdateSignals$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(((HeartSignalMeasurement) t12).getSignal().getSignalId(), ((HeartSignalMeasurement) t11).getSignal().getSignalId());
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Object> it = y11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Integer valueOf = Integer.valueOf(((HeartSignalMeasurement) next).getSignal().getMeta().getType());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = com.google.android.gms.internal.mlkit_common.a.d(linkedHashMap, valueOf);
            }
            ((List) obj).add(next);
        }
        for (List list : linkedHashMap.values()) {
            int i11 = 0;
            int i12 = 0;
            for (Object obj2 : list) {
                int i13 = i11 + 1;
                if (i11 >= 0) {
                    HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) obj2;
                    heartSignalMeasurement.setId(this.repository.insertOrUpdate(heartSignalMeasurement));
                    if (heartSignalMeasurement.getSignal().getSignalId() != null) {
                        if (i12 < 7) {
                            run(new GetSignalData(this.context, heartSignalMeasurement, this.repository, this.signalRemoteRepository));
                            i12++;
                        }
                        BuildersKt__BuildersKt.runBlocking$default(null, new SynchronizeMeasureSignals$insertOrUpdateSignals$4$1$1$1$1(this, heartSignalMeasurement, null), 1, null);
                    }
                    i11 = i13;
                } else {
                    x.K0();
                    throw null;
                }
            }
        }
    }

    private final void resolveConflicts() {
        Object obj;
        for (HeartSignalMeasurement heartSignalMeasurement : x.u0(this.notSynchronizedSignals)) {
            Iterator<T> it = this.wsUpdatedSignals.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    HeartSignalMeasurement heartSignalMeasurement2 = (HeartSignalMeasurement) obj;
                    if (u.e(heartSignalMeasurement2.getSignal().getSignalId(), heartSignalMeasurement.getSignal().getSignalId()) || heartSignalMeasurement2.getTimestamp().getMillis() == heartSignalMeasurement.getTimestamp().getMillis()) {
                        if (heartSignalMeasurement2.getSignal().getMeta().getType() == heartSignalMeasurement.getSignal().getMeta().getType()) {
                            break;
                        }
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            HeartSignalMeasurement heartSignalMeasurement3 = (HeartSignalMeasurement) obj;
            if (heartSignalMeasurement3 != null) {
                if (new DateTime(heartSignalMeasurement3.getModified()).isAfter(heartSignalMeasurement.getModified())) {
                    heartSignalMeasurement3.setId(heartSignalMeasurement.getId());
                    this.notSynchronizedSignals = x.g0(this.notSynchronizedSignals, heartSignalMeasurement);
                } else {
                    heartSignalMeasurement.getSignal().setSignalId(heartSignalMeasurement3.getSignal().getSignalId());
                    this.wsUpdatedSignals = x.g0(this.wsUpdatedSignals, heartSignalMeasurement3);
                }
            }
        }
    }

    private final void softDeleteNoteGroup(HeartSignalMeasurement heartSignalMeasurement) {
        NoteGroup localNoteGroupForId = this.noteRepository.getLocalNoteGroupForId(heartSignalMeasurement.getId());
        if (localNoteGroupForId != null) {
            this.noteRepository.softDeleteNoteGroup(localNoteGroupForId);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof SynchronizeMeasureSignals) && this.user.q() == ((SynchronizeMeasureSignals) obj).user.q()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) this.user.q();
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        List<HeartSignalMeasurement> notSyncedSignalsForUserId;
        Object runBlocking$default;
        if (this.user.D()) {
            notSyncedSignalsForUserId = i0.f76187a;
        } else {
            notSyncedSignalsForUserId = this.repository.getNotSyncedSignalsForUserId(this.user.q());
        }
        this.notSynchronizedSignals = notSyncedSignalsForUserId;
        long lastModifiedSyncedToWsForUserId = this.repository.getLastModifiedSyncedToWsForUserId(this.user.q());
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SynchronizeMeasureSignals$run$1(this, lastModifiedSyncedToWsForUserId, null), 1, null);
        this.wsUpdatedSignals = (List) runBlocking$default;
        resolveConflicts();
        insertOrUpdateSignals(lastModifiedSyncedToWsForUserId);
        if (!this.user.D()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : this.notSynchronizedSignals) {
                if (((HeartSignalMeasurement) obj).getDeleted()) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            j jVar = new j(arrayList, arrayList2);
            List list = (List) jVar.b();
            for (HeartSignalMeasurement heartSignalMeasurement : (List) jVar.a()) {
                try {
                    BuildersKt__BuildersKt.runBlocking$default(null, new SynchronizeMeasureSignals$run$3$1(this, heartSignalMeasurement, null), 1, null);
                    deleteRelatedEntities(heartSignalMeasurement);
                } catch (Exception e11) {
                    WsFailer.failWithException(e11);
                }
            }
            run(new SendSignals(this.context, this.user, this.repository, this.noteRepository, list, this.signalRemoteRepository));
        }
    }
}
