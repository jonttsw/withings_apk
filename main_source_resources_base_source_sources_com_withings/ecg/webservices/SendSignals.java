package com.withings.ecg.webservices;

import android.content.Context;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SendSignals.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/withings/ecg/webservices/SendSignals;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "heartSignal", "Lnm0/y;", "updateNoteGroupForMeasurement", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)V", "heartSignalMeasurement", "", "signal", "", "deviceId", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "sendSignal", "(Lcom/withings/ecg/model/HeartSignalMeasurement;[BJLqm0/d;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "run", "()V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "Lcom/withings/ecg/model/HeartSignalRepository;", "heartSignalRepository", "Lcom/withings/ecg/model/HeartSignalRepository;", "Lcom/withings/note/model/NoteRepository;", "noteRepository", "Lcom/withings/note/model/NoteRepository;", "", "signalsToSync", "Ljava/util/List;", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "signalRemoteRepository", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "<init>", "(Landroid/content/Context;Lcom/withings/user/User;Lcom/withings/ecg/model/HeartSignalRepository;Lcom/withings/note/model/NoteRepository;Ljava/util/List;Lcom/withings/ecg/webservices/SignalRemoteRepository;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendSignals extends BaseSyncAction {
    public static final int $stable = 8;
    private final Context context;
    private final HeartSignalRepository heartSignalRepository;
    private final NoteRepository noteRepository;
    private final SignalRemoteRepository signalRemoteRepository;
    private final List<HeartSignalMeasurement> signalsToSync;
    private final User user;

    public SendSignals(Context context, User user, HeartSignalRepository heartSignalRepository, NoteRepository noteRepository, List<HeartSignalMeasurement> list, SignalRemoteRepository signalRemoteRepository) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(heartSignalRepository, "heartSignalRepository");
        u.j(noteRepository, "noteRepository");
        u.j(signalRemoteRepository, "signalRemoteRepository");
        this.context = context;
        this.user = user;
        this.heartSignalRepository = heartSignalRepository;
        this.noteRepository = noteRepository;
        this.signalsToSync = list;
        this.signalRemoteRepository = signalRemoteRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(1:(4:9|10|11|12)(2:37|38))(2:39|(9:41|42|43|44|45|46|47|48|(1:50)(1:51))(1:61))|13|14|15|(1:24)|25|(1:27)|28|29))|62|6|(0)(0)|13|14|15|(2:17|24)|25|(0)|28|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0134, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSignal(com.withings.ecg.model.HeartSignalMeasurement r33, byte[] r34, long r35, qm0.d<? super com.withings.ecg.webservices.StoreSignalResponse> r37) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.webservices.SendSignals.sendSignal(com.withings.ecg.model.HeartSignalMeasurement, byte[], long, qm0.d):java.lang.Object");
    }

    private final void updateNoteGroupForMeasurement(HeartSignalMeasurement heartSignalMeasurement) {
        NoteGroup localNoteGroupForId = this.noteRepository.getLocalNoteGroupForId(heartSignalMeasurement.getId());
        if (localNoteGroupForId != null) {
            localNoteGroupForId.setSignalId(heartSignalMeasurement.getSignal().getSignalId());
            localNoteGroupForId.setSynced(false);
            this.noteRepository.update(localNoteGroupForId);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof SendSignals) {
            SendSignals sendSignals = (SendSignals) obj;
            if (this.user.q() == sendSignals.user.q() && u.e(this.signalsToSync, sendSignals.signalsToSync)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) this.user.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            java.util.List<com.withings.ecg.model.HeartSignalMeasurement> r0 = r8.signalsToSync
            if (r0 == 0) goto Lca
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.withings.ecg.model.HeartSignalMeasurement r3 = (com.withings.ecg.model.HeartSignalMeasurement) r3
            java.lang.Long r3 = r3.getDeviceId()
            if (r3 != 0) goto L23
            goto Lf
        L23:
            r1.add(r2)
            goto Lf
        L27:
            java.util.Iterator r0 = r1.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.next()
            com.withings.ecg.model.HeartSignalMeasurement r1 = (com.withings.ecg.model.HeartSignalMeasurement) r1
            com.withings.ecg.model.Signal r2 = r1.getSignal()
            com.withings.ecg.model.SignalMeta r2 = r2.getMeta()
            int r2 = r2.getType()
            r3 = 13
            r4 = 0
            if (r2 == r3) goto L62
            switch(r2) {
                case 1: goto L62;
                case 2: goto L5a;
                case 3: goto L4d;
                case 4: goto L4d;
                case 5: goto L4d;
                case 6: goto L62;
                case 7: goto L62;
                case 8: goto L62;
                case 9: goto L4d;
                default: goto L4b;
            }
        L4b:
            r2 = r4
            goto L69
        L4d:
            mq.b r2 = new mq.b
            android.content.Context r3 = r8.context
            java.lang.String r5 = "context"
            kotlin.jvm.internal.u.j(r3, r5)
            r2.<init>(r3)
            goto L69
        L5a:
            mq.i r2 = new mq.i
            android.content.Context r3 = r8.context
            r2.<init>(r3)
            goto L69
        L62:
            mq.c r2 = new mq.c
            android.content.Context r3 = r8.context
            r2.<init>(r3)
        L69:
            r3 = 1
            if (r2 == 0) goto L90
            org.joda.time.DateTime r5 = r1.getTimestamp()
            long r5 = r5.getMillis()
            com.withings.ecg.model.Signal r7 = r1.getSignal()
            com.withings.ecg.model.SignalMeta r7 = r7.getMeta()
            int r7 = r7.getType()
            byte[] r2 = r2.b(r7, r5)
            com.withings.ecg.webservices.SendSignals$run$2$1$response$1$1 r5 = new com.withings.ecg.webservices.SendSignals$run$2$1$response$1$1
            r5.<init>(r8, r1, r2, r4)
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.runBlocking$default(r4, r5, r3, r4)
            com.withings.ecg.webservices.StoreSignalResponse r2 = (com.withings.ecg.webservices.StoreSignalResponse) r2
            goto L91
        L90:
            r2 = r4
        L91:
            com.withings.ecg.model.Signal r5 = r1.getSignal()
            if (r2 == 0) goto La5
            com.withings.ecg.webservices.StoreSignal r6 = r2.getSignal()
            if (r6 == 0) goto La5
            long r6 = r6.getSignalid()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
        La5:
            r5.setSignalId(r4)
            if (r2 == 0) goto Lbd
            com.withings.ecg.webservices.StoreSignal r2 = r2.getSignal()
            if (r2 == 0) goto Lbd
            org.joda.time.DateTime r2 = r2.getModified()
            if (r2 == 0) goto Lbd
            long r4 = r2.getMillis()
            r1.setModified(r4)
        Lbd:
            r1.setSynced(r3)
            com.withings.ecg.model.HeartSignalRepository r2 = r8.heartSignalRepository
            r2.update(r1)
            r8.updateNoteGroupForMeasurement(r1)
            goto L2b
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.webservices.SendSignals.run():void");
    }
}
