package com.withings.webservices.legacy.sync;

import bj0.b;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.jvm.internal.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements u70.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46855a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f46856b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f46855a = i11;
        this.f46856b = obj;
    }

    @Override // u70.b
    public final boolean isMatching(Object obj) {
        boolean lambda$isSyncJobAlreadyRunning$5;
        boolean lambda$filterNotChangedCategories$1;
        int i11 = this.f46855a;
        Object obj2 = this.f46856b;
        switch (i11) {
            case 0:
                lambda$isSyncJobAlreadyRunning$5 = SyncJobManager.lambda$isSyncJobAlreadyRunning$5((SyncJob) obj2, (SyncJob) obj);
                return lambda$isSyncJobAlreadyRunning$5;
            case 1:
                ((com.withings.wiscale2.activity.model.builder.e) obj2).getClass();
                if (((Track) obj).getDuration() >= 480000) {
                    return true;
                }
                return false;
            case 2:
                Track track = (Track) obj2;
                b.a delegate = (b.a) obj;
                u.j(track, "$track");
                u.j(delegate, "delegate");
                return delegate.b(track);
            default:
                lambda$filterNotChangedCategories$1 = WorkoutCategoryManager.lambda$filterNotChangedCategories$1((WorkoutCategory) obj2, (WorkoutCategory) obj);
                return lambda$filterNotChangedCategories$1;
        }
    }
}
