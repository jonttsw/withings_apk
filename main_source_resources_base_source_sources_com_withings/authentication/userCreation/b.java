package com.withings.authentication.userCreation;

import com.withings.webservices.legacy.sync.SyncJob;
import nm0.y;
/* compiled from: UserCreationViewModel.kt */
/* loaded from: classes3.dex */
final class b implements SyncJob.Listener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ qm0.d<y> f32500a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(qm0.i iVar) {
        this.f32500a = iVar;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
    public final void onSyncJobDone(SyncJob syncJob, int i11) {
        qm0.d<y> dVar = this.f32500a;
        if (i11 == 2) {
            dVar.resumeWith(y.f85009a);
        } else {
            dVar.resumeWith(nm0.l.a(new IllegalStateException(android.support.v4.media.a.a("Account creation unexpected status: ", i11))));
        }
    }
}
